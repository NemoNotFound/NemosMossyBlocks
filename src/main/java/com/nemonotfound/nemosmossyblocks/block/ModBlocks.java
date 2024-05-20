package com.nemonotfound.nemosmossyblocks.block;

import com.nemonotfound.nemosmossyblocks.item.ModItemGroups;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block MOSSY_ACACIA_LOG = registerBlock("mossy_acacia_log",
            Blocks.createLogBlock(MapColor.ORANGE, MapColor.STONE_GRAY), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_WOOD = registerBlock("mossy_acacia_wood",
            new PillarBlock(AbstractBlock.Settings.copy(ACACIA_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_PLANKS = registerBlock("mossy_acacia_planks",
            new Block(AbstractBlock.Settings.copy(ACACIA_PLANKS)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_STAIRS = registerBlock("mossy_acacia_stairs",
            createStairsBlock(MOSSY_ACACIA_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_SLAB = registerBlock("mossy_acacia_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_ACACIA_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_FENCE = registerBlock("mossy_acacia_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ACACIA_FENCE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_FENCE_GATE = registerBlock("mossy_acacia_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(ACACIA_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_PRESSURE_PLATE = registerBlock("mossy_acacia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.copy(ACACIA_PRESSURE_PLATE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_ACACIA_BUTTON = registerBlock("mossy_acacia_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(ACACIA_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_LOG = registerBlock("mossy_birch_log",
            Blocks.createLogBlock(MapColor.PALE_YELLOW, MapColor.OFF_WHITE), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_WOOD = registerBlock("mossy_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(BIRCH_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_PLANKS = registerBlock("mossy_birch_planks",
            new Block(AbstractBlock.Settings.copy(BIRCH_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_STAIRS = registerBlock("mossy_birch_stairs",
            createStairsBlock(MOSSY_BIRCH_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_SLAB = registerBlock("mossy_birch_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_BIRCH_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_FENCE = registerBlock("mossy_birch_fence",
            new FenceBlock(AbstractBlock.Settings.copy(BIRCH_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_FENCE_GATE = registerBlock("mossy_birch_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(BIRCH_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_PRESSURE_PLATE = registerBlock("mossy_birch_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(BIRCH_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_BIRCH_BUTTON = registerBlock("mossy_birch_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(BIRCH_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_STEM = registerBlock("mossy_crimson_stem",
            Blocks.createNetherStemBlock(MapColor.DULL_PINK), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_HYPHAE = registerBlock("mossy_crimson_hyphae",
            new PillarBlock(AbstractBlock.Settings.copy(CRIMSON_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_PLANKS = registerBlock("mossy_crimson_planks",
            new Block(AbstractBlock.Settings.copy(CRIMSON_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_STAIRS = registerBlock("mossy_crimson_stairs",
            createStairsBlock(MOSSY_CRIMSON_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_SLAB = registerBlock("mossy_crimson_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_CRIMSON_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_FENCE = registerBlock("mossy_crimson_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CRIMSON_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_FENCE_GATE = registerBlock("mossy_crimson_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(CRIMSON_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_PRESSURE_PLATE = registerBlock("mossy_crimson_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(CRIMSON_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_CRIMSON_BUTTON = registerBlock("mossy_crimson_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(CRIMSON_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_LOG = registerBlock("mossy_dark_oak_log",
            Blocks.createLogBlock(MapColor.BROWN, MapColor.BROWN), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_WOOD = registerBlock("mossy_dark_oak_wood",
            new PillarBlock(AbstractBlock.Settings.copy(DARK_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_PLANKS = registerBlock("mossy_dark_oak_planks",
            new Block(AbstractBlock.Settings.copy(DARK_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_STAIRS = registerBlock("mossy_dark_oak_stairs",
            createStairsBlock(MOSSY_DARK_OAK_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_SLAB = registerBlock("mossy_dark_oak_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_DARK_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_FENCE = registerBlock("mossy_dark_oak_fence",
            new FenceBlock(AbstractBlock.Settings.copy(DARK_OAK_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_FENCE_GATE = registerBlock("mossy_dark_oak_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(DARK_OAK_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_PRESSURE_PLATE = registerBlock("mossy_dark_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(DARK_OAK_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_DARK_OAK_BUTTON = registerBlock("mossy_dark_oak_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(DARK_OAK_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_LOG = registerBlock("mossy_jungle_log",
            Blocks.createLogBlock(MapColor.DIRT_BROWN, MapColor.SPRUCE_BROWN), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_WOOD = registerBlock("mossy_jungle_wood",
            new PillarBlock(AbstractBlock.Settings.copy(JUNGLE_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_PLANKS = registerBlock("mossy_jungle_planks",
            new Block(AbstractBlock.Settings.copy(JUNGLE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_STAIRS = registerBlock("mossy_jungle_stairs",
            createStairsBlock(MOSSY_JUNGLE_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_SLAB = registerBlock("mossy_jungle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_JUNGLE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_FENCE = registerBlock("mossy_jungle_fence",
            new FenceBlock(AbstractBlock.Settings.copy(JUNGLE_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_FENCE_GATE = registerBlock("mossy_jungle_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(JUNGLE_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_PRESSURE_PLATE = registerBlock("mossy_jungle_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(JUNGLE_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_JUNGLE_BUTTON = registerBlock("mossy_jungle_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(JUNGLE_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_LOG = registerBlock("mossy_mangrove_log",
            Blocks.createLogBlock(MapColor.RED, MapColor.SPRUCE_BROWN), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_WOOD = registerBlock("mossy_mangrove_wood",
            new PillarBlock(AbstractBlock.Settings.copy(MANGROVE_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_PLANKS = registerBlock("mossy_mangrove_planks",
            new Block(AbstractBlock.Settings.copy(MANGROVE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_STAIRS = registerBlock("mossy_mangrove_stairs",
            createStairsBlock(MOSSY_MANGROVE_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_SLAB = registerBlock("mossy_mangrove_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_MANGROVE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_FENCE = registerBlock("mossy_mangrove_fence",
            new FenceBlock(AbstractBlock.Settings.copy(MANGROVE_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_FENCE_GATE = registerBlock("mossy_mangrove_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(MANGROVE_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_PRESSURE_PLATE = registerBlock("mossy_mangrove_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(MANGROVE_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_MANGROVE_BUTTON = registerBlock("mossy_mangrove_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(MANGROVE_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_LOG = registerBlock("mossy_oak_log",
            Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_WOOD = registerBlock("mossy_oak_wood",
            new PillarBlock(AbstractBlock.Settings.copy(OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_PLANKS = registerBlock("mossy_oak_planks",
            new Block(AbstractBlock.Settings.copy(OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_STAIRS = registerBlock("mossy_oak_stairs",
            createStairsBlock(MOSSY_OAK_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_SLAB = registerBlock("mossy_oak_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_FENCE = registerBlock("mossy_oak_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_FENCE_GATE = registerBlock("mossy_oak_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(OAK_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_PRESSURE_PLATE = registerBlock("mossy_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(OAK_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_OAK_BUTTON = registerBlock("mossy_oak_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(OAK_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_LOG = registerBlock("mossy_spruce_log",
            Blocks.createLogBlock(MapColor.SPRUCE_BROWN, MapColor.BROWN), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_WOOD = registerBlock("mossy_spruce_wood",
            new PillarBlock(AbstractBlock.Settings.copy(SPRUCE_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_PLANKS = registerBlock("mossy_spruce_planks",
            new Block(AbstractBlock.Settings.copy(SPRUCE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_STAIRS = registerBlock("mossy_spruce_stairs",
            createStairsBlock(MOSSY_SPRUCE_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_SLAB = registerBlock("mossy_spruce_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_SPRUCE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_FENCE = registerBlock("mossy_spruce_fence",
            new FenceBlock(AbstractBlock.Settings.copy(SPRUCE_FENCE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_FENCE_GATE = registerBlock("mossy_spruce_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(SPRUCE_FENCE_GATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_PRESSURE_PLATE = registerBlock("mossy_spruce_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(SPRUCE_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_SPRUCE_BUTTON = registerBlock("mossy_spruce_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(SPRUCE_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_STEM = registerBlock("mossy_warped_stem",
            Blocks.createNetherStemBlock(MapColor.DARK_AQUA), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_HYPHAE = registerBlock("mossy_warped_hyphae",
            new PillarBlock(AbstractBlock.Settings.copy(WARPED_HYPHAE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_PLANKS = registerBlock("mossy_warped_planks",
            new Block(AbstractBlock.Settings.copy(WARPED_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_STAIRS = registerBlock("mossy_warped_stairs",
            createStairsBlock(MOSSY_WARPED_PLANKS), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_SLAB = registerBlock("mossy_warped_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_WARPED_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_FENCE = registerBlock("mossy_warped_fence",
            new FenceBlock(AbstractBlock.Settings.copy(WARPED_FENCE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_FENCE_GATE = registerBlock("mossy_warped_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(WARPED_FENCE_GATE)),
            ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_PRESSURE_PLATE = registerBlock("mossy_warped_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(WARPED_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_WARPED_BUTTON = registerBlock("mossy_warped_button",
            new WoodenButtonBlock(AbstractBlock.Settings.copy(WARPED_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_STONE = registerBlock("mossy_stone",
            new Block(AbstractBlock.Settings.copy(STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_STONE_STAIRS = registerBlock("mossy_stone_stairs",
            createStairsBlock(MOSSY_STONE), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_STONE_SLAB = registerBlock("mossy_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_STONE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_STONE_PRESSURE_PLATE = registerBlock("mossy_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    AbstractBlock.Settings.copy(STONE_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_STONE_BUTTON = registerBlock("mossy_stone_button",
            new StoneButtonBlock(AbstractBlock.Settings.copy(STONE_BUTTON)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MOSSY_GLASS = registerBlock("mossy_glass",
            new Block(AbstractBlock.Settings.copy(GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_BLACK_STAINED_GLASS = registerBlock("mossy_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(BLACK_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_BLUE_STAINED_GLASS = registerBlock("mossy_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(BLUE_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_BROWN_STAINED_GLASS = registerBlock("mossy_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(BROWN_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_CYAN_STAINED_GLASS = registerBlock("mossy_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(CYAN_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_GRAY_STAINED_GLASS = registerBlock("mossy_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(GRAY_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_GREEN_STAINED_GLASS = registerBlock("mossy_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(GREEN_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_LIGHT_BLUE_STAINED_GLASS = registerBlock("mossy_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_LIGHT_GRAY_STAINED_GLASS = registerBlock("mossy_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_LIME_STAINED_GLASS = registerBlock("mossy_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(LIME_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_MAGENTA_STAINED_GLASS = registerBlock("mossy_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(MAGENTA_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_ORANGE_STAINED_GLASS = registerBlock("mossy_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(ORANGE_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_PINK_STAINED_GLASS = registerBlock("mossy_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(PINK_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_PURPLE_STAINED_GLASS = registerBlock("mossy_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(PURPLE_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_RED_STAINED_GLASS = registerBlock("mossy_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(RED_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_TINTED_GLASS = registerBlock("mossy_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_WHITE_STAINED_GLASS = registerBlock("mossy_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(WHITE_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_YELLOW_STAINED_GLASS = registerBlock("mossy_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(YELLOW_STAINED_GLASS)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_GLASS_PANE = registerBlock("mossy_glass_pane",
            new PaneBlock(AbstractBlock.Settings.copy(GLASS_PANE)), ItemGroup.DECORATIONS);
    public static final Block MOSSY_BLACK_STAINED_GLASS_PANE = registerBlock("mossy_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(BLACK_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_BLUE_STAINED_GLASS_PANE = registerBlock("mossy_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(BLUE_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_BROWN_STAINED_GLASS_PANE = registerBlock("mossy_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(BROWN_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_CYAN_STAINED_GLASS_PANE = registerBlock("mossy_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(CYAN_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_GRAY_STAINED_GLASS_PANE = registerBlock("mossy_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(GRAY_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_GREEN_STAINED_GLASS_PANE = registerBlock("mossy_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(GREEN_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("mossy_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("mossy_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_LIME_STAINED_GLASS_PANE = registerBlock("mossy_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(LIME_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_MAGENTA_STAINED_GLASS_PANE = registerBlock("mossy_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(MAGENTA_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_ORANGE_STAINED_GLASS_PANE = registerBlock("mossy_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(ORANGE_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_PINK_STAINED_GLASS_PANE = registerBlock("mossy_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(PINK_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_PURPLE_STAINED_GLASS_PANE = registerBlock("mossy_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(PURPLE_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_RED_STAINED_GLASS_PANE = registerBlock("mossy_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(RED_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_WHITE_STAINED_GLASS_PANE = registerBlock("mossy_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(WHITE_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_YELLOW_STAINED_GLASS_PANE = registerBlock("mossy_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(YELLOW_STAINED_GLASS_PANE)),
            ItemGroup.DECORATIONS);
    public static final Block MOSSY_IRON_BARS = registerBlock("mossy_iron_bars",
            new PaneBlock(AbstractBlock.Settings.copy(IRON_BARS)), ItemGroup.BUILDING_BLOCKS);

    public static void registerBlocks() {
        log.debug("Register blocks");
    }

    private static Block registerBlock(String path, Block block, ItemGroup firstItemGroup) {
        Block registeredBlock = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, path), block);
        BlockItem blockItem = new BlockItem(registeredBlock, new Item.Settings().group(firstItemGroup));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, path), blockItem);
        ModItemGroups.items.add(new ItemStack(blockItem));

        return registeredBlock;
    }

    private static StairsBlock createStairsBlock(Block block) {
        return new StairsBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block));
    }
}
