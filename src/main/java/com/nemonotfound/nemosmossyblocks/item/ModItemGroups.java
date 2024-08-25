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
                    entries.add(ModItems.MOSSY_OAK_PRESSURE_PLATE);
                    entries.add(ModItems.MOSSY_OAK_BUTTON);
                    entries.add(ModItems.MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(ModItems.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
                    entries.add(ModItems.MOSSY_BRICKS);
                    entries.add(ModItems.MOSSY_BRICK_STAIRS);
                    entries.add(ModItems.MOSSY_BRICK_SLAB);
                    entries.add(ModItems.MOSSY_BRICK_WALL);
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
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_FENCE_GATE);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_FENCE);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_SLAB);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_STAIRS);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_PLANKS);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_WOOD);
            entries.addAfter(Items.OAK_BUTTON, ModItems.MOSSY_OAK_LOG);
            entries.addAfter(Items.MOSSY_STONE_BRICK_WALL, ModItems.MOSSY_CHISELED_STONE_BRICKS);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICK_WALL);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICK_SLAB);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICK_STAIRS);
            entries.addAfter(Items.BRICK_WALL, ModItems.MOSSY_BRICKS);
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
