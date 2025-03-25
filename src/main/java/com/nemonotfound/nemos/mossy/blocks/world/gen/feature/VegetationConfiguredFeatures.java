package com.nemonotfound.nemos.mossy.blocks.world.gen.feature;

import net.minecraft.block.BlockState;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemos.mossy.blocks.block.Blocks.*;
import static com.nemonotfound.nemos.mossy.blocks.registry.tag.BlockTags.CRIMSON_MOSS_REPLACEABLE;
import static com.nemonotfound.nemos.mossy.blocks.registry.tag.BlockTags.WARPED_MOSS_REPLACEABLE;
import static net.minecraft.block.Blocks.*;

public class VegetationConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_MOSS_VEGETATION = of("crimson_moss_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_MOSS_PATCH = of("crimson_moss_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRIMSON_MOSS_PATCH_BONEMEAL = of("crimson_moss_patch_bonemeal");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_MOSS_VEGETATION = of("warped_moss_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_MOSS_PATCH = of("warped_moss_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARPED_MOSS_PATCH_BONEMEAL = of("warped_moss_patch_bonemeal");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        ConfiguredFeatures.register(
                featureRegisterable,
                CRIMSON_MOSS_VEGETATION,
                Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(
                        new WeightedBlockStateProvider(
                                Pool.<BlockState>builder()
                                        .add(CRIMSON_MOSS_CARPET.getDefaultState(), 25)
                                        .add(CRIMSON_ROOTS.getDefaultState(), 25)
                                        .add(CRIMSON_FUNGUS.getDefaultState(), 10)
                        )
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                CRIMSON_MOSS_PATCH,
                Feature.VEGETATION_PATCH,
                new VegetationPatchFeatureConfig(
                        CRIMSON_MOSS_REPLACEABLE,
                        BlockStateProvider.of(CRIMSON_MOSS_BLOCK),
                        PlacedFeatures.createEntry(registryEntryLookup.getOrThrow(CRIMSON_MOSS_VEGETATION)),
                        VerticalSurfaceType.FLOOR,
                        ConstantIntProvider.create(1),
                        0.0F,
                        5,
                        0.3F,
                        UniformIntProvider.create(2, 4),
                        0.75F
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                CRIMSON_MOSS_PATCH_BONEMEAL,
                Feature.VEGETATION_PATCH,
                new VegetationPatchFeatureConfig(
                        CRIMSON_MOSS_REPLACEABLE,
                        BlockStateProvider.of(CRIMSON_MOSS_BLOCK),
                        PlacedFeatures.createEntry(registryEntryLookup.getOrThrow(CRIMSON_MOSS_VEGETATION)),
                        VerticalSurfaceType.FLOOR,
                        ConstantIntProvider.create(1),
                        0.0F,
                        5,
                        0.6F,
                        UniformIntProvider.create(1, 2),
                        0.75F
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                WARPED_MOSS_VEGETATION,
                Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(
                        new WeightedBlockStateProvider(
                                Pool.<BlockState>builder()
                                        .add(WARPED_MOSS_CARPET.getDefaultState(), 25)
                                        .add(WARPED_ROOTS.getDefaultState(), 25)
                                        .add(WARPED_FUNGUS.getDefaultState(), 10)
                        )
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                WARPED_MOSS_PATCH,
                Feature.VEGETATION_PATCH,
                new VegetationPatchFeatureConfig(
                        WARPED_MOSS_REPLACEABLE,
                        BlockStateProvider.of(WARPED_MOSS_BLOCK),
                        PlacedFeatures.createEntry(registryEntryLookup.getOrThrow(WARPED_MOSS_VEGETATION)),
                        VerticalSurfaceType.FLOOR,
                        ConstantIntProvider.create(1),
                        0.0F,
                        5,
                        0.3F,
                        UniformIntProvider.create(2, 4),
                        0.75F
                )
        );

        ConfiguredFeatures.register(
                featureRegisterable,
                WARPED_MOSS_PATCH_BONEMEAL,
                Feature.VEGETATION_PATCH,
                new VegetationPatchFeatureConfig(
                        WARPED_MOSS_REPLACEABLE,
                        BlockStateProvider.of(WARPED_MOSS_BLOCK),
                        PlacedFeatures.createEntry(registryEntryLookup.getOrThrow(WARPED_MOSS_VEGETATION)),
                        VerticalSurfaceType.FLOOR,
                        ConstantIntProvider.create(1),
                        0.0F,
                        5,
                        0.6F,
                        UniformIntProvider.create(1, 2),
                        0.75F
                )
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MOD_ID, id));
    }
}
