package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import com.nemonotfound.nemosmossyblocks.item.ModItems;
import com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createMossyBlockRecipe(exporter, Blocks.STONE, ModBlocks.MOSSY_STONE, "mossy_stone");
                createMossyBlockRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.MOSSY_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.MOSSY_WARPED_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, Blocks.ACACIA_LOG, ModBlocks.MOSSY_ACACIA_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.BAMBOO_BLOCK, ModBlocks.MOSSY_BAMBOO_BLOCK, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.BIRCH_LOG, ModBlocks.MOSSY_BIRCH_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.CHERRY_LOG, ModBlocks.MOSSY_CHERRY_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.CRIMSON_STEM, ModBlocks.MOSSY_CRIMSON_STEM, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.DARK_OAK_LOG, ModBlocks.MOSSY_DARK_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.JUNGLE_LOG, ModBlocks.MOSSY_JUNGLE_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.MANGROVE_LOG, ModBlocks.MOSSY_MANGROVE_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.OAK_LOG, ModBlocks.MOSSY_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.SPRUCE_LOG, ModBlocks.MOSSY_SPRUCE_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.WARPED_STEM, ModBlocks.MOSSY_WARPED_STEM, "mossy_log");
                createMossyBlockRecipe(exporter, Blocks.GLASS, ModBlocks.MOSSY_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.BLACK_STAINED_GLASS, ModBlocks.MOSSY_BLACK_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.BLUE_STAINED_GLASS, ModBlocks.MOSSY_BLUE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.BROWN_STAINED_GLASS, ModBlocks.MOSSY_BROWN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.CYAN_STAINED_GLASS, ModBlocks.MOSSY_CYAN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.GRAY_STAINED_GLASS, ModBlocks.MOSSY_GRAY_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.GREEN_STAINED_GLASS, ModBlocks.MOSSY_GREEN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.LIGHT_BLUE_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.LIGHT_GRAY_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.LIME_STAINED_GLASS, ModBlocks.MOSSY_LIME_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.MAGENTA_STAINED_GLASS, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.ORANGE_STAINED_GLASS, ModBlocks.MOSSY_ORANGE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.PINK_STAINED_GLASS, ModBlocks.MOSSY_PINK_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.PURPLE_STAINED_GLASS, ModBlocks.MOSSY_PURPLE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.RED_STAINED_GLASS, ModBlocks.MOSSY_RED_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.TINTED_GLASS, ModBlocks.MOSSY_TINTED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.WHITE_STAINED_GLASS, ModBlocks.MOSSY_WHITE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.YELLOW_STAINED_GLASS, ModBlocks.MOSSY_YELLOW_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, Blocks.IRON_BARS, ModBlocks.MOSSY_IRON_BARS, "mossy_iron_bars");
                createMossyBlockRecipe(exporter, Blocks.IRON_DOOR, ModBlocks.MOSSY_IRON_DOOR, "mossy_iron_door");
                createMossyBlockRecipe(exporter, Blocks.IRON_TRAPDOOR, ModBlocks.MOSSY_IRON_TRAPDOOR, "mossy_iron_trapdoor");
                createMossyBlockRecipe(exporter, Blocks.CHISELED_STONE_BRICKS, ModBlocks.MOSSY_CHISELED_STONE_BRICKS, "mossy_chiseled_stone_bricks");
                createMossyBlockRecipe(exporter, Blocks.BRICKS, ModBlocks.MOSSY_BRICKS, "mossy_bricks");
                createMossyBlockRecipe(exporter, Blocks.DEEPSLATE, ModBlocks.MOSSY_DEEPSLATE, "mossy_deepslate");
                createMossyBlockRecipe(exporter, Blocks.COBBLED_DEEPSLATE, ModBlocks.MOSSY_COBBLED_DEEPSLATE, "mossy_cobbled_deepslate");
                createMossyBlockRecipe(exporter, Blocks.DEEPSLATE_BRICKS, ModBlocks.MOSSY_DEEPSLATE_BRICKS, "mossy_deepslate_bricks");
                createMossyBlockRecipe(exporter, Blocks.DEEPSLATE_TILES, ModBlocks.MOSSY_DEEPSLATE_TILES, "mossy_deepslate_tiles");
                createMossyBlockRecipe(exporter, Blocks.TUFF, ModBlocks.MOSSY_TUFF, "mossy_tuff");
                createMossyBlockRecipe(exporter, Blocks.TUFF_BRICKS, ModBlocks.MOSSY_TUFF_BRICKS, "mossy_tuff_bricks");

                createPlanksRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_ACACIA_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_BIRCH_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_CHERRY_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_OAK_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_WARPED_WOOD);

                createStairsRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_STAIRS);
                createWoodenStairsRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_STAIRS);
                createStairsRecipe(exporter, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_SLAB);
                createWoodenSlabRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_SLAB);
                createSlabRecipe(exporter, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);

                createPressurePlateRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE);
                createWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_PRESSURE_PLATE);

                createFenceRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_FENCE);
                createFenceRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_FENCE);

                createFenceGateRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_FENCE_GATE);
                createFenceGateRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_BUTTON);
                createWoodenButtonRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_BUTTON);

                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_SLAB, ModBlocks.MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_STONE_STAIRS, ModBlocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICK_SLAB, ModBlocks.MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICK_STAIRS, ModBlocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_BRICK_WALL, ModBlocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_CHISELED_STONE_BRICKS, ModBlocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_SLAB, ModBlocks.MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_STAIRS, ModBlocks.MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_SLAB, ModBlocks.MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_STAIRS, ModBlocks.MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_WALL, ModBlocks.MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB, ModBlocks.MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS, ModBlocks.MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(exporter);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_BLACK_STAINED_GLASS, ModBlocks.MOSSY_BLACK_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_BLUE_STAINED_GLASS, ModBlocks.MOSSY_BLUE_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_BROWN_STAINED_GLASS, ModBlocks.MOSSY_BROWN_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_CYAN_STAINED_GLASS, ModBlocks.MOSSY_CYAN_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_GRAY_STAINED_GLASS, ModBlocks.MOSSY_GRAY_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_GREEN_STAINED_GLASS, ModBlocks.MOSSY_GREEN_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIME_STAINED_GLASS, ModBlocks.MOSSY_LIME_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_ORANGE_STAINED_GLASS, ModBlocks.MOSSY_ORANGE_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_PINK_STAINED_GLASS, ModBlocks.MOSSY_PINK_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_PURPLE_STAINED_GLASS, ModBlocks.MOSSY_PURPLE_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_RED_STAINED_GLASS, ModBlocks.MOSSY_RED_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_WHITE_STAINED_GLASS, ModBlocks.MOSSY_WHITE_STAINED_GLASS_PANE);
                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_YELLOW_STAINED_GLASS, ModBlocks.MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.offerBarkBlockRecipe(ModBlocks.MOSSY_ACACIA_WOOD, ModBlocks.MOSSY_ACACIA_LOG);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_BIRCH_WOOD, ModBlocks.MOSSY_BIRCH_LOG);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_DARK_OAK_WOOD, ModBlocks.MOSSY_DARK_OAK_LOG);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_JUNGLE_WOOD, ModBlocks.MOSSY_JUNGLE_LOG);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_OAK_WOOD, ModBlocks.MOSSY_OAK_LOG);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_SPRUCE_WOOD, ModBlocks.MOSSY_SPRUCE_LOG);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_CRIMSON_HYPHAE, ModBlocks.MOSSY_CRIMSON_STEM);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_WARPED_HYPHAE, ModBlocks.MOSSY_WARPED_STEM);
                this.offerBarkBlockRecipe(ModBlocks.MOSSY_MANGROVE_WOOD, ModBlocks.MOSSY_MANGROVE_LOG);

                this.offerMosaicRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);

                this.offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSS_BLOCK, ModItems.MOSS_BALL);
                this.createShapeless(RecipeCategory.MISC, ModItems.MOSS_BALL, 4)
                        .input(Blocks.MOSS_BLOCK)
                        .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                        .offerTo(exporter);

                createStairsRecipe(exporter, ModBlocks.MOSSY_BRICKS, ModBlocks.MOSSY_BRICK_STAIRS);
                createSlabRecipe(exporter, ModBlocks.MOSSY_BRICKS, ModBlocks.MOSSY_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BRICK_WALL, ModBlocks.MOSSY_BRICKS);

                offerDoorRecipe(exporter, ModBlocks.MOSSY_OAK_DOOR, ModBlocks.MOSSY_OAK_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_SPRUCE_DOOR, ModBlocks.MOSSY_SPRUCE_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_BIRCH_DOOR, ModBlocks.MOSSY_BIRCH_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_CHERRY_DOOR, ModBlocks.MOSSY_CHERRY_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_JUNGLE_DOOR, ModBlocks.MOSSY_JUNGLE_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_BAMBOO_DOOR, ModBlocks.MOSSY_BAMBOO_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_MANGROVE_DOOR, ModBlocks.MOSSY_MANGROVE_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_DOOR, ModBlocks.MOSSY_DARK_OAK_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_ACACIA_DOOR, ModBlocks.MOSSY_ACACIA_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_CRIMSON_DOOR, ModBlocks.MOSSY_CRIMSON_PLANKS);
                offerDoorRecipe(exporter, ModBlocks.MOSSY_WARPED_DOOR, ModBlocks.MOSSY_WARPED_PLANKS);

                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_TRAPDOOR);
                createWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(exporter, ModBlocks.MOSSY_COBBLED_DEEPSLATE, ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(exporter, ModBlocks.MOSSY_COBBLED_DEEPSLATE, ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(exporter, ModBlocks.MOSSY_DEEPSLATE_BRICKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(exporter, ModBlocks.MOSSY_DEEPSLATE_BRICKS, ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(exporter, ModBlocks.MOSSY_DEEPSLATE_TILES, ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(exporter, ModBlocks.MOSSY_DEEPSLATE_TILES, ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(exporter, ModBlocks.MOSSY_TUFF, ModBlocks.MOSSY_TUFF_STAIRS);
                createSlabRecipe(exporter, ModBlocks.MOSSY_TUFF, ModBlocks.MOSSY_TUFF_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_TUFF_WALL, ModBlocks.MOSSY_TUFF);

                createStairsRecipe(exporter, ModBlocks.MOSSY_TUFF_BRICKS, ModBlocks.MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(exporter, ModBlocks.MOSSY_TUFF_BRICKS, ModBlocks.MOSSY_TUFF_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_TUFF_BRICK_WALL, ModBlocks.MOSSY_TUFF_BRICKS);
            }

            private void offerDoorRecipe(RecipeExporter exporter, Block output, Block input) {
                this.createDoorRecipe(output, Ingredient.ofItems(input))
                        .criterion("has_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createMossyBlockRecipe(RecipeExporter exporter, Block input, Block result, String group) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .input(input).input(Blocks.VINE).group(group)
                        .criterion(hasItem(Blocks.VINE), this.conditionsFromItem(Blocks.VINE))
                        .offerTo(exporter, convertBetween(result, Blocks.VINE));
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .input(input).input(Blocks.MOSS_BLOCK).group(group)
                        .criterion(hasItem(Blocks.MOSS_BLOCK), this.conditionsFromItem(Blocks.MOSS_BLOCK))
                        .offerTo(exporter, convertBetween(result, Blocks.MOSS_BLOCK));
            }

            public void createPlanksRecipe(RecipeExporter exporter, ItemConvertible output, String criterion, String group, TagKey<Item> input) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .input(input)
                        .group(group)
                        .criterion(criterion, this.conditionsFromTag(input))
                        .offerTo(exporter);
            }

            private void createWoodenStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createStairsRecipe(result, Ingredient.ofItems(input)).group("mossy_wooden_stairs")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createWoodenTrapdoorRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createTrapdoorRecipe(result, Ingredient.ofItems(input)).group("mossy_wooden_stairs")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createStairsRecipe(result, Ingredient.ofItems(input))
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createWoodenSlabRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.ofItems(input.asItem()))
                        .group("mossy_wooden_slab")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createSlabRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.ofItems(input.asItem()))
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createWoodenPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createPressurePlateRecipe(RecipeCategory.REDSTONE, result, Ingredient.ofItems(input))
                        .group("mossy_wooden_pressure_plate")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createPressurePlateRecipe(RecipeCategory.REDSTONE, result, Ingredient.ofItems(input))
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createFenceRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createFenceRecipe(result, Ingredient.ofItems(input))
                        .group("mossy_wooden_fence")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createFenceGateRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createFenceGateRecipe(result, Ingredient.ofItems(input))
                        .group("mossy_wooden_fence_gate")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter);
            }

            private void createWoodenButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createShapeless(RecipeCategory.REDSTONE, result)
                        .input(input)
                        .group("mossy_wooden_button")
                        .criterion("has_mossy_planks", this.conditionsFromTag(ModItemTags.MOSSY_PLANKS))
                        .offerTo(exporter, convertBetween(result, input));
            }

            private void createButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createShapeless(RecipeCategory.REDSTONE, result)
                        .input(input)
                        .criterion(hasItem(input), this.conditionsFromItem(input.asItem()))
                        .offerTo(exporter, convertBetween(result, input));
            }

            private void createGlassPaneRecipe(RecipeExporter exporter) {
                this.createShaped(RecipeCategory.DECORATIONS, ModBlocks.MOSSY_GLASS_PANE, 16)
                        .input('#', ModBlocks.MOSSY_GLASS)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(ModBlocks.MOSSY_GLASS), this.conditionsFromItem(ModBlocks.MOSSY_GLASS))
                        .offerTo(exporter);
            }

            private void createGlassPaneRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createShaped(RecipeCategory.DECORATIONS, result, 16)
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion("has_mossy_stained_glass", this.conditionsFromTag(ModItemTags.MOSSY_STAINED_GLASS))
                        .group("mossy_stained_glass")
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Nemo's Mossy Blocks Recipes";
    }
}
