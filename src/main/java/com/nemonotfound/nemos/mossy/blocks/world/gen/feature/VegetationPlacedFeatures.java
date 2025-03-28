package com.nemonotfound.nemos.mossy.blocks.world.gen.feature;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountMultilayerPlacementModifier;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;

public class VegetationPlacedFeatures {

    public static final RegistryKey<PlacedFeature> CRIMSON_MOSS_PATCH = of("crimson_moss_patch");
    public static final RegistryKey<PlacedFeature> WARPED_MOSS_PATCH = of("warped_moss_patch");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> crimsonMossPatchRegistryEntry = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.CRIMSON_MOSS_PATCH);
        RegistryEntry<ConfiguredFeature<?, ?>> warpedMossPatchRegistryEntry = registryEntryLookup.getOrThrow(VegetationConfiguredFeatures.WARPED_MOSS_PATCH);

        PlacedFeatures.register(
                featureRegisterable,
                CRIMSON_MOSS_PATCH,
                crimsonMossPatchRegistryEntry,
                CountMultilayerPlacementModifier.of(2),
                BiomePlacementModifier.of()
        );

        PlacedFeatures.register(
                featureRegisterable,
                WARPED_MOSS_PATCH,
                warpedMossPatchRegistryEntry,
                CountMultilayerPlacementModifier.of(2),
                BiomePlacementModifier.of()
        );
    }

    private static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, id));
    }
}
