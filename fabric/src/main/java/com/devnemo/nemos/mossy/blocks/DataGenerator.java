package com.devnemo.nemos.mossy.blocks;

import com.devnemo.nemos.mossy.blocks.data.worldgen.features.NemosMossyVegetationFeatures;
import com.devnemo.nemos.mossy.blocks.data.worldgen.features.NemosMossyVegetationPlacements;
import com.devnemo.nemos.mossy.blocks.datagen.*;
import com.devnemo.nemos.mossy.blocks.datagen.lang.EnglishLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModelProvider::new);
        pack.addProvider(BlockLootTableProvider::new);
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(NemosMossyRecipeProvider::new);
        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(EnglishLanguageProvider::new);
        pack.addProvider(WorldGenProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
        registrySetBuilder.add(Registries.CONFIGURED_FEATURE, NemosMossyVegetationFeatures::bootstrap);
        registrySetBuilder.add(Registries.PLACED_FEATURE, NemosMossyVegetationPlacements::bootstrap);
    }
}
