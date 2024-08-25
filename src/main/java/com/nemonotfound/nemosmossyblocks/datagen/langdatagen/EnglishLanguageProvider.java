package com.nemonotfound.nemosmossyblocks.datagen.langdatagen;

import com.nemonotfound.nemosmossyblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class EnglishLanguageProvider extends FabricLanguageProvider {

    public EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.MOSSY_CHISELED_STONE_BRICKS, "Mossy Chiseled Stone Bricks");
        translationBuilder.add(ModItems.INFESTED_MOSSY_CHISELED_STONE_BRICKS, "Infested Mossy Chiseled Stone Bricks");
        translationBuilder.add(ModItems.MOSSY_BRICKS, "Mossy Bricks");
        translationBuilder.add(ModItems.MOSSY_BRICK_SLAB, "Mossy Brick Slab");
        translationBuilder.add(ModItems.MOSSY_BRICK_STAIRS, "Mossy Brick Stairs");
        translationBuilder.add(ModItems.MOSSY_BRICK_WALL, "Mossy Brick Wall");
        translationBuilder.add(ModItems.MOSSY_OAK_LOG, "Mossy Oak Log");
        translationBuilder.add(ModItems.MOSSY_OAK_WOOD, "Mossy Oak Wood");
        translationBuilder.add(ModItems.MOSSY_OAK_PLANKS, "Mossy Oak Planks");
        translationBuilder.add(ModItems.MOSSY_OAK_STAIRS, "Mossy Oak Stairs");
        translationBuilder.add(ModItems.MOSSY_OAK_SLAB, "Mossy Oak Slab");
        translationBuilder.add(ModItems.MOSSY_OAK_FENCE, "Mossy Oak Fence");
        translationBuilder.add(ModItems.MOSSY_OAK_FENCE_GATE, "Mossy Oak Fence Gate");
        translationBuilder.add(ModItems.MOSSY_OAK_PRESSURE_PLATE, "Mossy Oak Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_OAK_BUTTON, "Mossy Oak Button");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_LOG, "Mossy Spruce Log");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_WOOD, "Mossy Spruce Wood");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_PLANKS, "Mossy Spruce Planks");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_STAIRS, "Mossy Spruce Stairs");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_SLAB, "Mossy Spruce Slab");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_FENCE, "Mossy Spruce Fence");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_FENCE_GATE, "Mossy Spruce Fence Gate");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_PRESSURE_PLATE, "Mossy Spruce Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_BUTTON, "Mossy Spruce Button");

        try {
            Optional<Path> optionalPath = dataOutput.getModContainer().findPath("en_us.json");

            if (optionalPath.isPresent()) {
                translationBuilder.add(optionalPath.get());
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
