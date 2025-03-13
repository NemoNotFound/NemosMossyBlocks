package com.nemonotfound.nemos.mossy.blocks;

import com.nemonotfound.nemos.mossy.blocks.datagen.*;
import com.nemonotfound.nemos.mossy.blocks.datagen.langdatagen.EnglishLanguageProvider;
import com.nemonotfound.nemos.mossy.blocks.world.gen.feature.VegetationConfiguredFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class NemosMossyBlocksDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(BlockLootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(ItemTagProvider::new);
		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(WorldGenProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, VegetationConfiguredFeatures::bootstrap);
	}
}
