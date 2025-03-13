package com.nemonotfound.nemos.mossy.blocks.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.block.BlockState;
import net.minecraft.block.FungusBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static com.nemonotfound.nemos.mossy.blocks.registry.tag.BlockTags.FUNGUS_PLANTABLE_ON;

@Mixin(FungusBlock.class)
public class FungusBlockMixin {

    @ModifyReturnValue(method = "canPlantOnTop", at = @At("RETURN"))
    boolean canPlantOnTop(boolean original, @Local(argsOnly = true) BlockState floor) {
        return original || floor.isIn(FUNGUS_PLANTABLE_ON);
    }
}
