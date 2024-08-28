package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-mossy-blocks-group";
    public static final RegistryKey<ItemGroup> NEMOS_MOSSY_BLOCKS = getItemGroup(NEMOS_CARPENTRY_GROUP_ID);
    public static final Map<RegistryKey<ItemGroup>, List<BlockItem>> itemGroupToBlocksMap = new HashMap<>();

    public static void registerItemGroups() {
        log.info("Registering item groups");

        registerNemosMossyBlocksItemGroup("Nemo's Mossy Blocks", NEMOS_CARPENTRY_GROUP_ID, ModBlocks.MOSSY_STONE);
        modifyBuildingBlocksItemGroup();
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
                    entries.add(ModItems.MOSSY_WARPED_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_WARPED_BUTTON);
                    entries.add(ModItems.MOSSY_STONE);
                    entries.add(ModItems.MOSSY_STONE_STAIRS);
                    entries.add(ModItems.MOSSY_STONE_SLAB);
                    entries.add(ModItems.MOSSY_STONE_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_STONE_BUTTON);
                    entries.add(ModItems.MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(ModItems.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(ModItems.MOSSY_BRICKS);
                    entries.add(ModItems.MOSSY_BRICK_STAIRS);
                    entries.add(ModItems.MOSSY_BRICK_SLAB);
                    entries.add(ModItems.MOSSY_BRICK_WALL);
                    entries.add(ModItems.MOSSY_IRON_BARS);
                    entries.add(ModItems.MOSSY_IRON_DOOR);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, path), ITEM_GROUP);
    }

    private static RegistryKey<ItemGroup> getItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, path));
    }

    public static void registerItemsToItemGroups() {
        for (Map.Entry<RegistryKey<ItemGroup>, List<BlockItem>> entry : itemGroupToBlocksMap.entrySet()) {
            ItemGroupEvents.modifyEntriesEvent(entry.getKey())
                    .register(content -> {
                        for (BlockItem blockItem : entry.getValue()) {
                            content.add(blockItem);
                        }
                    });
        }
    }

    private static void modifyBuildingBlocksItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_BUTTON);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_PRESSURE_PLATE);
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
            entries.addAfter(Items.IRON_BARS, ModItems.MOSSY_IRON_BARS);
            entries.addAfter(Items.IRON_DOOR, ModItems.MOSSY_IRON_DOOR);
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
