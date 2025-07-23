package com.devnemo.nemos.mossy.blocks.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.level.block.RootsBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static com.devnemo.nemos.mossy.blocks.tags.NemosMossyBlockTags.ROOTS_PLANTABLE_ON;

@Mixin(RootsBlock.class)
public class RootsBlockMixin {

    @ModifyReturnValue(method = "mayPlaceOn", at = @At("RETURN"))
    boolean mayPlaceOn(boolean original, @Local(argsOnly = true) BlockState floor) {
        return original || floor.is(ROOTS_PLANTABLE_ON);
    }
}
