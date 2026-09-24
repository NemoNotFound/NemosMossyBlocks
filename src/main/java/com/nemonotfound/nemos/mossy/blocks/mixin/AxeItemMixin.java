package com.nemonotfound.nemos.mossy.blocks.mixin;

import com.nemonotfound.nemos.mossy.blocks.helper.BlockReplacementHelper;
import net.minecraft.core.component.BlockTransformer;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockTransformer.class)
public class AxeItemMixin {

    @Inject(method = "transformBlock", at = @At("HEAD"), cancellable = true)
    private void transformMossyBlock(UseOnContext context, CallbackInfoReturnable<InteractionResult> callbackInfo) {
        ItemStack itemStack = context.getItemInHand();
        Player player = context.getPlayer();

        if (!itemStack.is(ItemTags.AXES)
                || context.getHand() == InteractionHand.MAIN_HAND
                && player != null
                && player.getOffhandItem().has(DataComponents.BLOCKS_ATTACKS)
                && !player.isSecondaryUseActive()) {
            return;
        }

        Level level = context.getLevel();
        BlockState oldState = level.getBlockState(context.getClickedPos());
        Block replacement = BlockReplacementHelper.STRIPPED_MOSSY_BLOCKS.get(oldState.getBlock());

        if (replacement == null) {
            return;
        }

        BlockState newState = replacement.defaultBlockState()
                .setValue(RotatedPillarBlock.AXIS, oldState.getValue(RotatedPillarBlock.AXIS));
        itemStack.hurtAndBreak(1, player, context.getHand().asEquipmentSlot());
        level.setBlock(context.getClickedPos(), newState, 11);
        level.playSound(player, context.getClickedPos(), SoundEvents.AXE_STRIP.value(), SoundSource.BLOCKS, 1.0F, 1.0F);
        level.gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(player, newState));
        callbackInfo.setReturnValue(InteractionResult.SUCCESS);
    }
}
