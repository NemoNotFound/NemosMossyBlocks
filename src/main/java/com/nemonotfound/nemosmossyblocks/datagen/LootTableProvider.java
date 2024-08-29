package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        this.addDrop(ModBlocks.MOSSY_STONE, (Block block) -> this.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.MOSSY_COBBLESTONE))));
        this.addDrop(ModBlocks.MOSSY_STONE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_STONE_SLAB);
        this.addDrop(ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_STONE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_ACACIA_PLANKS);
        this.addDrop(ModBlocks.MOSSY_ACACIA_STAIRS);
        this.addDrop(ModBlocks.MOSSY_ACACIA_SLAB);
        this.addDrop(ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_ACACIA_BUTTON);
        this.addDrop(ModBlocks.MOSSY_ACACIA_FENCE);
        this.addDrop(ModBlocks.MOSSY_ACACIA_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_PLANKS);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_STAIRS);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_SLAB);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_BUTTON);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_FENCE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_BIRCH_PLANKS);
        this.addDrop(ModBlocks.MOSSY_BIRCH_STAIRS);
        this.addDrop(ModBlocks.MOSSY_BIRCH_SLAB);
        this.addDrop(ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_BIRCH_BUTTON);
        this.addDrop(ModBlocks.MOSSY_BIRCH_FENCE);
        this.addDrop(ModBlocks.MOSSY_BIRCH_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_CHERRY_PLANKS);
        this.addDrop(ModBlocks.MOSSY_CHERRY_STAIRS);
        this.addDrop(ModBlocks.MOSSY_CHERRY_SLAB);
        this.addDrop(ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_CHERRY_BUTTON);
        this.addDrop(ModBlocks.MOSSY_CHERRY_FENCE);
        this.addDrop(ModBlocks.MOSSY_CHERRY_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_PLANKS);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_STAIRS);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_SLAB);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_BUTTON);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_FENCE);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_PLANKS);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_STAIRS);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_SLAB);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_BUTTON);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_FENCE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_PLANKS);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_SLAB);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_FENCE);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_PLANKS);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_SLAB);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_FENCE);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_OAK_PLANKS);
        this.addDrop(ModBlocks.MOSSY_OAK_STAIRS);
        this.addDrop(ModBlocks.MOSSY_OAK_SLAB);
        this.addDrop(ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_OAK_BUTTON);
        this.addDrop(ModBlocks.MOSSY_OAK_FENCE);
        this.addDrop(ModBlocks.MOSSY_OAK_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_PLANKS);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_SLAB);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_FENCE);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_WARPED_PLANKS);
        this.addDrop(ModBlocks.MOSSY_WARPED_STAIRS);
        this.addDrop(ModBlocks.MOSSY_WARPED_SLAB);
        this.addDrop(ModBlocks.MOSSY_WARPED_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_WARPED_BUTTON);
        this.addDrop(ModBlocks.MOSSY_WARPED_FENCE);
        this.addDrop(ModBlocks.MOSSY_WARPED_FENCE_GATE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_BLACK_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_BLUE_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_BROWN_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_CYAN_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_GRAY_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_GREEN_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_LIME_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_MAGENTA_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_ORANGE_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_PINK_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_PURPLE_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_RED_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_TINTED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_WHITE_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_YELLOW_STAINED_GLASS);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_BLACK_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_BLUE_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_BROWN_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_CYAN_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_GRAY_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_GREEN_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_LIME_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_MAGENTA_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_ORANGE_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_PINK_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_PURPLE_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_RED_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_WHITE_STAINED_GLASS_PANE);
        this.addDropWithSilkTouch(ModBlocks.MOSSY_YELLOW_STAINED_GLASS_PANE);
        this.addDrop(ModBlocks.MOSSY_ACACIA_LOG);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_BLOCK);
        this.addDrop(ModBlocks.MOSSY_BIRCH_LOG);
        this.addDrop(ModBlocks.MOSSY_CHERRY_LOG);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_STEM);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_LOG);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_LOG);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_LOG);
        this.addDrop(ModBlocks.MOSSY_OAK_LOG);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_LOG);
        this.addDrop(ModBlocks.MOSSY_WARPED_STEM);
        this.addDrop(ModBlocks.MOSSY_ACACIA_WOOD);
        this.addDrop(ModBlocks.MOSSY_BIRCH_WOOD);
        this.addDrop(ModBlocks.MOSSY_CHERRY_WOOD);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_HYPHAE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_WOOD);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_WOOD);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_WOOD);
        this.addDrop(ModBlocks.MOSSY_OAK_WOOD);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_WOOD);
        this.addDrop(ModBlocks.MOSSY_WARPED_HYPHAE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_MOSAIC);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_MOSAIC_STAIRS);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);
        this.addDrop(ModBlocks.MOSSY_IRON_BARS);
        this.addDrop(ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
        this.addDrop(ModBlocks.MOSSY_BRICKS);
        this.addDrop(ModBlocks.MOSSY_BRICK_SLAB);
        this.addDrop(ModBlocks.MOSSY_BRICK_STAIRS);
        this.addDrop(ModBlocks.MOSSY_BRICK_WALL);
        this.addDrop(ModBlocks.MOSSY_OAK_DOOR, this.doorDrops(ModBlocks.MOSSY_OAK_DOOR));
        this.addDrop(ModBlocks.MOSSY_SPRUCE_DOOR, this.doorDrops(ModBlocks.MOSSY_SPRUCE_DOOR));
        this.addDrop(ModBlocks.MOSSY_BIRCH_DOOR, this.doorDrops(ModBlocks.MOSSY_BIRCH_DOOR));
        this.addDrop(ModBlocks.MOSSY_JUNGLE_DOOR, this.doorDrops(ModBlocks.MOSSY_JUNGLE_DOOR));
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_DOOR, this.doorDrops(ModBlocks.MOSSY_DARK_OAK_DOOR));
        this.addDrop(ModBlocks.MOSSY_ACACIA_DOOR, this.doorDrops(ModBlocks.MOSSY_ACACIA_DOOR));
        this.addDrop(ModBlocks.MOSSY_MANGROVE_DOOR, this.doorDrops(ModBlocks.MOSSY_MANGROVE_DOOR));
        this.addDrop(ModBlocks.MOSSY_CHERRY_DOOR, this.doorDrops(ModBlocks.MOSSY_CHERRY_DOOR));
        this.addDrop(ModBlocks.MOSSY_BAMBOO_DOOR, this.doorDrops(ModBlocks.MOSSY_BAMBOO_DOOR));
        this.addDrop(ModBlocks.MOSSY_WARPED_DOOR, this.doorDrops(ModBlocks.MOSSY_WARPED_DOOR));
        this.addDrop(ModBlocks.MOSSY_CRIMSON_DOOR, this.doorDrops(ModBlocks.MOSSY_CRIMSON_DOOR));
        this.addDrop(ModBlocks.MOSSY_IRON_DOOR, this.doorDrops(ModBlocks.MOSSY_IRON_DOOR));
        this.addDrop(ModBlocks.MOSSY_OAK_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_BIRCH_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_ACACIA_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_CHERRY_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_WARPED_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_TRAPDOOR);
        this.addDrop(ModBlocks.MOSSY_IRON_TRAPDOOR);
    }
}
