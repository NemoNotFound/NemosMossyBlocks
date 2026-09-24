package com.nemonotfound.nemos.mossy.blocks.data.worldgen.features;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.VegetationPatchFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyBlockTags.CRIMSON_MOSS_REPLACEABLE;
import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyBlockTags.WARPED_MOSS_REPLACEABLE;
import static com.nemonotfound.nemos.mossy.blocks.world.level.block.MossyBlocks.*;
import static net.minecraft.world.level.block.Blocks.*;

public class NemosMossyVegetationFeatures {

    public static final ResourceKey<Feature> CRIMSON_MOSS_VEGETATION = of("crimson_moss_vegetation");
    public static final ResourceKey<Feature> CRIMSON_MOSS_PATCH = of("crimson_moss_patch");
    public static final ResourceKey<Feature> CRIMSON_MOSS_PATCH_BONEMEAL = of("crimson_moss_patch_bonemeal");
    public static final ResourceKey<Feature> WARPED_MOSS_VEGETATION = of("warped_moss_vegetation");
    public static final ResourceKey<Feature> WARPED_MOSS_PATCH = of("warped_moss_patch");
    public static final ResourceKey<Feature> WARPED_MOSS_PATCH_BONEMEAL = of("warped_moss_patch_bonemeal");

    public static void bootstrap(BootstrapContext<Feature> context) {
        var blockHolderGetter = context.lookup(Registries.BLOCK);
        var featureHolderGetter = context.lookup(Registries.FEATURE);

        context.register(
                CRIMSON_MOSS_VEGETATION,
                new SimpleBlockFeature(
                        new WeightedStateProvider(
                                WeightedList.<BlockState>builder()
                                        .add(CRIMSON_MOSS_CARPET.defaultBlockState(), 25)
                                        .add(CRIMSON_ROOTS.defaultBlockState(), 25)
                                        .add(CRIMSON_FUNGUS.defaultBlockState(), 10)
                        )
                )
        );

        context.register(
                CRIMSON_MOSS_PATCH,
                new VegetationPatchFeature(
                        blockHolderGetter.getOrThrow(CRIMSON_MOSS_REPLACEABLE),
                        BlockStateProvider.holderOf(CRIMSON_MOSS_BLOCK),
                        PlacementUtils.inlinePlaced(featureHolderGetter.getOrThrow(CRIMSON_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.3F,
                        UniformInt.of(2, 4),
                        0.75F
                )
        );

        context.register(
                CRIMSON_MOSS_PATCH_BONEMEAL,
                new VegetationPatchFeature(
                        blockHolderGetter.getOrThrow(CRIMSON_MOSS_REPLACEABLE),
                        BlockStateProvider.holderOf(CRIMSON_MOSS_BLOCK),
                        PlacementUtils.inlinePlaced(featureHolderGetter.getOrThrow(CRIMSON_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.6F,
                        UniformInt.of(1, 2),
                        0.75F
                )
        );

        context.register(
                WARPED_MOSS_VEGETATION,
                new SimpleBlockFeature(
                        new WeightedStateProvider(
                                WeightedList.<BlockState>builder()
                                        .add(WARPED_MOSS_CARPET.defaultBlockState(), 25)
                                        .add(WARPED_ROOTS.defaultBlockState(), 25)
                                        .add(WARPED_FUNGUS.defaultBlockState(), 10)
                        )
                )
        );

        context.register(
                WARPED_MOSS_PATCH,
                new VegetationPatchFeature(
                        blockHolderGetter.getOrThrow(WARPED_MOSS_REPLACEABLE),
                        BlockStateProvider.holderOf(WARPED_MOSS_BLOCK),
                        PlacementUtils.inlinePlaced(featureHolderGetter.getOrThrow(WARPED_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.3F,
                        UniformInt.of(2, 4),
                        0.75F
                )
        );

        context.register(
                WARPED_MOSS_PATCH_BONEMEAL,
                new VegetationPatchFeature(
                        blockHolderGetter.getOrThrow(WARPED_MOSS_REPLACEABLE),
                        BlockStateProvider.holderOf(WARPED_MOSS_BLOCK),
                        PlacementUtils.inlinePlaced(featureHolderGetter.getOrThrow(WARPED_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.6F,
                        UniformInt.of(1, 2),
                        0.75F
                )
        );
    }

    public static ResourceKey<Feature> of(String id) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, id));
    }
}
