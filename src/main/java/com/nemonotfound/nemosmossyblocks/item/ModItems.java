package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class ModItems {

    public static final Item MOSS_BALL = registerItem("moss_ball",
            new MossBallItem(new Item.Settings().maxCount(16)));
    public static final Item MOSSY_OAK_LOG = registerBlockItem("mossy_oak_log", ModBlocks.MOSSY_OAK_LOG);
    public static final Item MOSSY_OAK_WOOD = registerBlockItem("mossy_oak_wood", ModBlocks.MOSSY_OAK_WOOD);
    public static final Item MOSSY_OAK_PLANKS = registerBlockItem("mossy_oak_planks", ModBlocks.MOSSY_OAK_PLANKS);
    public static final Item MOSSY_OAK_STAIRS = registerBlockItem("mossy_oak_stairs", ModBlocks.MOSSY_OAK_STAIRS);
    public static final Item MOSSY_OAK_SLAB = registerBlockItem("mossy_oak_slab", ModBlocks.MOSSY_OAK_SLAB);
    public static final Item MOSSY_OAK_FENCE = registerBlockItem("mossy_oak_fence", ModBlocks.MOSSY_OAK_FENCE);
    public static final Item MOSSY_OAK_FENCE_GATE = registerBlockItem("mossy_oak_fence_gate", ModBlocks.MOSSY_OAK_FENCE_GATE);
    public static final Item MOSSY_OAK_DOOR = registerBlockItem("mossy_oak_door", ModBlocks.MOSSY_OAK_DOOR);
    public static final Item MOSSY_OAK_PRESSURE_PLATE = registerBlockItem("mossy_oak_pressure_plate", ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
    public static final Item MOSSY_OAK_BUTTON = registerBlockItem("mossy_oak_button", ModBlocks.MOSSY_OAK_BUTTON);
    public static final Item MOSSY_SPRUCE_LOG = registerBlockItem("mossy_spruce_log", ModBlocks.MOSSY_SPRUCE_LOG);
    public static final Item MOSSY_SPRUCE_WOOD = registerBlockItem("mossy_spruce_wood", ModBlocks.MOSSY_SPRUCE_WOOD);
    public static final Item MOSSY_SPRUCE_PLANKS = registerBlockItem("mossy_spruce_planks", ModBlocks.MOSSY_SPRUCE_PLANKS);
    public static final Item MOSSY_SPRUCE_STAIRS = registerBlockItem("mossy_spruce_stairs", ModBlocks.MOSSY_SPRUCE_STAIRS);
    public static final Item MOSSY_SPRUCE_SLAB = registerBlockItem("mossy_spruce_slab", ModBlocks.MOSSY_SPRUCE_SLAB);
    public static final Item MOSSY_SPRUCE_FENCE = registerBlockItem("mossy_spruce_fence", ModBlocks.MOSSY_SPRUCE_FENCE);
    public static final Item MOSSY_SPRUCE_FENCE_GATE = registerBlockItem("mossy_spruce_fence_gate", ModBlocks.MOSSY_SPRUCE_FENCE_GATE);
    public static final Item MOSSY_SPRUCE_DOOR = registerBlockItem("mossy_spruce_door", ModBlocks.MOSSY_SPRUCE_DOOR);
    public static final Item MOSSY_SPRUCE_PRESSURE_PLATE = registerBlockItem("mossy_spruce_pressure_plate", ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE);
    public static final Item MOSSY_SPRUCE_BUTTON = registerBlockItem("mossy_spruce_button", ModBlocks.MOSSY_SPRUCE_BUTTON);
    public static final Item MOSSY_BIRCH_LOG = registerBlockItem("mossy_birch_log", ModBlocks.MOSSY_BIRCH_LOG);
    public static final Item MOSSY_BIRCH_WOOD = registerBlockItem("mossy_birch_wood", ModBlocks.MOSSY_BIRCH_WOOD);
    public static final Item MOSSY_BIRCH_PLANKS = registerBlockItem("mossy_birch_planks", ModBlocks.MOSSY_BIRCH_PLANKS);
    public static final Item MOSSY_BIRCH_STAIRS = registerBlockItem("mossy_birch_stairs", ModBlocks.MOSSY_BIRCH_STAIRS);
    public static final Item MOSSY_BIRCH_SLAB = registerBlockItem("mossy_birch_slab", ModBlocks.MOSSY_BIRCH_SLAB);
    public static final Item MOSSY_BIRCH_FENCE = registerBlockItem("mossy_birch_fence", ModBlocks.MOSSY_BIRCH_FENCE);
    public static final Item MOSSY_BIRCH_FENCE_GATE = registerBlockItem("mossy_birch_fence_gate", ModBlocks.MOSSY_BIRCH_FENCE_GATE);
    public static final Item MOSSY_BIRCH_DOOR = registerBlockItem("mossy_birch_door", ModBlocks.MOSSY_BIRCH_DOOR);
    public static final Item MOSSY_BIRCH_PRESSURE_PLATE = registerBlockItem("mossy_birch_pressure_plate", ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE);
    public static final Item MOSSY_BIRCH_BUTTON = registerBlockItem("mossy_birch_button", ModBlocks.MOSSY_BIRCH_BUTTON);
    public static final Item MOSSY_JUNGLE_LOG = registerBlockItem("mossy_jungle_log", ModBlocks.MOSSY_JUNGLE_LOG);
    public static final Item MOSSY_JUNGLE_WOOD = registerBlockItem("mossy_jungle_wood", ModBlocks.MOSSY_JUNGLE_WOOD);
    public static final Item MOSSY_JUNGLE_PLANKS = registerBlockItem("mossy_jungle_planks", ModBlocks.MOSSY_JUNGLE_PLANKS);
    public static final Item MOSSY_JUNGLE_STAIRS = registerBlockItem("mossy_jungle_stairs", ModBlocks.MOSSY_JUNGLE_STAIRS);
    public static final Item MOSSY_JUNGLE_SLAB = registerBlockItem("mossy_jungle_slab", ModBlocks.MOSSY_JUNGLE_SLAB);
    public static final Item MOSSY_JUNGLE_FENCE = registerBlockItem("mossy_jungle_fence", ModBlocks.MOSSY_JUNGLE_FENCE);
    public static final Item MOSSY_JUNGLE_FENCE_GATE = registerBlockItem("mossy_jungle_fence_gate", ModBlocks.MOSSY_JUNGLE_FENCE_GATE);
    public static final Item MOSSY_JUNGLE_DOOR = registerBlockItem("mossy_jungle_door", ModBlocks.MOSSY_JUNGLE_DOOR);
    public static final Item MOSSY_JUNGLE_PRESSURE_PLATE = registerBlockItem("mossy_jungle_pressure_plate", ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE);
    public static final Item MOSSY_JUNGLE_BUTTON = registerBlockItem("mossy_jungle_button", ModBlocks.MOSSY_JUNGLE_BUTTON);
    public static final Item MOSSY_ACACIA_LOG = registerBlockItem("mossy_acacia_log", ModBlocks.MOSSY_ACACIA_LOG);
    public static final Item MOSSY_ACACIA_WOOD = registerBlockItem("mossy_acacia_wood", ModBlocks.MOSSY_ACACIA_WOOD);
    public static final Item MOSSY_ACACIA_PLANKS = registerBlockItem("mossy_acacia_planks", ModBlocks.MOSSY_ACACIA_PLANKS);
    public static final Item MOSSY_ACACIA_STAIRS = registerBlockItem("mossy_acacia_stairs", ModBlocks.MOSSY_ACACIA_STAIRS);
    public static final Item MOSSY_ACACIA_SLAB = registerBlockItem("mossy_acacia_slab", ModBlocks.MOSSY_ACACIA_SLAB);
    public static final Item MOSSY_ACACIA_FENCE = registerBlockItem("mossy_acacia_fence", ModBlocks.MOSSY_ACACIA_FENCE);
    public static final Item MOSSY_ACACIA_FENCE_GATE = registerBlockItem("mossy_acacia_fence_gate", ModBlocks.MOSSY_ACACIA_FENCE_GATE);
    public static final Item MOSSY_ACACIA_DOOR = registerBlockItem("mossy_acacia_door", ModBlocks.MOSSY_ACACIA_DOOR);
    public static final Item MOSSY_ACACIA_PRESSURE_PLATE = registerBlockItem("mossy_acacia_pressure_plate", ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE);
    public static final Item MOSSY_ACACIA_BUTTON = registerBlockItem("mossy_acacia_button", ModBlocks.MOSSY_ACACIA_BUTTON);
    public static final Item MOSSY_DARK_OAK_LOG = registerBlockItem("mossy_dark_oak_log", ModBlocks.MOSSY_DARK_OAK_LOG);
    public static final Item MOSSY_DARK_OAK_WOOD = registerBlockItem("mossy_dark_oak_wood", ModBlocks.MOSSY_DARK_OAK_WOOD);
    public static final Item MOSSY_DARK_OAK_PLANKS = registerBlockItem("mossy_dark_oak_planks", ModBlocks.MOSSY_DARK_OAK_PLANKS);
    public static final Item MOSSY_DARK_OAK_STAIRS = registerBlockItem("mossy_dark_oak_stairs", ModBlocks.MOSSY_DARK_OAK_STAIRS);
    public static final Item MOSSY_DARK_OAK_SLAB = registerBlockItem("mossy_dark_oak_slab", ModBlocks.MOSSY_DARK_OAK_SLAB);
    public static final Item MOSSY_DARK_OAK_FENCE = registerBlockItem("mossy_dark_oak_fence", ModBlocks.MOSSY_DARK_OAK_FENCE);
    public static final Item MOSSY_DARK_OAK_FENCE_GATE = registerBlockItem("mossy_dark_oak_fence_gate", ModBlocks.MOSSY_DARK_OAK_FENCE_GATE);
    public static final Item MOSSY_DARK_OAK_DOOR = registerBlockItem("mossy_dark_oak_door", ModBlocks.MOSSY_DARK_OAK_DOOR);
    public static final Item MOSSY_DARK_OAK_PRESSURE_PLATE = registerBlockItem("mossy_dark_oak_pressure_plate", ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
    public static final Item MOSSY_DARK_OAK_BUTTON = registerBlockItem("mossy_dark_oak_button", ModBlocks.MOSSY_DARK_OAK_BUTTON);
    public static final Item MOSSY_MANGROVE_LOG = registerBlockItem("mossy_mangrove_log", ModBlocks.MOSSY_MANGROVE_LOG);
    public static final Item MOSSY_MANGROVE_WOOD = registerBlockItem("mossy_mangrove_wood", ModBlocks.MOSSY_MANGROVE_WOOD);
    public static final Item MOSSY_MANGROVE_PLANKS = registerBlockItem("mossy_mangrove_planks", ModBlocks.MOSSY_MANGROVE_PLANKS);
    public static final Item MOSSY_MANGROVE_STAIRS = registerBlockItem("mossy_mangrove_stairs", ModBlocks.MOSSY_MANGROVE_STAIRS);
    public static final Item MOSSY_MANGROVE_SLAB = registerBlockItem("mossy_mangrove_slab", ModBlocks.MOSSY_MANGROVE_SLAB);
    public static final Item MOSSY_MANGROVE_FENCE = registerBlockItem("mossy_mangrove_fence", ModBlocks.MOSSY_MANGROVE_FENCE);
    public static final Item MOSSY_MANGROVE_FENCE_GATE = registerBlockItem("mossy_mangrove_fence_gate", ModBlocks.MOSSY_MANGROVE_FENCE_GATE);
    public static final Item MOSSY_MANGROVE_DOOR = registerBlockItem("mossy_mangrove_door", ModBlocks.MOSSY_MANGROVE_DOOR);
    public static final Item MOSSY_MANGROVE_PRESSURE_PLATE = registerBlockItem("mossy_mangrove_pressure_plate", ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE);
    public static final Item MOSSY_MANGROVE_BUTTON = registerBlockItem("mossy_mangrove_button", ModBlocks.MOSSY_MANGROVE_BUTTON);
    public static final Item MOSSY_CHERRY_LOG = registerBlockItem("mossy_cherry_log", ModBlocks.MOSSY_CHERRY_LOG);
    public static final Item MOSSY_CHERRY_WOOD = registerBlockItem("mossy_cherry_wood", ModBlocks.MOSSY_CHERRY_WOOD);
    public static final Item MOSSY_CHERRY_PLANKS = registerBlockItem("mossy_cherry_planks", ModBlocks.MOSSY_CHERRY_PLANKS);
    public static final Item MOSSY_CHERRY_STAIRS = registerBlockItem("mossy_cherry_stairs", ModBlocks.MOSSY_CHERRY_STAIRS);
    public static final Item MOSSY_CHERRY_SLAB = registerBlockItem("mossy_cherry_slab", ModBlocks.MOSSY_CHERRY_SLAB);
    public static final Item MOSSY_CHERRY_FENCE = registerBlockItem("mossy_cherry_fence", ModBlocks.MOSSY_CHERRY_FENCE);
    public static final Item MOSSY_CHERRY_FENCE_GATE = registerBlockItem("mossy_cherry_fence_gate", ModBlocks.MOSSY_CHERRY_FENCE_GATE);
    public static final Item MOSSY_CHERRY_DOOR = registerBlockItem("mossy_cherry_door", ModBlocks.MOSSY_CHERRY_DOOR);
    public static final Item MOSSY_CHERRY_PRESSURE_PLATE = registerBlockItem("mossy_cherry_pressure_plate", ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE);
    public static final Item MOSSY_CHERRY_BUTTON = registerBlockItem("mossy_cherry_button", ModBlocks.MOSSY_CHERRY_BUTTON);
    public static final Item MOSSY_BAMBOO_BLOCK = registerBlockItem("mossy_bamboo_block", ModBlocks.MOSSY_BAMBOO_BLOCK);
    public static final Item MOSSY_BAMBOO_PLANKS = registerBlockItem("mossy_bamboo_planks", ModBlocks.MOSSY_BAMBOO_PLANKS);
    public static final Item MOSSY_BAMBOO_MOSAIC = registerBlockItem("mossy_bamboo_mosaic", ModBlocks.MOSSY_BAMBOO_MOSAIC);
    public static final Item MOSSY_BAMBOO_STAIRS = registerBlockItem("mossy_bamboo_stairs", ModBlocks.MOSSY_BAMBOO_STAIRS);
    public static final Item MOSSY_BAMBOO_MOSAIC_STAIRS = registerBlockItem("mossy_bamboo_mosaic_stairs", ModBlocks.MOSSY_BAMBOO_MOSAIC_STAIRS);
    public static final Item MOSSY_BAMBOO_SLAB = registerBlockItem("mossy_bamboo_slab", ModBlocks.MOSSY_BAMBOO_SLAB);
    public static final Item MOSSY_BAMBOO_MOSAIC_SLAB = registerBlockItem("mossy_bamboo_mosaic_slab", ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);
    public static final Item MOSSY_BAMBOO_FENCE = registerBlockItem("mossy_bamboo_fence", ModBlocks.MOSSY_BAMBOO_FENCE);
    public static final Item MOSSY_BAMBOO_FENCE_GATE = registerBlockItem("mossy_bamboo_fence_gate", ModBlocks.MOSSY_BAMBOO_FENCE_GATE);
    public static final Item MOSSY_BAMBOO_DOOR = registerBlockItem("mossy_bamboo_door", ModBlocks.MOSSY_BAMBOO_DOOR);
    public static final Item MOSSY_BAMBOO_PRESSURE_PLATE = registerBlockItem("mossy_bamboo_pressure_plate", ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE);
    public static final Item MOSSY_BAMBOO_BUTTON = registerBlockItem("mossy_bamboo_button", ModBlocks.MOSSY_BAMBOO_BUTTON);
    public static final Item MOSSY_CRIMSON_STEM = registerBlockItem("mossy_crimson_stem", ModBlocks.MOSSY_CRIMSON_STEM);
    public static final Item MOSSY_CRIMSON_HYPHAE = registerBlockItem("mossy_crimson_hyphae", ModBlocks.MOSSY_CRIMSON_HYPHAE);
    public static final Item MOSSY_CRIMSON_PLANKS = registerBlockItem("mossy_crimson_planks", ModBlocks.MOSSY_CRIMSON_PLANKS);
    public static final Item MOSSY_CRIMSON_STAIRS = registerBlockItem("mossy_crimson_stairs", ModBlocks.MOSSY_CRIMSON_STAIRS);
    public static final Item MOSSY_CRIMSON_SLAB = registerBlockItem("mossy_crimson_slab", ModBlocks.MOSSY_CRIMSON_SLAB);
    public static final Item MOSSY_CRIMSON_FENCE = registerBlockItem("mossy_crimson_fence", ModBlocks.MOSSY_CRIMSON_FENCE);
    public static final Item MOSSY_CRIMSON_FENCE_GATE = registerBlockItem("mossy_crimson_fence_gate", ModBlocks.MOSSY_CRIMSON_FENCE_GATE);
    public static final Item MOSSY_CRIMSON_DOOR = registerBlockItem("mossy_crimson_door", ModBlocks.MOSSY_CRIMSON_DOOR);
    public static final Item MOSSY_CRIMSON_PRESSURE_PLATE = registerBlockItem("mossy_crimson_pressure_plate", ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE);
    public static final Item MOSSY_CRIMSON_BUTTON = registerBlockItem("mossy_crimson_button", ModBlocks.MOSSY_CRIMSON_BUTTON);
    public static final Item MOSSY_WARPED_STEM = registerBlockItem("mossy_warped_stem", ModBlocks.MOSSY_WARPED_STEM);
    public static final Item MOSSY_WARPED_HYPHAE = registerBlockItem("mossy_warped_hyphae", ModBlocks.MOSSY_WARPED_HYPHAE);
    public static final Item MOSSY_WARPED_PLANKS = registerBlockItem("mossy_warped_planks", ModBlocks.MOSSY_WARPED_PLANKS);
    public static final Item MOSSY_WARPED_STAIRS = registerBlockItem("mossy_warped_stairs", ModBlocks.MOSSY_WARPED_STAIRS);
    public static final Item MOSSY_WARPED_SLAB = registerBlockItem("mossy_warped_slab", ModBlocks.MOSSY_WARPED_SLAB);
    public static final Item MOSSY_WARPED_FENCE = registerBlockItem("mossy_warped_fence", ModBlocks.MOSSY_WARPED_FENCE);
    public static final Item MOSSY_WARPED_FENCE_GATE = registerBlockItem("mossy_warped_fence_gate", ModBlocks.MOSSY_WARPED_FENCE_GATE);
    public static final Item MOSSY_WARPED_DOOR = registerBlockItem("mossy_warped_door", ModBlocks.MOSSY_WARPED_DOOR);
    public static final Item MOSSY_WARPED_PRESSURE_PLATE = registerBlockItem("mossy_warped_pressure_plate", ModBlocks.MOSSY_WARPED_PRESSURE_PLATE);
    public static final Item MOSSY_WARPED_BUTTON = registerBlockItem("mossy_warped_button", ModBlocks.MOSSY_WARPED_BUTTON);
    public static final Item MOSSY_STONE = registerBlockItem("mossy_stone", ModBlocks.MOSSY_STONE);
    public static final Item MOSSY_STONE_STAIRS = registerBlockItem("mossy_stone_stairs", ModBlocks.MOSSY_STONE_STAIRS);
    public static final Item MOSSY_STONE_SLAB = registerBlockItem("mossy_stone_slab", ModBlocks.MOSSY_STONE_SLAB);
    public static final Item MOSSY_STONE_PRESSURE_PLATE = registerBlockItem("mossy_stone_pressure_plate", ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
    public static final Item MOSSY_STONE_BUTTON = registerBlockItem("mossy_stone_button", ModBlocks.MOSSY_STONE_BUTTON);
    public static final Item MOSSY_CHISELED_STONE_BRICKS = registerBlockItem("mossy_chiseled_stone_bricks", ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
    public static final Item INFESTED_MOSSY_CHISELED_STONE_BRICKS = registerBlockItem("infested_mossy_chiseled_stone_bricks", ModBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
    public static final Item MOSSY_BRICKS = registerBlockItem("mossy_bricks", ModBlocks.MOSSY_BRICKS);
    public static final Item MOSSY_BRICK_SLAB = registerBlockItem("mossy_brick_slab", ModBlocks.MOSSY_BRICK_SLAB);
    public static final Item MOSSY_BRICK_STAIRS = registerBlockItem("mossy_brick_stairs", ModBlocks.MOSSY_BRICK_STAIRS);
    public static final Item MOSSY_BRICK_WALL = registerBlockItem("mossy_brick_wall", ModBlocks.MOSSY_BRICK_WALL);
    public static final Item MOSSY_IRON_BARS =registerBlockItem("mossy_iron_bars", ModBlocks.MOSSY_IRON_BARS);
    public static final Item MOSSY_IRON_DOOR = registerBlockItem("mossy_iron_door", ModBlocks.MOSSY_IRON_DOOR);

    public static void registerItems() {
        log.debug("Registering items");
    }

    private static Item registerItem(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), item);
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }
}
