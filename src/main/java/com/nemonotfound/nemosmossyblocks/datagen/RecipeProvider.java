package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import com.nemonotfound.nemosmossyblocks.item.ModItems;
import com.nemonotfound.nemosmossyblocks.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
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
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_STAIRS);
                createStairsRecipe(exporter, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_SLAB);
                createMossyWoodenSlabRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_SLAB);
                createSlabRecipe(exporter, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);

                createPressurePlateRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_PRESSURE_PLATE);

                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_FENCE);
                createMossyFenceRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_FENCE);

                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_BUTTON);

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

                createGlassPaneRecipe(exporter, ModBlocks.MOSSY_GLASS, ModBlocks.MOSSY_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_BLACK_STAINED_GLASS, ModBlocks.MOSSY_BLACK_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_BLUE_STAINED_GLASS, ModBlocks.MOSSY_BLUE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_BROWN_STAINED_GLASS, ModBlocks.MOSSY_BROWN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_CYAN_STAINED_GLASS, ModBlocks.MOSSY_CYAN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_GRAY_STAINED_GLASS, ModBlocks.MOSSY_GRAY_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_GREEN_STAINED_GLASS, ModBlocks.MOSSY_GREEN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIME_STAINED_GLASS, ModBlocks.MOSSY_LIME_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_ORANGE_STAINED_GLASS, ModBlocks.MOSSY_ORANGE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_PINK_STAINED_GLASS, ModBlocks.MOSSY_PINK_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_PURPLE_STAINED_GLASS, ModBlocks.MOSSY_PURPLE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_RED_STAINED_GLASS, ModBlocks.MOSSY_RED_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_WHITE_STAINED_GLASS, ModBlocks.MOSSY_WHITE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, ModBlocks.MOSSY_YELLOW_STAINED_GLASS, ModBlocks.MOSSY_YELLOW_STAINED_GLASS_PANE);

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

                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_OAK_DOOR, ModBlocks.MOSSY_OAK_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_SPRUCE_DOOR, ModBlocks.MOSSY_SPRUCE_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_BIRCH_DOOR, ModBlocks.MOSSY_BIRCH_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_CHERRY_DOOR, ModBlocks.MOSSY_CHERRY_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_JUNGLE_DOOR, ModBlocks.MOSSY_JUNGLE_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_BAMBOO_DOOR, ModBlocks.MOSSY_BAMBOO_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_MANGROVE_DOOR, ModBlocks.MOSSY_MANGROVE_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_DOOR, ModBlocks.MOSSY_DARK_OAK_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_ACACIA_DOOR, ModBlocks.MOSSY_ACACIA_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_CRIMSON_DOOR, ModBlocks.MOSSY_CRIMSON_PLANKS);
                createMossyDoorRecipe(exporter, ModBlocks.MOSSY_WARPED_DOOR, ModBlocks.MOSSY_WARPED_PLANKS);

                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_TRAPDOOR);

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

                createPaleMossyBlockRecipe(exporter, Blocks.STONE, ModBlocks.PALE_MOSSY_STONE, "pale_mossy_stone");
                createPaleMossyBlockRecipe(exporter, Blocks.COBBLESTONE, ModBlocks.PALE_MOSSY_COBBLESTONE, "pale_mossy_cobblestone");
                createPaleMossyBlockRecipe(exporter, Blocks.STONE_BRICKS, ModBlocks.PALE_MOSSY_STONE_BRICKS, "pale_mossy_stone_bricks");
                createPaleMossyBlockRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.BAMBOO_MOSAIC, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, Blocks.ACACIA_LOG, ModBlocks.PALE_MOSSY_ACACIA_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.BAMBOO_BLOCK, ModBlocks.PALE_MOSSY_BAMBOO_BLOCK, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.BIRCH_LOG, ModBlocks.PALE_MOSSY_BIRCH_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.CHERRY_LOG, ModBlocks.PALE_MOSSY_CHERRY_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.CRIMSON_STEM, ModBlocks.PALE_MOSSY_CRIMSON_STEM, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.DARK_OAK_LOG, ModBlocks.PALE_MOSSY_DARK_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.JUNGLE_LOG, ModBlocks.PALE_MOSSY_JUNGLE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.MANGROVE_LOG, ModBlocks.PALE_MOSSY_MANGROVE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.OAK_LOG, ModBlocks.PALE_MOSSY_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.SPRUCE_LOG, ModBlocks.PALE_MOSSY_SPRUCE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.WARPED_STEM, ModBlocks.PALE_MOSSY_WARPED_STEM, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, Blocks.GLASS, ModBlocks.PALE_MOSSY_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.BLACK_STAINED_GLASS, ModBlocks.PALE_MOSSY_BLACK_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.BLUE_STAINED_GLASS, ModBlocks.PALE_MOSSY_BLUE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.BROWN_STAINED_GLASS, ModBlocks.PALE_MOSSY_BROWN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.CYAN_STAINED_GLASS, ModBlocks.PALE_MOSSY_CYAN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.GRAY_STAINED_GLASS, ModBlocks.PALE_MOSSY_GRAY_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.GREEN_STAINED_GLASS, ModBlocks.PALE_MOSSY_GREEN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.LIGHT_BLUE_STAINED_GLASS, ModBlocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.LIGHT_GRAY_STAINED_GLASS, ModBlocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.LIME_STAINED_GLASS, ModBlocks.PALE_MOSSY_LIME_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.MAGENTA_STAINED_GLASS, ModBlocks.PALE_MOSSY_MAGENTA_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.ORANGE_STAINED_GLASS, ModBlocks.PALE_MOSSY_ORANGE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.PINK_STAINED_GLASS, ModBlocks.PALE_MOSSY_PINK_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.PURPLE_STAINED_GLASS, ModBlocks.PALE_MOSSY_PURPLE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.RED_STAINED_GLASS, ModBlocks.PALE_MOSSY_RED_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.TINTED_GLASS, ModBlocks.PALE_MOSSY_TINTED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.WHITE_STAINED_GLASS, ModBlocks.PALE_MOSSY_WHITE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.YELLOW_STAINED_GLASS, ModBlocks.PALE_MOSSY_YELLOW_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, Blocks.IRON_BARS, ModBlocks.PALE_MOSSY_IRON_BARS, "pale_mossy_iron_bars");
                createPaleMossyBlockRecipe(exporter, Blocks.IRON_DOOR, ModBlocks.PALE_MOSSY_IRON_DOOR, "pale_mossy_iron_door");
                createPaleMossyBlockRecipe(exporter, Blocks.IRON_TRAPDOOR, ModBlocks.PALE_MOSSY_IRON_TRAPDOOR, "pale_mossy_iron_trapdoor");
                createPaleMossyBlockRecipe(exporter, Blocks.CHISELED_STONE_BRICKS, ModBlocks.PALE_MOSSY_CHISELED_STONE_BRICKS, "pale_mossy_chiseled_stone_bricks");
                createPaleMossyBlockRecipe(exporter, Blocks.BRICKS, ModBlocks.PALE_MOSSY_BRICKS, "pale_mossy_bricks");
                createPaleMossyBlockRecipe(exporter, Blocks.DEEPSLATE, ModBlocks.PALE_MOSSY_DEEPSLATE, "pale_mossy_deepslate");
                createPaleMossyBlockRecipe(exporter, Blocks.COBBLED_DEEPSLATE, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE, "pale_mossy_cobbled_deepslate");
                createPaleMossyBlockRecipe(exporter, Blocks.DEEPSLATE_BRICKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS, "pale_mossy_deepslate_bricks");
                createPaleMossyBlockRecipe(exporter, Blocks.DEEPSLATE_TILES, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES, "pale_mossy_deepslate_tiles");
                createPaleMossyBlockRecipe(exporter, Blocks.TUFF, ModBlocks.PALE_MOSSY_TUFF, "pale_mossy_tuff");
                createPaleMossyBlockRecipe(exporter, Blocks.TUFF_BRICKS, ModBlocks.PALE_MOSSY_TUFF_BRICKS, "pale_mossy_tuff_bricks");

                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_OAK_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ModItemTags.PALE_MOSSY_WARPED_WOOD);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_STONE, ModBlocks.PALE_MOSSY_STONE_STAIRS);
                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_COBBLESTONE, ModBlocks.PALE_MOSSY_COBBLESTONE_STAIRS);
                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_STONE_BRICKS, ModBlocks.PALE_MOSSY_STONE_BRICK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_STAIRS);
                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_STONE, ModBlocks.PALE_MOSSY_STONE_SLAB);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_COBBLESTONE, ModBlocks.PALE_MOSSY_COBBLESTONE_SLAB);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_STONE_BRICKS, ModBlocks.PALE_MOSSY_STONE_BRICK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_SLAB);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

                createPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_STONE, ModBlocks.PALE_MOSSY_STONE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_PRESSURE_PLATE);

                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_FENCE);
                createPaleMossyFenceRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_FENCE);

                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(exporter, ModBlocks.PALE_MOSSY_STONE, ModBlocks.PALE_MOSSY_STONE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_BUTTON);

                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_SLAB, ModBlocks.PALE_MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_STAIRS, ModBlocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICK_SLAB, ModBlocks.PALE_MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICKS, ModBlocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICK_STAIRS, ModBlocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICK_WALL, ModBlocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_CHISELED_STONE_BRICKS, ModBlocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_COBBLESTONE_SLAB, ModBlocks.PALE_MOSSY_COBBLESTONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_COBBLESTONE_STAIRS, ModBlocks.PALE_MOSSY_COBBLESTONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_COBBLESTONE_WALL, ModBlocks.PALE_MOSSY_COBBLESTONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICK_SLAB, ModBlocks.PALE_MOSSY_STONE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICK_STAIRS, ModBlocks.PALE_MOSSY_STONE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_STONE_BRICK_WALL, ModBlocks.PALE_MOSSY_STONE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_BRICK_SLAB, ModBlocks.PALE_MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_BRICK_STAIRS, ModBlocks.PALE_MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_BRICK_WALL, ModBlocks.PALE_MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_SLAB, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_SLAB, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_STAIRS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_SLAB, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_STAIRS, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_TUFF_SLAB, ModBlocks.PALE_MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_TUFF_STAIRS, ModBlocks.PALE_MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_TUFF_WALL, ModBlocks.PALE_MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_TUFF_BRICK_SLAB, ModBlocks.PALE_MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_TUFF_BRICK_STAIRS, ModBlocks.PALE_MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_MOSSY_TUFF_BRICK_WALL, ModBlocks.PALE_MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_GLASS, ModBlocks.PALE_MOSSY_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_BLACK_STAINED_GLASS, ModBlocks.PALE_MOSSY_BLACK_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_BLUE_STAINED_GLASS, ModBlocks.PALE_MOSSY_BLUE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_BROWN_STAINED_GLASS, ModBlocks.PALE_MOSSY_BROWN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_CYAN_STAINED_GLASS, ModBlocks.PALE_MOSSY_CYAN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_GRAY_STAINED_GLASS, ModBlocks.PALE_MOSSY_GRAY_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_GREEN_STAINED_GLASS, ModBlocks.PALE_MOSSY_GREEN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, ModBlocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, ModBlocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_LIME_STAINED_GLASS, ModBlocks.PALE_MOSSY_LIME_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_MAGENTA_STAINED_GLASS, ModBlocks.PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_ORANGE_STAINED_GLASS, ModBlocks.PALE_MOSSY_ORANGE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_PINK_STAINED_GLASS, ModBlocks.PALE_MOSSY_PINK_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_PURPLE_STAINED_GLASS, ModBlocks.PALE_MOSSY_PURPLE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_RED_STAINED_GLASS, ModBlocks.PALE_MOSSY_RED_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_WHITE_STAINED_GLASS, ModBlocks.PALE_MOSSY_WHITE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, ModBlocks.PALE_MOSSY_YELLOW_STAINED_GLASS, ModBlocks.PALE_MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_ACACIA_WOOD, ModBlocks.PALE_MOSSY_ACACIA_LOG);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_BIRCH_WOOD, ModBlocks.PALE_MOSSY_BIRCH_LOG);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_DARK_OAK_WOOD, ModBlocks.PALE_MOSSY_DARK_OAK_LOG);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_JUNGLE_WOOD, ModBlocks.PALE_MOSSY_JUNGLE_LOG);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_OAK_WOOD, ModBlocks.PALE_MOSSY_OAK_LOG);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_SPRUCE_WOOD, ModBlocks.PALE_MOSSY_SPRUCE_LOG);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_CRIMSON_HYPHAE, ModBlocks.PALE_MOSSY_CRIMSON_STEM);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_WARPED_HYPHAE, ModBlocks.PALE_MOSSY_WARPED_STEM);
                this.offerBarkBlockRecipe(ModBlocks.PALE_MOSSY_MANGROVE_WOOD, ModBlocks.PALE_MOSSY_MANGROVE_LOG);

                this.offerMosaicRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC, ModBlocks.PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

                this.offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSS_BLOCK, ModItems.PALE_MOSS_BALL);
                this.createShapeless(RecipeCategory.MISC, ModItems.PALE_MOSS_BALL, 4)
                        .input(Blocks.PALE_MOSS_BLOCK)
                        .criterion(hasItem(Blocks.PALE_MOSS_BLOCK), conditionsFromItem(Blocks.PALE_MOSS_BLOCK))
                        .offerTo(exporter);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_BRICKS, ModBlocks.PALE_MOSSY_BRICK_STAIRS);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_BRICKS, ModBlocks.PALE_MOSSY_BRICK_SLAB);

                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_BRICK_WALL, ModBlocks.PALE_MOSSY_BRICKS);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_COBBLESTONE_WALL, ModBlocks.PALE_MOSSY_COBBLESTONE);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_STONE_BRICK_WALL, ModBlocks.PALE_MOSSY_STONE_BRICKS);

                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_DOOR, ModBlocks.PALE_MOSSY_OAK_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_DOOR, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_DOOR, ModBlocks.PALE_MOSSY_BIRCH_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_DOOR, ModBlocks.PALE_MOSSY_CHERRY_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_DOOR, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_DOOR, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_DOOR, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_DOOR, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_DOOR, ModBlocks.PALE_MOSSY_ACACIA_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_DOOR, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS);
                createPaleMossyDoorRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_DOOR, ModBlocks.PALE_MOSSY_WARPED_PLANKS);

                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_ACACIA_PLANKS, ModBlocks.PALE_MOSSY_ACACIA_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_BAMBOO_PLANKS, ModBlocks.PALE_MOSSY_BAMBOO_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_BIRCH_PLANKS, ModBlocks.PALE_MOSSY_BIRCH_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_CHERRY_PLANKS, ModBlocks.PALE_MOSSY_CHERRY_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_CRIMSON_PLANKS, ModBlocks.PALE_MOSSY_CRIMSON_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_DARK_OAK_PLANKS, ModBlocks.PALE_MOSSY_DARK_OAK_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_JUNGLE_PLANKS, ModBlocks.PALE_MOSSY_JUNGLE_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_MANGROVE_PLANKS, ModBlocks.PALE_MOSSY_MANGROVE_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_OAK_PLANKS, ModBlocks.PALE_MOSSY_OAK_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_SPRUCE_PLANKS, ModBlocks.PALE_MOSSY_SPRUCE_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, ModBlocks.PALE_MOSSY_WARPED_PLANKS, ModBlocks.PALE_MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE_WALL, ModBlocks.PALE_MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICK_WALL, ModBlocks.PALE_MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_DEEPSLATE_TILE_WALL, ModBlocks.PALE_MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_TUFF, ModBlocks.PALE_MOSSY_TUFF_STAIRS);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_TUFF, ModBlocks.PALE_MOSSY_TUFF_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_TUFF_WALL, ModBlocks.PALE_MOSSY_TUFF);

                createStairsRecipe(exporter, ModBlocks.PALE_MOSSY_TUFF_BRICKS, ModBlocks.PALE_MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(exporter, ModBlocks.PALE_MOSSY_TUFF_BRICKS, ModBlocks.PALE_MOSSY_TUFF_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, ModBlocks.PALE_MOSSY_TUFF_BRICK_WALL, ModBlocks.PALE_MOSSY_TUFF_BRICKS);
            }

            private void createMossyDoorRecipe(RecipeExporter exporter, Block output, Block input) {
                createDoorRecipe(exporter, "mossy_wooden_doors", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, output, input);
            }

            private void createPaleMossyDoorRecipe(RecipeExporter exporter, Block output, Block input) {
                createDoorRecipe(exporter, "pale_mossy_wooden_doors", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, output, input);
            }

            private void createDoorRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block output, Block input) {
                this.createDoorRecipe(output, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
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

            private void createPaleMossyBlockRecipe(RecipeExporter exporter, Block input, Block result, String group) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .input(input)
                        .input(Blocks.PALE_MOSS_BLOCK)
                        .group(group)
                        .criterion(hasItem(Blocks.PALE_MOSS_BLOCK), this.conditionsFromItem(Blocks.PALE_MOSS_BLOCK))
                        .offerTo(exporter, convertBetween(result, Blocks.PALE_MOSS_BLOCK));
            }

            public void createPlanksRecipe(RecipeExporter exporter, ItemConvertible output, String criterion, String group, TagKey<Item> input) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .input(input)
                        .group(group)
                        .criterion(criterion, this.conditionsFromTag(input))
                        .offerTo(exporter);
            }

            private void createMossyWoodenStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenStairsRecipe(exporter, "mossy_wooden_stairs", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenStairsRecipe(exporter, "pale_mossy_wooden_stairs", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createWoodenStairsRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createStairsRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyWoodenTrapdoorRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenTrapdoorRecipe(exporter, "mossy_wooden_stairs", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenTrapdoorRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenTrapdoorRecipe(exporter, "pale_mossy_wooden_stairs", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createWoodenTrapdoorRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createTrapdoorRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createStairsRecipe(result, Ingredient.ofItems(input))
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createMossyWoodenSlabRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenSlabRecipe(exporter, "mossy_wooden_slab", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenSlabRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenSlabRecipe(exporter, "pale_mossy_wooden_slab", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createWoodenSlabRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.ofItems(input.asItem()))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createSlabRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.ofItems(input.asItem()))
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createMossyWoodenPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenPressurePlateRecipe(exporter, "mossy_wooden_pressure_plate", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenPressurePlateRecipe(exporter, "pale_mossy_wooden_pressure_plate", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createWoodenPressurePlateRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createPressurePlateRecipe(RecipeCategory.REDSTONE, result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createPressurePlateRecipe(RecipeCategory.REDSTONE, result, Ingredient.ofItems(input))
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createMossyFenceRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceRecipe(exporter, "mossy_wooden_fence", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyFenceRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceRecipe(exporter, "pale_mossy_wooden_fence", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createFenceRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createFenceRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyFenceGateRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceGateRecipe(exporter, "mossy_wooden_fence_gate", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyFenceGateRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceGateRecipe(exporter, "pale_mossy_wooden_fence_gate", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createFenceGateRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createFenceGateRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyWoodenButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenButtonRecipe(exporter, "mossy_wooden_button", "has_mossy_planks", ModItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenButtonRecipe(exporter, "pale_mossy_wooden_button", "has_pale_mossy_planks", ModItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createWoodenButtonRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createShapeless(RecipeCategory.REDSTONE, result)
                        .input(input)
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter, convertBetween(result, input));
            }

            private void createButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                this.createShapeless(RecipeCategory.REDSTONE, result)
                        .input(input)
                        .criterion(hasItem(input), this.conditionsFromItem(input.asItem()))
                        .offerTo(exporter, convertBetween(result, input));
            }

            private void createGlassPaneRecipe(RecipeExporter exporter, Block input, Block output) {
                this.createShaped(RecipeCategory.DECORATIONS, output, 16)
                        .input('#', input)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(input), this.conditionsFromItem(input))
                        .offerTo(exporter);
            }

            private void createMossyStainedGlassPaneRecipe(RecipeExporter exporter, Block input, Block result) {
                createStainedGlassPaneRecipe(exporter, "mossy_stained_glass", "has_mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS, input, result);
            }

            private void createPaleMossyStainedGlassPaneRecipe(RecipeExporter exporter, Block input, Block result) {
                createStainedGlassPaneRecipe(exporter, "pale_mossy_stained_glass", "has_pale_mossy_stained_glass", ModItemTags.PALE_MOSSY_STAINED_GLASS, input, result);
            }

            private void createStainedGlassPaneRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createShaped(RecipeCategory.DECORATIONS, result, 16)
                        .input('#', input)
                        .group(group)
                        .pattern("###")
                        .pattern("###")
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Nemo's Mossy Blocks Recipes";
    }
}
