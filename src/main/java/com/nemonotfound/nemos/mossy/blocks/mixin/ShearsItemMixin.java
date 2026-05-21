package com.nemonotfound.nemos.mossy.blocks.mixin;

import com.nemonotfound.nemos.mossy.blocks.helper.BlockReplacementHelper;
import com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Collection;
import java.util.Optional;

import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyBlockTags.*;

@Mixin(ShearsItem.class)
public class ShearsItemMixin {

    @Inject(method = "useOn", at = @At("HEAD"), cancellable = true)
    private void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfoReturnable) {
        var player = context.getPlayer();
        var blockPos = context.getClickedPos();
        var level = context.getLevel();
        var blockState = level.getBlockState(blockPos);
        var optionalShearedBlockState = this.nemosMossyBlocks$tryShear(level, blockPos, player, blockState);

        if (optionalShearedBlockState.isPresent()) {
            var itemStack = context.getItemInHand();
            BlockState shearedBlockState = optionalShearedBlockState.get();

            if (player instanceof ServerPlayer) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer)player, blockPos, itemStack);
            }

            level.setBlock(blockPos, shearedBlockState, Block.UPDATE_ALL_IMMEDIATE);
            level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(player, shearedBlockState));
            Containers.dropContents(level, blockPos.relative(player.getNearestViewDirection().getOpposite()),
                    NonNullList.withSize(1, nemosMossyBlocks$getItemStackToDrop(blockState)));

            if (player != null) {
                itemStack.hurtAndBreak(1, player, context.getHand().asEquipmentSlot());
            }

            callbackInfoReturnable.setReturnValue(InteractionResult.SUCCESS);
        }

    }

    @Unique
    private ItemStack nemosMossyBlocks$getItemStackToDrop(BlockState blockState) {
        if (blockState.is(PALE_MOSSY_BLOCKS)) {
            return new ItemStack(MossyItems.PALE_MOSS_BALL);
        }

        if (blockState.is(CRIMSON_MOSSY_BLOCKS)) {
            return new ItemStack(MossyItems.CRIMSON_MOSS_BALL);
        }

        if (blockState.is(WARPED_MOSSY_BLOCKS)) {
            return new ItemStack(MossyItems.WARPED_MOSS_BALL);
        }

        return new ItemStack(MossyItems.MOSS_BALL);
    }

    @Unique
    private Optional<BlockState> nemosMossyBlocks$tryShear(Level level, BlockPos pos, @Nullable Player player, BlockState state) {
        Optional<BlockState> optionalShearedBlockState = this.nemosMossyBlocks$getShearedState(state);

        if (optionalShearedBlockState.isPresent()) {
            level.playSound(player, pos, SoundEvents.SHEEP_SHEAR, SoundSource.BLOCKS, 1.0f, 1.0f);
            return optionalShearedBlockState;
        }

        return Optional.empty();
    }

    @Unique
    private Optional<BlockState> nemosMossyBlocks$getShearedState(BlockState state) {
        Optional<Block> optionalBlock = Optional.ofNullable(BlockReplacementHelper.SHEARED_MOSSY_BLOCKS.get(state.getBlock()));

        if (optionalBlock.isPresent()) {
            Block mossyBlock = optionalBlock.get();
            Collection<Property<?>> properties = state.getProperties();
            BlockState defaultState = mossyBlock.defaultBlockState();

            for (Property property:properties) {
                defaultState = defaultState.setValue(property, state.getValue(property));
            }

            return Optional.of(defaultState);
        }

        return Optional.empty();
    }
}
