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
    public static final Item MOSSY_OAK_PRESSURE_PLATE = registerBlockItem("mossy_oak_pressure_plate", ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
    public static final Item MOSSY_OAK_BUTTON = registerBlockItem("mossy_oak_button", ModBlocks.MOSSY_OAK_BUTTON);
    public static final Item MOSSY_CHISELED_STONE_BRICKS = registerBlockItem("mossy_chiseled_stone_bricks",
            ModBlocks.MOSSY_CHISELED_STONE_BRICKS);
    public static final Item INFESTED_MOSSY_CHISELED_STONE_BRICKS = registerBlockItem("infested_mossy_chiseled_stone_bricks",
            ModBlocks.INFESTED_MOSSY_CHISELED_STONE_BRICKS);
    public static final Item MOSSY_BRICKS = registerBlockItem("mossy_bricks",
            ModBlocks.MOSSY_BRICKS);
    public static final Item MOSSY_BRICK_SLAB = registerBlockItem("mossy_brick_slab",
            ModBlocks.MOSSY_BRICK_SLAB);
    public static final Item MOSSY_BRICK_STAIRS = registerBlockItem("mossy_brick_stairs",
            ModBlocks.MOSSY_BRICK_STAIRS);
    public static final Item MOSSY_BRICK_WALL = registerBlockItem("mossy_brick_wall",
            ModBlocks.MOSSY_BRICK_WALL);

    public static void registerItems() {
        log.debug("Register items");
    }

    private static Item registerItem(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), item);
    }

    private static Item registerBlockItem(String path, Block block) {
        BlockItem blockItem = new BlockItem(block, new Item.Settings());

        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, path), blockItem);
    }
}
