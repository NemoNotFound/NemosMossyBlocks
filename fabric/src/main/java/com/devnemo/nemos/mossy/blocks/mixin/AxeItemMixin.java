package com.devnemo.nemos.mossy.blocks.mixin;

import com.devnemo.nemos.mossy.blocks.helper.BlockReplacementHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {

    @Inject(method = "evaluateNewBlockState", at = @At("HEAD"), cancellable = true)
    private void evaluateNewBlockState(Level level, BlockPos pos, @Nullable Player player, BlockState state,
                                       CallbackInfoReturnable<Optional<BlockState>> callbackInfoReturnable) {
        Optional<BlockState> optional = this.nemosMossyBlocks$getMossyStrippedState(state);
        if (optional.isPresent()) {
            level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0f, 1.0f);
            callbackInfoReturnable.setReturnValue(optional);
        }
    }

    @Unique
    private Optional<BlockState> nemosMossyBlocks$getMossyStrippedState(BlockState state) {
        return Optional.ofNullable(BlockReplacementHelper.STRIPPED_MOSSY_BLOCKS.get(state.getBlock())).map(block ->
                block.defaultBlockState().setValue(RotatedPillarBlock.AXIS, state.getValue(RotatedPillarBlock.AXIS)));
    }
}
