package com.nemonotfound.nemos.mossy.blocks.datagen;

import com.nemonotfound.nemos.mossy.blocks.block.Blocks;
import com.nemonotfound.nemos.mossy.blocks.item.Items;
import com.nemonotfound.nemos.mossy.blocks.registry.tag.ItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.mossy.blocks.block.Blocks.*;
import static net.minecraft.block.Blocks.*;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createMossyBlockRecipe(exporter, STONE, Blocks.MOSSY_STONE, "mossy_stone");
                createMossyBlockRecipe(exporter, ACACIA_PLANKS, Blocks.MOSSY_ACACIA_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, BAMBOO_MOSAIC, Blocks.MOSSY_BAMBOO_MOSAIC, "mossy_planks");
                createMossyBlockRecipe(exporter, BIRCH_PLANKS, Blocks.MOSSY_BIRCH_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, CHERRY_PLANKS, Blocks.MOSSY_CHERRY_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, OAK_PLANKS, Blocks.MOSSY_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, WARPED_PLANKS, Blocks.MOSSY_WARPED_PLANKS, "mossy_planks");
                createMossyBlockRecipe(exporter, ACACIA_LOG, Blocks.MOSSY_ACACIA_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, BAMBOO_BLOCK, Blocks.MOSSY_BAMBOO_BLOCK, "mossy_log");
                createMossyBlockRecipe(exporter, BIRCH_LOG, Blocks.MOSSY_BIRCH_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, CHERRY_LOG, Blocks.MOSSY_CHERRY_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, CRIMSON_STEM, Blocks.MOSSY_CRIMSON_STEM, "mossy_log");
                createMossyBlockRecipe(exporter, DARK_OAK_LOG, Blocks.MOSSY_DARK_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, PALE_OAK_LOG, Blocks.MOSSY_PALE_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, JUNGLE_LOG, Blocks.MOSSY_JUNGLE_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, MANGROVE_LOG, Blocks.MOSSY_MANGROVE_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, OAK_LOG, Blocks.MOSSY_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, SPRUCE_LOG, Blocks.MOSSY_SPRUCE_LOG, "mossy_log");
                createMossyBlockRecipe(exporter, WARPED_STEM, Blocks.MOSSY_WARPED_STEM, "mossy_log");
                createMossyBlockRecipe(exporter, GLASS, Blocks.MOSSY_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, BLACK_STAINED_GLASS, Blocks.MOSSY_BLACK_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, BLUE_STAINED_GLASS, Blocks.MOSSY_BLUE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, BROWN_STAINED_GLASS, Blocks.MOSSY_BROWN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, CYAN_STAINED_GLASS, Blocks.MOSSY_CYAN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, GRAY_STAINED_GLASS, Blocks.MOSSY_GRAY_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, GREEN_STAINED_GLASS, Blocks.MOSSY_GREEN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, LIGHT_BLUE_STAINED_GLASS, Blocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, LIGHT_GRAY_STAINED_GLASS, Blocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, LIME_STAINED_GLASS, Blocks.MOSSY_LIME_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, MAGENTA_STAINED_GLASS, Blocks.MOSSY_MAGENTA_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, ORANGE_STAINED_GLASS, Blocks.MOSSY_ORANGE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, PINK_STAINED_GLASS, Blocks.MOSSY_PINK_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, PURPLE_STAINED_GLASS, Blocks.MOSSY_PURPLE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, RED_STAINED_GLASS, Blocks.MOSSY_RED_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, TINTED_GLASS, Blocks.MOSSY_TINTED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, WHITE_STAINED_GLASS, Blocks.MOSSY_WHITE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, YELLOW_STAINED_GLASS, Blocks.MOSSY_YELLOW_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(exporter, IRON_BARS, Blocks.MOSSY_IRON_BARS, "mossy_iron_bars");
                createMossyBlockRecipe(exporter, IRON_DOOR, Blocks.MOSSY_IRON_DOOR, "mossy_iron_door");
                createMossyBlockRecipe(exporter, IRON_TRAPDOOR, Blocks.MOSSY_IRON_TRAPDOOR, "mossy_iron_trapdoor");
                createMossyBlockRecipe(exporter, CHISELED_STONE_BRICKS, Blocks.MOSSY_CHISELED_STONE_BRICKS, "mossy_chiseled_stone_bricks");
                createMossyBlockRecipe(exporter, BRICKS, Blocks.MOSSY_BRICKS, "mossy_bricks");
                createMossyBlockRecipe(exporter, DEEPSLATE, Blocks.MOSSY_DEEPSLATE, "mossy_deepslate");
                createMossyBlockRecipe(exporter, COBBLED_DEEPSLATE, Blocks.MOSSY_COBBLED_DEEPSLATE, "mossy_cobbled_deepslate");
                createMossyBlockRecipe(exporter, DEEPSLATE_BRICKS, Blocks.MOSSY_DEEPSLATE_BRICKS, "mossy_deepslate_bricks");
                createMossyBlockRecipe(exporter, DEEPSLATE_TILES, Blocks.MOSSY_DEEPSLATE_TILES, "mossy_deepslate_tiles");
                createMossyBlockRecipe(exporter, TUFF, Blocks.MOSSY_TUFF, "mossy_tuff");
                createMossyBlockRecipe(exporter, TUFF_BRICKS, Blocks.MOSSY_TUFF_BRICKS, "mossy_tuff_bricks");

                createPlanksRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_ACACIA_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_BIRCH_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_CHERRY_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_OAK_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, "has_mossy_wood", "mossy_planks", ItemTags.MOSSY_WARPED_WOOD);

                createStairsRecipe(exporter, Blocks.MOSSY_STONE, Blocks.MOSSY_STONE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_STAIRS);
                createMossyWoodenStairsRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_STAIRS);
                createStairsRecipe(exporter, Blocks.MOSSY_BAMBOO_MOSAIC, Blocks.MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(exporter, Blocks.MOSSY_STONE, Blocks.MOSSY_STONE_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_SLAB);
                createMossyWoodenSlabRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_SLAB);
                createSlabRecipe(exporter, Blocks.MOSSY_BAMBOO_MOSAIC, Blocks.MOSSY_BAMBOO_MOSAIC_SLAB);

                createPressurePlateRecipe(exporter, Blocks.MOSSY_STONE, Blocks.MOSSY_STONE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_PRESSURE_PLATE);

                createMossyFenceRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_FENCE);
                createMossyFenceRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_FENCE);

                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_FENCE_GATE);
                createMossyFenceGateRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(exporter, Blocks.MOSSY_STONE, Blocks.MOSSY_STONE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_BUTTON);
                createMossyWoodenButtonRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_BUTTON);

                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_SLAB, Blocks.MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_STONE_STAIRS, Blocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_SLAB, Blocks.MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_STAIRS, Blocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_WALL, Blocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_CHISELED_STONE_BRICKS, Blocks.MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_BRICK_SLAB, Blocks.MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_BRICK_STAIRS, Blocks.MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_BRICK_WALL, Blocks.MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLED_DEEPSLATE_SLAB, Blocks.MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLED_DEEPSLATE_STAIRS, Blocks.MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_COBBLED_DEEPSLATE_WALL, Blocks.MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_DEEPSLATE_BRICK_SLAB, Blocks.MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_DEEPSLATE_BRICK_STAIRS, Blocks.MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_DEEPSLATE_BRICK_WALL, Blocks.MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_DEEPSLATE_TILE_SLAB, Blocks.MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_DEEPSLATE_TILE_STAIRS, Blocks.MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_DEEPSLATE_TILE_WALL, Blocks.MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_TUFF_SLAB, Blocks.MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_TUFF_STAIRS, Blocks.MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_TUFF_WALL, Blocks.MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_TUFF_BRICK_SLAB, Blocks.MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_TUFF_BRICK_STAIRS, Blocks.MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.MOSSY_TUFF_BRICK_WALL, Blocks.MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(exporter, Blocks.MOSSY_GLASS, Blocks.MOSSY_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_BLACK_STAINED_GLASS, Blocks.MOSSY_BLACK_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_BLUE_STAINED_GLASS, Blocks.MOSSY_BLUE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_BROWN_STAINED_GLASS, Blocks.MOSSY_BROWN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_CYAN_STAINED_GLASS, Blocks.MOSSY_CYAN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_GRAY_STAINED_GLASS, Blocks.MOSSY_GRAY_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_GREEN_STAINED_GLASS, Blocks.MOSSY_GREEN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, Blocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, Blocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_LIME_STAINED_GLASS, Blocks.MOSSY_LIME_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_MAGENTA_STAINED_GLASS, Blocks.MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_ORANGE_STAINED_GLASS, Blocks.MOSSY_ORANGE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_PINK_STAINED_GLASS, Blocks.MOSSY_PINK_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_PURPLE_STAINED_GLASS, Blocks.MOSSY_PURPLE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_RED_STAINED_GLASS, Blocks.MOSSY_RED_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_WHITE_STAINED_GLASS, Blocks.MOSSY_WHITE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(exporter, Blocks.MOSSY_YELLOW_STAINED_GLASS, Blocks.MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.offerBarkBlockRecipe(Blocks.MOSSY_ACACIA_WOOD, Blocks.MOSSY_ACACIA_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_BIRCH_WOOD, Blocks.MOSSY_BIRCH_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_DARK_OAK_WOOD, Blocks.MOSSY_DARK_OAK_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_PALE_OAK_WOOD, Blocks.MOSSY_PALE_OAK_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_JUNGLE_WOOD, Blocks.MOSSY_JUNGLE_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_OAK_WOOD, Blocks.MOSSY_OAK_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_SPRUCE_WOOD, Blocks.MOSSY_SPRUCE_LOG);
                this.offerBarkBlockRecipe(Blocks.MOSSY_CRIMSON_HYPHAE, Blocks.MOSSY_CRIMSON_STEM);
                this.offerBarkBlockRecipe(Blocks.MOSSY_WARPED_HYPHAE, Blocks.MOSSY_WARPED_STEM);
                this.offerBarkBlockRecipe(Blocks.MOSSY_MANGROVE_WOOD, Blocks.MOSSY_MANGROVE_LOG);

                this.offerMosaicRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_BAMBOO_MOSAIC, Blocks.MOSSY_BAMBOO_MOSAIC_SLAB);

                this.offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, MOSS_BLOCK, Items.MOSS_BALL);
                this.createShapeless(RecipeCategory.MISC, Items.MOSS_BALL, 4)
                        .input(MOSS_BLOCK)
                        .criterion(hasItem(MOSS_BLOCK), conditionsFromItem(MOSS_BLOCK))
                        .offerTo(exporter);

                createStairsRecipe(exporter, Blocks.MOSSY_BRICKS, Blocks.MOSSY_BRICK_STAIRS);
                createSlabRecipe(exporter, Blocks.MOSSY_BRICKS, Blocks.MOSSY_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_BRICK_WALL, Blocks.MOSSY_BRICKS);

                createMossyDoorRecipe(exporter, Blocks.MOSSY_OAK_DOOR, Blocks.MOSSY_OAK_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_SPRUCE_DOOR, Blocks.MOSSY_SPRUCE_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_BIRCH_DOOR, Blocks.MOSSY_BIRCH_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_CHERRY_DOOR, Blocks.MOSSY_CHERRY_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_JUNGLE_DOOR, Blocks.MOSSY_JUNGLE_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_BAMBOO_DOOR, Blocks.MOSSY_BAMBOO_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_MANGROVE_DOOR, Blocks.MOSSY_MANGROVE_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_DARK_OAK_DOOR, Blocks.MOSSY_DARK_OAK_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_PALE_OAK_DOOR, Blocks.MOSSY_PALE_OAK_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_ACACIA_DOOR, Blocks.MOSSY_ACACIA_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_CRIMSON_DOOR, Blocks.MOSSY_CRIMSON_PLANKS);
                createMossyDoorRecipe(exporter, Blocks.MOSSY_WARPED_DOOR, Blocks.MOSSY_WARPED_PLANKS);

                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_ACACIA_PLANKS, Blocks.MOSSY_ACACIA_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_BAMBOO_PLANKS, Blocks.MOSSY_BAMBOO_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_BIRCH_PLANKS, Blocks.MOSSY_BIRCH_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_CHERRY_PLANKS, Blocks.MOSSY_CHERRY_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_CRIMSON_PLANKS, Blocks.MOSSY_CRIMSON_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_DARK_OAK_PLANKS, Blocks.MOSSY_DARK_OAK_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_PALE_OAK_PLANKS, Blocks.MOSSY_PALE_OAK_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_JUNGLE_PLANKS, Blocks.MOSSY_JUNGLE_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_MANGROVE_PLANKS, Blocks.MOSSY_MANGROVE_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_OAK_PLANKS, Blocks.MOSSY_OAK_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_SPRUCE_PLANKS, Blocks.MOSSY_SPRUCE_TRAPDOOR);
                createMossyWoodenTrapdoorRecipe(exporter, Blocks.MOSSY_WARPED_PLANKS, Blocks.MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(exporter, Blocks.MOSSY_COBBLED_DEEPSLATE, Blocks.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(exporter, Blocks.MOSSY_COBBLED_DEEPSLATE, Blocks.MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_COBBLED_DEEPSLATE_WALL, Blocks.MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(exporter, Blocks.MOSSY_DEEPSLATE_BRICKS, Blocks.MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(exporter, Blocks.MOSSY_DEEPSLATE_BRICKS, Blocks.MOSSY_DEEPSLATE_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_DEEPSLATE_BRICK_WALL, Blocks.MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(exporter, Blocks.MOSSY_DEEPSLATE_TILES, Blocks.MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(exporter, Blocks.MOSSY_DEEPSLATE_TILES, Blocks.MOSSY_DEEPSLATE_TILE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_DEEPSLATE_TILE_WALL, Blocks.MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(exporter, Blocks.MOSSY_TUFF, Blocks.MOSSY_TUFF_STAIRS);
                createSlabRecipe(exporter, Blocks.MOSSY_TUFF, Blocks.MOSSY_TUFF_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_TUFF_WALL, Blocks.MOSSY_TUFF);

                createStairsRecipe(exporter, Blocks.MOSSY_TUFF_BRICKS, Blocks.MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(exporter, Blocks.MOSSY_TUFF_BRICKS, Blocks.MOSSY_TUFF_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.MOSSY_TUFF_BRICK_WALL, Blocks.MOSSY_TUFF_BRICKS);

                createPaleMossyBlockRecipe(exporter, STONE, Blocks.PALE_MOSSY_STONE, "pale_mossy_stone");
                createPaleMossyBlockRecipe(exporter, COBBLESTONE, Blocks.PALE_MOSSY_COBBLESTONE, "pale_mossy_cobblestone");
                createPaleMossyBlockRecipe(exporter, STONE_BRICKS, Blocks.PALE_MOSSY_STONE_BRICKS, "pale_mossy_stone_bricks");
                createPaleMossyBlockRecipe(exporter, ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, BAMBOO_MOSAIC, Blocks.PALE_MOSSY_BAMBOO_MOSAIC, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, OAK_PLANKS, Blocks.PALE_MOSSY_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(exporter, ACACIA_LOG, Blocks.PALE_MOSSY_ACACIA_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, BAMBOO_BLOCK, Blocks.PALE_MOSSY_BAMBOO_BLOCK, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, BIRCH_LOG, Blocks.PALE_MOSSY_BIRCH_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, CHERRY_LOG, Blocks.PALE_MOSSY_CHERRY_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, CRIMSON_STEM, Blocks.PALE_MOSSY_CRIMSON_STEM, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, DARK_OAK_LOG, Blocks.PALE_MOSSY_DARK_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, PALE_OAK_LOG, Blocks.PALE_MOSSY_PALE_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, JUNGLE_LOG, Blocks.PALE_MOSSY_JUNGLE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, MANGROVE_LOG, Blocks.PALE_MOSSY_MANGROVE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, OAK_LOG, Blocks.PALE_MOSSY_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, SPRUCE_LOG, Blocks.PALE_MOSSY_SPRUCE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, WARPED_STEM, Blocks.PALE_MOSSY_WARPED_STEM, "pale_mossy_log");
                createPaleMossyBlockRecipe(exporter, GLASS, Blocks.PALE_MOSSY_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, BLACK_STAINED_GLASS, Blocks.PALE_MOSSY_BLACK_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, BLUE_STAINED_GLASS, Blocks.PALE_MOSSY_BLUE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, BROWN_STAINED_GLASS, Blocks.PALE_MOSSY_BROWN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, CYAN_STAINED_GLASS, Blocks.PALE_MOSSY_CYAN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, GRAY_STAINED_GLASS, Blocks.PALE_MOSSY_GRAY_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, GREEN_STAINED_GLASS, Blocks.PALE_MOSSY_GREEN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, LIGHT_BLUE_STAINED_GLASS, Blocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, LIGHT_GRAY_STAINED_GLASS, Blocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, LIME_STAINED_GLASS, Blocks.PALE_MOSSY_LIME_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, MAGENTA_STAINED_GLASS, Blocks.PALE_MOSSY_MAGENTA_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, ORANGE_STAINED_GLASS, Blocks.PALE_MOSSY_ORANGE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, PINK_STAINED_GLASS, Blocks.PALE_MOSSY_PINK_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, PURPLE_STAINED_GLASS, Blocks.PALE_MOSSY_PURPLE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, RED_STAINED_GLASS, Blocks.PALE_MOSSY_RED_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, TINTED_GLASS, Blocks.PALE_MOSSY_TINTED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, WHITE_STAINED_GLASS, Blocks.PALE_MOSSY_WHITE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, YELLOW_STAINED_GLASS, Blocks.PALE_MOSSY_YELLOW_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(exporter, IRON_BARS, Blocks.PALE_MOSSY_IRON_BARS, "pale_mossy_iron_bars");
                createPaleMossyBlockRecipe(exporter, IRON_DOOR, Blocks.PALE_MOSSY_IRON_DOOR, "pale_mossy_iron_door");
                createPaleMossyBlockRecipe(exporter, IRON_TRAPDOOR, Blocks.PALE_MOSSY_IRON_TRAPDOOR, "pale_mossy_iron_trapdoor");
                createPaleMossyBlockRecipe(exporter, CHISELED_STONE_BRICKS, Blocks.PALE_MOSSY_CHISELED_STONE_BRICKS, "pale_mossy_chiseled_stone_bricks");
                createPaleMossyBlockRecipe(exporter, BRICKS, Blocks.PALE_MOSSY_BRICKS, "pale_mossy_bricks");
                createPaleMossyBlockRecipe(exporter, DEEPSLATE, Blocks.PALE_MOSSY_DEEPSLATE, "pale_mossy_deepslate");
                createPaleMossyBlockRecipe(exporter, COBBLED_DEEPSLATE, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE, "pale_mossy_cobbled_deepslate");
                createPaleMossyBlockRecipe(exporter, DEEPSLATE_BRICKS, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS, "pale_mossy_deepslate_bricks");
                createPaleMossyBlockRecipe(exporter, DEEPSLATE_TILES, Blocks.PALE_MOSSY_DEEPSLATE_TILES, "pale_mossy_deepslate_tiles");
                createPaleMossyBlockRecipe(exporter, TUFF, Blocks.PALE_MOSSY_TUFF, "pale_mossy_tuff");
                createPaleMossyBlockRecipe(exporter, TUFF_BRICKS, Blocks.PALE_MOSSY_TUFF_BRICKS, "pale_mossy_tuff_bricks");

                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_OAK_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", ItemTags.PALE_MOSSY_WARPED_WOOD);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_STONE, Blocks.PALE_MOSSY_STONE_STAIRS);
                createStairsRecipe(exporter, Blocks.PALE_MOSSY_COBBLESTONE, Blocks.PALE_MOSSY_COBBLESTONE_STAIRS);
                createStairsRecipe(exporter, Blocks.PALE_MOSSY_STONE_BRICKS, Blocks.PALE_MOSSY_STONE_BRICK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_STAIRS);
                createPaleMossyWoodenStairsRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_STAIRS);
                createStairsRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_MOSAIC, Blocks.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(exporter, Blocks.PALE_MOSSY_STONE, Blocks.PALE_MOSSY_STONE_SLAB);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_COBBLESTONE, Blocks.PALE_MOSSY_COBBLESTONE_SLAB);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_STONE_BRICKS, Blocks.PALE_MOSSY_STONE_BRICK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_SLAB);
                createPaleMossyWoodenSlabRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_SLAB);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_MOSAIC, Blocks.PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

                createPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_STONE, Blocks.PALE_MOSSY_STONE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_PRESSURE_PLATE);

                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_FENCE);
                createPaleMossyFenceRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_FENCE);

                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_FENCE_GATE);
                createPaleMossyFenceGateRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(exporter, Blocks.PALE_MOSSY_STONE, Blocks.PALE_MOSSY_STONE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_BUTTON);
                createPaleMossyWoodenButtonRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_BUTTON);

                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_SLAB, Blocks.PALE_MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_STAIRS, Blocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICK_SLAB, Blocks.PALE_MOSSY_STONE, 2);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICKS, Blocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICK_STAIRS, Blocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICK_WALL, Blocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_CHISELED_STONE_BRICKS, Blocks.PALE_MOSSY_STONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_COBBLESTONE_SLAB, Blocks.PALE_MOSSY_COBBLESTONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_COBBLESTONE_STAIRS, Blocks.PALE_MOSSY_COBBLESTONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_COBBLESTONE_WALL, Blocks.PALE_MOSSY_COBBLESTONE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICK_SLAB, Blocks.PALE_MOSSY_STONE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICK_STAIRS, Blocks.PALE_MOSSY_STONE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_STONE_BRICK_WALL, Blocks.PALE_MOSSY_STONE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_BRICK_SLAB, Blocks.PALE_MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_BRICK_STAIRS, Blocks.PALE_MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_BRICK_WALL, Blocks.PALE_MOSSY_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE_SLAB, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE_WALL, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_DEEPSLATE_BRICK_SLAB, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_DEEPSLATE_BRICK_STAIRS, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_DEEPSLATE_BRICK_WALL, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_DEEPSLATE_TILE_SLAB, Blocks.PALE_MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_DEEPSLATE_TILE_STAIRS, Blocks.PALE_MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_DEEPSLATE_TILE_WALL, Blocks.PALE_MOSSY_DEEPSLATE_TILES);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_TUFF_SLAB, Blocks.PALE_MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_TUFF_STAIRS, Blocks.PALE_MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_TUFF_WALL, Blocks.PALE_MOSSY_TUFF);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_TUFF_BRICK_SLAB, Blocks.PALE_MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_TUFF_BRICK_STAIRS, Blocks.PALE_MOSSY_TUFF_BRICKS);
                this.offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Blocks.PALE_MOSSY_TUFF_BRICK_WALL, Blocks.PALE_MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_GLASS, Blocks.PALE_MOSSY_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_BLACK_STAINED_GLASS, Blocks.PALE_MOSSY_BLACK_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_BLUE_STAINED_GLASS, Blocks.PALE_MOSSY_BLUE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_BROWN_STAINED_GLASS, Blocks.PALE_MOSSY_BROWN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_CYAN_STAINED_GLASS, Blocks.PALE_MOSSY_CYAN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_GRAY_STAINED_GLASS, Blocks.PALE_MOSSY_GRAY_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_GREEN_STAINED_GLASS, Blocks.PALE_MOSSY_GREEN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, Blocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, Blocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_LIME_STAINED_GLASS, Blocks.PALE_MOSSY_LIME_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_MAGENTA_STAINED_GLASS, Blocks.PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_ORANGE_STAINED_GLASS, Blocks.PALE_MOSSY_ORANGE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_PINK_STAINED_GLASS, Blocks.PALE_MOSSY_PINK_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_PURPLE_STAINED_GLASS, Blocks.PALE_MOSSY_PURPLE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_RED_STAINED_GLASS, Blocks.PALE_MOSSY_RED_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_WHITE_STAINED_GLASS, Blocks.PALE_MOSSY_WHITE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(exporter, Blocks.PALE_MOSSY_YELLOW_STAINED_GLASS, Blocks.PALE_MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_ACACIA_WOOD, Blocks.PALE_MOSSY_ACACIA_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_BIRCH_WOOD, Blocks.PALE_MOSSY_BIRCH_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_DARK_OAK_WOOD, Blocks.PALE_MOSSY_DARK_OAK_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_PALE_OAK_WOOD, Blocks.PALE_MOSSY_PALE_OAK_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_JUNGLE_WOOD, Blocks.PALE_MOSSY_JUNGLE_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_OAK_WOOD, Blocks.PALE_MOSSY_OAK_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_SPRUCE_WOOD, Blocks.PALE_MOSSY_SPRUCE_LOG);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_CRIMSON_HYPHAE, Blocks.PALE_MOSSY_CRIMSON_STEM);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_WARPED_HYPHAE, Blocks.PALE_MOSSY_WARPED_STEM);
                this.offerBarkBlockRecipe(Blocks.PALE_MOSSY_MANGROVE_WOOD, Blocks.PALE_MOSSY_MANGROVE_LOG);

                this.offerMosaicRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_BAMBOO_MOSAIC, Blocks.PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

                this.offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, PALE_MOSS_BLOCK, Items.PALE_MOSS_BALL);
                this.createShapeless(RecipeCategory.MISC, Items.PALE_MOSS_BALL, 4)
                        .input(PALE_MOSS_BLOCK)
                        .criterion(hasItem(PALE_MOSS_BLOCK), conditionsFromItem(PALE_MOSS_BLOCK))
                        .offerTo(exporter);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_BRICKS, Blocks.PALE_MOSSY_BRICK_STAIRS);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_BRICKS, Blocks.PALE_MOSSY_BRICK_SLAB);

                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_BRICK_WALL, Blocks.PALE_MOSSY_BRICKS);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_COBBLESTONE_WALL, Blocks.PALE_MOSSY_COBBLESTONE);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_STONE_BRICK_WALL, Blocks.PALE_MOSSY_STONE_BRICKS);

                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_OAK_DOOR, Blocks.PALE_MOSSY_OAK_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_DOOR, Blocks.PALE_MOSSY_SPRUCE_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_DOOR, Blocks.PALE_MOSSY_BIRCH_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_DOOR, Blocks.PALE_MOSSY_CHERRY_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_DOOR, Blocks.PALE_MOSSY_JUNGLE_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_DOOR, Blocks.PALE_MOSSY_BAMBOO_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_DOOR, Blocks.PALE_MOSSY_MANGROVE_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_DOOR, Blocks.PALE_MOSSY_DARK_OAK_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_DOOR, Blocks.PALE_MOSSY_PALE_OAK_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_DOOR, Blocks.PALE_MOSSY_ACACIA_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_DOOR, Blocks.PALE_MOSSY_CRIMSON_PLANKS);
                createPaleMossyDoorRecipe(exporter, Blocks.PALE_MOSSY_WARPED_DOOR, Blocks.PALE_MOSSY_WARPED_PLANKS);

                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_ACACIA_PLANKS, Blocks.PALE_MOSSY_ACACIA_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_BAMBOO_PLANKS, Blocks.PALE_MOSSY_BAMBOO_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_BIRCH_PLANKS, Blocks.PALE_MOSSY_BIRCH_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_CHERRY_PLANKS, Blocks.PALE_MOSSY_CHERRY_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_CRIMSON_PLANKS, Blocks.PALE_MOSSY_CRIMSON_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_DARK_OAK_PLANKS, Blocks.PALE_MOSSY_DARK_OAK_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_PALE_OAK_PLANKS, Blocks.PALE_MOSSY_PALE_OAK_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_JUNGLE_PLANKS, Blocks.PALE_MOSSY_JUNGLE_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_MANGROVE_PLANKS, Blocks.PALE_MOSSY_MANGROVE_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_OAK_PLANKS, Blocks.PALE_MOSSY_OAK_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_SPRUCE_PLANKS, Blocks.PALE_MOSSY_SPRUCE_TRAPDOOR);
                createPaleMossyWoodenTrapdoorRecipe(exporter, Blocks.PALE_MOSSY_WARPED_PLANKS, Blocks.PALE_MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE_WALL, Blocks.PALE_MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS, Blocks.PALE_MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS, Blocks.PALE_MOSSY_DEEPSLATE_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_DEEPSLATE_BRICK_WALL, Blocks.PALE_MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_DEEPSLATE_TILES, Blocks.PALE_MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_DEEPSLATE_TILES, Blocks.PALE_MOSSY_DEEPSLATE_TILE_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_DEEPSLATE_TILE_WALL, Blocks.PALE_MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_TUFF, Blocks.PALE_MOSSY_TUFF_STAIRS);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_TUFF, Blocks.PALE_MOSSY_TUFF_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_TUFF_WALL, Blocks.PALE_MOSSY_TUFF);

                createStairsRecipe(exporter, Blocks.PALE_MOSSY_TUFF_BRICKS, Blocks.PALE_MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(exporter, Blocks.PALE_MOSSY_TUFF_BRICKS, Blocks.PALE_MOSSY_TUFF_BRICK_SLAB);
                this.offerWallRecipe(RecipeCategory.DECORATIONS, Blocks.PALE_MOSSY_TUFF_BRICK_WALL, Blocks.PALE_MOSSY_TUFF_BRICKS);

                this.offerCarpetRecipe(CRIMSON_MOSS_CARPET, CRIMSON_MOSS_BLOCK);
                this.offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSS_BLOCK, Items.CRIMSON_MOSS_BALL);
                this.createShapeless(RecipeCategory.MISC, Items.CRIMSON_MOSS_BALL, 4)
                        .input(CRIMSON_MOSS_BLOCK)
                        .criterion(hasItem(CRIMSON_MOSS_BLOCK), conditionsFromItem(CRIMSON_MOSS_BLOCK))
                        .offerTo(exporter);

                this.offerCarpetRecipe(WARPED_MOSS_CARPET, WARPED_MOSS_BLOCK);
                this.offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSS_BLOCK, Items.WARPED_MOSS_BALL);
                this.createShapeless(RecipeCategory.MISC, Items.WARPED_MOSS_BALL, 4)
                        .input(WARPED_MOSS_BLOCK)
                        .criterion(hasItem(WARPED_MOSS_BLOCK), conditionsFromItem(WARPED_MOSS_BLOCK))
                        .offerTo(exporter);
            }

            private void createMossyDoorRecipe(RecipeExporter exporter, Block output, Block input) {
                createDoorRecipe(exporter, "mossy_wooden_doors", "has_mossy_planks", ItemTags.MOSSY_PLANKS, output, input);
            }

            private void createPaleMossyDoorRecipe(RecipeExporter exporter, Block output, Block input) {
                createDoorRecipe(exporter, "pale_mossy_wooden_doors", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, output, input);
            }

            private void createDoorRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block output, Block input) {
                this.createDoorRecipe(output, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyBlockRecipe(RecipeExporter exporter, Block input, Block result, String group) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .input(input).input(VINE).group(group)
                        .criterion(hasItem(VINE), this.conditionsFromItem(VINE))
                        .offerTo(exporter, convertBetween(result, VINE));
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .input(input).input(MOSS_BLOCK).group(group)
                        .criterion(hasItem(MOSS_BLOCK), this.conditionsFromItem(MOSS_BLOCK))
                        .offerTo(exporter, convertBetween(result, MOSS_BLOCK));
            }

            private void createPaleMossyBlockRecipe(RecipeExporter exporter, Block input, Block result, String group) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .input(input)
                        .input(PALE_MOSS_BLOCK)
                        .group(group)
                        .criterion(hasItem(PALE_MOSS_BLOCK), this.conditionsFromItem(PALE_MOSS_BLOCK))
                        .offerTo(exporter, convertBetween(result, PALE_MOSS_BLOCK));
            }

            public void createPlanksRecipe(RecipeExporter exporter, ItemConvertible output, String criterion, String group, TagKey<Item> input) {
                this.createShapeless(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .input(input)
                        .group(group)
                        .criterion(criterion, this.conditionsFromTag(input))
                        .offerTo(exporter);
            }

            private void createMossyWoodenStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenStairsRecipe(exporter, "mossy_wooden_stairs", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenStairsRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenStairsRecipe(exporter, "pale_mossy_wooden_stairs", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createWoodenStairsRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createStairsRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyWoodenTrapdoorRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenTrapdoorRecipe(exporter, "mossy_wooden_stairs", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenTrapdoorRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenTrapdoorRecipe(exporter, "pale_mossy_wooden_stairs", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
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
                createWoodenSlabRecipe(exporter, "mossy_wooden_slab", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenSlabRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenSlabRecipe(exporter, "pale_mossy_wooden_slab", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
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
                createWoodenPressurePlateRecipe(exporter, "mossy_wooden_pressure_plate", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenPressurePlateRecipe(exporter, "pale_mossy_wooden_pressure_plate", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
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
                createFenceRecipe(exporter, "mossy_wooden_fence", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyFenceRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceRecipe(exporter, "pale_mossy_wooden_fence", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createFenceRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createFenceRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyFenceGateRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceGateRecipe(exporter, "mossy_wooden_fence_gate", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyFenceGateRecipe(RecipeExporter exporter, Block input, Block result) {
                createFenceGateRecipe(exporter, "pale_mossy_wooden_fence_gate", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createFenceGateRecipe(RecipeExporter exporter, String group, String criteria, TagKey<Item> tag, Block input, Block result) {
                this.createFenceGateRecipe(result, Ingredient.ofItems(input))
                        .group(group)
                        .criterion(criteria, this.conditionsFromTag(tag))
                        .offerTo(exporter);
            }

            private void createMossyWoodenButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenButtonRecipe(exporter, "mossy_wooden_button", "has_mossy_planks", ItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenButtonRecipe(RecipeExporter exporter, Block input, Block result) {
                createWoodenButtonRecipe(exporter, "pale_mossy_wooden_button", "has_pale_mossy_planks", ItemTags.PALE_MOSSY_PLANKS, input, result);
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
                createStainedGlassPaneRecipe(exporter, "mossy_stained_glass", "has_mossy_stained_glass", ItemTags.MOSSY_STAINED_GLASS, input, result);
            }

            private void createPaleMossyStainedGlassPaneRecipe(RecipeExporter exporter, Block input, Block result) {
                createStainedGlassPaneRecipe(exporter, "pale_mossy_stained_glass", "has_pale_mossy_stained_glass", ItemTags.PALE_MOSSY_STAINED_GLASS, input, result);
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
