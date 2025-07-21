package com.devnemo.nemos.mossy.blocks.data.worldgen.features;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static com.devnemo.nemos.mossy.blocks.Constants.MOD_ID;

public class NemosMossyVegetationPlacements {

    public static final ResourceKey<PlacedFeature> CRIMSON_MOSS_PATCH = of("crimson_moss_patch");
    public static final ResourceKey<PlacedFeature> WARPED_MOSS_PATCH = of("warped_moss_patch");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        var crimsonMossPatchRegistryEntry = configuredFeatureHolderGetter.getOrThrow(NemosMossyVegetationFeatures.CRIMSON_MOSS_PATCH);
       var warpedMossPatchRegistryEntry = configuredFeatureHolderGetter.getOrThrow(NemosMossyVegetationFeatures.WARPED_MOSS_PATCH);

        PlacementUtils.register(
                context,
                CRIMSON_MOSS_PATCH,
                crimsonMossPatchRegistryEntry,
                CountOnEveryLayerPlacement.of(2),
                BiomeFilter.biome()
        );

        PlacementUtils.register(
                context,
                WARPED_MOSS_PATCH,
                warpedMossPatchRegistryEntry,
                CountOnEveryLayerPlacement.of(2),
                BiomeFilter.biome()
        );
    }

    private static ResourceKey<PlacedFeature> of(String id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID, id));
    }
}
