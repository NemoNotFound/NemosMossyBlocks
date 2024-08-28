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
        translationBuilder.add(ModItems.MOSS_BALL, "Moss Ball");
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
        translationBuilder.add(ModItems.MOSSY_OAK_DOOR, "Mossy Oak Door");
        translationBuilder.add(ModItems.MOSSY_OAK_PRESSURE_PLATE, "Mossy Oak Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_OAK_BUTTON, "Mossy Oak Button");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_LOG, "Mossy Spruce Log");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_WOOD, "Mossy Spruce Wood");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_PLANKS, "Mossy Spruce Planks");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_STAIRS, "Mossy Spruce Stairs");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_SLAB, "Mossy Spruce Slab");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_FENCE, "Mossy Spruce Fence");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_FENCE_GATE, "Mossy Spruce Fence Gate");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_DOOR, "Mossy Spruce Door");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_PRESSURE_PLATE, "Mossy Spruce Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_SPRUCE_BUTTON, "Mossy Spruce Button");
        translationBuilder.add(ModItems.MOSSY_BIRCH_LOG, "Mossy Birch Log");
        translationBuilder.add(ModItems.MOSSY_BIRCH_WOOD, "Mossy Birch Wood");
        translationBuilder.add(ModItems.MOSSY_BIRCH_PLANKS, "Mossy Birch Planks");
        translationBuilder.add(ModItems.MOSSY_BIRCH_STAIRS, "Mossy Birch Stairs");
        translationBuilder.add(ModItems.MOSSY_BIRCH_SLAB, "Mossy Birch Slab");
        translationBuilder.add(ModItems.MOSSY_BIRCH_FENCE, "Mossy Birch Fence");
        translationBuilder.add(ModItems.MOSSY_BIRCH_FENCE_GATE, "Mossy Birch Fence Gate");
        translationBuilder.add(ModItems.MOSSY_BIRCH_DOOR, "Mossy Birch Door");
        translationBuilder.add(ModItems.MOSSY_BIRCH_PRESSURE_PLATE, "Mossy Birch Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_BIRCH_BUTTON, "Mossy Birch Button");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_LOG, "Mossy Jungle Log");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_WOOD, "Mossy Jungle Wood");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_PLANKS, "Mossy Jungle Planks");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_STAIRS, "Mossy Jungle Stairs");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_SLAB, "Mossy Jungle Slab");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_FENCE, "Mossy Jungle Fence");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_FENCE_GATE, "Mossy Jungle Fence Gate");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_DOOR, "Mossy Jungle Door");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_PRESSURE_PLATE, "Mossy Jungle Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_JUNGLE_BUTTON, "Mossy Jungle Button");
        translationBuilder.add(ModItems.MOSSY_ACACIA_LOG, "Mossy Acacia Log");
        translationBuilder.add(ModItems.MOSSY_ACACIA_WOOD, "Mossy Acacia Wood");
        translationBuilder.add(ModItems.MOSSY_ACACIA_PLANKS, "Mossy Acacia Planks");
        translationBuilder.add(ModItems.MOSSY_ACACIA_STAIRS, "Mossy Acacia Stairs");
        translationBuilder.add(ModItems.MOSSY_ACACIA_SLAB, "Mossy Acacia Slab");
        translationBuilder.add(ModItems.MOSSY_ACACIA_FENCE, "Mossy Acacia Fence");
        translationBuilder.add(ModItems.MOSSY_ACACIA_FENCE_GATE, "Mossy Acacia Fence Gate");
        translationBuilder.add(ModItems.MOSSY_ACACIA_DOOR, "Mossy Acacia Door");
        translationBuilder.add(ModItems.MOSSY_ACACIA_PRESSURE_PLATE, "Mossy Acacia Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_ACACIA_BUTTON, "Mossy Acacia Button");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_LOG, "Mossy Dark Oak Log");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_WOOD, "Mossy Dark Oak Wood");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_PLANKS, "Mossy Dark Oak Planks");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_STAIRS, "Mossy Dark Oak Stairs");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_SLAB, "Mossy Dark Oak Slab");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_FENCE, "Mossy Dark Oak Fence");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_FENCE_GATE, "Mossy Dark Oak Fence Gate");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_DOOR, "Mossy Dark Oak Door");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_PRESSURE_PLATE, "Mossy Dark Oak Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_DARK_OAK_BUTTON, "Mossy Dark Oak Button");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_LOG, "Mossy Mangrove Log");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_WOOD, "Mossy Mangrove Wood");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_PLANKS, "Mossy Mangrove Planks");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_STAIRS, "Mossy Mangrove Stairs");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_SLAB, "Mossy Mangrove Slab");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_FENCE, "Mossy Mangrove Fence");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_FENCE_GATE, "Mossy Mangrove Fence Gate");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_DOOR, "Mossy Mangrove Door");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_PRESSURE_PLATE, "Mossy Mangrove Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_MANGROVE_BUTTON, "Mossy Mangrove Button");
        translationBuilder.add(ModItems.MOSSY_CHERRY_LOG, "Mossy Cherry Log");
        translationBuilder.add(ModItems.MOSSY_CHERRY_WOOD, "Mossy Cherry Wood");
        translationBuilder.add(ModItems.MOSSY_CHERRY_PLANKS, "Mossy Cherry Planks");
        translationBuilder.add(ModItems.MOSSY_CHERRY_STAIRS, "Mossy Cherry Stairs");
        translationBuilder.add(ModItems.MOSSY_CHERRY_SLAB, "Mossy Cherry Slab");
        translationBuilder.add(ModItems.MOSSY_CHERRY_FENCE, "Mossy Cherry Fence");
        translationBuilder.add(ModItems.MOSSY_CHERRY_FENCE_GATE, "Mossy Cherry Fence Gate");
        translationBuilder.add(ModItems.MOSSY_CHERRY_DOOR, "Mossy Cherry Door");
        translationBuilder.add(ModItems.MOSSY_CHERRY_PRESSURE_PLATE, "Mossy Cherry Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_CHERRY_BUTTON, "Mossy Cherry Button");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_BLOCK, "Mossy Bamboo Block");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_PLANKS, "Mossy Bamboo Planks");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_MOSAIC, "Mossy Bamboo Mosaic");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_STAIRS, "Mossy Bamboo Stairs");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_MOSAIC_STAIRS, "Mossy Bamboo Mosaic Stairs");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_SLAB, "Mossy Bamboo Slab");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_MOSAIC_SLAB, "Mossy Bamboo Mosaic Slab");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_FENCE, "Mossy Bamboo Fence");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_FENCE_GATE, "Mossy Bamboo Fence Gate");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_DOOR, "Mossy Bamboo Door");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_PRESSURE_PLATE, "Mossy Bamboo Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_BAMBOO_BUTTON, "Mossy Bamboo Button");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_STEM, "Mossy Crimson Stem");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_HYPHAE, "Mossy Crimson Hyphae");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_PLANKS, "Mossy Crimson Planks");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_STAIRS, "Mossy Crimson Stairs");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_SLAB, "Mossy Crimson Slab");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_FENCE, "Mossy Crimson Fence");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_FENCE_GATE, "Mossy Crimson Fence Gate");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_DOOR, "Mossy Crimson Door");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_PRESSURE_PLATE, "Mossy Crimson Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_CRIMSON_BUTTON, "Mossy Crimson Button");
        translationBuilder.add(ModItems.MOSSY_WARPED_STEM, "Mossy Warped Stem");
        translationBuilder.add(ModItems.MOSSY_WARPED_HYPHAE, "Mossy Warped Hyphae");
        translationBuilder.add(ModItems.MOSSY_WARPED_PLANKS, "Mossy Warped Planks");
        translationBuilder.add(ModItems.MOSSY_WARPED_STAIRS, "Mossy Warped Stairs");
        translationBuilder.add(ModItems.MOSSY_WARPED_SLAB, "Mossy Warped Slab");
        translationBuilder.add(ModItems.MOSSY_WARPED_FENCE, "Mossy Warped Fence");
        translationBuilder.add(ModItems.MOSSY_WARPED_FENCE_GATE, "Mossy Warped Fence Gate");
        translationBuilder.add(ModItems.MOSSY_WARPED_DOOR, "Mossy Warped Door");
        translationBuilder.add(ModItems.MOSSY_WARPED_PRESSURE_PLATE, "Mossy Warped Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_WARPED_BUTTON, "Mossy Warped Button");
        translationBuilder.add(ModItems.MOSSY_STONE, "Mossy Stone");
        translationBuilder.add(ModItems.MOSSY_STONE_STAIRS, "Mossy Stone Stairs");
        translationBuilder.add(ModItems.MOSSY_STONE_SLAB, "Mossy Stone Slab");
        translationBuilder.add(ModItems.MOSSY_STONE_PRESSURE_PLATE, "Mossy Stone Pressure Plate");
        translationBuilder.add(ModItems.MOSSY_STONE_BUTTON, "Mossy Stone Button");
        translationBuilder.add(ModItems.MOSSY_IRON_BARS, "Mossy Iron Bars");
        translationBuilder.add(ModItems.MOSSY_IRON_DOOR, "Mossy Iron Door");

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
