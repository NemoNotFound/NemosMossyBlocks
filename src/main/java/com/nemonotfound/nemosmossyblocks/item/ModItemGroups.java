package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-mossy-blocks-group";

    public static void registerItemGroups() {
        log.info("Registering item groups");

        registerNemosMossyBlocksItemGroup("Nemo's Mossy Blocks", NEMOS_CARPENTRY_GROUP_ID, ModBlocks.MOSSY_STONE);
        modifyBuildingBlocksItemGroup();
        modifyColoredBlocksItemGroup();
        modifyFunctionalBlocksItemGroup();
        modifyCombatItemGroup();
        modifyIngredientsItemGroup();
    }

    public static void registerNemosMossyBlocksItemGroup(String displayName, String path, Block iconBlock) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconBlock))
                .displayName(Text.translatable(displayName))
                .entries((context, entries) -> {
                    entries.add(ModItems.MOSS_BALL);
                    entries.add(ModItems.MOSSY_OAK_LOG);
                    entries.add(ModItems.MOSSY_OAK_WOOD);
                    entries.add(ModItems.MOSSY_OAK_PLANKS);
                    entries.add(ModItems.MOSSY_OAK_STAIRS);
                    entries.add(ModItems.MOSSY_OAK_SLAB);
                    entries.add(ModItems.MOSSY_OAK_FENCE);
                    entries.add(ModItems.MOSSY_OAK_FENCE_GATE);
                    entries.add(ModItems.MOSSY_OAK_DOOR);
                    entries.add(ModItems.MOSSY_OAK_TRAPDOOR);
                    entries.add(ModItems.MOSSY_OAK_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_OAK_BUTTON);
                    entries.add(ModItems.MOSSY_SPRUCE_LOG);
                    entries.add(ModItems.MOSSY_SPRUCE_WOOD);
                    entries.add(ModItems.MOSSY_SPRUCE_PLANKS);
                    entries.add(ModItems.MOSSY_SPRUCE_STAIRS);
                    entries.add(ModItems.MOSSY_SPRUCE_SLAB);
                    entries.add(ModItems.MOSSY_SPRUCE_FENCE);
                    entries.add(ModItems.MOSSY_SPRUCE_FENCE_GATE);
                    entries.add(ModItems.MOSSY_SPRUCE_DOOR);
                    entries.add(ModItems.MOSSY_SPRUCE_TRAPDOOR);
                    entries.add(ModItems.MOSSY_SPRUCE_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_SPRUCE_BUTTON);
                    entries.add(ModItems.MOSSY_BIRCH_LOG);
                    entries.add(ModItems.MOSSY_BIRCH_WOOD);
                    entries.add(ModItems.MOSSY_BIRCH_PLANKS);
                    entries.add(ModItems.MOSSY_BIRCH_STAIRS);
                    entries.add(ModItems.MOSSY_BIRCH_SLAB);
                    entries.add(ModItems.MOSSY_BIRCH_FENCE);
                    entries.add(ModItems.MOSSY_BIRCH_FENCE_GATE);
                    entries.add(ModItems.MOSSY_BIRCH_DOOR);
                    entries.add(ModItems.MOSSY_BIRCH_TRAPDOOR);
                    entries.add(ModItems.MOSSY_BIRCH_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_BIRCH_BUTTON);
                    entries.add(ModItems.MOSSY_JUNGLE_LOG);
                    entries.add(ModItems.MOSSY_JUNGLE_WOOD);
                    entries.add(ModItems.MOSSY_JUNGLE_PLANKS);
                    entries.add(ModItems.MOSSY_JUNGLE_STAIRS);
                    entries.add(ModItems.MOSSY_JUNGLE_SLAB);
                    entries.add(ModItems.MOSSY_JUNGLE_FENCE);
                    entries.add(ModItems.MOSSY_JUNGLE_FENCE_GATE);
                    entries.add(ModItems.MOSSY_JUNGLE_DOOR);
                    entries.add(ModItems.MOSSY_JUNGLE_TRAPDOOR);
                    entries.add(ModItems.MOSSY_JUNGLE_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_JUNGLE_BUTTON);
                    entries.add(ModItems.MOSSY_ACACIA_LOG);
                    entries.add(ModItems.MOSSY_ACACIA_WOOD);
                    entries.add(ModItems.MOSSY_ACACIA_PLANKS);
                    entries.add(ModItems.MOSSY_ACACIA_STAIRS);
                    entries.add(ModItems.MOSSY_ACACIA_SLAB);
                    entries.add(ModItems.MOSSY_ACACIA_FENCE);
                    entries.add(ModItems.MOSSY_ACACIA_FENCE_GATE);
                    entries.add(ModItems.MOSSY_ACACIA_DOOR);
                    entries.add(ModItems.MOSSY_ACACIA_TRAPDOOR);
                    entries.add(ModItems.MOSSY_ACACIA_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_ACACIA_BUTTON);
                    entries.add(ModItems.MOSSY_DARK_OAK_LOG);
                    entries.add(ModItems.MOSSY_DARK_OAK_WOOD);
                    entries.add(ModItems.MOSSY_DARK_OAK_PLANKS);
                    entries.add(ModItems.MOSSY_DARK_OAK_STAIRS);
                    entries.add(ModItems.MOSSY_DARK_OAK_SLAB);
                    entries.add(ModItems.MOSSY_DARK_OAK_FENCE);
                    entries.add(ModItems.MOSSY_DARK_OAK_FENCE_GATE);
                    entries.add(ModItems.MOSSY_DARK_OAK_DOOR);
                    entries.add(ModItems.MOSSY_DARK_OAK_TRAPDOOR);
                    entries.add(ModItems.MOSSY_DARK_OAK_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_DARK_OAK_BUTTON);
                    entries.add(ModItems.MOSSY_MANGROVE_LOG);
                    entries.add(ModItems.MOSSY_MANGROVE_WOOD);
                    entries.add(ModItems.MOSSY_MANGROVE_PLANKS);
                    entries.add(ModItems.MOSSY_MANGROVE_STAIRS);
                    entries.add(ModItems.MOSSY_MANGROVE_SLAB);
                    entries.add(ModItems.MOSSY_MANGROVE_FENCE);
                    entries.add(ModItems.MOSSY_MANGROVE_FENCE_GATE);
                    entries.add(ModItems.MOSSY_MANGROVE_DOOR);
                    entries.add(ModItems.MOSSY_MANGROVE_TRAPDOOR);
                    entries.add(ModItems.MOSSY_MANGROVE_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_MANGROVE_BUTTON);
                    entries.add(ModItems.MOSSY_CHERRY_LOG);
                    entries.add(ModItems.MOSSY_CHERRY_WOOD);
                    entries.add(ModItems.MOSSY_CHERRY_PLANKS);
                    entries.add(ModItems.MOSSY_CHERRY_STAIRS);
                    entries.add(ModItems.MOSSY_CHERRY_SLAB);
                    entries.add(ModItems.MOSSY_CHERRY_FENCE);
                    entries.add(ModItems.MOSSY_CHERRY_FENCE_GATE);
                    entries.add(ModItems.MOSSY_CHERRY_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_CHERRY_DOOR);
                    entries.add(ModItems.MOSSY_CHERRY_TRAPDOOR);
                    entries.add(ModItems.MOSSY_CHERRY_BUTTON);
                    entries.add(ModItems.MOSSY_BAMBOO_BLOCK);
                    entries.add(ModItems.MOSSY_BAMBOO_PLANKS);
                    entries.add(ModItems.MOSSY_BAMBOO_MOSAIC);
                    entries.add(ModItems.MOSSY_BAMBOO_STAIRS);
                    entries.add(ModItems.MOSSY_BAMBOO_MOSAIC_STAIRS);
                    entries.add(ModItems.MOSSY_BAMBOO_SLAB);
                    entries.add(ModItems.MOSSY_BAMBOO_MOSAIC_SLAB);
                    entries.add(ModItems.MOSSY_BAMBOO_FENCE);
                    entries.add(ModItems.MOSSY_BAMBOO_FENCE_GATE);
                    entries.add(ModItems.MOSSY_BAMBOO_DOOR);
                    entries.add(ModItems.MOSSY_BAMBOO_TRAPDOOR);
                    entries.add(ModItems.MOSSY_BAMBOO_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_BAMBOO_BUTTON);
                    entries.add(ModItems.MOSSY_CRIMSON_STEM);
                    entries.add(ModItems.MOSSY_CRIMSON_HYPHAE);
                    entries.add(ModItems.MOSSY_CRIMSON_PLANKS);
                    entries.add(ModItems.MOSSY_CRIMSON_STAIRS);
                    entries.add(ModItems.MOSSY_CRIMSON_SLAB);
                    entries.add(ModItems.MOSSY_CRIMSON_FENCE);
                    entries.add(ModItems.MOSSY_CRIMSON_FENCE_GATE);
                    entries.add(ModItems.MOSSY_CRIMSON_DOOR);
                    entries.add(ModItems.MOSSY_CRIMSON_TRAPDOOR);
                    entries.add(ModItems.MOSSY_CRIMSON_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_CRIMSON_BUTTON);
                    entries.add(ModItems.MOSSY_WARPED_STEM);
                    entries.add(ModItems.MOSSY_WARPED_HYPHAE);
                    entries.add(ModItems.MOSSY_WARPED_PLANKS);
                    entries.add(ModItems.MOSSY_WARPED_STAIRS);
                    entries.add(ModItems.MOSSY_WARPED_SLAB);
                    entries.add(ModItems.MOSSY_WARPED_FENCE);
                    entries.add(ModItems.MOSSY_WARPED_FENCE_GATE);
                    entries.add(ModItems.MOSSY_WARPED_DOOR);
                    entries.add(ModItems.MOSSY_WARPED_TRAPDOOR);
                    entries.add(ModItems.MOSSY_WARPED_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_WARPED_BUTTON);
                    entries.add(ModItems.MOSSY_STONE);
                    entries.add(ModItems.MOSSY_STONE_STAIRS);
                    entries.add(ModItems.MOSSY_STONE_SLAB);
                    entries.add(ModItems.MOSSY_STONE_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_STONE_BUTTON);
                    entries.add(ModItems.MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(ModItems.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(ModItems.MOSSY_DEEPSLATE);
                    entries.add(ModItems.MOSSY_COBBLED_DEEPSLATE);
                    entries.add(ModItems.MOSSY_COBBLED_DEEPSLATE_STAIRS);
                    entries.add(ModItems.MOSSY_COBBLED_DEEPSLATE_SLAB);
                    entries.add(ModItems.MOSSY_COBBLED_DEEPSLATE_WALL);
                    entries.add(ModItems.MOSSY_DEEPSLATE_BRICKS);
                    entries.add(ModItems.MOSSY_DEEPSLATE_BRICK_STAIRS);
                    entries.add(ModItems.MOSSY_DEEPSLATE_BRICK_SLAB);
                    entries.add(ModItems.MOSSY_DEEPSLATE_BRICK_WALL);
                    entries.add(ModItems.MOSSY_DEEPSLATE_TILES);
                    entries.add(ModItems.MOSSY_DEEPSLATE_TILE_STAIRS);
                    entries.add(ModItems.MOSSY_DEEPSLATE_TILE_SLAB);
                    entries.add(ModItems.MOSSY_DEEPSLATE_TILE_WALL);
                    entries.add(ModItems.MOSSY_TUFF);
                    entries.add(ModItems.MOSSY_TUFF_STAIRS);
                    entries.add(ModItems.MOSSY_TUFF_SLAB);
                    entries.add(ModItems.MOSSY_TUFF_WALL);
                    entries.add(ModItems.MOSSY_TUFF_BRICKS);
                    entries.add(ModItems.MOSSY_TUFF_BRICK_STAIRS);
                    entries.add(ModItems.MOSSY_TUFF_BRICK_SLAB);
                    entries.add(ModItems.MOSSY_TUFF_BRICK_WALL);
                    entries.add(ModItems.MOSSY_BRICKS);
                    entries.add(ModItems.MOSSY_BRICK_STAIRS);
                    entries.add(ModItems.MOSSY_BRICK_SLAB);
                    entries.add(ModItems.MOSSY_BRICK_WALL);
                    entries.add(ModItems.MOSSY_IRON_BARS);
                    entries.add(ModItems.MOSSY_IRON_DOOR);
                    entries.add(ModItems.MOSSY_IRON_TRAPDOOR);
                    entries.add(ModItems.MOSSY_GLASS);
                    entries.add(ModItems.MOSSY_TINTED_GLASS);
                    entries.add(ModItems.MOSSY_WHITE_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_LIGHT_GRAY_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_GRAY_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_BLACK_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_BROWN_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_RED_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_ORANGE_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_YELLOW_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_LIME_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_GREEN_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_CYAN_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_LIGHT_BLUE_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_BLUE_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_PURPLE_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_MAGENTA_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_PINK_STAINED_GLASS);
                    entries.add(ModItems.MOSSY_GLASS_PANE);
                    entries.add(ModItems.MOSSY_WHITE_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_GRAY_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_BLACK_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_BROWN_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_RED_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_ORANGE_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_YELLOW_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_LIME_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_GREEN_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_CYAN_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_BLUE_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_PURPLE_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_MAGENTA_STAINED_GLASS_PANE);
                    entries.add(ModItems.MOSSY_PINK_STAINED_GLASS_PANE);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, path), ITEM_GROUP);
    }

    private static void modifyBuildingBlocksItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_BUTTON);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_PRESSURE_PLATE);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_TRAPDOOR);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_DOOR);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_FENCE_GATE);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_FENCE);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_SLAB);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_STAIRS);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_PLANKS);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_WOOD);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_LOG);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_BUTTON);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_PRESSURE_PLATE);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_TRAPDOOR);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_DOOR);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_FENCE_GATE);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_FENCE);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_SLAB);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_STAIRS);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_PLANKS);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_WOOD);
            entries.addAfter(Items.SPRUCE_BUTTON, ModItems.MOSSY_SPRUCE_LOG);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_BUTTON);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_PRESSURE_PLATE);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_TRAPDOOR);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_DOOR);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_FENCE_GATE);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_FENCE);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_SLAB);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_STAIRS);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_PLANKS);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_WOOD);
            entries.addAfter(Items.BIRCH_BUTTON, ModItems.MOSSY_BIRCH_LOG);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_BUTTON);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_PRESSURE_PLATE);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_TRAPDOOR);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_DOOR);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_FENCE_GATE);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_FENCE);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_SLAB);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_STAIRS);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_PLANKS);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_WOOD);
            entries.addAfter(Items.JUNGLE_BUTTON, ModItems.MOSSY_JUNGLE_LOG);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_BUTTON);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_PRESSURE_PLATE);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_TRAPDOOR);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_DOOR);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_FENCE_GATE);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_FENCE);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_SLAB);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_STAIRS);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_PLANKS);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_WOOD);
            entries.addAfter(Items.ACACIA_BUTTON, ModItems.MOSSY_ACACIA_LOG);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_BUTTON);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_PRESSURE_PLATE);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_TRAPDOOR);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_DOOR);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_FENCE_GATE);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_FENCE);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_SLAB);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_STAIRS);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_PLANKS);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_WOOD);
            entries.addAfter(Items.DARK_OAK_BUTTON, ModItems.MOSSY_DARK_OAK_LOG);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_BUTTON);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_PRESSURE_PLATE);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_TRAPDOOR);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_DOOR);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_FENCE_GATE);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_FENCE);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_SLAB);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_STAIRS);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_PLANKS);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_WOOD);
            entries.addAfter(Items.MANGROVE_BUTTON, ModItems.MOSSY_MANGROVE_LOG);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_BUTTON);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_PRESSURE_PLATE);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_TRAPDOOR);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_DOOR);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_FENCE_GATE);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_FENCE);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_SLAB);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_STAIRS);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_PLANKS);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_WOOD);
            entries.addAfter(Items.CHERRY_BUTTON, ModItems.MOSSY_CHERRY_LOG);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_BUTTON);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_PRESSURE_PLATE);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_TRAPDOOR);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_DOOR);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_FENCE_GATE);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_FENCE);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_MOSAIC_SLAB);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_SLAB);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_MOSAIC_STAIRS);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_STAIRS);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_MOSAIC);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_PLANKS);
            entries.addAfter(Items.BAMBOO_BUTTON, ModItems.MOSSY_BAMBOO_BLOCK);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_BUTTON);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_PRESSURE_PLATE);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_TRAPDOOR);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_DOOR);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_FENCE_GATE);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_FENCE);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_SLAB);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_STAIRS);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_PLANKS);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_HYPHAE);
            entries.addAfter(Items.CRIMSON_BUTTON, ModItems.MOSSY_CRIMSON_STEM);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_BUTTON);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_PRESSURE_PLATE);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_TRAPDOOR);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_DOOR);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_FENCE_GATE);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_FENCE);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_SLAB);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_STAIRS);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_PLANKS);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_HYPHAE);
            entries.addAfter(Items.WARPED_BUTTON, ModItems.MOSSY_WARPED_STEM);
            entries.addAfter(Items.STONE_BUTTON, ModItems.MOSSY_STONE_BUTTON);
            entries.addAfter(Items.STONE_BUTTON, ModItems.MOSSY_STONE_PRESSURE_PLATE);
            entries.addAfter(Items.STONE_BUTTON, ModItems.MOSSY_STONE_SLAB);
            entries.addAfter(Items.STONE_BUTTON, ModItems.MOSSY_STONE_STAIRS);
            entries.addAfter(Items.STONE_BUTTON, ModItems.MOSSY_STONE);
            entries.addAfter(Items.MOSSY_STONE_BRICK_WALL, ModItems.MOSSY_CHISELED_STONE_BRICKS);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICK_WALL);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICK_SLAB);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICK_STAIRS);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICKS);
            entries.addAfter(Items.IRON_TRAPDOOR, ModItems.MOSSY_IRON_TRAPDOOR);
            entries.addAfter(Items.IRON_TRAPDOOR, ModItems.MOSSY_IRON_DOOR);
            entries.addAfter(Items.IRON_TRAPDOOR, ModItems.MOSSY_IRON_BARS);
            entries.addAfter(Items.DEEPSLATE, ModItems.MOSSY_DEEPSLATE);
            entries.addAfter(Items.COBBLED_DEEPSLATE_WALL, ModItems.MOSSY_COBBLED_DEEPSLATE_WALL);
            entries.addAfter(Items.COBBLED_DEEPSLATE_WALL, ModItems.MOSSY_COBBLED_DEEPSLATE_SLAB);
            entries.addAfter(Items.COBBLED_DEEPSLATE_WALL, ModItems.MOSSY_COBBLED_DEEPSLATE_STAIRS);
            entries.addAfter(Items.COBBLED_DEEPSLATE_WALL, ModItems.MOSSY_COBBLED_DEEPSLATE);
            entries.addAfter(Items.DEEPSLATE_BRICK_WALL, ModItems.MOSSY_DEEPSLATE_BRICK_WALL);
            entries.addAfter(Items.DEEPSLATE_BRICK_WALL, ModItems.MOSSY_DEEPSLATE_BRICK_SLAB);
            entries.addAfter(Items.DEEPSLATE_BRICK_WALL, ModItems.MOSSY_DEEPSLATE_BRICK_STAIRS);
            entries.addAfter(Items.DEEPSLATE_BRICK_WALL, ModItems.MOSSY_DEEPSLATE_BRICKS);
            entries.addAfter(Items.DEEPSLATE_TILE_WALL, ModItems.MOSSY_DEEPSLATE_TILE_WALL);
            entries.addAfter(Items.DEEPSLATE_TILE_WALL, ModItems.MOSSY_DEEPSLATE_TILE_SLAB);
            entries.addAfter(Items.DEEPSLATE_TILE_WALL, ModItems.MOSSY_DEEPSLATE_TILE_STAIRS);
            entries.addAfter(Items.DEEPSLATE_TILE_WALL, ModItems.MOSSY_DEEPSLATE_TILES);
            entries.addAfter(Items.TUFF_WALL, ModItems.MOSSY_TUFF_WALL);
            entries.addAfter(Items.TUFF_WALL, ModItems.MOSSY_TUFF_SLAB);
            entries.addAfter(Items.TUFF_WALL, ModItems.MOSSY_TUFF_STAIRS);
            entries.addAfter(Items.TUFF_WALL, ModItems.MOSSY_TUFF);
            entries.addAfter(Items.TUFF_BRICK_WALL, ModItems.MOSSY_TUFF_BRICK_WALL);
            entries.addAfter(Items.TUFF_BRICK_WALL, ModItems.MOSSY_TUFF_BRICK_SLAB);
            entries.addAfter(Items.TUFF_BRICK_WALL, ModItems.MOSSY_TUFF_BRICK_STAIRS);
            entries.addAfter(Items.TUFF_BRICK_WALL, ModItems.MOSSY_TUFF_BRICKS);
        });
    }

    private static void modifyColoredBlocksItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.addAfter(Items.GLASS, ModItems.MOSSY_GLASS);
            entries.addAfter(Items.TINTED_GLASS, ModItems.MOSSY_TINTED_GLASS);
            entries.addAfter(Items.WHITE_STAINED_GLASS, ModItems.MOSSY_WHITE_STAINED_GLASS);
            entries.addAfter(Items.LIGHT_GRAY_STAINED_GLASS, ModItems.MOSSY_LIGHT_GRAY_STAINED_GLASS);
            entries.addAfter(Items.GRAY_STAINED_GLASS, ModItems.MOSSY_GRAY_STAINED_GLASS);
            entries.addAfter(Items.BLACK_STAINED_GLASS, ModItems.MOSSY_BLACK_STAINED_GLASS);
            entries.addAfter(Items.BROWN_STAINED_GLASS, ModItems.MOSSY_BROWN_STAINED_GLASS);
            entries.addAfter(Items.RED_STAINED_GLASS, ModItems.MOSSY_RED_STAINED_GLASS);
            entries.addAfter(Items.ORANGE_STAINED_GLASS, ModItems.MOSSY_ORANGE_STAINED_GLASS);
            entries.addAfter(Items.YELLOW_STAINED_GLASS, ModItems.MOSSY_YELLOW_STAINED_GLASS);
            entries.addAfter(Items.LIME_STAINED_GLASS, ModItems.MOSSY_LIME_STAINED_GLASS);
            entries.addAfter(Items.GREEN_STAINED_GLASS, ModItems.MOSSY_GREEN_STAINED_GLASS);
            entries.addAfter(Items.CYAN_STAINED_GLASS, ModItems.MOSSY_CYAN_STAINED_GLASS);
            entries.addAfter(Items.LIGHT_BLUE_STAINED_GLASS, ModItems.MOSSY_LIGHT_BLUE_STAINED_GLASS);
            entries.addAfter(Items.BLUE_STAINED_GLASS, ModItems.MOSSY_BLUE_STAINED_GLASS);
            entries.addAfter(Items.PURPLE_STAINED_GLASS, ModItems.MOSSY_PURPLE_STAINED_GLASS);
            entries.addAfter(Items.MAGENTA_STAINED_GLASS, ModItems.MOSSY_MAGENTA_STAINED_GLASS);
            entries.addAfter(Items.PINK_STAINED_GLASS, ModItems.MOSSY_PINK_STAINED_GLASS);
            entries.addAfter(Items.GLASS_PANE, ModItems.MOSSY_GLASS_PANE);
            entries.addAfter(Items.WHITE_STAINED_GLASS_PANE, ModItems.MOSSY_WHITE_STAINED_GLASS_PANE);
            entries.addAfter(Items.LIGHT_GRAY_STAINED_GLASS_PANE, ModItems.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
            entries.addAfter(Items.GRAY_STAINED_GLASS_PANE, ModItems.MOSSY_GRAY_STAINED_GLASS_PANE);
            entries.addAfter(Items.BLACK_STAINED_GLASS_PANE, ModItems.MOSSY_BLACK_STAINED_GLASS_PANE);
            entries.addAfter(Items.BROWN_STAINED_GLASS_PANE, ModItems.MOSSY_BROWN_STAINED_GLASS_PANE);
            entries.addAfter(Items.RED_STAINED_GLASS_PANE, ModItems.MOSSY_RED_STAINED_GLASS_PANE);
            entries.addAfter(Items.ORANGE_STAINED_GLASS_PANE, ModItems.MOSSY_ORANGE_STAINED_GLASS_PANE);
            entries.addAfter(Items.YELLOW_STAINED_GLASS_PANE, ModItems.MOSSY_YELLOW_STAINED_GLASS_PANE);
            entries.addAfter(Items.LIME_STAINED_GLASS_PANE, ModItems.MOSSY_LIME_STAINED_GLASS_PANE);
            entries.addAfter(Items.GREEN_STAINED_GLASS_PANE, ModItems.MOSSY_GREEN_STAINED_GLASS_PANE);
            entries.addAfter(Items.CYAN_STAINED_GLASS_PANE, ModItems.MOSSY_CYAN_STAINED_GLASS_PANE);
            entries.addAfter(Items.LIGHT_BLUE_STAINED_GLASS_PANE, ModItems.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
            entries.addAfter(Items.BLUE_STAINED_GLASS_PANE, ModItems.MOSSY_BLUE_STAINED_GLASS_PANE);
            entries.addAfter(Items.PURPLE_STAINED_GLASS_PANE, ModItems.MOSSY_PURPLE_STAINED_GLASS_PANE);
            entries.addAfter(Items.MAGENTA_STAINED_GLASS_PANE, ModItems.MOSSY_MAGENTA_STAINED_GLASS_PANE);
            entries.addAfter(Items.PINK_STAINED_GLASS_PANE, ModItems.MOSSY_PINK_STAINED_GLASS_PANE);
        });
    }

    private static void modifyFunctionalBlocksItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.INFESTED_CHISELED_STONE_BRICKS, ModItems.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
        });
    }

    private static void modifyCombatItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.SNOWBALL, ModItems.MOSS_BALL);
        });
    }

    private static void modifyIngredientsItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.SNOWBALL, ModItems.MOSS_BALL);
        });
    }

}
