package com.nemonotfound.nemosmossyblocks.block;

import com.nemonotfound.nemosmossyblocks.item.ModItemGroups;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block MOSSY_ACACIA_LOG = registerBlock("mossy_acacia_log",
            Blocks.createLogBlock(MapColor.ORANGE, MapColor.STONE_GRAY), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_WOOD = registerBlock("mossy_acacia_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_ACACIA_LOG = registerBlock("mossy_stripped_acacia_log",
            Blocks.createLogBlock(MapColor.ORANGE, MapColor.ORANGE), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_ACACIA_WOOD = registerBlock("mossy_stripped_acacia_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.GRAY).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_PLANKS = registerBlock("mossy_acacia_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_STAIRS = registerBlock("mossy_acacia_stairs",
            createStairsBlock(MOSSY_ACACIA_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_SLAB = registerBlock("mossy_acacia_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_ACACIA_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_FENCE = registerBlock("mossy_acacia_fence",
            new FenceBlock(AbstractBlock.Settings.copy(ACACIA_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_FENCE_GATE = registerBlock("mossy_acacia_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(ACACIA_FENCE_GATE), WoodType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_PRESSURE_PLATE = registerBlock("mossy_acacia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_BUTTON = registerBlock("mossy_acacia_button",
            Blocks.createWoodenButtonBlock(BlockSetType.ACACIA), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_BLOCK = registerBlock("mossy_bamboo_block",
            Blocks.createBambooBlock(MapColor.YELLOW, MapColor.DARK_GREEN, BlockSoundGroup.BAMBOO_WOOD), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_BAMBOO_BLOCK = registerBlock("mossy_stripped_bamboo_block",
            Blocks.createBambooBlock(MapColor.YELLOW, MapColor.YELLOW, BlockSoundGroup.BAMBOO_WOOD), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_PLANKS = registerBlock("mossy_bamboo_planks",
            new Block(AbstractBlock.Settings.copy(BAMBOO_PLANKS)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_MOSAIC = registerBlock("mossy_bamboo_mosaic",
            new Block(AbstractBlock.Settings.copy(BAMBOO_MOSAIC)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_STAIRS = registerBlock("mossy_bamboo_stairs",
            createStairsBlock(MOSSY_BAMBOO_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_MOSAIC_STAIRS = registerBlock("mossy_bamboo_mosaic_stairs",
            createStairsBlock(MOSSY_BAMBOO_MOSAIC), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_SLAB = registerBlock("mossy_bamboo_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_BAMBOO_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_MOSAIC_SLAB = registerBlock("mossy_bamboo_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_BAMBOO_MOSAIC)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_FENCE = registerBlock("mossy_bamboo_fence",
            new FenceBlock(AbstractBlock.Settings.copy(BAMBOO_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_FENCE_GATE = registerBlock("mossy_bamboo_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(BAMBOO_FENCE_GATE), WoodType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_PRESSURE_PLATE = registerBlock("mossy_bamboo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(BAMBOO_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_BUTTON = registerBlock("mossy_bamboo_button",
            Blocks.createWoodenButtonBlock(BlockSetType.BAMBOO), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_LOG = registerBlock("mossy_birch_log",
            Blocks.createLogBlock(MapColor.PALE_YELLOW, MapColor.OFF_WHITE), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_WOOD = registerBlock("mossy_birch_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_BIRCH_LOG = registerBlock("mossy_stripped_birch_log",
            Blocks.createLogBlock(MapColor.PALE_YELLOW, MapColor.PALE_YELLOW), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_BIRCH_WOOD = registerBlock("mossy_stripped_birch_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_PLANKS = registerBlock("mossy_birch_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_STAIRS = registerBlock("mossy_birch_stairs",
            createStairsBlock(MOSSY_BIRCH_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_SLAB = registerBlock("mossy_birch_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_BIRCH_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_FENCE = registerBlock("mossy_birch_fence",
            new FenceBlock(AbstractBlock.Settings.copy(BIRCH_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_FENCE_GATE = registerBlock("mossy_birch_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(BIRCH_FENCE_GATE), WoodType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_PRESSURE_PLATE = registerBlock("mossy_birch_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(BIRCH_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_BUTTON = registerBlock("mossy_birch_button",
            Blocks.createWoodenButtonBlock(BlockSetType.BIRCH), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_LOG = registerBlock("mossy_cherry_log",
            Blocks.createBambooBlock(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_GRAY, BlockSoundGroup.CHERRY_WOOD),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_WOOD = registerBlock("mossy_cherry_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_CHERRY_LOG = registerBlock("mossy_stripped_cherry_log",
            Blocks.createBambooBlock(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_PINK, BlockSoundGroup.CHERRY_WOOD),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_CHERRY_WOOD = registerBlock("mossy_stripped_cherry_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.CHERRY_WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_PLANKS = registerBlock("mossy_cherry_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_STAIRS = registerBlock("mossy_cherry_stairs",
            createStairsBlock(MOSSY_CHERRY_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_SLAB = registerBlock("mossy_cherry_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_CHERRY_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_FENCE = registerBlock("mossy_cherry_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CHERRY_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_FENCE_GATE = registerBlock("mossy_cherry_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(CHERRY_FENCE_GATE), WoodType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_PRESSURE_PLATE = registerBlock("mossy_cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(CHERRY_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_BUTTON = registerBlock("mossy_cherry_button",
            Blocks.createWoodenButtonBlock(BlockSetType.CHERRY), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_STEM = registerBlock("mossy_crimson_stem",
            Blocks.createNetherStemBlock(MapColor.DULL_PINK), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_HYPHAE = registerBlock("mossy_crimson_hyphae",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM)), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_CRIMSON_STEM = registerBlock("mossy_stripped_crimson_stem",
            Blocks.createNetherStemBlock(MapColor.DULL_PINK), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_CRIMSON_HYPHAE = registerBlock("mossy_stripped_crimson_hyphae",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM)), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_PLANKS = registerBlock("mossy_crimson_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_STAIRS = registerBlock("mossy_crimson_stairs",
            createStairsBlock(MOSSY_CRIMSON_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_SLAB = registerBlock("mossy_crimson_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_CRIMSON_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_FENCE = registerBlock("mossy_crimson_fence",
            new FenceBlock(AbstractBlock.Settings.copy(CRIMSON_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_FENCE_GATE = registerBlock("mossy_crimson_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(CRIMSON_FENCE_GATE), WoodType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_PRESSURE_PLATE = registerBlock("mossy_crimson_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(CRIMSON_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_BUTTON = registerBlock("mossy_crimson_button",
            Blocks.createWoodenButtonBlock(BlockSetType.CRIMSON), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_LOG = registerBlock("mossy_dark_oak_log",
            Blocks.createLogBlock(MapColor.BROWN, MapColor.BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_WOOD = registerBlock("mossy_dark_oak_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_DARK_OAK_LOG = registerBlock("mossy_stripped_dark_oak_log",
            Blocks.createLogBlock(MapColor.BROWN, MapColor.BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_DARK_OAK_WOOD = registerBlock("mossy_stripped_dark_oak_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_PLANKS = registerBlock("mossy_dark_oak_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_STAIRS = registerBlock("mossy_dark_oak_stairs",
            createStairsBlock(MOSSY_DARK_OAK_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_SLAB = registerBlock("mossy_dark_oak_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_DARK_OAK_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_FENCE = registerBlock("mossy_dark_oak_fence",
            new FenceBlock(AbstractBlock.Settings.copy(DARK_OAK_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_FENCE_GATE = registerBlock("mossy_dark_oak_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(DARK_OAK_FENCE_GATE), WoodType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_PRESSURE_PLATE = registerBlock("mossy_dark_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_BUTTON = registerBlock("mossy_dark_oak_button",
            Blocks.createWoodenButtonBlock(BlockSetType.DARK_OAK), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_LOG = registerBlock("mossy_jungle_log",
            Blocks.createLogBlock(MapColor.DIRT_BROWN, MapColor.SPRUCE_BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_WOOD = registerBlock("mossy_jungle_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_JUNGLE_LOG = registerBlock("mossy_stripped_jungle_log",
            Blocks.createLogBlock(MapColor.DIRT_BROWN, MapColor.DIRT_BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_JUNGLE_WOOD = registerBlock("mossy_stripped_jungle_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_PLANKS = registerBlock("mossy_jungle_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_STAIRS = registerBlock("mossy_jungle_stairs",
            createStairsBlock(MOSSY_JUNGLE_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_SLAB = registerBlock("mossy_jungle_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_JUNGLE_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_FENCE = registerBlock("mossy_jungle_fence",
            new FenceBlock(AbstractBlock.Settings.copy(JUNGLE_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_FENCE_GATE = registerBlock("mossy_jungle_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(JUNGLE_FENCE_GATE), WoodType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_PRESSURE_PLATE = registerBlock("mossy_jungle_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(JUNGLE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_BUTTON = registerBlock("mossy_jungle_button",
            Blocks.createWoodenButtonBlock(BlockSetType.JUNGLE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_LOG = registerBlock("mossy_mangrove_log",
            Blocks.createLogBlock(MapColor.RED, MapColor.SPRUCE_BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_WOOD = registerBlock("mossy_mangrove_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_MANGROVE_LOG = registerBlock("mossy_stripped_mangrove_log",
            Blocks.createLogBlock(MapColor.RED, MapColor.RED), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_MANGROVE_WOOD = registerBlock("mossy_stripped_mangrove_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_PLANKS = registerBlock("mossy_mangrove_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_STAIRS = registerBlock("mossy_mangrove_stairs",
            createStairsBlock(MOSSY_MANGROVE_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_SLAB = registerBlock("mossy_mangrove_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_MANGROVE_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_FENCE = registerBlock("mossy_mangrove_fence",
            new FenceBlock(AbstractBlock.Settings.copy(MANGROVE_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_FENCE_GATE = registerBlock("mossy_mangrove_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(MANGROVE_FENCE_GATE), WoodType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_PRESSURE_PLATE = registerBlock("mossy_mangrove_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(MANGROVE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_BUTTON = registerBlock("mossy_mangrove_button",
            Blocks.createWoodenButtonBlock(BlockSetType.MANGROVE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_LOG = registerBlock("mossy_oak_log",
            Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_WOOD = registerBlock("mossy_oak_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_OAK_LOG = registerBlock("mossy_stripped_oak_log",
            Blocks.createLogBlock(MapColor.OAK_TAN, MapColor.OAK_TAN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_OAK_WOOD = registerBlock("mossy_stripped_oak_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_PLANKS = registerBlock("mossy_oak_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_STAIRS = registerBlock("mossy_oak_stairs",
            createStairsBlock(MOSSY_OAK_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_SLAB = registerBlock("mossy_oak_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_OAK_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_FENCE = registerBlock("mossy_oak_fence",
            new FenceBlock(AbstractBlock.Settings.copy(OAK_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_FENCE_GATE = registerBlock("mossy_oak_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(OAK_FENCE_GATE), WoodType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_PRESSURE_PLATE = registerBlock("mossy_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(OAK_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_BUTTON = registerBlock("mossy_oak_button",
            Blocks.createWoodenButtonBlock(BlockSetType.OAK), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_LOG = registerBlock("mossy_spruce_log",
            Blocks.createLogBlock(MapColor.SPRUCE_BROWN, MapColor.BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_WOOD = registerBlock("mossy_spruce_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_SPRUCE_LOG = registerBlock("mossy_stripped_spruce_log",
            Blocks.createLogBlock(MapColor.SPRUCE_BROWN, MapColor.SPRUCE_BROWN), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_SPRUCE_WOOD = registerBlock("mossy_stripped_spruce_wood",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BASS)
                    .strength(2.0f).sounds(BlockSoundGroup.WOOD).burnable()), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_PLANKS = registerBlock("mossy_spruce_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN)
                    .instrument(Instrument.BASS).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_STAIRS = registerBlock("mossy_spruce_stairs",
            createStairsBlock(MOSSY_SPRUCE_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_SLAB = registerBlock("mossy_spruce_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_SPRUCE_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_FENCE = registerBlock("mossy_spruce_fence",
            new FenceBlock(AbstractBlock.Settings.copy(SPRUCE_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_FENCE_GATE = registerBlock("mossy_spruce_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(SPRUCE_FENCE_GATE), WoodType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_PRESSURE_PLATE = registerBlock("mossy_spruce_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(SPRUCE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_BUTTON = registerBlock("mossy_spruce_button",
            Blocks.createWoodenButtonBlock(BlockSetType.SPRUCE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_STEM = registerBlock("mossy_warped_stem",
            Blocks.createNetherStemBlock(MapColor.DARK_AQUA), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_HYPHAE = registerBlock("mossy_warped_hyphae",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK)
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_WARPED_STEM = registerBlock("mossy_stripped_warped_stem",
            Blocks.createNetherStemBlock(MapColor.DARK_AQUA), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STRIPPED_WARPED_HYPHAE = registerBlock("mossy_stripped_warped_hyphae",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_DULL_PINK)
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_PLANKS = registerBlock("mossy_warped_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_STAIRS = registerBlock("mossy_warped_stairs",
            createStairsBlock(MOSSY_WARPED_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_SLAB = registerBlock("mossy_warped_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_WARPED_PLANKS)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_FENCE = registerBlock("mossy_warped_fence",
            new FenceBlock(AbstractBlock.Settings.copy(WARPED_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_FENCE_GATE = registerBlock("mossy_warped_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(WARPED_FENCE_GATE), WoodType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_PRESSURE_PLATE = registerBlock("mossy_warped_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(WARPED_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision()
                    .strength(0.5f).burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_BUTTON = registerBlock("mossy_warped_button",
            Blocks.createWoodenButtonBlock(BlockSetType.WARPED), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE = registerBlock("mossy_stone",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool().strength(2.0f, 6.0f)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_STAIRS = registerBlock("mossy_stone_stairs",
            createStairsBlock(MOSSY_STONE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_SLAB = registerBlock("mossy_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(MOSSY_STONE)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_PRESSURE_PLATE = registerBlock("mossy_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY).solid().instrument(Instrument.BASEDRUM).requiresTool().noCollision()
                    .strength(0.5F).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.STONE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_BUTTON = registerBlock("mossy_stone_button",
            Blocks.createStoneButtonBlock(), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_GLASS = registerBlock("mossy_glass",
            new Block(AbstractBlock.Settings.copy(GLASS)), ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BLACK_STAINED_GLASS = registerBlock("mossy_black_stained_glass",
            new StainedGlassBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(BLACK_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BLUE_STAINED_GLASS = registerBlock("mossy_blue_stained_glass",
            new StainedGlassBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(BLUE_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BROWN_STAINED_GLASS = registerBlock("mossy_brown_stained_glass",
            new StainedGlassBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(BROWN_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CYAN_STAINED_GLASS = registerBlock("mossy_cyan_stained_glass",
            new StainedGlassBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(CYAN_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_GRAY_STAINED_GLASS = registerBlock("mossy_gray_stained_glass",
            new StainedGlassBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(GRAY_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_GREEN_STAINED_GLASS = registerBlock("mossy_green_stained_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(GREEN_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_LIGHT_BLUE_STAINED_GLASS = registerBlock("mossy_light_blue_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_LIGHT_GRAY_STAINED_GLASS = registerBlock("mossy_light_gray_stained_glass",
            new StainedGlassBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_LIME_STAINED_GLASS = registerBlock("mossy_lime_stained_glass",
            new StainedGlassBlock(DyeColor.LIME, AbstractBlock.Settings.copy(LIME_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MAGENTA_STAINED_GLASS = registerBlock("mossy_magenta_stained_glass",
            new StainedGlassBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(MAGENTA_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ORANGE_STAINED_GLASS = registerBlock("mossy_orange_stained_glass",
            new StainedGlassBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(ORANGE_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_PINK_STAINED_GLASS = registerBlock("mossy_pink_stained_glass",
            new StainedGlassBlock(DyeColor.PINK, AbstractBlock.Settings.copy(PINK_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_PURPLE_STAINED_GLASS = registerBlock("mossy_purple_stained_glass",
            new StainedGlassBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(PURPLE_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_RED_STAINED_GLASS = registerBlock("mossy_red_stained_glass",
            new StainedGlassBlock(DyeColor.RED, AbstractBlock.Settings.copy(RED_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_TINTED_GLASS = registerBlock("mossy_tinted_glass",
            new TintedGlassBlock(AbstractBlock.Settings.copy(TINTED_GLASS)), ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WHITE_STAINED_GLASS = registerBlock("mossy_white_stained_glass",
            new StainedGlassBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(WHITE_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_YELLOW_STAINED_GLASS = registerBlock("mossy_yellow_stained_glass",
            new StainedGlassBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(YELLOW_STAINED_GLASS)), ItemGroups.COLORED_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_GLASS_PANE = registerBlock("mossy_glass_pane",
            new PaneBlock(AbstractBlock.Settings.copy(GLASS_PANE)), ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BLACK_STAINED_GLASS_PANE = registerBlock("mossy_black_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(BLACK_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BLUE_STAINED_GLASS_PANE = registerBlock("mossy_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(BLUE_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BROWN_STAINED_GLASS_PANE = registerBlock("mossy_brown_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(BROWN_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CYAN_STAINED_GLASS_PANE = registerBlock("mossy_cyan_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(CYAN_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_GRAY_STAINED_GLASS_PANE = registerBlock("mossy_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(GRAY_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_GREEN_STAINED_GLASS_PANE = registerBlock("mossy_green_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(GREEN_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("mossy_light_blue_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(LIGHT_BLUE_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("mossy_light_gray_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(LIGHT_GRAY_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_LIME_STAINED_GLASS_PANE = registerBlock("mossy_lime_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.LIME, AbstractBlock.Settings.copy(LIME_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MAGENTA_STAINED_GLASS_PANE = registerBlock("mossy_magenta_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(MAGENTA_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ORANGE_STAINED_GLASS_PANE = registerBlock("mossy_orange_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(ORANGE_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_PINK_STAINED_GLASS_PANE = registerBlock("mossy_pink_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PINK, AbstractBlock.Settings.copy(PINK_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_PURPLE_STAINED_GLASS_PANE = registerBlock("mossy_purple_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(PURPLE_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_RED_STAINED_GLASS_PANE = registerBlock("mossy_red_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.RED, AbstractBlock.Settings.copy(RED_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WHITE_STAINED_GLASS_PANE = registerBlock("mossy_white_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(WHITE_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_YELLOW_STAINED_GLASS_PANE = registerBlock("mossy_yellow_stained_glass_pane",
            new StainedGlassPaneBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(YELLOW_STAINED_GLASS_PANE)),
            ItemGroups.COLORED_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_IRON_BARS = registerBlock("mossy_iron_bars",
            new PaneBlock(AbstractBlock.Settings.copy(IRON_BARS)), ItemGroups.BUILDING_BLOCKS,
            ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_IRON_BARS = registerBlock("mossy_iron_bars",
            new PaneBlock(IRON_BARS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);

    public static void registerBlocks() {
        log.debug("Register blocks");
    }

    @SafeVarargs
    private static Block registerBlock(String path, Block block, RegistryKey<ItemGroup>... itemGroups) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
        BlockItem blockItem = new BlockItem(registeredBlock, new Item.Settings());
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), blockItem);

        for (RegistryKey<ItemGroup> itemGroup : itemGroups) {
            List<BlockItem> currentBlockItems = new ArrayList<>(ModItemGroups.itemGroupToBlocksMap
                    .getOrDefault(itemGroup, List.of()));
            currentBlockItems.add(blockItem);
            ModItemGroups.itemGroupToBlocksMap.put(itemGroup, currentBlockItems);
        }

        return registeredBlock;
    }

    private static StairsBlock createStairsBlock(Block block) {
        return new StairsBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block));
    }
}
