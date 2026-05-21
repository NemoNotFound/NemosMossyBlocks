package com.nemonotfound.nemos.mossy.blocks.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

import java.util.List;

import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyBlockTags.*;
import static net.minecraft.tags.BlockTags.BARS;

@Mixin(IronBarsBlock.class)
public class IronBarsBlockMixin {

    @ModifyReturnValue(method = "attachsTo", at = @At(value = "RETURN"))
    private boolean isBars(boolean original, @Local(argsOnly = true) BlockState blockState) {
        return original || blockState.is(ATTACHES_TO_PANES_AND_BARS);
    }

    @ModifyExpressionValue(method = "skipRendering", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;is(Ljava/lang/Object;)Z"))
    private boolean skipRendering(boolean original, @Local(argsOnly = true, ordinal = 0) BlockState blockState, @Local(argsOnly = true, ordinal = 1) BlockState adjacentBlockState) {
        List<TagKey<Block>> paneTags = List.of(
                BARS,
                GLASS_PANES,
                BROWN_STAINED_GLASS_PANES,
                BLUE_STAINED_GLASS_PANES,
                LIGHT_BLUE_STAINED_GLASS_PANES,
                CYAN_STAINED_GLASS_PANES,
                RED_STAINED_GLASS_PANES,
                BLACK_STAINED_GLASS_PANES,
                YELLOW_STAINED_GLASS_PANES,
                ORANGE_STAINED_GLASS_PANES,
                GREEN_STAINED_GLASS_PANES,
                LIME_STAINED_GLASS_PANES,
                PURPLE_STAINED_GLASS_PANES,
                PINK_STAINED_GLASS_PANES,
                MAGENTA_STAINED_GLASS_PANES,
                LIGHT_GRAY_STAINED_GLASS_PANES,
                GRAY_STAINED_GLASS_PANES,
                WHITE_STAINED_GLASS_PANES
        );

        var anyMatch = paneTags.stream()
                .anyMatch(tag -> nemosMossyBlocks$areBothStatesInTag(blockState, adjacentBlockState, tag));

        return original || anyMatch;
    }

    @Unique
    private boolean nemosMossyBlocks$areBothStatesInTag(BlockState state, BlockState adjacentBlockState, TagKey<Block> blockTag) {
        return state.is(blockTag) && adjacentBlockState.is(blockTag);
    }
}
