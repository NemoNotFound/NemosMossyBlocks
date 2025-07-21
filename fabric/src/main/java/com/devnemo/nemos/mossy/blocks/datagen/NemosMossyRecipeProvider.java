package com.devnemo.nemos.mossy.blocks.datagen;

import com.devnemo.nemos.mossy.blocks.tags.NemosMossyItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
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

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems.*;
import static net.minecraft.world.item.Items.*;

public class NemosMossyRecipeProvider extends FabricRecipeProvider {

    public NemosMossyRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new RecipeProvider(provider, recipeOutput) {
            @Override
            public void buildRecipes() {
                createMossyBlockRecipe(recipeOutput, STONE, MOSSY_STONE.get(), "mossy_stone");
                createMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, MOSSY_ACACIA_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, MOSSY_BAMBOO_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, MOSSY_BAMBOO_MOSAIC.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, MOSSY_BIRCH_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, MOSSY_CHERRY_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, MOSSY_CRIMSON_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, MOSSY_DARK_OAK_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, MOSSY_PALE_OAK_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, MOSSY_JUNGLE_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, MOSSY_MANGROVE_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, OAK_PLANKS, MOSSY_OAK_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, MOSSY_SPRUCE_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, WARPED_PLANKS, MOSSY_WARPED_PLANKS.get(), "mossy_planks");
                createMossyBlockRecipe(recipeOutput, ACACIA_LOG, MOSSY_ACACIA_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, MOSSY_BAMBOO_BLOCK.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, BIRCH_LOG, MOSSY_BIRCH_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, CHERRY_LOG, MOSSY_CHERRY_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, CRIMSON_STEM, MOSSY_CRIMSON_STEM.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, MOSSY_DARK_OAK_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, MOSSY_PALE_OAK_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, JUNGLE_LOG, MOSSY_JUNGLE_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, MANGROVE_LOG, MOSSY_MANGROVE_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, OAK_LOG, MOSSY_OAK_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, SPRUCE_LOG, MOSSY_SPRUCE_LOG.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, WARPED_STEM, MOSSY_WARPED_STEM.get(), "mossy_log");
                createMossyBlockRecipe(recipeOutput, GLASS, MOSSY_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, MOSSY_BLACK_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, MOSSY_BLUE_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, MOSSY_BROWN_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, MOSSY_CYAN_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, MOSSY_GRAY_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, MOSSY_GREEN_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, MOSSY_LIME_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, MOSSY_MAGENTA_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, MOSSY_ORANGE_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, MOSSY_PINK_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, MOSSY_PURPLE_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, MOSSY_RED_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, TINTED_GLASS, MOSSY_TINTED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, MOSSY_WHITE_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, MOSSY_YELLOW_STAINED_GLASS.get(), "mossy_glass");
                createMossyBlockRecipe(recipeOutput, IRON_BARS, MOSSY_IRON_BARS.get(), "mossy_iron_bars");
                createMossyBlockRecipe(recipeOutput, IRON_DOOR, MOSSY_IRON_DOOR.get(), "mossy_iron_door");
                createMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, MOSSY_IRON_TRAPDOOR.get(), "mossy_iron_trapdoor");
                createMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, MOSSY_CHISELED_STONE_BRICKS.get(), "mossy_chiseled_stone_bricks");
                createMossyBlockRecipe(recipeOutput, BRICKS, MOSSY_BRICKS.get(), "mossy_bricks");
                createMossyBlockRecipe(recipeOutput, DEEPSLATE, MOSSY_DEEPSLATE.get(), "mossy_deepslate");
                createMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, MOSSY_COBBLED_DEEPSLATE.get(), "mossy_cobbled_deepslate");
                createMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, MOSSY_DEEPSLATE_BRICKS.get(), "mossy_deepslate_bricks");
                createMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, MOSSY_DEEPSLATE_TILES.get(), "mossy_deepslate_tiles");
                createMossyBlockRecipe(recipeOutput, TUFF, MOSSY_TUFF.get(), "mossy_tuff");
                createMossyBlockRecipe(recipeOutput, TUFF_BRICKS, MOSSY_TUFF_BRICKS.get(), "mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, MOSSY_ACACIA_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, MOSSY_BIRCH_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_CHERRY_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_OAK_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, MOSSY_WARPED_PLANKS.get(), "has_mossy_wood", "mossy_planks", NemosMossyItemTags.MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, MOSSY_STONE.get(), MOSSY_STONE_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_STAIRS.get());
                mossyStairBuilder(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_STAIRS.get());
                createStairsRecipe(recipeOutput, MOSSY_BAMBOO_MOSAIC.get(), MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                createSlabRecipe(recipeOutput, MOSSY_STONE.get(), MOSSY_STONE_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_SLAB.get());
                mossySlabBuilder(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_SLAB.get());
                createSlabRecipe(recipeOutput, MOSSY_BAMBOO_MOSAIC.get(), MOSSY_BAMBOO_MOSAIC_SLAB.get());

                pressurePlateBuilder(recipeOutput, MOSSY_STONE.get(), MOSSY_STONE_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_PRESSURE_PLATE.get());
                createMossyWoodenPressurePlateRecipe(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_PRESSURE_PLATE.get());

                mossyFenceBuilder(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_FENCE.get());
                mossyFenceBuilder(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_FENCE.get());

                mossyFenceGateBuilder(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_FENCE_GATE.get());
                mossyFenceGateBuilder(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_FENCE_GATE.get());

                createButtonRecipe(recipeOutput, MOSSY_STONE.get(), MOSSY_STONE_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_BUTTON.get());
                createMossyWoodenButtonRecipe(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_BUTTON.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_SLAB.get(), MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_STAIRS.get(), MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_SLAB, MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICKS, MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_STAIRS, MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_STONE_BRICK_WALL, MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_CHISELED_STONE_BRICKS.get(), MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_BRICK_SLAB.get(), MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_BRICK_STAIRS.get(), MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_BRICK_WALL.get(), MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_COBBLED_DEEPSLATE_SLAB.get(), MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_COBBLED_DEEPSLATE_STAIRS.get(), MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_COBBLED_DEEPSLATE_WALL.get(), MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_BRICK_SLAB.get(), MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_BRICK_STAIRS.get(), MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_BRICK_WALL.get(), MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_TILE_SLAB.get(), MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_TILE_STAIRS.get(), MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_DEEPSLATE_TILE_WALL.get(), MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_SLAB.get(), MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_STAIRS.get(), MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_WALL.get(), MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_BRICK_SLAB.get(), MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_BRICK_STAIRS.get(), MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, MOSSY_TUFF_BRICK_WALL.get(), MOSSY_TUFF_BRICKS.get());

                createGlassPaneRecipe(recipeOutput, MOSSY_GLASS.get(), MOSSY_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_BLACK_STAINED_GLASS.get(), MOSSY_BLACK_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_BLUE_STAINED_GLASS.get(), MOSSY_BLUE_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_BROWN_STAINED_GLASS.get(), MOSSY_BROWN_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_CYAN_STAINED_GLASS.get(), MOSSY_CYAN_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_GRAY_STAINED_GLASS.get(), MOSSY_GRAY_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_GREEN_STAINED_GLASS.get(), MOSSY_GREEN_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_LIME_STAINED_GLASS.get(), MOSSY_LIME_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_MAGENTA_STAINED_GLASS.get(), MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_ORANGE_STAINED_GLASS.get(), MOSSY_ORANGE_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_PINK_STAINED_GLASS.get(), MOSSY_PINK_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_PURPLE_STAINED_GLASS.get(), MOSSY_PURPLE_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_RED_STAINED_GLASS.get(), MOSSY_RED_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_WHITE_STAINED_GLASS.get(), MOSSY_WHITE_STAINED_GLASS_PANE.get());
                createMossyStainedGlassPaneRecipe(recipeOutput, MOSSY_YELLOW_STAINED_GLASS.get(), MOSSY_YELLOW_STAINED_GLASS_PANE.get());

                this.woodFromLogs(MOSSY_ACACIA_WOOD.get(), MOSSY_ACACIA_LOG.get());
                this.woodFromLogs(MOSSY_BIRCH_WOOD.get(), MOSSY_BIRCH_LOG.get());
                this.woodFromLogs(MOSSY_DARK_OAK_WOOD.get(), MOSSY_DARK_OAK_LOG.get());
                this.woodFromLogs(MOSSY_PALE_OAK_WOOD.get(), MOSSY_PALE_OAK_LOG.get());
                this.woodFromLogs(MOSSY_JUNGLE_WOOD.get(), MOSSY_JUNGLE_LOG.get());
                this.woodFromLogs(MOSSY_OAK_WOOD.get(), MOSSY_OAK_LOG.get());
                this.woodFromLogs(MOSSY_SPRUCE_WOOD.get(), MOSSY_SPRUCE_LOG.get());
                this.woodFromLogs(MOSSY_CRIMSON_HYPHAE.get(), MOSSY_CRIMSON_STEM.get());
                this.woodFromLogs(MOSSY_WARPED_HYPHAE.get(), MOSSY_WARPED_STEM.get());
                this.woodFromLogs(MOSSY_MANGROVE_WOOD.get(), MOSSY_MANGROVE_LOG.get());

                this.mosaicBuilder(RecipeCategory.DECORATIONS, MOSSY_BAMBOO_MOSAIC.get(), MOSSY_BAMBOO_MOSAIC_SLAB.get());

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, MOSS_BLOCK, MOSS_BALL.get());
                this.shapeless(RecipeCategory.MISC, MOSS_BALL.get(), 4)
                        .requires(MOSS_BLOCK)
                        .unlockedBy(getHasName(MOSS_BLOCK), has(MOSS_BLOCK))
                        .save(recipeOutput);

                createStairsRecipe(recipeOutput, MOSSY_BRICKS.get(), MOSSY_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, MOSSY_BRICKS.get(), MOSSY_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, MOSSY_BRICK_WALL.get(), MOSSY_BRICKS.get());

                mossyDoorBuilder(recipeOutput, MOSSY_OAK_DOOR.get(), MOSSY_OAK_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_SPRUCE_DOOR.get(), MOSSY_SPRUCE_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_BIRCH_DOOR.get(), MOSSY_BIRCH_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_CHERRY_DOOR.get(), MOSSY_CHERRY_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_JUNGLE_DOOR.get(), MOSSY_JUNGLE_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_BAMBOO_DOOR.get(), MOSSY_BAMBOO_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_MANGROVE_DOOR.get(), MOSSY_MANGROVE_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_DARK_OAK_DOOR.get(), MOSSY_DARK_OAK_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_PALE_OAK_DOOR.get(), MOSSY_PALE_OAK_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_ACACIA_DOOR.get(), MOSSY_ACACIA_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_CRIMSON_DOOR.get(), MOSSY_CRIMSON_PLANKS.get());
                mossyDoorBuilder(recipeOutput, MOSSY_WARPED_DOOR.get(), MOSSY_WARPED_PLANKS.get());

                mossyTrapdoorBuilder(recipeOutput, MOSSY_ACACIA_PLANKS.get(), MOSSY_ACACIA_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_BAMBOO_PLANKS.get(), MOSSY_BAMBOO_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_BIRCH_PLANKS.get(), MOSSY_BIRCH_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_CHERRY_PLANKS.get(), MOSSY_CHERRY_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_CRIMSON_PLANKS.get(), MOSSY_CRIMSON_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_DARK_OAK_PLANKS.get(), MOSSY_DARK_OAK_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_PALE_OAK_PLANKS.get(), MOSSY_PALE_OAK_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_JUNGLE_PLANKS.get(), MOSSY_JUNGLE_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_MANGROVE_PLANKS.get(), MOSSY_MANGROVE_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_OAK_PLANKS.get(), MOSSY_OAK_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_SPRUCE_PLANKS.get(), MOSSY_SPRUCE_TRAPDOOR.get());
                mossyTrapdoorBuilder(recipeOutput, MOSSY_WARPED_PLANKS.get(), MOSSY_WARPED_TRAPDOOR.get());

                createStairsRecipe(recipeOutput, MOSSY_COBBLED_DEEPSLATE.get(), MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                createSlabRecipe(recipeOutput, MOSSY_COBBLED_DEEPSLATE.get(), MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, MOSSY_COBBLED_DEEPSLATE_WALL.get(), MOSSY_COBBLED_DEEPSLATE.get());

                createStairsRecipe(recipeOutput, MOSSY_DEEPSLATE_BRICKS.get(), MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, MOSSY_DEEPSLATE_BRICKS.get(), MOSSY_DEEPSLATE_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, MOSSY_DEEPSLATE_BRICK_WALL.get(), MOSSY_DEEPSLATE_BRICKS.get());

                createStairsRecipe(recipeOutput, MOSSY_DEEPSLATE_TILES.get(), MOSSY_DEEPSLATE_TILE_STAIRS.get());
                createSlabRecipe(recipeOutput, MOSSY_DEEPSLATE_TILES.get(), MOSSY_DEEPSLATE_TILE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, MOSSY_DEEPSLATE_TILE_WALL.get(), MOSSY_DEEPSLATE_TILES.get());

                createStairsRecipe(recipeOutput, MOSSY_TUFF.get(), MOSSY_TUFF_STAIRS.get());
                createSlabRecipe(recipeOutput, MOSSY_TUFF.get(), MOSSY_TUFF_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, MOSSY_TUFF_WALL.get(), MOSSY_TUFF.get());

                createStairsRecipe(recipeOutput, MOSSY_TUFF_BRICKS.get(), MOSSY_TUFF_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, MOSSY_TUFF_BRICKS.get(), MOSSY_TUFF_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, MOSSY_TUFF_BRICK_WALL.get(), MOSSY_TUFF_BRICKS.get());

                createPaleMossyBlockRecipe(recipeOutput, STONE, PALE_MOSSY_STONE.get(), "pale_mossy_stone");
                createPaleMossyBlockRecipe(recipeOutput, COBBLESTONE, PALE_MOSSY_COBBLESTONE.get(), "pale_mossy_cobblestone");
                createPaleMossyBlockRecipe(recipeOutput, STONE_BRICKS, PALE_MOSSY_STONE_BRICKS.get(), "pale_mossy_stone_bricks");
                createPaleMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, PALE_MOSSY_ACACIA_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, PALE_MOSSY_BAMBOO_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, PALE_MOSSY_BAMBOO_MOSAIC.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, PALE_MOSSY_BIRCH_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, PALE_MOSSY_CHERRY_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, PALE_MOSSY_CRIMSON_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, PALE_MOSSY_DARK_OAK_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, PALE_MOSSY_PALE_OAK_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, PALE_MOSSY_JUNGLE_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, PALE_MOSSY_MANGROVE_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, OAK_PLANKS, PALE_MOSSY_OAK_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, PALE_MOSSY_SPRUCE_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, WARPED_PLANKS, PALE_MOSSY_WARPED_PLANKS.get(), "pale_mossy_planks");
                createPaleMossyBlockRecipe(recipeOutput, ACACIA_LOG, PALE_MOSSY_ACACIA_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, PALE_MOSSY_BAMBOO_BLOCK.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, BIRCH_LOG, PALE_MOSSY_BIRCH_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, CHERRY_LOG, PALE_MOSSY_CHERRY_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, CRIMSON_STEM, PALE_MOSSY_CRIMSON_STEM.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, PALE_MOSSY_DARK_OAK_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, PALE_MOSSY_PALE_OAK_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, JUNGLE_LOG, PALE_MOSSY_JUNGLE_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, MANGROVE_LOG, PALE_MOSSY_MANGROVE_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, OAK_LOG, PALE_MOSSY_OAK_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, SPRUCE_LOG, PALE_MOSSY_SPRUCE_LOG.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, WARPED_STEM, PALE_MOSSY_WARPED_STEM.get(), "pale_mossy_log");
                createPaleMossyBlockRecipe(recipeOutput, GLASS, PALE_MOSSY_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, PALE_MOSSY_BLACK_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, PALE_MOSSY_BLUE_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, PALE_MOSSY_BROWN_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, PALE_MOSSY_CYAN_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, PALE_MOSSY_GRAY_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, PALE_MOSSY_GREEN_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, PALE_MOSSY_LIME_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, PALE_MOSSY_MAGENTA_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, PALE_MOSSY_ORANGE_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, PALE_MOSSY_PINK_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, PALE_MOSSY_PURPLE_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, PALE_MOSSY_RED_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, TINTED_GLASS, PALE_MOSSY_TINTED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, PALE_MOSSY_WHITE_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, PALE_MOSSY_YELLOW_STAINED_GLASS.get(), "pale_mossy_glass");
                createPaleMossyBlockRecipe(recipeOutput, IRON_BARS, PALE_MOSSY_IRON_BARS.get(), "pale_mossy_iron_bars");
                createPaleMossyBlockRecipe(recipeOutput, IRON_DOOR, PALE_MOSSY_IRON_DOOR.get(), "pale_mossy_iron_door");
                createPaleMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, PALE_MOSSY_IRON_TRAPDOOR.get(), "pale_mossy_iron_trapdoor");
                createPaleMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, PALE_MOSSY_CHISELED_STONE_BRICKS.get(), "pale_mossy_chiseled_stone_bricks");
                createPaleMossyBlockRecipe(recipeOutput, BRICKS, PALE_MOSSY_BRICKS.get(), "pale_mossy_bricks");
                createPaleMossyBlockRecipe(recipeOutput, DEEPSLATE, PALE_MOSSY_DEEPSLATE.get(), "pale_mossy_deepslate");
                createPaleMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, PALE_MOSSY_COBBLED_DEEPSLATE.get(), "pale_mossy_cobbled_deepslate");
                createPaleMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, PALE_MOSSY_DEEPSLATE_BRICKS.get(), "pale_mossy_deepslate_bricks");
                createPaleMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, PALE_MOSSY_DEEPSLATE_TILES.get(), "pale_mossy_deepslate_tiles");
                createPaleMossyBlockRecipe(recipeOutput, TUFF, PALE_MOSSY_TUFF.get(), "pale_mossy_tuff");
                createPaleMossyBlockRecipe(recipeOutput, TUFF_BRICKS, PALE_MOSSY_TUFF_BRICKS.get(), "pale_mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), "has_pale_mossy_wood", "pale_mossy_planks", NemosMossyItemTags.PALE_MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, PALE_MOSSY_STONE.get(), PALE_MOSSY_STONE_STAIRS.get());
                createStairsRecipe(recipeOutput, PALE_MOSSY_COBBLESTONE.get(), PALE_MOSSY_COBBLESTONE_STAIRS.get());
                createStairsRecipe(recipeOutput, PALE_MOSSY_STONE_BRICKS.get(), PALE_MOSSY_STONE_BRICK_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_STAIRS.get());
                paleMossyStairBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_STAIRS.get());
                createStairsRecipe(recipeOutput, PALE_MOSSY_BAMBOO_MOSAIC.get(), PALE_MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                createSlabRecipe(recipeOutput, PALE_MOSSY_STONE.get(), PALE_MOSSY_STONE_SLAB.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_COBBLESTONE.get(), PALE_MOSSY_COBBLESTONE_SLAB.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_STONE_BRICKS.get(), PALE_MOSSY_STONE_BRICK_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_SLAB.get());
                paleMossySlabBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_SLAB.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_BAMBOO_MOSAIC.get(), PALE_MOSSY_BAMBOO_MOSAIC_SLAB.get());

                pressurePlateBuilder(recipeOutput, PALE_MOSSY_STONE.get(), PALE_MOSSY_STONE_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_PRESSURE_PLATE.get());
                createPaleMossyWoodenPressurePlateRecipe(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_PRESSURE_PLATE.get());

                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_FENCE.get());
                paleMossyFenceBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_FENCE.get());

                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_FENCE_GATE.get());
                paleMossyFenceGateBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_FENCE_GATE.get());

                createButtonRecipe(recipeOutput, PALE_MOSSY_STONE.get(), PALE_MOSSY_STONE_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_BUTTON.get());
                createPaleMossyWoodenButtonRecipe(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_BUTTON.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_SLAB.get(), PALE_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_STAIRS.get(), PALE_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_SLAB.get(), PALE_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICKS.get(), PALE_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_STAIRS.get(), PALE_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_WALL.get(), PALE_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_CHISELED_STONE_BRICKS.get(), PALE_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLESTONE_SLAB.get(), PALE_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLESTONE_STAIRS.get(), PALE_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLESTONE_WALL.get(), PALE_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_SLAB.get(), PALE_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_STAIRS.get(), PALE_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_STONE_BRICK_WALL.get(), PALE_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_BRICK_SLAB.get(), PALE_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_BRICK_STAIRS.get(), PALE_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_BRICK_WALL.get(), PALE_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLED_DEEPSLATE_SLAB.get(), PALE_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS.get(), PALE_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_COBBLED_DEEPSLATE_WALL.get(), PALE_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_BRICK_SLAB.get(), PALE_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_BRICK_STAIRS.get(), PALE_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_BRICK_WALL.get(), PALE_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_TILE_SLAB.get(), PALE_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_TILE_STAIRS.get(), PALE_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_DEEPSLATE_TILE_WALL.get(), PALE_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_SLAB.get(), PALE_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_STAIRS.get(), PALE_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_WALL.get(), PALE_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_BRICK_SLAB.get(), PALE_MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_BRICK_STAIRS.get(), PALE_MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, PALE_MOSSY_TUFF_BRICK_WALL.get(), PALE_MOSSY_TUFF_BRICKS.get());

                createGlassPaneRecipe(recipeOutput, PALE_MOSSY_GLASS.get(), PALE_MOSSY_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_BLACK_STAINED_GLASS.get(), PALE_MOSSY_BLACK_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_BLUE_STAINED_GLASS.get(), PALE_MOSSY_BLUE_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_BROWN_STAINED_GLASS.get(), PALE_MOSSY_BROWN_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_CYAN_STAINED_GLASS.get(), PALE_MOSSY_CYAN_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_GRAY_STAINED_GLASS.get(), PALE_MOSSY_GRAY_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_GREEN_STAINED_GLASS.get(), PALE_MOSSY_GREEN_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_LIME_STAINED_GLASS.get(), PALE_MOSSY_LIME_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_MAGENTA_STAINED_GLASS.get(), PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_ORANGE_STAINED_GLASS.get(), PALE_MOSSY_ORANGE_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_PINK_STAINED_GLASS.get(), PALE_MOSSY_PINK_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_PURPLE_STAINED_GLASS.get(), PALE_MOSSY_PURPLE_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_RED_STAINED_GLASS.get(), PALE_MOSSY_RED_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_WHITE_STAINED_GLASS.get(), PALE_MOSSY_WHITE_STAINED_GLASS_PANE.get());
                createPaleMossyStainedGlassPaneRecipe(recipeOutput, PALE_MOSSY_YELLOW_STAINED_GLASS.get(), PALE_MOSSY_YELLOW_STAINED_GLASS_PANE.get());

                this.woodFromLogs(PALE_MOSSY_ACACIA_WOOD.get(), PALE_MOSSY_ACACIA_LOG.get());
                this.woodFromLogs(PALE_MOSSY_BIRCH_WOOD.get(), PALE_MOSSY_BIRCH_LOG.get());
                this.woodFromLogs(PALE_MOSSY_DARK_OAK_WOOD.get(), PALE_MOSSY_DARK_OAK_LOG.get());
                this.woodFromLogs(PALE_MOSSY_PALE_OAK_WOOD.get(), PALE_MOSSY_PALE_OAK_LOG.get());
                this.woodFromLogs(PALE_MOSSY_JUNGLE_WOOD.get(), PALE_MOSSY_JUNGLE_LOG.get());
                this.woodFromLogs(PALE_MOSSY_OAK_WOOD.get(), PALE_MOSSY_OAK_LOG.get());
                this.woodFromLogs(PALE_MOSSY_SPRUCE_WOOD.get(), PALE_MOSSY_SPRUCE_LOG.get());
                this.woodFromLogs(PALE_MOSSY_CRIMSON_HYPHAE.get(), PALE_MOSSY_CRIMSON_STEM.get());
                this.woodFromLogs(PALE_MOSSY_WARPED_HYPHAE.get(), PALE_MOSSY_WARPED_STEM.get());
                this.woodFromLogs(PALE_MOSSY_MANGROVE_WOOD.get(), PALE_MOSSY_MANGROVE_LOG.get());

                this.mosaicBuilder(RecipeCategory.DECORATIONS, PALE_MOSSY_BAMBOO_MOSAIC.get(), PALE_MOSSY_BAMBOO_MOSAIC_SLAB.get());

                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, PALE_MOSS_BLOCK, PALE_MOSS_BALL.get());
                this.shapeless(RecipeCategory.MISC, PALE_MOSS_BALL.get(), 4)
                        .requires(PALE_MOSS_BLOCK)
                        .unlockedBy(getHasName(PALE_MOSS_BLOCK), has(PALE_MOSS_BLOCK))
                        .save(recipeOutput);

                createStairsRecipe(recipeOutput, PALE_MOSSY_BRICKS.get(), PALE_MOSSY_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_BRICKS.get(), PALE_MOSSY_BRICK_SLAB.get());

                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_BRICK_WALL.get(), PALE_MOSSY_BRICKS.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_COBBLESTONE_WALL.get(), PALE_MOSSY_COBBLESTONE.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_STONE_BRICK_WALL.get(), PALE_MOSSY_STONE_BRICKS.get());

                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_OAK_DOOR.get(), PALE_MOSSY_OAK_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_SPRUCE_DOOR.get(), PALE_MOSSY_SPRUCE_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_BIRCH_DOOR.get(), PALE_MOSSY_BIRCH_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_CHERRY_DOOR.get(), PALE_MOSSY_CHERRY_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_JUNGLE_DOOR.get(), PALE_MOSSY_JUNGLE_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_BAMBOO_DOOR.get(), PALE_MOSSY_BAMBOO_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_MANGROVE_DOOR.get(), PALE_MOSSY_MANGROVE_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_DOOR.get(), PALE_MOSSY_DARK_OAK_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_DOOR.get(), PALE_MOSSY_PALE_OAK_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_ACACIA_DOOR.get(), PALE_MOSSY_ACACIA_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_CRIMSON_DOOR.get(), PALE_MOSSY_CRIMSON_PLANKS.get());
                paleMossyDoorBuilder(recipeOutput, PALE_MOSSY_WARPED_DOOR.get(), PALE_MOSSY_WARPED_PLANKS.get());

                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_ACACIA_PLANKS.get(), PALE_MOSSY_ACACIA_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_BAMBOO_PLANKS.get(), PALE_MOSSY_BAMBOO_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_BIRCH_PLANKS.get(), PALE_MOSSY_BIRCH_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_CHERRY_PLANKS.get(), PALE_MOSSY_CHERRY_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_CRIMSON_PLANKS.get(), PALE_MOSSY_CRIMSON_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_DARK_OAK_PLANKS.get(), PALE_MOSSY_DARK_OAK_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_PALE_OAK_PLANKS.get(), PALE_MOSSY_PALE_OAK_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_JUNGLE_PLANKS.get(), PALE_MOSSY_JUNGLE_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_MANGROVE_PLANKS.get(), PALE_MOSSY_MANGROVE_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_OAK_PLANKS.get(), PALE_MOSSY_OAK_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_SPRUCE_PLANKS.get(), PALE_MOSSY_SPRUCE_TRAPDOOR.get());
                paleMossyTrapdoorBuilder(recipeOutput, PALE_MOSSY_WARPED_PLANKS.get(), PALE_MOSSY_WARPED_TRAPDOOR.get());

                createStairsRecipe(recipeOutput, PALE_MOSSY_COBBLED_DEEPSLATE.get(), PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_COBBLED_DEEPSLATE.get(), PALE_MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_COBBLED_DEEPSLATE_WALL.get(), PALE_MOSSY_COBBLED_DEEPSLATE.get());

                createStairsRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_BRICKS.get(), PALE_MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_BRICKS.get(), PALE_MOSSY_DEEPSLATE_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_DEEPSLATE_BRICK_WALL.get(), PALE_MOSSY_DEEPSLATE_BRICKS.get());

                createStairsRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_TILES.get(), PALE_MOSSY_DEEPSLATE_TILE_STAIRS.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_DEEPSLATE_TILES.get(), PALE_MOSSY_DEEPSLATE_TILE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_DEEPSLATE_TILE_WALL.get(), PALE_MOSSY_DEEPSLATE_TILES.get());

                createStairsRecipe(recipeOutput, PALE_MOSSY_TUFF.get(), PALE_MOSSY_TUFF_STAIRS.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_TUFF.get(), PALE_MOSSY_TUFF_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_TUFF_WALL.get(), PALE_MOSSY_TUFF.get());

                createStairsRecipe(recipeOutput, PALE_MOSSY_TUFF_BRICKS.get(), PALE_MOSSY_TUFF_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, PALE_MOSSY_TUFF_BRICKS.get(), PALE_MOSSY_TUFF_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, PALE_MOSSY_TUFF_BRICK_WALL.get(), PALE_MOSSY_TUFF_BRICKS.get());

                this.carpet(CRIMSON_MOSS_CARPET.get(), CRIMSON_MOSS_BLOCK.get());
                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSS_BLOCK.get(), CRIMSON_MOSS_BALL.get());
                this.shapeless(RecipeCategory.MISC, CRIMSON_MOSS_BALL.get(), 4)
                        .requires(CRIMSON_MOSS_BLOCK.get())
                        .unlockedBy(getHasName(CRIMSON_MOSS_BLOCK.get()), has(CRIMSON_MOSS_BLOCK.get()))
                        .save(recipeOutput);

                createCrimsonMossyBlockRecipe(recipeOutput, STONE, CRIMSON_MOSSY_STONE.get(), "crimson_mossy_stone");
                createCrimsonMossyBlockRecipe(recipeOutput, COBBLESTONE, CRIMSON_MOSSY_COBBLESTONE.get(), "crimson_mossy_cobblestone");
                createCrimsonMossyBlockRecipe(recipeOutput, STONE_BRICKS, CRIMSON_MOSSY_STONE_BRICKS.get(), "crimson_mossy_stone_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, CRIMSON_MOSSY_ACACIA_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, CRIMSON_MOSSY_BIRCH_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, CRIMSON_MOSSY_CHERRY_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, OAK_PLANKS, CRIMSON_MOSSY_OAK_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, WARPED_PLANKS, CRIMSON_MOSSY_WARPED_PLANKS.get(), "crimson_mossy_planks");
                createCrimsonMossyBlockRecipe(recipeOutput, ACACIA_LOG, CRIMSON_MOSSY_ACACIA_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, CRIMSON_MOSSY_BAMBOO_BLOCK.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, BIRCH_LOG, CRIMSON_MOSSY_BIRCH_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, CHERRY_LOG, CRIMSON_MOSSY_CHERRY_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, CRIMSON_STEM, CRIMSON_MOSSY_CRIMSON_STEM.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, CRIMSON_MOSSY_DARK_OAK_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, CRIMSON_MOSSY_PALE_OAK_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, JUNGLE_LOG, CRIMSON_MOSSY_JUNGLE_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, MANGROVE_LOG, CRIMSON_MOSSY_MANGROVE_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, OAK_LOG, CRIMSON_MOSSY_OAK_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, SPRUCE_LOG, CRIMSON_MOSSY_SPRUCE_LOG.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, WARPED_STEM, CRIMSON_MOSSY_WARPED_STEM.get(), "crimson_mossy_log");
                createCrimsonMossyBlockRecipe(recipeOutput, GLASS, CRIMSON_MOSSY_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, CRIMSON_MOSSY_BLACK_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, CRIMSON_MOSSY_BLUE_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, CRIMSON_MOSSY_BROWN_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, CRIMSON_MOSSY_CYAN_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, CRIMSON_MOSSY_GRAY_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, CRIMSON_MOSSY_GREEN_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, CRIMSON_MOSSY_LIME_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, CRIMSON_MOSSY_ORANGE_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, CRIMSON_MOSSY_PINK_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, CRIMSON_MOSSY_PURPLE_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, CRIMSON_MOSSY_RED_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, TINTED_GLASS, CRIMSON_MOSSY_TINTED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, CRIMSON_MOSSY_WHITE_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, CRIMSON_MOSSY_YELLOW_STAINED_GLASS.get(), "crimson_mossy_glass");
                createCrimsonMossyBlockRecipe(recipeOutput, IRON_BARS, CRIMSON_MOSSY_IRON_BARS.get(), "crimson_mossy_iron_bars");
                createCrimsonMossyBlockRecipe(recipeOutput, IRON_DOOR, CRIMSON_MOSSY_IRON_DOOR.get(), "crimson_mossy_iron_door");
                createCrimsonMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, CRIMSON_MOSSY_IRON_TRAPDOOR.get(), "crimson_mossy_iron_trapdoor");
                createCrimsonMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, CRIMSON_MOSSY_CHISELED_STONE_BRICKS.get(), "crimson_mossy_chiseled_stone_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, BRICKS, CRIMSON_MOSSY_BRICKS.get(), "crimson_mossy_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, DEEPSLATE, CRIMSON_MOSSY_DEEPSLATE.get(), "crimson_mossy_deepslate");
                createCrimsonMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), "crimson_mossy_cobbled_deepslate");
                createCrimsonMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), "crimson_mossy_deepslate_bricks");
                createCrimsonMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, CRIMSON_MOSSY_DEEPSLATE_TILES.get(), "crimson_mossy_deepslate_tiles");
                createCrimsonMossyBlockRecipe(recipeOutput, TUFF, CRIMSON_MOSSY_TUFF.get(), "crimson_mossy_tuff");
                createCrimsonMossyBlockRecipe(recipeOutput, TUFF_BRICKS, CRIMSON_MOSSY_TUFF_BRICKS.get(), "crimson_mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), "has_crimson_mossy_wood", "crimson_mossy_planks", NemosMossyItemTags.CRIMSON_MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_STONE.get(), CRIMSON_MOSSY_STONE_STAIRS.get());
                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_COBBLESTONE.get(), CRIMSON_MOSSY_COBBLESTONE_STAIRS.get());
                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_STONE_BRICKS.get(), CRIMSON_MOSSY_STONE_BRICK_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_STAIRS.get());
                crimsonMossyStairBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_STAIRS.get());
                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_STONE.get(), CRIMSON_MOSSY_STONE_SLAB.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_COBBLESTONE.get(), CRIMSON_MOSSY_COBBLESTONE_SLAB.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_STONE_BRICKS.get(), CRIMSON_MOSSY_STONE_BRICK_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_SLAB.get());
                crimsonMossySlabBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_SLAB.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB.get());

                pressurePlateBuilder(recipeOutput, CRIMSON_MOSSY_STONE.get(), CRIMSON_MOSSY_STONE_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE.get());
                createCrimsonMossyWoodenPressurePlateRecipe(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_PRESSURE_PLATE.get());

                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_FENCE.get());
                crimsonMossyFenceBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_FENCE.get());

                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_FENCE_GATE.get());
                crimsonMossyFenceGateBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_FENCE_GATE.get());

                createButtonRecipe(recipeOutput, CRIMSON_MOSSY_STONE.get(), CRIMSON_MOSSY_STONE_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_BUTTON.get());
                createCrimsonMossyWoodenButtonRecipe(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_BUTTON.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_SLAB.get(), CRIMSON_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_STAIRS.get(), CRIMSON_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_SLAB.get(), CRIMSON_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICKS.get(), CRIMSON_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_STAIRS.get(), CRIMSON_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_WALL.get(), CRIMSON_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_CHISELED_STONE_BRICKS.get(), CRIMSON_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLESTONE_SLAB.get(), CRIMSON_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLESTONE_STAIRS.get(), CRIMSON_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLESTONE_WALL.get(), CRIMSON_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_SLAB.get(), CRIMSON_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_STAIRS.get(), CRIMSON_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_STONE_BRICK_WALL.get(), CRIMSON_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_BRICK_SLAB.get(), CRIMSON_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_BRICK_STAIRS.get(), CRIMSON_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_BRICK_WALL.get(), CRIMSON_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_SLAB.get(), CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_STAIRS.get(), CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_WALL.get(), CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_SLAB.get(), CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_STAIRS.get(), CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_BRICK_WALL.get(), CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_TILE_SLAB.get(), CRIMSON_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_TILE_STAIRS.get(), CRIMSON_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_DEEPSLATE_TILE_WALL.get(), CRIMSON_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_SLAB.get(), CRIMSON_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_STAIRS.get(), CRIMSON_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_WALL.get(), CRIMSON_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_BRICK_SLAB.get(), CRIMSON_MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_BRICK_STAIRS.get(), CRIMSON_MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, CRIMSON_MOSSY_TUFF_BRICK_WALL.get(), CRIMSON_MOSSY_TUFF_BRICKS.get());

                createGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_GLASS.get(), CRIMSON_MOSSY_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_BLACK_STAINED_GLASS.get(), CRIMSON_MOSSY_BLACK_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_BLUE_STAINED_GLASS.get(), CRIMSON_MOSSY_BLUE_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_BROWN_STAINED_GLASS.get(), CRIMSON_MOSSY_BROWN_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_CYAN_STAINED_GLASS.get(), CRIMSON_MOSSY_CYAN_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_GRAY_STAINED_GLASS.get(), CRIMSON_MOSSY_GRAY_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_GREEN_STAINED_GLASS.get(), CRIMSON_MOSSY_GREEN_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_LIME_STAINED_GLASS.get(), CRIMSON_MOSSY_LIME_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.get(), CRIMSON_MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_ORANGE_STAINED_GLASS.get(), CRIMSON_MOSSY_ORANGE_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_PINK_STAINED_GLASS.get(), CRIMSON_MOSSY_PINK_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_PURPLE_STAINED_GLASS.get(), CRIMSON_MOSSY_PURPLE_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_RED_STAINED_GLASS.get(), CRIMSON_MOSSY_RED_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_WHITE_STAINED_GLASS.get(), CRIMSON_MOSSY_WHITE_STAINED_GLASS_PANE.get());
                createCrimsonMossyStainedGlassPaneRecipe(recipeOutput, CRIMSON_MOSSY_YELLOW_STAINED_GLASS.get(), CRIMSON_MOSSY_YELLOW_STAINED_GLASS_PANE.get());

                this.woodFromLogs(CRIMSON_MOSSY_ACACIA_WOOD.get(), CRIMSON_MOSSY_ACACIA_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_BIRCH_WOOD.get(), CRIMSON_MOSSY_BIRCH_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_DARK_OAK_WOOD.get(), CRIMSON_MOSSY_DARK_OAK_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_PALE_OAK_WOOD.get(), CRIMSON_MOSSY_PALE_OAK_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_JUNGLE_WOOD.get(), CRIMSON_MOSSY_JUNGLE_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_OAK_WOOD.get(), CRIMSON_MOSSY_OAK_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_SPRUCE_WOOD.get(), CRIMSON_MOSSY_SPRUCE_LOG.get());
                this.woodFromLogs(CRIMSON_MOSSY_CRIMSON_HYPHAE.get(), CRIMSON_MOSSY_CRIMSON_STEM.get());
                this.woodFromLogs(CRIMSON_MOSSY_WARPED_HYPHAE.get(), CRIMSON_MOSSY_WARPED_STEM.get());
                this.woodFromLogs(CRIMSON_MOSSY_MANGROVE_WOOD.get(), CRIMSON_MOSSY_MANGROVE_LOG.get());

                this.mosaicBuilder(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_BAMBOO_MOSAIC.get(), CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB.get());

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_BRICKS.get(), CRIMSON_MOSSY_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_BRICKS.get(), CRIMSON_MOSSY_BRICK_SLAB.get());

                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_BRICK_WALL.get(), CRIMSON_MOSSY_BRICKS.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_COBBLESTONE_WALL.get(), CRIMSON_MOSSY_COBBLESTONE.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_STONE_BRICK_WALL.get(), CRIMSON_MOSSY_STONE_BRICKS.get());

                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_OAK_DOOR.get(), CRIMSON_MOSSY_OAK_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_DOOR.get(), CRIMSON_MOSSY_SPRUCE_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_DOOR.get(), CRIMSON_MOSSY_BIRCH_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_DOOR.get(), CRIMSON_MOSSY_CHERRY_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_DOOR.get(), CRIMSON_MOSSY_JUNGLE_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_DOOR.get(), CRIMSON_MOSSY_BAMBOO_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_DOOR.get(), CRIMSON_MOSSY_MANGROVE_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_DOOR.get(), CRIMSON_MOSSY_DARK_OAK_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_DOOR.get(), CRIMSON_MOSSY_PALE_OAK_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_DOOR.get(), CRIMSON_MOSSY_ACACIA_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_DOOR.get(), CRIMSON_MOSSY_CRIMSON_PLANKS.get());
                crimsonMossyDoorBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_DOOR.get(), CRIMSON_MOSSY_WARPED_PLANKS.get());

                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_ACACIA_PLANKS.get(), CRIMSON_MOSSY_ACACIA_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_BAMBOO_PLANKS.get(), CRIMSON_MOSSY_BAMBOO_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_BIRCH_PLANKS.get(), CRIMSON_MOSSY_BIRCH_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_CHERRY_PLANKS.get(), CRIMSON_MOSSY_CHERRY_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_CRIMSON_PLANKS.get(), CRIMSON_MOSSY_CRIMSON_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_DARK_OAK_PLANKS.get(), CRIMSON_MOSSY_DARK_OAK_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_PALE_OAK_PLANKS.get(), CRIMSON_MOSSY_PALE_OAK_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_JUNGLE_PLANKS.get(), CRIMSON_MOSSY_JUNGLE_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_MANGROVE_PLANKS.get(), CRIMSON_MOSSY_MANGROVE_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_OAK_PLANKS.get(), CRIMSON_MOSSY_OAK_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_SPRUCE_PLANKS.get(), CRIMSON_MOSSY_SPRUCE_TRAPDOOR.get());
                crimsonMossyTrapdoorBuilder(recipeOutput, CRIMSON_MOSSY_WARPED_PLANKS.get(), CRIMSON_MOSSY_WARPED_TRAPDOOR.get());

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), CRIMSON_MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_COBBLED_DEEPSLATE.get(), CRIMSON_MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_COBBLED_DEEPSLATE_WALL.get(), CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), CRIMSON_MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_BRICKS.get(), CRIMSON_MOSSY_DEEPSLATE_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_DEEPSLATE_BRICK_WALL.get(), CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_TILES.get(), CRIMSON_MOSSY_DEEPSLATE_TILE_STAIRS.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_DEEPSLATE_TILES.get(), CRIMSON_MOSSY_DEEPSLATE_TILE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_DEEPSLATE_TILE_WALL.get(), CRIMSON_MOSSY_DEEPSLATE_TILES.get());

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_TUFF.get(), CRIMSON_MOSSY_TUFF_STAIRS.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_TUFF.get(), CRIMSON_MOSSY_TUFF_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_TUFF_WALL.get(), CRIMSON_MOSSY_TUFF.get());

                createStairsRecipe(recipeOutput, CRIMSON_MOSSY_TUFF_BRICKS.get(), CRIMSON_MOSSY_TUFF_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, CRIMSON_MOSSY_TUFF_BRICKS.get(), CRIMSON_MOSSY_TUFF_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, CRIMSON_MOSSY_TUFF_BRICK_WALL.get(), CRIMSON_MOSSY_TUFF_BRICKS.get());

                this.carpet(WARPED_MOSS_CARPET.get(), WARPED_MOSS_BLOCK.get());
                this.twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSS_BLOCK.get(), WARPED_MOSS_BALL.get());
                this.shapeless(RecipeCategory.MISC, WARPED_MOSS_BALL.get(), 4)
                        .requires(WARPED_MOSS_BLOCK.get())
                        .unlockedBy(getHasName(WARPED_MOSS_BLOCK.get()), has(WARPED_MOSS_BLOCK.get()))
                        .save(recipeOutput);
                createWarpedMossyBlockRecipe(recipeOutput, STONE, WARPED_MOSSY_STONE.get(), "warped_mossy_stone");
                createWarpedMossyBlockRecipe(recipeOutput, COBBLESTONE, WARPED_MOSSY_COBBLESTONE.get(), "warped_mossy_cobblestone");
                createWarpedMossyBlockRecipe(recipeOutput, STONE_BRICKS, WARPED_MOSSY_STONE_BRICKS.get(), "warped_mossy_stone_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, ACACIA_PLANKS, WARPED_MOSSY_ACACIA_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, BAMBOO_PLANKS, WARPED_MOSSY_BAMBOO_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, BAMBOO_MOSAIC, WARPED_MOSSY_BAMBOO_MOSAIC.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, BIRCH_PLANKS, WARPED_MOSSY_BIRCH_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, CHERRY_PLANKS, WARPED_MOSSY_CHERRY_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, CRIMSON_PLANKS, WARPED_MOSSY_CRIMSON_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, DARK_OAK_PLANKS, WARPED_MOSSY_DARK_OAK_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, PALE_OAK_PLANKS, WARPED_MOSSY_PALE_OAK_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, JUNGLE_PLANKS, WARPED_MOSSY_JUNGLE_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, MANGROVE_PLANKS, WARPED_MOSSY_MANGROVE_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, OAK_PLANKS, WARPED_MOSSY_OAK_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, SPRUCE_PLANKS, WARPED_MOSSY_SPRUCE_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, WARPED_PLANKS, WARPED_MOSSY_WARPED_PLANKS.get(), "warped_mossy_planks");
                createWarpedMossyBlockRecipe(recipeOutput, ACACIA_LOG, WARPED_MOSSY_ACACIA_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, BAMBOO_BLOCK, WARPED_MOSSY_BAMBOO_BLOCK.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, BIRCH_LOG, WARPED_MOSSY_BIRCH_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, CHERRY_LOG, WARPED_MOSSY_CHERRY_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, CRIMSON_STEM, WARPED_MOSSY_CRIMSON_STEM.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, DARK_OAK_LOG, WARPED_MOSSY_DARK_OAK_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, PALE_OAK_LOG, WARPED_MOSSY_PALE_OAK_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, JUNGLE_LOG, WARPED_MOSSY_JUNGLE_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, MANGROVE_LOG, WARPED_MOSSY_MANGROVE_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, OAK_LOG, WARPED_MOSSY_OAK_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, SPRUCE_LOG, WARPED_MOSSY_SPRUCE_LOG.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, WARPED_STEM, WARPED_MOSSY_WARPED_STEM.get(), "warped_mossy_log");
                createWarpedMossyBlockRecipe(recipeOutput, GLASS, WARPED_MOSSY_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, BLACK_STAINED_GLASS, WARPED_MOSSY_BLACK_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, BLUE_STAINED_GLASS, WARPED_MOSSY_BLUE_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, BROWN_STAINED_GLASS, WARPED_MOSSY_BROWN_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, CYAN_STAINED_GLASS, WARPED_MOSSY_CYAN_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, GRAY_STAINED_GLASS, WARPED_MOSSY_GRAY_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, GREEN_STAINED_GLASS, WARPED_MOSSY_GREEN_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, LIGHT_BLUE_STAINED_GLASS, WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, LIGHT_GRAY_STAINED_GLASS, WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, LIME_STAINED_GLASS, WARPED_MOSSY_LIME_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, MAGENTA_STAINED_GLASS, WARPED_MOSSY_MAGENTA_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, ORANGE_STAINED_GLASS, WARPED_MOSSY_ORANGE_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, PINK_STAINED_GLASS, WARPED_MOSSY_PINK_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, PURPLE_STAINED_GLASS, WARPED_MOSSY_PURPLE_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, RED_STAINED_GLASS, WARPED_MOSSY_RED_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, TINTED_GLASS, WARPED_MOSSY_TINTED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, WHITE_STAINED_GLASS, WARPED_MOSSY_WHITE_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, YELLOW_STAINED_GLASS, WARPED_MOSSY_YELLOW_STAINED_GLASS.get(), "warped_mossy_glass");
                createWarpedMossyBlockRecipe(recipeOutput, IRON_BARS, WARPED_MOSSY_IRON_BARS.get(), "warped_mossy_iron_bars");
                createWarpedMossyBlockRecipe(recipeOutput, IRON_DOOR, WARPED_MOSSY_IRON_DOOR.get(), "warped_mossy_iron_door");
                createWarpedMossyBlockRecipe(recipeOutput, IRON_TRAPDOOR, WARPED_MOSSY_IRON_TRAPDOOR.get(), "warped_mossy_iron_trapdoor");
                createWarpedMossyBlockRecipe(recipeOutput, CHISELED_STONE_BRICKS, WARPED_MOSSY_CHISELED_STONE_BRICKS.get(), "warped_mossy_chiseled_stone_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, BRICKS, WARPED_MOSSY_BRICKS.get(), "warped_mossy_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, DEEPSLATE, WARPED_MOSSY_DEEPSLATE.get(), "warped_mossy_deepslate");
                createWarpedMossyBlockRecipe(recipeOutput, COBBLED_DEEPSLATE, WARPED_MOSSY_COBBLED_DEEPSLATE.get(), "warped_mossy_cobbled_deepslate");
                createWarpedMossyBlockRecipe(recipeOutput, DEEPSLATE_BRICKS, WARPED_MOSSY_DEEPSLATE_BRICKS.get(), "warped_mossy_deepslate_bricks");
                createWarpedMossyBlockRecipe(recipeOutput, DEEPSLATE_TILES, WARPED_MOSSY_DEEPSLATE_TILES.get(), "warped_mossy_deepslate_tiles");
                createWarpedMossyBlockRecipe(recipeOutput, TUFF, WARPED_MOSSY_TUFF.get(), "warped_mossy_tuff");
                createWarpedMossyBlockRecipe(recipeOutput, TUFF_BRICKS, WARPED_MOSSY_TUFF_BRICKS.get(), "warped_mossy_tuff_bricks");

                createPlanksRecipe(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_ACACIA_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_BAMBOO_BLOCKS);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_BIRCH_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_CHERRY_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_CRIMSON_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_DARK_OAK_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_PALE_OAK_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_JUNGLE_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_MANGROVE_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_OAK_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_SPRUCE_WOOD);
                createPlanksRecipe(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), "has_warped_mossy_wood", "warped_mossy_planks", NemosMossyItemTags.WARPED_MOSSY_WARPED_WOOD);

                createStairsRecipe(recipeOutput, WARPED_MOSSY_STONE.get(), WARPED_MOSSY_STONE_STAIRS.get());
                createStairsRecipe(recipeOutput, WARPED_MOSSY_COBBLESTONE.get(), WARPED_MOSSY_COBBLESTONE_STAIRS.get());
                createStairsRecipe(recipeOutput, WARPED_MOSSY_STONE_BRICKS.get(), WARPED_MOSSY_STONE_BRICK_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_STAIRS.get());
                wapredMossyStairBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_STAIRS.get());
                createStairsRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_MOSAIC.get(), WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS.get());

                createSlabRecipe(recipeOutput, WARPED_MOSSY_STONE.get(), WARPED_MOSSY_STONE_SLAB.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_COBBLESTONE.get(), WARPED_MOSSY_COBBLESTONE_SLAB.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_STONE_BRICKS.get(), WARPED_MOSSY_STONE_BRICK_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_SLAB.get());
                warpedMossySlabBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_SLAB.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_MOSAIC.get(), WARPED_MOSSY_BAMBOO_MOSAIC_SLAB.get());

                pressurePlateBuilder(recipeOutput, WARPED_MOSSY_STONE.get(), WARPED_MOSSY_STONE_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_PRESSURE_PLATE.get());
                createWarpedMossyWoodenPressurePlateRecipe(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_PRESSURE_PLATE.get());

                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_FENCE.get());
                warpedMossyFenceBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_FENCE.get());

                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_FENCE_GATE.get());
                warpedMossyFenceGateBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_FENCE_GATE.get());

                createButtonRecipe(recipeOutput, WARPED_MOSSY_STONE.get(), WARPED_MOSSY_STONE_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_BUTTON.get());
                createWarpedMossyWoodenButtonRecipe(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_BUTTON.get());

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_SLAB.get(), WARPED_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_STAIRS.get(), WARPED_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_SLAB.get(), WARPED_MOSSY_STONE.get(), 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICKS.get(), WARPED_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_STAIRS.get(), WARPED_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_WALL.get(), WARPED_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_CHISELED_STONE_BRICKS.get(), WARPED_MOSSY_STONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLESTONE_SLAB.get(), WARPED_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLESTONE_STAIRS.get(), WARPED_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLESTONE_WALL.get(), WARPED_MOSSY_COBBLESTONE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_SLAB.get(), WARPED_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_STAIRS.get(), WARPED_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_STONE_BRICK_WALL.get(), WARPED_MOSSY_STONE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_BRICK_SLAB.get(), WARPED_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_BRICK_STAIRS.get(), WARPED_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_BRICK_WALL.get(), WARPED_MOSSY_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLED_DEEPSLATE_SLAB.get(), WARPED_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLED_DEEPSLATE_STAIRS.get(), WARPED_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_COBBLED_DEEPSLATE_WALL.get(), WARPED_MOSSY_COBBLED_DEEPSLATE.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_BRICK_SLAB.get(), WARPED_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_BRICK_STAIRS.get(), WARPED_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_BRICK_WALL.get(), WARPED_MOSSY_DEEPSLATE_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_TILE_SLAB.get(), WARPED_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_TILE_STAIRS.get(), WARPED_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_DEEPSLATE_TILE_WALL.get(), WARPED_MOSSY_DEEPSLATE_TILES.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_SLAB.get(), WARPED_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_STAIRS.get(), WARPED_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_WALL.get(), WARPED_MOSSY_TUFF.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_BRICK_SLAB.get(), WARPED_MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_BRICK_STAIRS.get(), WARPED_MOSSY_TUFF_BRICKS.get());
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, WARPED_MOSSY_TUFF_BRICK_WALL.get(), WARPED_MOSSY_TUFF_BRICKS.get());

                createGlassPaneRecipe(recipeOutput, WARPED_MOSSY_GLASS.get(), WARPED_MOSSY_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_BLACK_STAINED_GLASS.get(), WARPED_MOSSY_BLACK_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_BLUE_STAINED_GLASS.get(), WARPED_MOSSY_BLUE_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_BROWN_STAINED_GLASS.get(), WARPED_MOSSY_BROWN_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_CYAN_STAINED_GLASS.get(), WARPED_MOSSY_CYAN_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_GRAY_STAINED_GLASS.get(), WARPED_MOSSY_GRAY_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_GREEN_STAINED_GLASS.get(), WARPED_MOSSY_GREEN_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_LIME_STAINED_GLASS.get(), WARPED_MOSSY_LIME_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_MAGENTA_STAINED_GLASS.get(), WARPED_MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_ORANGE_STAINED_GLASS.get(), WARPED_MOSSY_ORANGE_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_PINK_STAINED_GLASS.get(), WARPED_MOSSY_PINK_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_PURPLE_STAINED_GLASS.get(), WARPED_MOSSY_PURPLE_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_RED_STAINED_GLASS.get(), WARPED_MOSSY_RED_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_WHITE_STAINED_GLASS.get(), WARPED_MOSSY_WHITE_STAINED_GLASS_PANE.get());
                createWarpedMossyStainedGlassPaneRecipe(recipeOutput, WARPED_MOSSY_YELLOW_STAINED_GLASS.get(), WARPED_MOSSY_YELLOW_STAINED_GLASS_PANE.get());

                this.woodFromLogs(WARPED_MOSSY_ACACIA_WOOD.get(), WARPED_MOSSY_ACACIA_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_BIRCH_WOOD.get(), WARPED_MOSSY_BIRCH_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_DARK_OAK_WOOD.get(), WARPED_MOSSY_DARK_OAK_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_PALE_OAK_WOOD.get(), WARPED_MOSSY_PALE_OAK_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_JUNGLE_WOOD.get(), WARPED_MOSSY_JUNGLE_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_OAK_WOOD.get(), WARPED_MOSSY_OAK_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_SPRUCE_WOOD.get(), WARPED_MOSSY_SPRUCE_LOG.get());
                this.woodFromLogs(WARPED_MOSSY_CRIMSON_HYPHAE.get(), WARPED_MOSSY_CRIMSON_STEM.get());
                this.woodFromLogs(WARPED_MOSSY_WARPED_HYPHAE.get(), WARPED_MOSSY_WARPED_STEM.get());
                this.woodFromLogs(WARPED_MOSSY_MANGROVE_WOOD.get(), WARPED_MOSSY_MANGROVE_LOG.get());

                this.mosaicBuilder(RecipeCategory.DECORATIONS, WARPED_MOSSY_BAMBOO_MOSAIC.get(), WARPED_MOSSY_BAMBOO_MOSAIC_SLAB.get());

                createStairsRecipe(recipeOutput, WARPED_MOSSY_BRICKS.get(), WARPED_MOSSY_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_BRICKS.get(), WARPED_MOSSY_BRICK_SLAB.get());

                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_BRICK_WALL.get(), WARPED_MOSSY_BRICKS.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_COBBLESTONE_WALL.get(), WARPED_MOSSY_COBBLESTONE.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_STONE_BRICK_WALL.get(), WARPED_MOSSY_STONE_BRICKS.get());

                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_OAK_DOOR.get(), WARPED_MOSSY_OAK_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_DOOR.get(), WARPED_MOSSY_SPRUCE_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_BIRCH_DOOR.get(), WARPED_MOSSY_BIRCH_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_CHERRY_DOOR.get(), WARPED_MOSSY_CHERRY_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_DOOR.get(), WARPED_MOSSY_JUNGLE_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_DOOR.get(), WARPED_MOSSY_BAMBOO_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_DOOR.get(), WARPED_MOSSY_MANGROVE_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_DOOR.get(), WARPED_MOSSY_DARK_OAK_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_DOOR.get(), WARPED_MOSSY_PALE_OAK_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_ACACIA_DOOR.get(), WARPED_MOSSY_ACACIA_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_DOOR.get(), WARPED_MOSSY_CRIMSON_PLANKS.get());
                warpedMossyDoorBuilder(recipeOutput, WARPED_MOSSY_WARPED_DOOR.get(), WARPED_MOSSY_WARPED_PLANKS.get());

                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_ACACIA_PLANKS.get(), WARPED_MOSSY_ACACIA_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_BAMBOO_PLANKS.get(), WARPED_MOSSY_BAMBOO_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_BIRCH_PLANKS.get(), WARPED_MOSSY_BIRCH_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_CHERRY_PLANKS.get(), WARPED_MOSSY_CHERRY_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_CRIMSON_PLANKS.get(), WARPED_MOSSY_CRIMSON_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_DARK_OAK_PLANKS.get(), WARPED_MOSSY_DARK_OAK_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_PALE_OAK_PLANKS.get(), WARPED_MOSSY_PALE_OAK_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_JUNGLE_PLANKS.get(), WARPED_MOSSY_JUNGLE_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_MANGROVE_PLANKS.get(), WARPED_MOSSY_MANGROVE_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_OAK_PLANKS.get(), WARPED_MOSSY_OAK_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_SPRUCE_PLANKS.get(), WARPED_MOSSY_SPRUCE_TRAPDOOR.get());
                warpedMossyTrapdoorBuilder(recipeOutput, WARPED_MOSSY_WARPED_PLANKS.get(), WARPED_MOSSY_WARPED_TRAPDOOR.get());

                createStairsRecipe(recipeOutput, WARPED_MOSSY_COBBLED_DEEPSLATE.get(), WARPED_MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_COBBLED_DEEPSLATE.get(), WARPED_MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_COBBLED_DEEPSLATE_WALL.get(), WARPED_MOSSY_COBBLED_DEEPSLATE.get());

                createStairsRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_BRICKS.get(), WARPED_MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_BRICKS.get(), WARPED_MOSSY_DEEPSLATE_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_DEEPSLATE_BRICK_WALL.get(), WARPED_MOSSY_DEEPSLATE_BRICKS.get());

                createStairsRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_TILES.get(), WARPED_MOSSY_DEEPSLATE_TILE_STAIRS.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_DEEPSLATE_TILES.get(), WARPED_MOSSY_DEEPSLATE_TILE_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_DEEPSLATE_TILE_WALL.get(), WARPED_MOSSY_DEEPSLATE_TILES.get());

                createStairsRecipe(recipeOutput, WARPED_MOSSY_TUFF.get(), WARPED_MOSSY_TUFF_STAIRS.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_TUFF.get(), WARPED_MOSSY_TUFF_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_TUFF_WALL.get(), WARPED_MOSSY_TUFF.get());

                createStairsRecipe(recipeOutput, WARPED_MOSSY_TUFF_BRICKS.get(), WARPED_MOSSY_TUFF_BRICK_STAIRS.get());
                createSlabRecipe(recipeOutput, WARPED_MOSSY_TUFF_BRICKS.get(), WARPED_MOSSY_TUFF_BRICK_SLAB.get());
                this.wall(RecipeCategory.DECORATIONS, WARPED_MOSSY_TUFF_BRICK_WALL.get(), WARPED_MOSSY_TUFF_BRICKS.get());
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
                        .requires(CRIMSON_MOSS_BLOCK.get())
                        .group(group)
                        .unlockedBy(getHasName(CRIMSON_MOSS_BLOCK.get()), this.has(CRIMSON_MOSS_BLOCK.get()))
                        .save(recipeOutput, getConversionRecipeName(result, CRIMSON_MOSS_BLOCK.get()));
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
                        .requires(WARPED_MOSS_BLOCK.get())
                        .group(group)
                        .unlockedBy(getHasName(WARPED_MOSS_BLOCK.get()), this.has(WARPED_MOSS_BLOCK.get()))
                        .save(recipeOutput, getConversionRecipeName(result, WARPED_MOSS_BLOCK.get()));
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
