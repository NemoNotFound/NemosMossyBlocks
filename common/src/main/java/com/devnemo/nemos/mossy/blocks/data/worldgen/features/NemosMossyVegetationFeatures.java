package com.devnemo.nemos.mossy.blocks.data.worldgen.features;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.WeightedList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.VegetationPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import static com.devnemo.nemos.mossy.blocks.Constants.MOD_ID;
import static com.devnemo.nemos.mossy.blocks.tags.NemosMossyBlockTags.CRIMSON_MOSS_REPLACEABLE;
import static com.devnemo.nemos.mossy.blocks.tags.NemosMossyBlockTags.WARPED_MOSS_REPLACEABLE;
import static com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks.*;
import static net.minecraft.world.level.block.Blocks.*;

public class NemosMossyVegetationFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_MOSS_VEGETATION = of("crimson_moss_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_MOSS_PATCH = of("crimson_moss_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_MOSS_PATCH_BONEMEAL = of("crimson_moss_patch_bonemeal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WARPED_MOSS_VEGETATION = of("warped_moss_vegetation");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WARPED_MOSS_PATCH = of("warped_moss_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WARPED_MOSS_PATCH_BONEMEAL = of("warped_moss_patch_bonemeal");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        var configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        FeatureUtils.register(
                context,
                CRIMSON_MOSS_VEGETATION,
                Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(
                        new WeightedStateProvider(
                                WeightedList.<BlockState>builder()
                                        .add(CRIMSON_MOSS_CARPET.get().defaultBlockState(), 25)
                                        .add(CRIMSON_ROOTS.defaultBlockState(), 25)
                                        .add(CRIMSON_FUNGUS.defaultBlockState(), 10)
                        )
                )
        );

        FeatureUtils.register(
                context,
                CRIMSON_MOSS_PATCH,
                Feature.VEGETATION_PATCH,
                new VegetationPatchConfiguration(
                        CRIMSON_MOSS_REPLACEABLE,
                        BlockStateProvider.simple(CRIMSON_MOSS_BLOCK.get()),
                        PlacementUtils.inlinePlaced(configuredFeatureHolderGetter.getOrThrow(CRIMSON_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.3F,
                        UniformInt.of(2, 4),
                        0.75F
                )
        );

        FeatureUtils.register(
                context,
                CRIMSON_MOSS_PATCH_BONEMEAL,
                Feature.VEGETATION_PATCH,
                new VegetationPatchConfiguration(
                        CRIMSON_MOSS_REPLACEABLE,
                        BlockStateProvider.simple(CRIMSON_MOSS_BLOCK.get()),
                        PlacementUtils.inlinePlaced(configuredFeatureHolderGetter.getOrThrow(CRIMSON_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.6F,
                        UniformInt.of(1, 2),
                        0.75F
                )
        );

        FeatureUtils.register(
                context,
                WARPED_MOSS_VEGETATION,
                Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(
                        new WeightedStateProvider(
                                WeightedList.<BlockState>builder()
                                        .add(WARPED_MOSS_CARPET.get().defaultBlockState(), 25)
                                        .add(WARPED_ROOTS.defaultBlockState(), 25)
                                        .add(WARPED_FUNGUS.defaultBlockState(), 10)
                        )
                )
        );

        FeatureUtils.register(
                context,
                WARPED_MOSS_PATCH,
                Feature.VEGETATION_PATCH,
                new VegetationPatchConfiguration(
                        WARPED_MOSS_REPLACEABLE,
                        BlockStateProvider.simple(WARPED_MOSS_BLOCK.get()),
                        PlacementUtils.inlinePlaced(configuredFeatureHolderGetter.getOrThrow(WARPED_MOSS_VEGETATION)),
                        CaveSurface.FLOOR,
                        ConstantInt.of(1),
                        0.0F,
                        5,
                        0.3F,
                        UniformInt.of(2, 4),
                        0.75F
                )
        );

        FeatureUtils.register(
                context,
                WARPED_MOSS_PATCH_BONEMEAL,
                Feature.VEGETATION_PATCH,
                new VegetationPatchConfiguration(
                        WARPED_MOSS_REPLACEABLE,
                        BlockStateProvider.simple(WARPED_MOSS_BLOCK.get()),
                        PlacementUtils.inlinePlaced(configuredFeatureHolderGetter.getOrThrow(WARPED_MOSS_VEGETATION)),
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

    public static ResourceKey<ConfiguredFeature<?, ?>> of(String id) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, id));
    }
}
