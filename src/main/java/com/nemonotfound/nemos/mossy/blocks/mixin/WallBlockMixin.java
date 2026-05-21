package com.nemonotfound.nemos.mossy.blocks.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyBlockTags.CONNECTS_TO_WALL;

@Mixin(WallBlock.class)
public class WallBlockMixin {

    @ModifyReturnValue(method = "connectsTo", at = @At(value = "RETURN"))
    private boolean isBars(boolean original, @Local(argsOnly = true) BlockState blockState) {
        return original || blockState.is(CONNECTS_TO_WALL);
    }
}
