package com.nemonotfound.nemos.mossy.blocks.datagen;

import com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems.*;
import static net.minecraft.world.item.Items.*;

public class NemosMossyRecipeProvider extends FabricRecipeProvider {

    public NemosMossyRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider provider, @NonNull RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                createMossyBlockRecipe(recipeOutput, STONE, MOSSY_STONE, "mossy_stone");
                createMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, MOSSY_ACACIA_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, MOSSY_BAMBOO_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, MOSSY_BAMBOO_MOSAIC, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, MOSSY_BIRCH_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, MOSSY_CHERRY_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, MOSSY_CRIMSON_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, MOSSY_DARK_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, MOSSY_PALE_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, MOSSY_JUNGLE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, MOSSY_MANGROVE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, OAK_PLANKS, MOSSY_OAK_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, MOSSY_SPRUCE_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, WARPED_PLANKS, MOSSY_WARPED_PLANKS, "mossy_planks");
                createMossyBlockRecipe(recipeOutput, ACACIA_LOG, MOSSY_ACACIA_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, MOSSY_BAMBOO_BLOCK, "mossy_log");
                createMossyBlockRecipe(recipeOutput, BIRCH_LOG, MOSSY_BIRCH_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, CHERRY_LOG, MOSSY_CHERRY_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, CRIMSON_STEM, MOSSY_CRIMSON_STEM, "mossy_log");
                createMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, MOSSY_DARK_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, MOSSY_PALE_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, JUNGLE_LOG, MOSSY_JUNGLE_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, MANGROVE_LOG, MOSSY_MANGROVE_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, OAK_LOG, MOSSY_OAK_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, SPRUCE_LOG, MOSSY_SPRUCE_LOG, "mossy_log");
                createMossyBlockRecipe(recipeOutput, WARPED_STEM, MOSSY_WARPED_STEM, "mossy_log");
                createMossyBlockRecipe(recipeOutput, GLASS, MOSSY_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, MOSSY_BLACK_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, MOSSY_BLUE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, MOSSY_BROWN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, MOSSY_CYAN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, MOSSY_GRAY_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, MOSSY_GREEN_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, MOSSY_LIGHT_BLUE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, MOSSY_LIGHT_GRAY_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, MOSSY_LIME_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, MOSSY_MAGENTA_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, MOSSY_ORANGE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, MOSSY_PINK_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, MOSSY_PURPLE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, MOSSY_RED_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, TINTED_GLASS, MOSSY_TINTED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, MOSSY_WHITE_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, MOSSY_YELLOW_STAINED_GLASS, "mossy_glass");
                createMossyBlockRecipe(recipeOutput, IRON_BARS, MOSSY_IRON_BARS, "mossy_iron_bars");
                createMossyBlockRecipe(recipeOutput, IRON_DOOR, MOSSY_IRON_DOOR, "mossy_iron_door");
                createMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, MOSSY_IRON_TRAPDOOR, "mossy_iron_trapdoor");
                createMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, MOSSY_CHISELED_STONE_BRICKS, "mossy_chiseled_stone_bricks");
                createMossyBlockRecipe(recipeOutput, BRICKS, MOSSY_BRICKS, "mossy_bricks");
                createMossyBlockRecipe(recipeOutput, DEEPSLATE, MOSSY_DEEPSLATE, "mossy_deepslate");
                createMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, MOSSY_COBBLED_DEEPSLATE, "mossy_cobbled_deepslate");
                createMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, MOSSY_DEEPSLATE_BRICKS, "mossy_deepslate_bricks");
                createMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, MOSSY_DEEPSLATE_TILES, "mossy_deepslate_tiles");
                createMossyBlockRecipe(recipeOutput, TUFF, MOSSY_TUFF, "mossy_tuff");
                createMossyBlockRecipe(recipeOutput, TUFF_BRICKS, MOSSY_TUFF_BRICKS, "mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, MOSSY_ACACIA_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_BAMBOO_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, MOSSY_BIRCH_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_CHERRY_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_CRIMSON_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_DARK_OAK_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_PALE_OAK_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_JUNGLE_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_MANGROVE_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_OAK_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_SPRUCE_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_WARPED_PLANKS, "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, MOSSY_STONE, MOSSY_STONE_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_STAIRS);
                mossyStairBuilder(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_STAIRS);
                createStairsRecipe(recipeOutput, MOSSY_BAMBOO_MOSAIC, MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(recipeOutput, MOSSY_STONE, MOSSY_STONE_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_SLAB);
                mossySlabBuilder(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_SLAB);
                createSlabRecipe(recipeOutput, MOSSY_BAMBOO_MOSAIC, MOSSY_BAMBOO_MOSAIC_SLAB);

                pressurePlateBuilder(recipeOutput, MOSSY_STONE, MOSSY_STONE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_PRESSURE_PLATE);
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_PRESSURE_PLATE);

                mossyFenceBuilder(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_FENCE);
                mossyFenceBuilder(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_FENCE);

                mossyFenceGateBuilder(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_FENCE_GATE);
                mossyFenceGateBuilder(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(recipeOutput, MOSSY_STONE, MOSSY_STONE_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_BUTTON);
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_BUTTON);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_SLAB, MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_STAIRS, MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_SLAB, MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICKS, MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_STAIRS, MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_WALL, MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_CHISELED_STONE_BRICKS, MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_BRICK_SLAB, MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_BRICK_STAIRS, MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_BRICK_WALL, MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_COBBLED_DEEPSLATE_SLAB, MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_COBBLED_DEEPSLATE_STAIRS, MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_COBBLED_DEEPSLATE_WALL, MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_BRICK_SLAB, MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_BRICK_STAIRS, MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_BRICK_WALL, MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_TILE_SLAB, MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_TILE_STAIRS, MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_TILE_WALL, MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_SLAB, MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_STAIRS, MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_WALL, MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_BRICK_SLAB, MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_BRICK_STAIRS, MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_BRICK_WALL, MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(recipeOutput, MOSSY_GLASS, MOSSY_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_BLACK_STAINED_GLASS, MOSSY_BLACK_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_BLUE_STAINED_GLASS, MOSSY_BLUE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_BROWN_STAINED_GLASS, MOSSY_BROWN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_CYAN_STAINED_GLASS, MOSSY_CYAN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_GRAY_STAINED_GLASS, MOSSY_GRAY_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_GREEN_STAINED_GLASS, MOSSY_GREEN_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_LIGHT_BLUE_STAINED_GLASS, MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_LIGHT_GRAY_STAINED_GLASS, MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_LIME_STAINED_GLASS, MOSSY_LIME_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_MAGENTA_STAINED_GLASS, MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_ORANGE_STAINED_GLASS, MOSSY_ORANGE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_PINK_STAINED_GLASS, MOSSY_PINK_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_PURPLE_STAINED_GLASS, MOSSY_PURPLE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_RED_STAINED_GLASS, MOSSY_RED_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_WHITE_STAINED_GLASS, MOSSY_WHITE_STAINED_GLASS_PANE);
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_YELLOW_STAINED_GLASS, MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.woodFromLogs(MOSSY_ACACIA_WOOD, MOSSY_ACACIA_LOG);
                this.woodFromLogs(MOSSY_BIRCH_WOOD, MOSSY_BIRCH_LOG);
                this.woodFromLogs(MOSSY_DARK_OAK_WOOD, MOSSY_DARK_OAK_LOG);
                this.woodFromLogs(MOSSY_PALE_OAK_WOOD, MOSSY_PALE_OAK_LOG);
                this.woodFromLogs(MOSSY_JUNGLE_WOOD, MOSSY_JUNGLE_LOG);
                this.woodFromLogs(MOSSY_OAK_WOOD, MOSSY_OAK_LOG);
                this.woodFromLogs(MOSSY_SPRUCE_WOOD, MOSSY_SPRUCE_LOG);
                this.woodFromLogs(MOSSY_CRIMSON_HYPHAE, MOSSY_CRIMSON_STEM);
                this.woodFromLogs(MOSSY_WARPED_HYPHAE, MOSSY_WARPED_STEM);
                this.woodFromLogs(MOSSY_MANGROVE_WOOD, MOSSY_MANGROVE_LOG);

                this.mosaicBuilder(RecipeCategory.DECORATIONS, MOSSY_BAMBOO_MOSAIC, MOSSY_BAMBOO_MOSAIC_SLAB);

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, MOSS_BLOCK, MOSS_BALL);
                this.shapeless(RecipeCategory.MISC, MOSS_BALL, 4)
                        .requires(MOSS_BLOCK)
                        .unlockedBy(getHasName(MOSS_BLOCK), has(MOSS_BLOCK))
                        .save(recipeOutput);

                createStairsRecipe(recipeOutput, MOSSY_BRICKS, MOSSY_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, MOSSY_BRICKS, MOSSY_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, MOSSY_BRICK_WALL, MOSSY_BRICKS);

                mossyDoorBuilder(recipeOutput, MOSSY_OAK_DOOR, MOSSY_OAK_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_SPRUCE_DOOR, MOSSY_SPRUCE_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_BIRCH_DOOR, MOSSY_BIRCH_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_CHERRY_DOOR, MOSSY_CHERRY_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_JUNGLE_DOOR, MOSSY_JUNGLE_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_BAMBOO_DOOR, MOSSY_BAMBOO_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_MANGROVE_DOOR, MOSSY_MANGROVE_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_DARK_OAK_DOOR, MOSSY_DARK_OAK_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_PALE_OAK_DOOR, MOSSY_PALE_OAK_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_ACACIA_DOOR, MOSSY_ACACIA_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_CRIMSON_DOOR, MOSSY_CRIMSON_PLANKS);
                mossyDoorBuilder(recipeOutput, MOSSY_WARPED_DOOR, MOSSY_WARPED_PLANKS);

                mossyTrapdoorBuilder(recipeOutput, MOSSY_ACACIA_PLANKS, MOSSY_ACACIA_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS, MOSSY_BAMBOO_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_BIRCH_PLANKS, MOSSY_BIRCH_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_CHERRY_PLANKS, MOSSY_CHERRY_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS, MOSSY_CRIMSON_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS, MOSSY_DARK_OAK_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS, MOSSY_PALE_OAK_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS, MOSSY_JUNGLE_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS, MOSSY_MANGROVE_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_OAK_PLANKS, MOSSY_OAK_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS, MOSSY_SPRUCE_TRAPDOOR);
                mossyTrapdoorBuilder(recipeOutput, MOSSY_WARPED_PLANKS, MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(recipeOutput, MOSSY_COBBLED_DEEPSLATE, MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(recipeOutput, MOSSY_COBBLED_DEEPSLATE, MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, MOSSY_COBBLED_DEEPSLATE_WALL, MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(recipeOutput, MOSSY_DEEPSLATE_BRICKS, MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, MOSSY_DEEPSLATE_BRICKS, MOSSY_DEEPSLATE_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, MOSSY_DEEPSLATE_BRICK_WALL, MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(recipeOutput, MOSSY_DEEPSLATE_TILES, MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(recipeOutput, MOSSY_DEEPSLATE_TILES, MOSSY_DEEPSLATE_TILE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, MOSSY_DEEPSLATE_TILE_WALL, MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(recipeOutput, MOSSY_TUFF, MOSSY_TUFF_STAIRS);
                createSlabRecipe(recipeOutput, MOSSY_TUFF, MOSSY_TUFF_SLAB);
                this.wall(RecipeCategory.DECORATIONS, MOSSY_TUFF_WALL, MOSSY_TUFF);

                createStairsRecipe(recipeOutput, MOSSY_TUFF_BRICKS, MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, MOSSY_TUFF_BRICKS, MOSSY_TUFF_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, MOSSY_TUFF_BRICK_WALL, MOSSY_TUFF_BRICKS);

                createPaleMossyBlockRecipe(recipeOutput, STONE, PALE_MOSSY_STONE, "pale_mossy_stone");
                createPaleMossyBlockRecipe(recipeOutput, COBBLESTONE, PALE_MOSSY_COBBLESTONE, "pale_mossy_cobblestone");
                createPaleMossyBlockRecipe(recipeOutput, STONE_BRICKS, PALE_MOSSY_STONE_BRICKS, "pale_mossy_stone_bricks");
                createPaleMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, PALE_MOSSY_ACACIA_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, PALE_MOSSY_BAMBOO_MOSAIC, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, PALE_MOSSY_BIRCH_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, PALE_MOSSY_CHERRY_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, OAK_PLANKS, PALE_MOSSY_OAK_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, WARPED_PLANKS, PALE_MOSSY_WARPED_PLANKS, "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, ACACIA_LOG, PALE_MOSSY_ACACIA_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, PALE_MOSSY_BAMBOO_BLOCK, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, BIRCH_LOG, PALE_MOSSY_BIRCH_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, CHERRY_LOG, PALE_MOSSY_CHERRY_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, CRIMSON_STEM, PALE_MOSSY_CRIMSON_STEM, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, PALE_MOSSY_DARK_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, PALE_MOSSY_PALE_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, JUNGLE_LOG, PALE_MOSSY_JUNGLE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, MANGROVE_LOG, PALE_MOSSY_MANGROVE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, OAK_LOG, PALE_MOSSY_OAK_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, SPRUCE_LOG, PALE_MOSSY_SPRUCE_LOG, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, WARPED_STEM, PALE_MOSSY_WARPED_STEM, "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, GLASS, PALE_MOSSY_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, PALE_MOSSY_BLACK_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, PALE_MOSSY_BLUE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, PALE_MOSSY_BROWN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, PALE_MOSSY_CYAN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, PALE_MOSSY_GRAY_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, PALE_MOSSY_GREEN_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, PALE_MOSSY_LIME_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, PALE_MOSSY_MAGENTA_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, PALE_MOSSY_ORANGE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, PALE_MOSSY_PINK_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, PALE_MOSSY_PURPLE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, PALE_MOSSY_RED_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, TINTED_GLASS, PALE_MOSSY_TINTED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, PALE_MOSSY_WHITE_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, PALE_MOSSY_YELLOW_STAINED_GLASS, "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, IRON_BARS, PALE_MOSSY_IRON_BARS, "pale_mossy_iron_bars");
                createPaleMossyBlockRecipe(recipeOutput, IRON_DOOR, PALE_MOSSY_IRON_DOOR, "pale_mossy_iron_door");
                createPaleMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, PALE_MOSSY_IRON_TRAPDOOR, "pale_mossy_iron_trapdoor");
                createPaleMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, PALE_MOSSY_CHISELED_STONE_BRICKS, "pale_mossy_chiseled_stone_bricks");
                createPaleMossyBlockRecipe(recipeOutput, BRICKS, PALE_MOSSY_BRICKS, "pale_mossy_bricks");
                createPaleMossyBlockRecipe(recipeOutput, DEEPSLATE, PALE_MOSSY_DEEPSLATE, "pale_mossy_deepslate");
                createPaleMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, PALE_MOSSY_COBBLED_DEEPSLATE, "pale_mossy_cobbled_deepslate");
                createPaleMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, PALE_MOSSY_DEEPSLATE_BRICKS, "pale_mossy_deepslate_bricks");
                createPaleMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, PALE_MOSSY_DEEPSLATE_TILES, "pale_mossy_deepslate_tiles");
                createPaleMossyBlockRecipe(recipeOutput, TUFF, PALE_MOSSY_TUFF, "pale_mossy_tuff");
                createPaleMossyBlockRecipe(recipeOutput, TUFF_BRICKS, PALE_MOSSY_TUFF_BRICKS, "pale_mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_OAK_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_WARPED_PLANKS, "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, PALE_MOSSY_STONE, PALE_MOSSY_STONE_STAIRS);
                createStairsRecipe(recipeOutput, PALE_MOSSY_COBBLESTONE, PALE_MOSSY_COBBLESTONE_STAIRS);
                createStairsRecipe(recipeOutput, PALE_MOSSY_STONE_BRICKS, PALE_MOSSY_STONE_BRICK_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_STAIRS);
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_STAIRS);
                createStairsRecipe(recipeOutput, PALE_MOSSY_BAMBOO_MOSAIC, PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(recipeOutput, PALE_MOSSY_STONE, PALE_MOSSY_STONE_SLAB);
                createSlabRecipe(recipeOutput, PALE_MOSSY_COBBLESTONE, PALE_MOSSY_COBBLESTONE_SLAB);
                createSlabRecipe(recipeOutput, PALE_MOSSY_STONE_BRICKS, PALE_MOSSY_STONE_BRICK_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_SLAB);
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_SLAB);
                createSlabRecipe(recipeOutput, PALE_MOSSY_BAMBOO_MOSAIC, PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

                pressurePlateBuilder(recipeOutput, PALE_MOSSY_STONE, PALE_MOSSY_STONE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_PRESSURE_PLATE);
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_PRESSURE_PLATE);

                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_FENCE);
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_FENCE);

                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_FENCE_GATE);
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(recipeOutput, PALE_MOSSY_STONE, PALE_MOSSY_STONE_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_BUTTON);
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_BUTTON);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_SLAB, PALE_MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_STAIRS, PALE_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_SLAB, PALE_MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICKS, PALE_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_STAIRS, PALE_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_WALL, PALE_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_CHISELED_STONE_BRICKS, PALE_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLESTONE_SLAB, PALE_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLESTONE_STAIRS, PALE_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLESTONE_WALL, PALE_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_SLAB, PALE_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_STAIRS, PALE_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_WALL, PALE_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_BRICK_SLAB, PALE_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_BRICK_STAIRS, PALE_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_BRICK_WALL, PALE_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLED_DEEPSLATE_SLAB, PALE_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS, PALE_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLED_DEEPSLATE_WALL, PALE_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_BRICK_SLAB, PALE_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_BRICK_STAIRS, PALE_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_BRICK_WALL, PALE_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_TILE_SLAB, PALE_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_TILE_STAIRS, PALE_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_TILE_WALL, PALE_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_SLAB, PALE_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_STAIRS, PALE_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_WALL, PALE_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_BRICK_SLAB, PALE_MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_BRICK_STAIRS, PALE_MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_BRICK_WALL, PALE_MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(recipeOutput, PALE_MOSSY_GLASS, PALE_MOSSY_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_BLACK_STAINED_GLASS, PALE_MOSSY_BLACK_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_BLUE_STAINED_GLASS, PALE_MOSSY_BLUE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_BROWN_STAINED_GLASS, PALE_MOSSY_BROWN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_CYAN_STAINED_GLASS, PALE_MOSSY_CYAN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_GRAY_STAINED_GLASS, PALE_MOSSY_GRAY_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_GREEN_STAINED_GLASS, PALE_MOSSY_GREEN_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_LIME_STAINED_GLASS, PALE_MOSSY_LIME_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_MAGENTA_STAINED_GLASS, PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_ORANGE_STAINED_GLASS, PALE_MOSSY_ORANGE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_PINK_STAINED_GLASS, PALE_MOSSY_PINK_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_PURPLE_STAINED_GLASS, PALE_MOSSY_PURPLE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_RED_STAINED_GLASS, PALE_MOSSY_RED_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_WHITE_STAINED_GLASS, PALE_MOSSY_WHITE_STAINED_GLASS_PANE);
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_YELLOW_STAINED_GLASS, PALE_MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.woodFromLogs(PALE_MOSSY_ACACIA_WOOD, PALE_MOSSY_ACACIA_LOG);
                this.woodFromLogs(PALE_MOSSY_BIRCH_WOOD, PALE_MOSSY_BIRCH_LOG);
                this.woodFromLogs(PALE_MOSSY_DARK_OAK_WOOD, PALE_MOSSY_DARK_OAK_LOG);
                this.woodFromLogs(PALE_MOSSY_PALE_OAK_WOOD, PALE_MOSSY_PALE_OAK_LOG);
                this.woodFromLogs(PALE_MOSSY_JUNGLE_WOOD, PALE_MOSSY_JUNGLE_LOG);
                this.woodFromLogs(PALE_MOSSY_OAK_WOOD, PALE_MOSSY_OAK_LOG);
                this.woodFromLogs(PALE_MOSSY_SPRUCE_WOOD, PALE_MOSSY_SPRUCE_LOG);
                this.woodFromLogs(PALE_MOSSY_CRIMSON_HYPHAE, PALE_MOSSY_CRIMSON_STEM);
                this.woodFromLogs(PALE_MOSSY_WARPED_HYPHAE, PALE_MOSSY_WARPED_STEM);
                this.woodFromLogs(PALE_MOSSY_MANGROVE_WOOD, PALE_MOSSY_MANGROVE_LOG);

                this.mosaicBuilder(RecipeCategory.DECORATIONS, PALE_MOSSY_BAMBOO_MOSAIC, PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, PALE_MOSS_BLOCK, PALE_MOSS_BALL);
                this.shapeless(RecipeCategory.MISC, PALE_MOSS_BALL, 4)
                        .requires(PALE_MOSS_BLOCK)
                        .unlockedBy(getHasName(PALE_MOSS_BLOCK), has(PALE_MOSS_BLOCK))
                        .save(recipeOutput);

                createStairsRecipe(recipeOutput, PALE_MOSSY_BRICKS, PALE_MOSSY_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, PALE_MOSSY_BRICKS, PALE_MOSSY_BRICK_SLAB);

                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_BRICK_WALL, PALE_MOSSY_BRICKS);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_COBBLESTONE_WALL, PALE_MOSSY_COBBLESTONE);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_STONE_BRICK_WALL, PALE_MOSSY_STONE_BRICKS);

                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_OAK_DOOR, PALE_MOSSY_OAK_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_SPRUCE_DOOR, PALE_MOSSY_SPRUCE_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_BIRCH_DOOR, PALE_MOSSY_BIRCH_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_CHERRY_DOOR, PALE_MOSSY_CHERRY_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_JUNGLE_DOOR, PALE_MOSSY_JUNGLE_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_BAMBOO_DOOR, PALE_MOSSY_BAMBOO_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_MANGROVE_DOOR, PALE_MOSSY_MANGROVE_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_DOOR, PALE_MOSSY_DARK_OAK_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_DOOR, PALE_MOSSY_PALE_OAK_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_ACACIA_DOOR, PALE_MOSSY_ACACIA_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_CRIMSON_DOOR, PALE_MOSSY_CRIMSON_PLANKS);
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_WARPED_DOOR, PALE_MOSSY_WARPED_PLANKS);

                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS, PALE_MOSSY_ACACIA_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS, PALE_MOSSY_BIRCH_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS, PALE_MOSSY_CHERRY_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS, PALE_MOSSY_OAK_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_TRAPDOOR);
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS, PALE_MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(recipeOutput, PALE_MOSSY_COBBLED_DEEPSLATE, PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(recipeOutput, PALE_MOSSY_COBBLED_DEEPSLATE, PALE_MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_COBBLED_DEEPSLATE_WALL, PALE_MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_BRICKS, PALE_MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_BRICKS, PALE_MOSSY_DEEPSLATE_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_DEEPSLATE_BRICK_WALL, PALE_MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_TILES, PALE_MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_TILES, PALE_MOSSY_DEEPSLATE_TILE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_DEEPSLATE_TILE_WALL, PALE_MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(recipeOutput, PALE_MOSSY_TUFF, PALE_MOSSY_TUFF_STAIRS);
                createSlabRecipe(recipeOutput, PALE_MOSSY_TUFF, PALE_MOSSY_TUFF_SLAB);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_TUFF_WALL, PALE_MOSSY_TUFF);

                createStairsRecipe(recipeOutput, PALE_MOSSY_TUFF_BRICKS, PALE_MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, PALE_MOSSY_TUFF_BRICKS, PALE_MOSSY_TUFF_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_TUFF_BRICK_WALL, PALE_MOSSY_TUFF_BRICKS);

                this.carpet(CRIMSON_MOSS_CARPET, CRIMSON_MOSS_BLOCK);
                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSS_BLOCK, CRIMSON_MOSS_BALL);
                this.shapeless(RecipeCategory.MISC, CRIMSON_MOSS_BALL, 4)
                        .requires(CRIMSON_MOSS_BLOCK)
                        .unlockedBy(getHasName(CRIMSON_MOSS_BLOCK), has(CRIMSON_MOSS_BLOCK))
                        .save(recipeOutput);

                createCrimsonMossyBlockRecipe(recipeOutput, STONE, CRIMSON_MOSSY_STONE, "crimson_mossy_stone");
                createCrimsonMossyBlockRecipe(recipeOutput, COBBLESTONE, CRIMSON_MOSSY_COBBLESTONE, "crimson_mossy_cobblestone");
                createCrimsonMossyBlockRecipe(recipeOutput, STONE_BRICKS, CRIMSON_MOSSY_STONE_BRICKS, "crimson_mossy_stone_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, CRIMSON_MOSSY_BAMBOO_MOSAIC, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, OAK_PLANKS, CRIMSON_MOSSY_OAK_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, WARPED_PLANKS, CRIMSON_MOSSY_WARPED_PLANKS, "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, ACACIA_LOG, CRIMSON_MOSSY_ACACIA_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, CRIMSON_MOSSY_BAMBOO_BLOCK, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, BIRCH_LOG, CRIMSON_MOSSY_BIRCH_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, CHERRY_LOG, CRIMSON_MOSSY_CHERRY_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, CRIMSON_STEM, CRIMSON_MOSSY_CRIMSON_STEM, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, CRIMSON_MOSSY_DARK_OAK_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, CRIMSON_MOSSY_PALE_OAK_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, JUNGLE_LOG, CRIMSON_MOSSY_JUNGLE_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, MANGROVE_LOG, CRIMSON_MOSSY_MANGROVE_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, OAK_LOG, CRIMSON_MOSSY_OAK_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, SPRUCE_LOG, CRIMSON_MOSSY_SPRUCE_LOG, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, WARPED_STEM, CRIMSON_MOSSY_WARPED_STEM, "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, GLASS, CRIMSON_MOSSY_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, CRIMSON_MOSSY_BLACK_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, CRIMSON_MOSSY_BLUE_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, CRIMSON_MOSSY_BROWN_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, CRIMSON_MOSSY_CYAN_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, CRIMSON_MOSSY_GRAY_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, CRIMSON_MOSSY_GREEN_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, CRIMSON_MOSSY_LIME_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, CRIMSON_MOSSY_MAGENTA_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, CRIMSON_MOSSY_ORANGE_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, CRIMSON_MOSSY_PINK_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, CRIMSON_MOSSY_PURPLE_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, CRIMSON_MOSSY_RED_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, TINTED_GLASS, CRIMSON_MOSSY_TINTED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, CRIMSON_MOSSY_WHITE_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, CRIMSON_MOSSY_YELLOW_STAINED_GLASS, "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, IRON_BARS, CRIMSON_MOSSY_IRON_BARS, "crimson_mossy_iron_bars");
                createCrimsonMossyBlockRecipe(recipeOutput, IRON_DOOR, CRIMSON_MOSSY_IRON_DOOR, "crimson_mossy_iron_door");
                createCrimsonMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, CRIMSON_MOSSY_IRON_TRAPDOOR, "crimson_mossy_iron_trapdoor");
                createCrimsonMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, CRIMSON_MOSSY_CHISELED_STONE_BRICKS, "crimson_mossy_chiseled_stone_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, BRICKS, CRIMSON_MOSSY_BRICKS, "crimson_mossy_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, DEEPSLATE, CRIMSON_MOSSY_DEEPSLATE, "crimson_mossy_deepslate");
                createCrimsonMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, CRIMSON_MOSSY_COBBLED_DEEPSLATE, "crimson_mossy_cobbled_deepslate");
                createCrimsonMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, CRIMSON_MOSSY_DEEPSLATE_BRICKS, "crimson_mossy_deepslate_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, CRIMSON_MOSSY_DEEPSLATE_TILES, "crimson_mossy_deepslate_tiles");
                createCrimsonMossyBlockRecipe(recipeOutput, TUFF, CRIMSON_MOSSY_TUFF, "crimson_mossy_tuff");
                createCrimsonMossyBlockRecipe(recipeOutput, TUFF_BRICKS, CRIMSON_MOSSY_TUFF_BRICKS, "crimson_mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_STONE, CRIMSON_MOSSY_STONE_STAIRS);
                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_COBBLESTONE, CRIMSON_MOSSY_COBBLESTONE_STAIRS);
                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_STONE_BRICKS, CRIMSON_MOSSY_STONE_BRICK_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_STAIRS);
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_STAIRS);
                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_MOSAIC, CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_STONE, CRIMSON_MOSSY_STONE_SLAB);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_COBBLESTONE, CRIMSON_MOSSY_COBBLESTONE_SLAB);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_STONE_BRICKS, CRIMSON_MOSSY_STONE_BRICK_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_SLAB);
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_SLAB);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_MOSAIC, CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB);

                pressurePlateBuilder(recipeOutput, CRIMSON_MOSSY_STONE, CRIMSON_MOSSY_STONE_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE);
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_PRESSURE_PLATE);

                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_FENCE);
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_FENCE);

                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_FENCE_GATE);
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(recipeOutput, CRIMSON_MOSSY_STONE, CRIMSON_MOSSY_STONE_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_BUTTON);
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_BUTTON);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_SLAB, CRIMSON_MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_STAIRS, CRIMSON_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_SLAB, CRIMSON_MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICKS, CRIMSON_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_STAIRS, CRIMSON_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_WALL, CRIMSON_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_CHISELED_STONE_BRICKS, CRIMSON_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLESTONE_SLAB, CRIMSON_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLESTONE_STAIRS, CRIMSON_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLESTONE_WALL, CRIMSON_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_SLAB, CRIMSON_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_STAIRS, CRIMSON_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_WALL, CRIMSON_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_BRICK_SLAB, CRIMSON_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_BRICK_STAIRS, CRIMSON_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_BRICK_WALL, CRIMSON_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_SLAB, CRIMSON_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_STAIRS, CRIMSON_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_WALL, CRIMSON_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_SLAB, CRIMSON_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_STAIRS, CRIMSON_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_WALL, CRIMSON_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_TILE_SLAB, CRIMSON_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_TILE_STAIRS, CRIMSON_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_TILE_WALL, CRIMSON_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_SLAB, CRIMSON_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_STAIRS, CRIMSON_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_WALL, CRIMSON_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_BRICK_SLAB, CRIMSON_MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_BRICK_STAIRS, CRIMSON_MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_BRICK_WALL, CRIMSON_MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_GLASS, CRIMSON_MOSSY_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_BLACK_STAINED_GLASS, CRIMSON_MOSSY_BLACK_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_BLUE_STAINED_GLASS, CRIMSON_MOSSY_BLUE_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_BROWN_STAINED_GLASS, CRIMSON_MOSSY_BROWN_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_CYAN_STAINED_GLASS, CRIMSON_MOSSY_CYAN_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_GRAY_STAINED_GLASS, CRIMSON_MOSSY_GRAY_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_GREEN_STAINED_GLASS, CRIMSON_MOSSY_GREEN_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_LIME_STAINED_GLASS, CRIMSON_MOSSY_LIME_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_MAGENTA_STAINED_GLASS, CRIMSON_MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_ORANGE_STAINED_GLASS, CRIMSON_MOSSY_ORANGE_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_PINK_STAINED_GLASS, CRIMSON_MOSSY_PINK_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_PURPLE_STAINED_GLASS, CRIMSON_MOSSY_PURPLE_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_RED_STAINED_GLASS, CRIMSON_MOSSY_RED_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_WHITE_STAINED_GLASS, CRIMSON_MOSSY_WHITE_STAINED_GLASS_PANE);
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_YELLOW_STAINED_GLASS, CRIMSON_MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.woodFromLogs(CRIMSON_MOSSY_ACACIA_WOOD, CRIMSON_MOSSY_ACACIA_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_BIRCH_WOOD, CRIMSON_MOSSY_BIRCH_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_DARK_OAK_WOOD, CRIMSON_MOSSY_DARK_OAK_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_PALE_OAK_WOOD, CRIMSON_MOSSY_PALE_OAK_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_JUNGLE_WOOD, CRIMSON_MOSSY_JUNGLE_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_OAK_WOOD, CRIMSON_MOSSY_OAK_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_SPRUCE_WOOD, CRIMSON_MOSSY_SPRUCE_LOG);
                this.woodFromLogs(CRIMSON_MOSSY_CRIMSON_HYPHAE, CRIMSON_MOSSY_CRIMSON_STEM);
                this.woodFromLogs(CRIMSON_MOSSY_WARPED_HYPHAE, CRIMSON_MOSSY_WARPED_STEM);
                this.woodFromLogs(CRIMSON_MOSSY_MANGROVE_WOOD, CRIMSON_MOSSY_MANGROVE_LOG);

                this.mosaicBuilder(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_BAMBOO_MOSAIC, CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_BRICKS, CRIMSON_MOSSY_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_BRICKS, CRIMSON_MOSSY_BRICK_SLAB);

                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_BRICK_WALL, CRIMSON_MOSSY_BRICKS);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_COBBLESTONE_WALL, CRIMSON_MOSSY_COBBLESTONE);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_STONE_BRICK_WALL, CRIMSON_MOSSY_STONE_BRICKS);

                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_OAK_DOOR, CRIMSON_MOSSY_OAK_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_DOOR, CRIMSON_MOSSY_SPRUCE_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_DOOR, CRIMSON_MOSSY_BIRCH_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_DOOR, CRIMSON_MOSSY_CHERRY_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_DOOR, CRIMSON_MOSSY_JUNGLE_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_DOOR, CRIMSON_MOSSY_BAMBOO_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_DOOR, CRIMSON_MOSSY_MANGROVE_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_DOOR, CRIMSON_MOSSY_DARK_OAK_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_DOOR, CRIMSON_MOSSY_PALE_OAK_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_DOOR, CRIMSON_MOSSY_ACACIA_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_DOOR, CRIMSON_MOSSY_CRIMSON_PLANKS);
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_DOOR, CRIMSON_MOSSY_WARPED_PLANKS);

                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS, CRIMSON_MOSSY_OAK_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_TRAPDOOR);
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS, CRIMSON_MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_COBBLED_DEEPSLATE, CRIMSON_MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_COBBLED_DEEPSLATE, CRIMSON_MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_WALL, CRIMSON_MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_BRICKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_BRICKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_DEEPSLATE_BRICK_WALL, CRIMSON_MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_TILES, CRIMSON_MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_TILES, CRIMSON_MOSSY_DEEPSLATE_TILE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_DEEPSLATE_TILE_WALL, CRIMSON_MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_TUFF, CRIMSON_MOSSY_TUFF_STAIRS);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_TUFF, CRIMSON_MOSSY_TUFF_SLAB);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_TUFF_WALL, CRIMSON_MOSSY_TUFF);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_TUFF_BRICKS, CRIMSON_MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_TUFF_BRICKS, CRIMSON_MOSSY_TUFF_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_TUFF_BRICK_WALL, CRIMSON_MOSSY_TUFF_BRICKS);

                this.carpet(WARPED_MOSS_CARPET, WARPED_MOSS_BLOCK);
                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSS_BLOCK, WARPED_MOSS_BALL);
                this.shapeless(RecipeCategory.MISC, WARPED_MOSS_BALL, 4)
                        .requires(WARPED_MOSS_BLOCK)
                        .unlockedBy(getHasName(WARPED_MOSS_BLOCK), has(WARPED_MOSS_BLOCK))
                        .save(recipeOutput);
                createWarpedMossyBlockRecipe(recipeOutput, STONE, WARPED_MOSSY_STONE, "warped_mossy_stone");
                createWarpedMossyBlockRecipe(recipeOutput, COBBLESTONE, WARPED_MOSSY_COBBLESTONE, "warped_mossy_cobblestone");
                createWarpedMossyBlockRecipe(recipeOutput, STONE_BRICKS, WARPED_MOSSY_STONE_BRICKS, "warped_mossy_stone_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, WARPED_MOSSY_ACACIA_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, WARPED_MOSSY_BAMBOO_MOSAIC, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, WARPED_MOSSY_BIRCH_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, WARPED_MOSSY_CHERRY_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, OAK_PLANKS, WARPED_MOSSY_OAK_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, WARPED_PLANKS, WARPED_MOSSY_WARPED_PLANKS, "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, ACACIA_LOG, WARPED_MOSSY_ACACIA_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, WARPED_MOSSY_BAMBOO_BLOCK, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, BIRCH_LOG, WARPED_MOSSY_BIRCH_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, CHERRY_LOG, WARPED_MOSSY_CHERRY_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, CRIMSON_STEM, WARPED_MOSSY_CRIMSON_STEM, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, WARPED_MOSSY_DARK_OAK_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, WARPED_MOSSY_PALE_OAK_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, JUNGLE_LOG, WARPED_MOSSY_JUNGLE_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, MANGROVE_LOG, WARPED_MOSSY_MANGROVE_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, OAK_LOG, WARPED_MOSSY_OAK_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, SPRUCE_LOG, WARPED_MOSSY_SPRUCE_LOG, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, WARPED_STEM, WARPED_MOSSY_WARPED_STEM, "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, GLASS, WARPED_MOSSY_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, WARPED_MOSSY_BLACK_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, WARPED_MOSSY_BLUE_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, WARPED_MOSSY_BROWN_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, WARPED_MOSSY_CYAN_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, WARPED_MOSSY_GRAY_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, WARPED_MOSSY_GREEN_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, WARPED_MOSSY_LIME_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, WARPED_MOSSY_MAGENTA_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, WARPED_MOSSY_ORANGE_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, WARPED_MOSSY_PINK_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, WARPED_MOSSY_PURPLE_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, WARPED_MOSSY_RED_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, TINTED_GLASS, WARPED_MOSSY_TINTED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, WARPED_MOSSY_WHITE_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, WARPED_MOSSY_YELLOW_STAINED_GLASS, "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, IRON_BARS, WARPED_MOSSY_IRON_BARS, "warped_mossy_iron_bars");
                createWarpedMossyBlockRecipe(recipeOutput, IRON_DOOR, WARPED_MOSSY_IRON_DOOR, "warped_mossy_iron_door");
                createWarpedMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, WARPED_MOSSY_IRON_TRAPDOOR, "warped_mossy_iron_trapdoor");
                createWarpedMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, WARPED_MOSSY_CHISELED_STONE_BRICKS, "warped_mossy_chiseled_stone_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, BRICKS, WARPED_MOSSY_BRICKS, "warped_mossy_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, DEEPSLATE, WARPED_MOSSY_DEEPSLATE, "warped_mossy_deepslate");
                createWarpedMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, WARPED_MOSSY_COBBLED_DEEPSLATE, "warped_mossy_cobbled_deepslate");
                createWarpedMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, WARPED_MOSSY_DEEPSLATE_BRICKS, "warped_mossy_deepslate_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, WARPED_MOSSY_DEEPSLATE_TILES, "warped_mossy_deepslate_tiles");
                createWarpedMossyBlockRecipe(recipeOutput, TUFF, WARPED_MOSSY_TUFF, "warped_mossy_tuff");
                createWarpedMossyBlockRecipe(recipeOutput, TUFF_BRICKS, WARPED_MOSSY_TUFF_BRICKS, "warped_mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_OAK_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_STONE, WARPED_MOSSY_STONE_STAIRS);
                createStairsRecipe(recipeOutput, WARPED_MOSSY_COBBLESTONE, WARPED_MOSSY_COBBLESTONE_STAIRS);
                createStairsRecipe(recipeOutput, WARPED_MOSSY_STONE_BRICKS, WARPED_MOSSY_STONE_BRICK_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_STAIRS);
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_STAIRS);
                createStairsRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_MOSAIC, WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS);

                createSlabRecipe(recipeOutput, WARPED_MOSSY_STONE, WARPED_MOSSY_STONE_SLAB);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_COBBLESTONE, WARPED_MOSSY_COBBLESTONE_SLAB);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_STONE_BRICKS, WARPED_MOSSY_STONE_BRICK_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_SLAB);
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_SLAB);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_MOSAIC, WARPED_MOSSY_BAMBOO_MOSAIC_SLAB);

                pressurePlateBuilder(recipeOutput, WARPED_MOSSY_STONE, WARPED_MOSSY_STONE_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_PRESSURE_PLATE);
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_PRESSURE_PLATE);

                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_FENCE);
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_FENCE);

                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_FENCE_GATE);
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_FENCE_GATE);

                createButtonRecipe(recipeOutput, WARPED_MOSSY_STONE, WARPED_MOSSY_STONE_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_BUTTON);
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_BUTTON);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_SLAB, WARPED_MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_STAIRS, WARPED_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_SLAB, WARPED_MOSSY_STONE, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICKS, WARPED_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_STAIRS, WARPED_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_WALL, WARPED_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_CHISELED_STONE_BRICKS, WARPED_MOSSY_STONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLESTONE_SLAB, WARPED_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLESTONE_STAIRS, WARPED_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLESTONE_WALL, WARPED_MOSSY_COBBLESTONE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_SLAB, WARPED_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_STAIRS, WARPED_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_WALL, WARPED_MOSSY_STONE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_BRICK_SLAB, WARPED_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_BRICK_STAIRS, WARPED_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_BRICK_WALL, WARPED_MOSSY_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLED_DEEPSLATE_SLAB, WARPED_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLED_DEEPSLATE_STAIRS, WARPED_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLED_DEEPSLATE_WALL, WARPED_MOSSY_COBBLED_DEEPSLATE);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_BRICK_SLAB, WARPED_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_BRICK_STAIRS, WARPED_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_BRICK_WALL, WARPED_MOSSY_DEEPSLATE_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_TILE_SLAB, WARPED_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_TILE_STAIRS, WARPED_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_TILE_WALL, WARPED_MOSSY_DEEPSLATE_TILES);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_SLAB, WARPED_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_STAIRS, WARPED_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_WALL, WARPED_MOSSY_TUFF);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_BRICK_SLAB, WARPED_MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_BRICK_STAIRS, WARPED_MOSSY_TUFF_BRICKS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_BRICK_WALL, WARPED_MOSSY_TUFF_BRICKS);

                createGlassPaneRecipe(recipeOutput, WARPED_MOSSY_GLASS, WARPED_MOSSY_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_BLACK_STAINED_GLASS, WARPED_MOSSY_BLACK_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_BLUE_STAINED_GLASS, WARPED_MOSSY_BLUE_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_BROWN_STAINED_GLASS, WARPED_MOSSY_BROWN_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_CYAN_STAINED_GLASS, WARPED_MOSSY_CYAN_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_GRAY_STAINED_GLASS, WARPED_MOSSY_GRAY_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_GREEN_STAINED_GLASS, WARPED_MOSSY_GREEN_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS, WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS, WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_LIME_STAINED_GLASS, WARPED_MOSSY_LIME_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_MAGENTA_STAINED_GLASS, WARPED_MOSSY_MAGENTA_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_ORANGE_STAINED_GLASS, WARPED_MOSSY_ORANGE_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_PINK_STAINED_GLASS, WARPED_MOSSY_PINK_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_PURPLE_STAINED_GLASS, WARPED_MOSSY_PURPLE_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_RED_STAINED_GLASS, WARPED_MOSSY_RED_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_WHITE_STAINED_GLASS, WARPED_MOSSY_WHITE_STAINED_GLASS_PANE);
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_YELLOW_STAINED_GLASS, WARPED_MOSSY_YELLOW_STAINED_GLASS_PANE);

                this.woodFromLogs(WARPED_MOSSY_ACACIA_WOOD, WARPED_MOSSY_ACACIA_LOG);
                this.woodFromLogs(WARPED_MOSSY_BIRCH_WOOD, WARPED_MOSSY_BIRCH_LOG);
                this.woodFromLogs(WARPED_MOSSY_DARK_OAK_WOOD, WARPED_MOSSY_DARK_OAK_LOG);
                this.woodFromLogs(WARPED_MOSSY_PALE_OAK_WOOD, WARPED_MOSSY_PALE_OAK_LOG);
                this.woodFromLogs(WARPED_MOSSY_JUNGLE_WOOD, WARPED_MOSSY_JUNGLE_LOG);
                this.woodFromLogs(WARPED_MOSSY_OAK_WOOD, WARPED_MOSSY_OAK_LOG);
                this.woodFromLogs(WARPED_MOSSY_SPRUCE_WOOD, WARPED_MOSSY_SPRUCE_LOG);
                this.woodFromLogs(WARPED_MOSSY_CRIMSON_HYPHAE, WARPED_MOSSY_CRIMSON_STEM);
                this.woodFromLogs(WARPED_MOSSY_WARPED_HYPHAE, WARPED_MOSSY_WARPED_STEM);
                this.woodFromLogs(WARPED_MOSSY_MANGROVE_WOOD, WARPED_MOSSY_MANGROVE_LOG);

                this.mosaicBuilder(RecipeCategory.DECORATIONS, WARPED_MOSSY_BAMBOO_MOSAIC, WARPED_MOSSY_BAMBOO_MOSAIC_SLAB);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_BRICKS, WARPED_MOSSY_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_BRICKS, WARPED_MOSSY_BRICK_SLAB);

                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_BRICK_WALL, WARPED_MOSSY_BRICKS);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_COBBLESTONE_WALL, WARPED_MOSSY_COBBLESTONE);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_STONE_BRICK_WALL, WARPED_MOSSY_STONE_BRICKS);

                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_OAK_DOOR, WARPED_MOSSY_OAK_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_DOOR, WARPED_MOSSY_SPRUCE_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_BIRCH_DOOR, WARPED_MOSSY_BIRCH_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_CHERRY_DOOR, WARPED_MOSSY_CHERRY_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_DOOR, WARPED_MOSSY_JUNGLE_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_DOOR, WARPED_MOSSY_BAMBOO_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_DOOR, WARPED_MOSSY_MANGROVE_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_DOOR, WARPED_MOSSY_DARK_OAK_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_DOOR, WARPED_MOSSY_PALE_OAK_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_ACACIA_DOOR, WARPED_MOSSY_ACACIA_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_DOOR, WARPED_MOSSY_CRIMSON_PLANKS);
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_WARPED_DOOR, WARPED_MOSSY_WARPED_PLANKS);

                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS, WARPED_MOSSY_ACACIA_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS, WARPED_MOSSY_BIRCH_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS, WARPED_MOSSY_CHERRY_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS, WARPED_MOSSY_OAK_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_TRAPDOOR);
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS, WARPED_MOSSY_WARPED_TRAPDOOR);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_COBBLED_DEEPSLATE, WARPED_MOSSY_COBBLED_DEEPSLATE_STAIRS);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_COBBLED_DEEPSLATE, WARPED_MOSSY_COBBLED_DEEPSLATE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_COBBLED_DEEPSLATE_WALL, WARPED_MOSSY_COBBLED_DEEPSLATE);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_BRICKS, WARPED_MOSSY_DEEPSLATE_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_BRICKS, WARPED_MOSSY_DEEPSLATE_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_DEEPSLATE_BRICK_WALL, WARPED_MOSSY_DEEPSLATE_BRICKS);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_TILES, WARPED_MOSSY_DEEPSLATE_TILE_STAIRS);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_TILES, WARPED_MOSSY_DEEPSLATE_TILE_SLAB);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_DEEPSLATE_TILE_WALL, WARPED_MOSSY_DEEPSLATE_TILES);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_TUFF, WARPED_MOSSY_TUFF_STAIRS);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_TUFF, WARPED_MOSSY_TUFF_SLAB);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_TUFF_WALL, WARPED_MOSSY_TUFF);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_TUFF_BRICKS, WARPED_MOSSY_TUFF_BRICK_STAIRS);
                createSlabRecipe(recipeOutput, WARPED_MOSSY_TUFF_BRICKS, WARPED_MOSSY_TUFF_BRICK_SLAB);
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_TUFF_BRICK_WALL, WARPED_MOSSY_TUFF_BRICKS);
            }

            private void mossyDoorBuilder(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
                doorBuilder(recipeOutput, "mossy_wooden_doors", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, output, input);
            }

            private void paleMossyDoorBuilder(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
                doorBuilder(recipeOutput, "pale_mossy_wooden_doors", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, output, input);
            }

            private void crimsonMossyDoorBuilder(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
                doorBuilder(recipeOutput, "crimson_mossy_wooden_doors", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, output, input);
            }

            private void warpedMossyDoorBuilder(RecipeOutput recipeOutput, ItemLike output, ItemLike input) {
                doorBuilder(recipeOutput, "warped_mossy_wooden_doors", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, output, input);
            }

            private void doorBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike output, ItemLike input) {
                this.doorBuilder(output, Ingredient.of(input))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void createMossyBlockRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike output, String group) {
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
                        .requires(input)
                        .requires(VINE)
                        .group(group)
                        .unlockedBy(getHasName(VINE), this.has(VINE))
                        .save(recipeOutput, getConversionRecipeName(output, VINE));
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
                        .requires(input)
                        .requires(MOSS_BLOCK)
                        .group(group)
                        .unlockedBy(getHasName(MOSS_BLOCK), this.has(MOSS_BLOCK))
                        .save(recipeOutput, getConversionRecipeName(output, MOSS_BLOCK));
            }

            private void createPaleMossyBlockRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result, String group) {
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .requires(input)
                        .requires(PALE_MOSS_BLOCK)
                        .group(group)
                        .unlockedBy(getHasName(PALE_MOSS_BLOCK), this.has(PALE_MOSS_BLOCK))
                        .save(recipeOutput, getConversionRecipeName(result, PALE_MOSS_BLOCK));
            }

            private void createCrimsonMossyBlockRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result, String group) {
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .requires(input)
                        .requires(WEEPING_VINES)
                        .group(group)
                        .unlockedBy(getHasName(WEEPING_VINES), this.has(WEEPING_VINES))
                        .save(recipeOutput, getConversionRecipeName(result, WEEPING_VINES));
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .requires(input)
                        .requires(CRIMSON_MOSS_BLOCK)
                        .group(group)
                        .unlockedBy(getHasName(CRIMSON_MOSS_BLOCK), this.has(CRIMSON_MOSS_BLOCK))
                        .save(recipeOutput, getConversionRecipeName(result, CRIMSON_MOSS_BLOCK));
            }

            private void createWarpedMossyBlockRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result, String group) {
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .requires(input)
                        .requires(WEEPING_VINES)
                        .group(group)
                        .unlockedBy(getHasName(WEEPING_VINES), this.has(WEEPING_VINES))
                        .save(recipeOutput, getConversionRecipeName(result, WEEPING_VINES));
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                        .requires(input)
                        .requires(WARPED_MOSS_BLOCK)
                        .group(group)
                        .unlockedBy(getHasName(WARPED_MOSS_BLOCK), this.has(WARPED_MOSS_BLOCK))
                        .save(recipeOutput, getConversionRecipeName(result, WARPED_MOSS_BLOCK));
            }

            public void createPlanksRecipe(RecipeOutput recipeOutput, ItemLike output, String criteria, String group, TagKey<Item> input) {
                this.shapeless(RecipeCategory.BUILDING_BLOCKS, output, 4)
                        .requires(input)
                        .group(group)
                        .unlockedBy(criteria, this.has(input))
                        .save(recipeOutput);
            }

            private void mossyStairBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                stairBuilder(recipeOutput, "mossy_wooden_stairs", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void paleMossyStairBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                stairBuilder(recipeOutput, "pale_mossy_wooden_stairs", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void crimsonMossyStairBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                stairBuilder(recipeOutput, "crimson_mossy_wooden_stairs", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void wapredMossyStairBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                stairBuilder(recipeOutput, "warped_mossy_wooden_stairs", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void stairBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.stairBuilder(result, Ingredient.of(input))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void mossyTrapdoorBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                trapdoorBuilder(recipeOutput, "mossy_wooden_stairs", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void paleMossyTrapdoorBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                trapdoorBuilder(recipeOutput, "pale_mossy_wooden_stairs", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void crimsonMossyTrapdoorBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                trapdoorBuilder(recipeOutput, "crimson_mossy_wooden_stairs", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void warpedMossyTrapdoorBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                trapdoorBuilder(recipeOutput, "warped_mossy_wooden_stairs", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void trapdoorBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.trapdoorBuilder(result, Ingredient.of(input))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void createStairsRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                this.stairBuilder(result, Ingredient.of(input))
                        .unlockedBy(getHasName(input), this.has(input))
                        .save(recipeOutput);
            }

            private void mossySlabBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                slabBuilder(recipeOutput, "mossy_wooden_slab", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void paleMossySlabBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                slabBuilder(recipeOutput, "pale_mossy_wooden_slab", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void crimsonMossySlabBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                slabBuilder(recipeOutput, "crimson_mossy_wooden_slab", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void warpedMossySlabBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                slabBuilder(recipeOutput, "warped_mossy_wooden_slab", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void slabBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.of(input.asItem()))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void createSlabRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                this.slabBuilder(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.of(input.asItem()))
                        .unlockedBy(getHasName(input), this.has(input))
                        .save(recipeOutput);
            }

            private void createMossyWoodenPressurePlateRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                woodenPressurePlateBuilder(recipeOutput, "mossy_wooden_pressure_plate", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenPressurePlateRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                woodenPressurePlateBuilder(recipeOutput, "pale_mossy_wooden_pressure_plate", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createCrimsonMossyWoodenPressurePlateRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                woodenPressurePlateBuilder(recipeOutput, "crimson_mossy_wooden_pressure_plate", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void createWarpedMossyWoodenPressurePlateRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                woodenPressurePlateBuilder(recipeOutput, "warped_mossy_wooden_pressure_plate", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void woodenPressurePlateBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.pressurePlateBuilder(RecipeCategory.REDSTONE, result, Ingredient.of(input))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void pressurePlateBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                this.pressurePlateBuilder(RecipeCategory.REDSTONE, result, Ingredient.of(input))
                        .unlockedBy(getHasName(input), this.has(input))
                        .save(recipeOutput);
            }

            private void mossyFenceBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceBuilder(recipeOutput, "mossy_wooden_fence", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void paleMossyFenceBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceBuilder(recipeOutput, "pale_mossy_wooden_fence", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void crimsonMossyFenceBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceBuilder(recipeOutput, "crimson_mossy_wooden_fence", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void warpedMossyFenceBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceBuilder(recipeOutput, "warped_mossy_wooden_fence", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void fenceBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.fenceBuilder(result, Ingredient.of(input))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void mossyFenceGateBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceGateBuilder(recipeOutput, "mossy_wooden_fence_gate", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void paleMossyFenceGateBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceGateBuilder(recipeOutput, "pale_mossy_wooden_fence_gate", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void crimsonMossyFenceGateBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceGateBuilder(recipeOutput, "crimson_mossy_wooden_fence_gate", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void warpedMossyFenceGateBuilder(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                fenceGateBuilder(recipeOutput, "warped_mossy_wooden_fence_gate", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void fenceGateBuilder(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.fenceGateBuilder(result, Ingredient.of(input))
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }

            private void createMossyWoodenButtonRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createWoodenButtonRecipe(recipeOutput, "mossy_wooden_button", "has_mossy_planks", NemosMossyItemTags.MOSSY_PLANKS, input, result);
            }

            private void createPaleMossyWoodenButtonRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createWoodenButtonRecipe(recipeOutput, "pale_mossy_wooden_button", "has_pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PLANKS, input, result);
            }

            private void createCrimsonMossyWoodenButtonRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createWoodenButtonRecipe(recipeOutput, "crimson_mossy_wooden_button", "has_crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PLANKS, input, result);
            }

            private void createWarpedMossyWoodenButtonRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createWoodenButtonRecipe(recipeOutput, "warped_mossy_wooden_button", "has_warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PLANKS, input, result);
            }

            private void createWoodenButtonRecipe(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.shapeless(RecipeCategory.REDSTONE, result)
                        .requires(input)
                        .group(group)
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput, getConversionRecipeName(result, input));
            }

            private void createButtonRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                this.shapeless(RecipeCategory.REDSTONE, result)
                        .requires(input)
                        .unlockedBy(getHasName(input), this.has(input.asItem()))
                        .save(recipeOutput, getConversionRecipeName(result, input));
            }

            private void createGlassPaneRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike output) {
                this.shaped(RecipeCategory.DECORATIONS, output, 16)
                        .define('#', input)
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy(getHasName(input), this.has(input))
                        .save(recipeOutput);
            }

            private void createMossyStainedGlassPaneRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createStainedGlassPaneRecipe(recipeOutput, "mossy_stained_glass", "has_mossy_stained_glass", NemosMossyItemTags.MOSSY_STAINED_GLASS, input, result);
            }

            private void createPaleMossyStainedGlassPaneRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createStainedGlassPaneRecipe(recipeOutput, "pale_mossy_stained_glass", "has_pale_mossy_stained_glass", NemosMossyItemTags.PALE_MOSSY_STAINED_GLASS, input, result);
            }

            private void createCrimsonMossyStainedGlassPaneRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createStainedGlassPaneRecipe(recipeOutput, "pale_crimson_stained_glass", "has_crimson_mossy_stained_glass", NemosMossyItemTags.CRIMSON_MOSSY_STAINED_GLASS, input, result);
            }

            private void createWarpedMossyStainedGlassPaneRecipe(RecipeOutput recipeOutput, ItemLike input, ItemLike result) {
                createStainedGlassPaneRecipe(recipeOutput, "pale_warped_stained_glass", "has_warped_mossy_stained_glass", NemosMossyItemTags.WARPED_MOSSY_STAINED_GLASS, input, result);
            }

            private void createStainedGlassPaneRecipe(RecipeOutput recipeOutput, String group, String criteria, TagKey<Item> tag, ItemLike input, ItemLike result) {
                this.shaped(RecipeCategory.DECORATIONS, result, 16)
                        .define('#', input)
                        .group(group)
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy(criteria, this.has(tag))
                        .save(recipeOutput);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Mossy Blocks Recipes";
    }
}
