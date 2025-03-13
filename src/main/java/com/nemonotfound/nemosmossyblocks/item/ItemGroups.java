package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.block.Blocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class ItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-mossy-blocks-group";

    public static void registerItemGroups() {
        log.info("Registering item groups");

        registerNemosMossyBlocksItemGroup("Nemo's Mossy Blocks", NEMOS_CARPENTRY_GROUP_ID, Blocks.PALE_MOSSY_COBBLESTONE);
    }

    public static void registerNemosMossyBlocksItemGroup(String displayName, String path, Block iconBlock) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconBlock))
                .displayName(Text.translatable(displayName))
                .entries((context, entries) -> {
                    entries.add(Items.MOSSY_OAK_LOG);
                    entries.add(Items.MOSSY_OAK_WOOD);
                    entries.add(Items.MOSSY_OAK_PLANKS);
                    entries.add(Items.MOSSY_OAK_STAIRS);
                    entries.add(Items.MOSSY_OAK_SLAB);
                    entries.add(Items.MOSSY_OAK_FENCE);
                    entries.add(Items.MOSSY_OAK_FENCE_GATE);
                    entries.add(Items.MOSSY_OAK_DOOR);
                    entries.add(Items.MOSSY_OAK_TRAPDOOR);
                    entries.add(Items.MOSSY_OAK_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_OAK_BUTTON);
                    entries.add(Items.PALE_MOSSY_OAK_LOG);
                    entries.add(Items.PALE_MOSSY_OAK_WOOD);
                    entries.add(Items.PALE_MOSSY_OAK_PLANKS);
                    entries.add(Items.PALE_MOSSY_OAK_STAIRS);
                    entries.add(Items.PALE_MOSSY_OAK_SLAB);
                    entries.add(Items.PALE_MOSSY_OAK_FENCE);
                    entries.add(Items.PALE_MOSSY_OAK_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_OAK_DOOR);
                    entries.add(Items.PALE_MOSSY_OAK_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_OAK_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_OAK_BUTTON);
                    entries.add(Items.MOSSY_SPRUCE_LOG);
                    entries.add(Items.MOSSY_SPRUCE_WOOD);
                    entries.add(Items.MOSSY_SPRUCE_PLANKS);
                    entries.add(Items.MOSSY_SPRUCE_STAIRS);
                    entries.add(Items.MOSSY_SPRUCE_SLAB);
                    entries.add(Items.MOSSY_SPRUCE_FENCE);
                    entries.add(Items.MOSSY_SPRUCE_FENCE_GATE);
                    entries.add(Items.MOSSY_SPRUCE_DOOR);
                    entries.add(Items.MOSSY_SPRUCE_TRAPDOOR);
                    entries.add(Items.MOSSY_SPRUCE_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_SPRUCE_BUTTON);
                    entries.add(Items.PALE_MOSSY_SPRUCE_LOG);
                    entries.add(Items.PALE_MOSSY_SPRUCE_WOOD);
                    entries.add(Items.PALE_MOSSY_SPRUCE_PLANKS);
                    entries.add(Items.PALE_MOSSY_SPRUCE_STAIRS);
                    entries.add(Items.PALE_MOSSY_SPRUCE_SLAB);
                    entries.add(Items.PALE_MOSSY_SPRUCE_FENCE);
                    entries.add(Items.PALE_MOSSY_SPRUCE_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_SPRUCE_DOOR);
                    entries.add(Items.PALE_MOSSY_SPRUCE_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_SPRUCE_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_SPRUCE_BUTTON);
                    entries.add(Items.MOSSY_BIRCH_LOG);
                    entries.add(Items.MOSSY_BIRCH_WOOD);
                    entries.add(Items.MOSSY_BIRCH_PLANKS);
                    entries.add(Items.MOSSY_BIRCH_STAIRS);
                    entries.add(Items.MOSSY_BIRCH_SLAB);
                    entries.add(Items.MOSSY_BIRCH_FENCE);
                    entries.add(Items.MOSSY_BIRCH_FENCE_GATE);
                    entries.add(Items.MOSSY_BIRCH_DOOR);
                    entries.add(Items.MOSSY_BIRCH_TRAPDOOR);
                    entries.add(Items.MOSSY_BIRCH_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_BIRCH_BUTTON);
                    entries.add(Items.PALE_MOSSY_BIRCH_LOG);
                    entries.add(Items.PALE_MOSSY_BIRCH_WOOD);
                    entries.add(Items.PALE_MOSSY_BIRCH_PLANKS);
                    entries.add(Items.PALE_MOSSY_BIRCH_STAIRS);
                    entries.add(Items.PALE_MOSSY_BIRCH_SLAB);
                    entries.add(Items.PALE_MOSSY_BIRCH_FENCE);
                    entries.add(Items.PALE_MOSSY_BIRCH_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_BIRCH_DOOR);
                    entries.add(Items.PALE_MOSSY_BIRCH_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_BIRCH_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_BIRCH_BUTTON);
                    entries.add(Items.MOSSY_JUNGLE_LOG);
                    entries.add(Items.MOSSY_JUNGLE_WOOD);
                    entries.add(Items.MOSSY_JUNGLE_PLANKS);
                    entries.add(Items.MOSSY_JUNGLE_STAIRS);
                    entries.add(Items.MOSSY_JUNGLE_SLAB);
                    entries.add(Items.MOSSY_JUNGLE_FENCE);
                    entries.add(Items.MOSSY_JUNGLE_FENCE_GATE);
                    entries.add(Items.MOSSY_JUNGLE_DOOR);
                    entries.add(Items.MOSSY_JUNGLE_TRAPDOOR);
                    entries.add(Items.MOSSY_JUNGLE_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_JUNGLE_BUTTON);
                    entries.add(Items.PALE_MOSSY_JUNGLE_LOG);
                    entries.add(Items.PALE_MOSSY_JUNGLE_WOOD);
                    entries.add(Items.PALE_MOSSY_JUNGLE_PLANKS);
                    entries.add(Items.PALE_MOSSY_JUNGLE_STAIRS);
                    entries.add(Items.PALE_MOSSY_JUNGLE_SLAB);
                    entries.add(Items.PALE_MOSSY_JUNGLE_FENCE);
                    entries.add(Items.PALE_MOSSY_JUNGLE_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_JUNGLE_DOOR);
                    entries.add(Items.PALE_MOSSY_JUNGLE_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_JUNGLE_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_JUNGLE_BUTTON);
                    entries.add(Items.MOSSY_ACACIA_LOG);
                    entries.add(Items.MOSSY_ACACIA_WOOD);
                    entries.add(Items.MOSSY_ACACIA_PLANKS);
                    entries.add(Items.MOSSY_ACACIA_STAIRS);
                    entries.add(Items.MOSSY_ACACIA_SLAB);
                    entries.add(Items.MOSSY_ACACIA_FENCE);
                    entries.add(Items.MOSSY_ACACIA_FENCE_GATE);
                    entries.add(Items.MOSSY_ACACIA_DOOR);
                    entries.add(Items.MOSSY_ACACIA_TRAPDOOR);
                    entries.add(Items.MOSSY_ACACIA_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_ACACIA_BUTTON);
                    entries.add(Items.PALE_MOSSY_ACACIA_LOG);
                    entries.add(Items.PALE_MOSSY_ACACIA_WOOD);
                    entries.add(Items.PALE_MOSSY_ACACIA_PLANKS);
                    entries.add(Items.PALE_MOSSY_ACACIA_STAIRS);
                    entries.add(Items.PALE_MOSSY_ACACIA_SLAB);
                    entries.add(Items.PALE_MOSSY_ACACIA_FENCE);
                    entries.add(Items.PALE_MOSSY_ACACIA_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_ACACIA_DOOR);
                    entries.add(Items.PALE_MOSSY_ACACIA_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_ACACIA_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_ACACIA_BUTTON);
                    entries.add(Items.MOSSY_DARK_OAK_LOG);
                    entries.add(Items.MOSSY_DARK_OAK_WOOD);
                    entries.add(Items.MOSSY_DARK_OAK_PLANKS);
                    entries.add(Items.MOSSY_DARK_OAK_STAIRS);
                    entries.add(Items.MOSSY_DARK_OAK_SLAB);
                    entries.add(Items.MOSSY_DARK_OAK_FENCE);
                    entries.add(Items.MOSSY_DARK_OAK_FENCE_GATE);
                    entries.add(Items.MOSSY_DARK_OAK_DOOR);
                    entries.add(Items.MOSSY_DARK_OAK_TRAPDOOR);
                    entries.add(Items.MOSSY_DARK_OAK_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_DARK_OAK_BUTTON);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_LOG);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_WOOD);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_PLANKS);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_STAIRS);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_SLAB);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_FENCE);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_DOOR);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_DARK_OAK_BUTTON);
                    entries.add(Items.MOSSY_MANGROVE_LOG);
                    entries.add(Items.MOSSY_MANGROVE_WOOD);
                    entries.add(Items.MOSSY_MANGROVE_PLANKS);
                    entries.add(Items.MOSSY_MANGROVE_STAIRS);
                    entries.add(Items.MOSSY_MANGROVE_SLAB);
                    entries.add(Items.MOSSY_MANGROVE_FENCE);
                    entries.add(Items.MOSSY_MANGROVE_FENCE_GATE);
                    entries.add(Items.MOSSY_MANGROVE_DOOR);
                    entries.add(Items.MOSSY_MANGROVE_TRAPDOOR);
                    entries.add(Items.MOSSY_MANGROVE_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_MANGROVE_BUTTON);
                    entries.add(Items.PALE_MOSSY_MANGROVE_LOG);
                    entries.add(Items.PALE_MOSSY_MANGROVE_WOOD);
                    entries.add(Items.PALE_MOSSY_MANGROVE_PLANKS);
                    entries.add(Items.PALE_MOSSY_MANGROVE_STAIRS);
                    entries.add(Items.PALE_MOSSY_MANGROVE_SLAB);
                    entries.add(Items.PALE_MOSSY_MANGROVE_FENCE);
                    entries.add(Items.PALE_MOSSY_MANGROVE_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_MANGROVE_DOOR);
                    entries.add(Items.PALE_MOSSY_MANGROVE_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_MANGROVE_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_MANGROVE_BUTTON);
                    entries.add(Items.MOSSY_CHERRY_LOG);
                    entries.add(Items.MOSSY_CHERRY_WOOD);
                    entries.add(Items.MOSSY_CHERRY_PLANKS);
                    entries.add(Items.MOSSY_CHERRY_STAIRS);
                    entries.add(Items.MOSSY_CHERRY_SLAB);
                    entries.add(Items.MOSSY_CHERRY_FENCE);
                    entries.add(Items.MOSSY_CHERRY_FENCE_GATE);
                    entries.add(Items.MOSSY_CHERRY_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_CHERRY_DOOR);
                    entries.add(Items.MOSSY_CHERRY_TRAPDOOR);
                    entries.add(Items.MOSSY_CHERRY_BUTTON);
                    entries.add(Items.PALE_MOSSY_CHERRY_LOG);
                    entries.add(Items.PALE_MOSSY_CHERRY_WOOD);
                    entries.add(Items.PALE_MOSSY_CHERRY_PLANKS);
                    entries.add(Items.PALE_MOSSY_CHERRY_STAIRS);
                    entries.add(Items.PALE_MOSSY_CHERRY_SLAB);
                    entries.add(Items.PALE_MOSSY_CHERRY_FENCE);
                    entries.add(Items.PALE_MOSSY_CHERRY_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_CHERRY_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_CHERRY_DOOR);
                    entries.add(Items.PALE_MOSSY_CHERRY_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_CHERRY_BUTTON);
                    entries.add(Items.MOSSY_PALE_OAK_LOG);
                    entries.add(Items.MOSSY_PALE_OAK_WOOD);
                    entries.add(Items.MOSSY_PALE_OAK_PLANKS);
                    entries.add(Items.MOSSY_PALE_OAK_STAIRS);
                    entries.add(Items.MOSSY_PALE_OAK_SLAB);
                    entries.add(Items.MOSSY_PALE_OAK_FENCE);
                    entries.add(Items.MOSSY_PALE_OAK_FENCE_GATE);
                    entries.add(Items.MOSSY_PALE_OAK_DOOR);
                    entries.add(Items.MOSSY_PALE_OAK_TRAPDOOR);
                    entries.add(Items.MOSSY_PALE_OAK_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_PALE_OAK_BUTTON);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_LOG);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_WOOD);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_PLANKS);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_STAIRS);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_SLAB);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_FENCE);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_DOOR);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_PALE_OAK_BUTTON);
                    entries.add(Items.MOSSY_BAMBOO_BLOCK);
                    entries.add(Items.MOSSY_BAMBOO_PLANKS);
                    entries.add(Items.MOSSY_BAMBOO_MOSAIC);
                    entries.add(Items.MOSSY_BAMBOO_STAIRS);
                    entries.add(Items.MOSSY_BAMBOO_MOSAIC_STAIRS);
                    entries.add(Items.MOSSY_BAMBOO_SLAB);
                    entries.add(Items.MOSSY_BAMBOO_MOSAIC_SLAB);
                    entries.add(Items.MOSSY_BAMBOO_FENCE);
                    entries.add(Items.MOSSY_BAMBOO_FENCE_GATE);
                    entries.add(Items.MOSSY_BAMBOO_DOOR);
                    entries.add(Items.MOSSY_BAMBOO_TRAPDOOR);
                    entries.add(Items.MOSSY_BAMBOO_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_BAMBOO_BUTTON);
                    entries.add(Items.PALE_MOSSY_BAMBOO_BLOCK);
                    entries.add(Items.PALE_MOSSY_BAMBOO_PLANKS);
                    entries.add(Items.PALE_MOSSY_BAMBOO_MOSAIC);
                    entries.add(Items.PALE_MOSSY_BAMBOO_STAIRS);
                    entries.add(Items.PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);
                    entries.add(Items.PALE_MOSSY_BAMBOO_SLAB);
                    entries.add(Items.PALE_MOSSY_BAMBOO_MOSAIC_SLAB);
                    entries.add(Items.PALE_MOSSY_BAMBOO_FENCE);
                    entries.add(Items.PALE_MOSSY_BAMBOO_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_BAMBOO_DOOR);
                    entries.add(Items.PALE_MOSSY_BAMBOO_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_BAMBOO_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_BAMBOO_BUTTON);
                    entries.add(Items.MOSSY_CRIMSON_STEM);
                    entries.add(Items.MOSSY_CRIMSON_HYPHAE);
                    entries.add(Items.MOSSY_CRIMSON_PLANKS);
                    entries.add(Items.MOSSY_CRIMSON_STAIRS);
                    entries.add(Items.MOSSY_CRIMSON_SLAB);
                    entries.add(Items.MOSSY_CRIMSON_FENCE);
                    entries.add(Items.MOSSY_CRIMSON_FENCE_GATE);
                    entries.add(Items.MOSSY_CRIMSON_DOOR);
                    entries.add(Items.MOSSY_CRIMSON_TRAPDOOR);
                    entries.add(Items.MOSSY_CRIMSON_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_CRIMSON_BUTTON);
                    entries.add(Items.PALE_MOSSY_CRIMSON_STEM);
                    entries.add(Items.PALE_MOSSY_CRIMSON_HYPHAE);
                    entries.add(Items.PALE_MOSSY_CRIMSON_PLANKS);
                    entries.add(Items.PALE_MOSSY_CRIMSON_STAIRS);
                    entries.add(Items.PALE_MOSSY_CRIMSON_SLAB);
                    entries.add(Items.PALE_MOSSY_CRIMSON_FENCE);
                    entries.add(Items.PALE_MOSSY_CRIMSON_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_CRIMSON_DOOR);
                    entries.add(Items.PALE_MOSSY_CRIMSON_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_CRIMSON_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_CRIMSON_BUTTON);
                    entries.add(Items.MOSSY_WARPED_STEM);
                    entries.add(Items.MOSSY_WARPED_HYPHAE);
                    entries.add(Items.MOSSY_WARPED_PLANKS);
                    entries.add(Items.MOSSY_WARPED_STAIRS);
                    entries.add(Items.MOSSY_WARPED_SLAB);
                    entries.add(Items.MOSSY_WARPED_FENCE);
                    entries.add(Items.MOSSY_WARPED_FENCE_GATE);
                    entries.add(Items.MOSSY_WARPED_DOOR);
                    entries.add(Items.MOSSY_WARPED_TRAPDOOR);
                    entries.add(Items.MOSSY_WARPED_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_WARPED_BUTTON);
                    entries.add(Items.PALE_MOSSY_WARPED_STEM);
                    entries.add(Items.PALE_MOSSY_WARPED_HYPHAE);
                    entries.add(Items.PALE_MOSSY_WARPED_PLANKS);
                    entries.add(Items.PALE_MOSSY_WARPED_STAIRS);
                    entries.add(Items.PALE_MOSSY_WARPED_SLAB);
                    entries.add(Items.PALE_MOSSY_WARPED_FENCE);
                    entries.add(Items.PALE_MOSSY_WARPED_FENCE_GATE);
                    entries.add(Items.PALE_MOSSY_WARPED_DOOR);
                    entries.add(Items.PALE_MOSSY_WARPED_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_WARPED_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_WARPED_BUTTON);
                    entries.add(Items.MOSSY_STONE);
                    entries.add(Items.MOSSY_STONE_STAIRS);
                    entries.add(Items.MOSSY_STONE_SLAB);
                    entries.add(Items.MOSSY_STONE_PRESSURE_PLATE);
                    entries.add(Items.MOSSY_STONE_BUTTON);
                    entries.add(Items.PALE_MOSSY_STONE);
                    entries.add(Items.PALE_MOSSY_STONE_STAIRS);
                    entries.add(Items.PALE_MOSSY_STONE_SLAB);
                    entries.add(Items.PALE_MOSSY_STONE_PRESSURE_PLATE);
                    entries.add(Items.PALE_MOSSY_STONE_BUTTON);
                    entries.add(Items.MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(Items.PALE_MOSSY_COBBLESTONE);
                    entries.add(Items.PALE_MOSSY_COBBLESTONE_STAIRS);
                    entries.add(Items.PALE_MOSSY_COBBLESTONE_SLAB);
                    entries.add(Items.PALE_MOSSY_COBBLESTONE_WALL);
                    entries.add(Items.PALE_MOSSY_STONE_BRICKS);
                    entries.add(Items.PALE_MOSSY_STONE_BRICK_STAIRS);
                    entries.add(Items.PALE_MOSSY_STONE_BRICK_SLAB);
                    entries.add(Items.PALE_MOSSY_STONE_BRICK_WALL);
                    entries.add(Items.PALE_MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(Items.MOSSY_DEEPSLATE);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE);
                    entries.add(Items.MOSSY_COBBLED_DEEPSLATE);
                    entries.add(Items.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                    entries.add(Items.MOSSY_COBBLED_DEEPSLATE_SLAB);
                    entries.add(Items.MOSSY_COBBLED_DEEPSLATE_WALL);
                    entries.add(Items.PALE_MOSSY_COBBLED_DEEPSLATE);
                    entries.add(Items.PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS);
                    entries.add(Items.PALE_MOSSY_COBBLED_DEEPSLATE_SLAB);
                    entries.add(Items.PALE_MOSSY_COBBLED_DEEPSLATE_WALL);
                    entries.add(Items.MOSSY_DEEPSLATE_BRICKS);
                    entries.add(Items.MOSSY_DEEPSLATE_BRICK_STAIRS);
                    entries.add(Items.MOSSY_DEEPSLATE_BRICK_SLAB);
                    entries.add(Items.MOSSY_DEEPSLATE_BRICK_WALL);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_BRICKS);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_BRICK_STAIRS);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_BRICK_SLAB);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_BRICK_WALL);
                    entries.add(Items.MOSSY_DEEPSLATE_TILES);
                    entries.add(Items.MOSSY_DEEPSLATE_TILE_STAIRS);
                    entries.add(Items.MOSSY_DEEPSLATE_TILE_SLAB);
                    entries.add(Items.MOSSY_DEEPSLATE_TILE_WALL);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_TILES);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_TILE_STAIRS);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_TILE_SLAB);
                    entries.add(Items.PALE_MOSSY_DEEPSLATE_TILE_WALL);
                    entries.add(Items.MOSSY_TUFF);
                    entries.add(Items.MOSSY_TUFF_STAIRS);
                    entries.add(Items.MOSSY_TUFF_SLAB);
                    entries.add(Items.MOSSY_TUFF_WALL);
                    entries.add(Items.MOSSY_TUFF_BRICKS);
                    entries.add(Items.MOSSY_TUFF_BRICK_STAIRS);
                    entries.add(Items.MOSSY_TUFF_BRICK_SLAB);
                    entries.add(Items.MOSSY_TUFF_BRICK_WALL);
                    entries.add(Items.PALE_MOSSY_TUFF);
                    entries.add(Items.PALE_MOSSY_TUFF_STAIRS);
                    entries.add(Items.PALE_MOSSY_TUFF_SLAB);
                    entries.add(Items.PALE_MOSSY_TUFF_WALL);
                    entries.add(Items.PALE_MOSSY_TUFF_BRICKS);
                    entries.add(Items.PALE_MOSSY_TUFF_BRICK_STAIRS);
                    entries.add(Items.PALE_MOSSY_TUFF_BRICK_SLAB);
                    entries.add(Items.PALE_MOSSY_TUFF_BRICK_WALL);
                    entries.add(Items.MOSSY_BRICKS);
                    entries.add(Items.MOSSY_BRICK_STAIRS);
                    entries.add(Items.MOSSY_BRICK_SLAB);
                    entries.add(Items.MOSSY_BRICK_WALL);
                    entries.add(Items.PALE_MOSSY_BRICKS);
                    entries.add(Items.PALE_MOSSY_BRICK_STAIRS);
                    entries.add(Items.PALE_MOSSY_BRICK_SLAB);
                    entries.add(Items.PALE_MOSSY_BRICK_WALL);
                    entries.add(Items.MOSSY_IRON_BARS);
                    entries.add(Items.MOSSY_IRON_DOOR);
                    entries.add(Items.MOSSY_IRON_TRAPDOOR);
                    entries.add(Items.PALE_MOSSY_IRON_BARS);
                    entries.add(Items.PALE_MOSSY_IRON_DOOR);
                    entries.add(Items.PALE_MOSSY_IRON_TRAPDOOR);
                    entries.add(Items.MOSSY_GLASS);
                    entries.add(Items.PALE_MOSSY_GLASS);
                    entries.add(Items.MOSSY_TINTED_GLASS);
                    entries.add(Items.PALE_MOSSY_TINTED_GLASS);
                    entries.add(Items.MOSSY_WHITE_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_WHITE_STAINED_GLASS);
                    entries.add(Items.MOSSY_LIGHT_GRAY_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS);
                    entries.add(Items.MOSSY_GRAY_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_GRAY_STAINED_GLASS);
                    entries.add(Items.MOSSY_BLACK_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_BLACK_STAINED_GLASS);
                    entries.add(Items.MOSSY_BROWN_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_BROWN_STAINED_GLASS);
                    entries.add(Items.MOSSY_RED_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_RED_STAINED_GLASS);
                    entries.add(Items.MOSSY_ORANGE_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_ORANGE_STAINED_GLASS);
                    entries.add(Items.MOSSY_YELLOW_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_YELLOW_STAINED_GLASS);
                    entries.add(Items.MOSSY_LIME_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_LIME_STAINED_GLASS);
                    entries.add(Items.MOSSY_GREEN_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_GREEN_STAINED_GLASS);
                    entries.add(Items.MOSSY_CYAN_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_CYAN_STAINED_GLASS);
                    entries.add(Items.MOSSY_LIGHT_BLUE_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS);
                    entries.add(Items.MOSSY_BLUE_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_BLUE_STAINED_GLASS);
                    entries.add(Items.MOSSY_PURPLE_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_PURPLE_STAINED_GLASS);
                    entries.add(Items.MOSSY_MAGENTA_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_MAGENTA_STAINED_GLASS);
                    entries.add(Items.MOSSY_PINK_STAINED_GLASS);
                    entries.add(Items.PALE_MOSSY_PINK_STAINED_GLASS);
                    entries.add(Items.MOSSY_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_GLASS_PANE);
                    entries.add(Items.MOSSY_WHITE_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_WHITE_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_GRAY_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_GRAY_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_BLACK_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_BLACK_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_BROWN_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_BROWN_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_RED_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_RED_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_ORANGE_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_ORANGE_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_YELLOW_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_YELLOW_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_LIME_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_LIME_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_GREEN_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_GREEN_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_CYAN_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_CYAN_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_BLUE_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_BLUE_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_PURPLE_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_PURPLE_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_MAGENTA_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE);
                    entries.add(Items.MOSSY_PINK_STAINED_GLASS_PANE);
                    entries.add(Items.PALE_MOSSY_PINK_STAINED_GLASS_PANE);
                    entries.add(Items.CRIMSON_MOSS_BLOCK);
                    entries.add(Items.CRIMSON_MOSS_CARPET);
                    entries.add(Items.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(Items.MOSS_BALL);
                    entries.add(Items.PALE_MOSS_BALL);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, path), ITEM_GROUP);
    }
}
