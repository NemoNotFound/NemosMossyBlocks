package com.nemonotfound.nemos.mossy.blocks.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.world.level.block.NetherFungusBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyBlockTags.NETHER_FUNGUS_PLANTABLE_ON;

@Mixin(NetherFungusBlock.class)
public class FungusBlockMixin {

    @ModifyReturnValue(method = "mayPlaceOn", at = @At("RETURN"))
    boolean mayPlaceOn(boolean original, @Local(argsOnly = true) BlockState floor) {
        return original || floor.is(NETHER_FUNGUS_PLANTABLE_ON);
    }
}
