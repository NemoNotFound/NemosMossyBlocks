package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemosmossyblocks.block.ModBlocks.*;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(MOSSY_ACACIA_PLANKS)
                .add(MOSSY_ACACIA_STAIRS)
                .add(MOSSY_ACACIA_SLAB)
                .add(MOSSY_ACACIA_PRESSURE_PLATE)
                .add(MOSSY_ACACIA_BUTTON)
                .add(MOSSY_ACACIA_FENCE)
                .add(MOSSY_ACACIA_FENCE_GATE)
                .add(MOSSY_BAMBOO_PLANKS)
                .add(MOSSY_BAMBOO_MOSAIC)
                .add(MOSSY_BAMBOO_STAIRS)
                .add(MOSSY_BAMBOO_MOSAIC_STAIRS)
                .add(MOSSY_BAMBOO_SLAB)
                .add(MOSSY_BAMBOO_MOSAIC_SLAB)
                .add(MOSSY_BAMBOO_PRESSURE_PLATE)
                .add(MOSSY_BAMBOO_BUTTON)
                .add(MOSSY_BAMBOO_FENCE)
                .add(MOSSY_BAMBOO_FENCE_GATE)
                .add(MOSSY_BIRCH_PLANKS)
                .add(MOSSY_BIRCH_STAIRS)
                .add(MOSSY_BIRCH_SLAB)
                .add(MOSSY_BIRCH_PRESSURE_PLATE)
                .add(MOSSY_BIRCH_BUTTON)
                .add(MOSSY_BIRCH_FENCE)
                .add(MOSSY_BIRCH_FENCE_GATE)
                .add(MOSSY_CHERRY_PLANKS)
                .add(MOSSY_CHERRY_STAIRS)
                .add(MOSSY_CHERRY_SLAB)
                .add(MOSSY_CHERRY_PRESSURE_PLATE)
                .add(MOSSY_CHERRY_BUTTON)
                .add(MOSSY_CHERRY_FENCE)
                .add(MOSSY_CHERRY_FENCE_GATE)
                .add(MOSSY_CRIMSON_PLANKS)
                .add(MOSSY_CRIMSON_STAIRS)
                .add(MOSSY_CRIMSON_SLAB)
                .add(MOSSY_CRIMSON_PRESSURE_PLATE)
                .add(MOSSY_CRIMSON_BUTTON)
                .add(MOSSY_CRIMSON_FENCE)
                .add(MOSSY_CRIMSON_FENCE_GATE)
                .add(MOSSY_DARK_OAK_PLANKS)
                .add(MOSSY_DARK_OAK_STAIRS)
                .add(MOSSY_DARK_OAK_SLAB)
                .add(MOSSY_DARK_OAK_PRESSURE_PLATE)
                .add(MOSSY_DARK_OAK_BUTTON)
                .add(MOSSY_DARK_OAK_FENCE)
                .add(MOSSY_DARK_OAK_FENCE_GATE)
                .add(MOSSY_PALE_OAK_PLANKS)
                .add(MOSSY_PALE_OAK_STAIRS)
                .add(MOSSY_PALE_OAK_SLAB)
                .add(MOSSY_PALE_OAK_PRESSURE_PLATE)
                .add(MOSSY_PALE_OAK_BUTTON)
                .add(MOSSY_PALE_OAK_FENCE)
                .add(MOSSY_PALE_OAK_FENCE_GATE)
                .add(MOSSY_JUNGLE_PLANKS)
                .add(MOSSY_JUNGLE_STAIRS)
                .add(MOSSY_JUNGLE_SLAB)
                .add(MOSSY_JUNGLE_PRESSURE_PLATE)
                .add(MOSSY_JUNGLE_BUTTON)
                .add(MOSSY_JUNGLE_FENCE)
                .add(MOSSY_JUNGLE_FENCE_GATE)
                .add(MOSSY_MANGROVE_PLANKS)
                .add(MOSSY_MANGROVE_STAIRS)
                .add(MOSSY_MANGROVE_SLAB)
                .add(MOSSY_MANGROVE_PRESSURE_PLATE)
                .add(MOSSY_MANGROVE_BUTTON)
                .add(MOSSY_MANGROVE_FENCE)
                .add(MOSSY_MANGROVE_FENCE_GATE)
                .add(MOSSY_OAK_PLANKS)
                .add(MOSSY_OAK_STAIRS)
                .add(MOSSY_OAK_SLAB)
                .add(MOSSY_OAK_PRESSURE_PLATE)
                .add(MOSSY_OAK_BUTTON)
                .add(MOSSY_OAK_FENCE)
                .add(MOSSY_OAK_FENCE_GATE)
                .add(MOSSY_SPRUCE_PLANKS)
                .add(MOSSY_SPRUCE_STAIRS)
                .add(MOSSY_SPRUCE_SLAB)
                .add(MOSSY_SPRUCE_PRESSURE_PLATE)
                .add(MOSSY_SPRUCE_BUTTON)
                .add(MOSSY_SPRUCE_FENCE)
                .add(MOSSY_SPRUCE_FENCE_GATE)
                .add(MOSSY_WARPED_PLANKS)
                .add(MOSSY_WARPED_STAIRS)
                .add(MOSSY_WARPED_SLAB)
                .add(MOSSY_WARPED_PRESSURE_PLATE)
                .add(MOSSY_WARPED_BUTTON)
                .add(MOSSY_WARPED_FENCE)
                .add(MOSSY_WARPED_FENCE_GATE)
                .add(MOSSY_ACACIA_LOG)
                .add(MOSSY_BAMBOO_BLOCK)
                .add(MOSSY_BIRCH_LOG)
                .add(MOSSY_CHERRY_LOG)
                .add(MOSSY_CRIMSON_STEM)
                .add(MOSSY_DARK_OAK_LOG)
                .add(MOSSY_PALE_OAK_LOG)
                .add(MOSSY_JUNGLE_LOG)
                .add(MOSSY_MANGROVE_LOG)
                .add(MOSSY_OAK_LOG)
                .add(MOSSY_SPRUCE_LOG)
                .add(MOSSY_WARPED_STEM)
                .add(MOSSY_ACACIA_WOOD)
                .add(MOSSY_BIRCH_WOOD)
                .add(MOSSY_CHERRY_WOOD)
                .add(MOSSY_CRIMSON_HYPHAE)
                .add(MOSSY_DARK_OAK_WOOD)
                .add(MOSSY_PALE_OAK_WOOD)
                .add(MOSSY_JUNGLE_WOOD)
                .add(MOSSY_MANGROVE_WOOD)
                .add(MOSSY_OAK_WOOD)
                .add(MOSSY_SPRUCE_WOOD)
                .add(MOSSY_WARPED_HYPHAE)
                .add(MOSSY_OAK_DOOR)
                .add(MOSSY_SPRUCE_DOOR)
                .add(MOSSY_BIRCH_DOOR)
                .add(MOSSY_ACACIA_DOOR)
                .add(MOSSY_DARK_OAK_DOOR)
                .add(MOSSY_PALE_OAK_DOOR)
                .add(MOSSY_MANGROVE_DOOR)
                .add(MOSSY_CHERRY_DOOR)
                .add(MOSSY_BAMBOO_DOOR)
                .add(MOSSY_JUNGLE_DOOR)
                .add(MOSSY_CRIMSON_DOOR)
                .add(MOSSY_WARPED_DOOR)
                .add(MOSSY_OAK_TRAPDOOR)
                .add(MOSSY_SPRUCE_TRAPDOOR)
                .add(MOSSY_BIRCH_TRAPDOOR)
                .add(MOSSY_ACACIA_TRAPDOOR)
                .add(MOSSY_DARK_OAK_TRAPDOOR)
                .add(MOSSY_PALE_OAK_TRAPDOOR)
                .add(MOSSY_MANGROVE_TRAPDOOR)
                .add(MOSSY_CHERRY_TRAPDOOR)
                .add(MOSSY_BAMBOO_TRAPDOOR)
                .add(MOSSY_JUNGLE_TRAPDOOR)
                .add(MOSSY_CRIMSON_TRAPDOOR)
                .add(MOSSY_WARPED_TRAPDOOR)
                .add(PALE_MOSSY_ACACIA_PLANKS)
                .add(PALE_MOSSY_ACACIA_STAIRS)
                .add(PALE_MOSSY_ACACIA_SLAB)
                .add(PALE_MOSSY_ACACIA_PRESSURE_PLATE)
                .add(PALE_MOSSY_ACACIA_BUTTON)
                .add(PALE_MOSSY_ACACIA_FENCE)
                .add(PALE_MOSSY_ACACIA_FENCE_GATE)
                .add(PALE_MOSSY_BAMBOO_PLANKS)
                .add(PALE_MOSSY_BAMBOO_MOSAIC)
                .add(PALE_MOSSY_BAMBOO_STAIRS)
                .add(PALE_MOSSY_BAMBOO_MOSAIC_STAIRS)
                .add(PALE_MOSSY_BAMBOO_SLAB)
                .add(PALE_MOSSY_BAMBOO_MOSAIC_SLAB)
                .add(PALE_MOSSY_BAMBOO_PRESSURE_PLATE)
                .add(PALE_MOSSY_BAMBOO_BUTTON)
                .add(PALE_MOSSY_BAMBOO_FENCE)
                .add(PALE_MOSSY_BAMBOO_FENCE_GATE)
                .add(PALE_MOSSY_BIRCH_PLANKS)
                .add(PALE_MOSSY_BIRCH_STAIRS)
                .add(PALE_MOSSY_BIRCH_SLAB)
                .add(PALE_MOSSY_BIRCH_PRESSURE_PLATE)
                .add(PALE_MOSSY_BIRCH_BUTTON)
                .add(PALE_MOSSY_BIRCH_FENCE)
                .add(PALE_MOSSY_BIRCH_FENCE_GATE)
                .add(PALE_MOSSY_CHERRY_PLANKS)
                .add(PALE_MOSSY_CHERRY_STAIRS)
                .add(PALE_MOSSY_CHERRY_SLAB)
                .add(PALE_MOSSY_CHERRY_PRESSURE_PLATE)
                .add(PALE_MOSSY_CHERRY_BUTTON)
                .add(PALE_MOSSY_CHERRY_FENCE)
                .add(PALE_MOSSY_CHERRY_FENCE_GATE)
                .add(PALE_MOSSY_CRIMSON_PLANKS)
                .add(PALE_MOSSY_CRIMSON_STAIRS)
                .add(PALE_MOSSY_CRIMSON_SLAB)
                .add(PALE_MOSSY_CRIMSON_PRESSURE_PLATE)
                .add(PALE_MOSSY_CRIMSON_BUTTON)
                .add(PALE_MOSSY_CRIMSON_FENCE)
                .add(PALE_MOSSY_CRIMSON_FENCE_GATE)
                .add(PALE_MOSSY_DARK_OAK_PLANKS)
                .add(PALE_MOSSY_DARK_OAK_STAIRS)
                .add(PALE_MOSSY_DARK_OAK_SLAB)
                .add(PALE_MOSSY_DARK_OAK_PRESSURE_PLATE)
                .add(PALE_MOSSY_DARK_OAK_BUTTON)
                .add(PALE_MOSSY_DARK_OAK_FENCE)
                .add(PALE_MOSSY_DARK_OAK_FENCE_GATE)
                .add(PALE_MOSSY_PALE_OAK_PLANKS)
                .add(PALE_MOSSY_PALE_OAK_STAIRS)
                .add(PALE_MOSSY_PALE_OAK_SLAB)
                .add(PALE_MOSSY_PALE_OAK_PRESSURE_PLATE)
                .add(PALE_MOSSY_PALE_OAK_BUTTON)
                .add(PALE_MOSSY_PALE_OAK_FENCE)
                .add(PALE_MOSSY_PALE_OAK_FENCE_GATE)
                .add(PALE_MOSSY_JUNGLE_PLANKS)
                .add(PALE_MOSSY_JUNGLE_STAIRS)
                .add(PALE_MOSSY_JUNGLE_SLAB)
                .add(PALE_MOSSY_JUNGLE_PRESSURE_PLATE)
                .add(PALE_MOSSY_JUNGLE_BUTTON)
                .add(PALE_MOSSY_JUNGLE_FENCE)
                .add(PALE_MOSSY_JUNGLE_FENCE_GATE)
                .add(PALE_MOSSY_MANGROVE_PLANKS)
                .add(PALE_MOSSY_MANGROVE_STAIRS)
                .add(PALE_MOSSY_MANGROVE_SLAB)
                .add(PALE_MOSSY_MANGROVE_PRESSURE_PLATE)
                .add(PALE_MOSSY_MANGROVE_BUTTON)
                .add(PALE_MOSSY_MANGROVE_FENCE)
                .add(PALE_MOSSY_MANGROVE_FENCE_GATE)
                .add(PALE_MOSSY_OAK_PLANKS)
                .add(PALE_MOSSY_OAK_STAIRS)
                .add(PALE_MOSSY_OAK_SLAB)
                .add(PALE_MOSSY_OAK_PRESSURE_PLATE)
                .add(PALE_MOSSY_OAK_BUTTON)
                .add(PALE_MOSSY_OAK_FENCE)
                .add(PALE_MOSSY_OAK_FENCE_GATE)
                .add(PALE_MOSSY_SPRUCE_PLANKS)
                .add(PALE_MOSSY_SPRUCE_STAIRS)
                .add(PALE_MOSSY_SPRUCE_SLAB)
                .add(PALE_MOSSY_SPRUCE_PRESSURE_PLATE)
                .add(PALE_MOSSY_SPRUCE_BUTTON)
                .add(PALE_MOSSY_SPRUCE_FENCE)
                .add(PALE_MOSSY_SPRUCE_FENCE_GATE)
                .add(PALE_MOSSY_WARPED_PLANKS)
                .add(PALE_MOSSY_WARPED_STAIRS)
                .add(PALE_MOSSY_WARPED_SLAB)
                .add(PALE_MOSSY_WARPED_PRESSURE_PLATE)
                .add(PALE_MOSSY_WARPED_BUTTON)
                .add(PALE_MOSSY_WARPED_FENCE)
                .add(PALE_MOSSY_WARPED_FENCE_GATE)
                .add(PALE_MOSSY_ACACIA_LOG)
                .add(PALE_MOSSY_BAMBOO_BLOCK)
                .add(PALE_MOSSY_BIRCH_LOG)
                .add(PALE_MOSSY_CHERRY_LOG)
                .add(PALE_MOSSY_CRIMSON_STEM)
                .add(PALE_MOSSY_DARK_OAK_LOG)
                .add(PALE_MOSSY_PALE_OAK_LOG)
                .add(PALE_MOSSY_JUNGLE_LOG)
                .add(PALE_MOSSY_MANGROVE_LOG)
                .add(PALE_MOSSY_OAK_LOG)
                .add(PALE_MOSSY_SPRUCE_LOG)
                .add(PALE_MOSSY_WARPED_STEM)
                .add(PALE_MOSSY_ACACIA_WOOD)
                .add(PALE_MOSSY_BIRCH_WOOD)
                .add(PALE_MOSSY_CHERRY_WOOD)
                .add(PALE_MOSSY_CRIMSON_HYPHAE)
                .add(PALE_MOSSY_DARK_OAK_WOOD)
                .add(PALE_MOSSY_PALE_OAK_WOOD)
                .add(PALE_MOSSY_JUNGLE_WOOD)
                .add(PALE_MOSSY_MANGROVE_WOOD)
                .add(PALE_MOSSY_OAK_WOOD)
                .add(PALE_MOSSY_SPRUCE_WOOD)
                .add(PALE_MOSSY_WARPED_HYPHAE)
                .add(PALE_MOSSY_OAK_DOOR)
                .add(PALE_MOSSY_SPRUCE_DOOR)
                .add(PALE_MOSSY_BIRCH_DOOR)
                .add(PALE_MOSSY_ACACIA_DOOR)
                .add(PALE_MOSSY_DARK_OAK_DOOR)
                .add(PALE_MOSSY_PALE_OAK_DOOR)
                .add(PALE_MOSSY_MANGROVE_DOOR)
                .add(PALE_MOSSY_CHERRY_DOOR)
                .add(PALE_MOSSY_BAMBOO_DOOR)
                .add(PALE_MOSSY_JUNGLE_DOOR)
                .add(PALE_MOSSY_CRIMSON_DOOR)
                .add(PALE_MOSSY_WARPED_DOOR)
                .add(PALE_MOSSY_OAK_TRAPDOOR)
                .add(PALE_MOSSY_SPRUCE_TRAPDOOR)
                .add(PALE_MOSSY_BIRCH_TRAPDOOR)
                .add(PALE_MOSSY_ACACIA_TRAPDOOR)
                .add(PALE_MOSSY_DARK_OAK_TRAPDOOR)
                .add(PALE_MOSSY_PALE_OAK_TRAPDOOR)
                .add(PALE_MOSSY_MANGROVE_TRAPDOOR)
                .add(PALE_MOSSY_CHERRY_TRAPDOOR)
                .add(PALE_MOSSY_BAMBOO_TRAPDOOR)
                .add(PALE_MOSSY_JUNGLE_TRAPDOOR)
                .add(PALE_MOSSY_CRIMSON_TRAPDOOR)
                .add(PALE_MOSSY_WARPED_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(MOSSY_STONE)
                .add(MOSSY_STONE_STAIRS)
                .add(MOSSY_STONE_SLAB)
                .add(MOSSY_STONE_PRESSURE_PLATE)
                .add(MOSSY_STONE_BUTTON)
                .add(MOSSY_IRON_BARS)
                .add(MOSSY_CHISELED_STONE_BRICKS)
                .add(INFESTED_MOSSY_CHISELED_STONE_BRICKS)
                .add(MOSSY_BRICKS)
                .add(MOSSY_BRICK_SLAB)
                .add(MOSSY_BRICK_STAIRS)
                .add(MOSSY_BRICK_WALL)
                .add(MOSSY_IRON_DOOR)
                .add(MOSSY_DEEPSLATE)
                .add(MOSSY_COBBLED_DEEPSLATE)
                .add(MOSSY_COBBLED_DEEPSLATE_STAIRS)
                .add(MOSSY_COBBLED_DEEPSLATE_SLAB)
                .add(MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(MOSSY_DEEPSLATE_BRICKS)
                .add(MOSSY_DEEPSLATE_BRICK_STAIRS)
                .add(MOSSY_DEEPSLATE_BRICK_SLAB)
                .add(MOSSY_DEEPSLATE_BRICK_WALL)
                .add(MOSSY_DEEPSLATE_TILES)
                .add(MOSSY_DEEPSLATE_TILE_STAIRS)
                .add(MOSSY_DEEPSLATE_TILE_SLAB)
                .add(MOSSY_DEEPSLATE_TILE_WALL)
                .add(MOSSY_TUFF)
                .add(MOSSY_TUFF_STAIRS)
                .add(MOSSY_TUFF_SLAB)
                .add(MOSSY_TUFF_WALL)
                .add(MOSSY_TUFF_BRICKS)
                .add(MOSSY_TUFF_BRICK_STAIRS)
                .add(MOSSY_TUFF_BRICK_SLAB)
                .add(MOSSY_TUFF_BRICK_WALL)
                .add(PALE_MOSSY_STONE)
                .add(PALE_MOSSY_STONE_STAIRS)
                .add(PALE_MOSSY_STONE_SLAB)
                .add(PALE_MOSSY_STONE_PRESSURE_PLATE)
                .add(PALE_MOSSY_STONE_BUTTON)
                .add(PALE_MOSSY_COBBLESTONE)
                .add(PALE_MOSSY_COBBLESTONE_STAIRS)
                .add(PALE_MOSSY_COBBLESTONE_SLAB)
                .add(PALE_MOSSY_COBBLESTONE_WALL)
                .add(PALE_MOSSY_STONE_BRICKS)
                .add(PALE_MOSSY_STONE_BRICK_STAIRS)
                .add(PALE_MOSSY_STONE_BRICK_SLAB)
                .add(PALE_MOSSY_STONE_BRICK_WALL)
                .add(PALE_MOSSY_IRON_BARS)
                .add(PALE_MOSSY_CHISELED_STONE_BRICKS)
                .add(PALE_MOSSY_BRICKS)
                .add(PALE_MOSSY_BRICK_SLAB)
                .add(PALE_MOSSY_BRICK_STAIRS)
                .add(PALE_MOSSY_BRICK_WALL)
                .add(PALE_MOSSY_IRON_DOOR)
                .add(PALE_MOSSY_DEEPSLATE)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_SLAB)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(PALE_MOSSY_DEEPSLATE_BRICKS)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_STAIRS)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_SLAB)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_WALL)
                .add(PALE_MOSSY_DEEPSLATE_TILES)
                .add(PALE_MOSSY_DEEPSLATE_TILE_STAIRS)
                .add(PALE_MOSSY_DEEPSLATE_TILE_SLAB)
                .add(PALE_MOSSY_DEEPSLATE_TILE_WALL)
                .add(PALE_MOSSY_TUFF)
                .add(PALE_MOSSY_TUFF_STAIRS)
                .add(PALE_MOSSY_TUFF_SLAB)
                .add(PALE_MOSSY_TUFF_WALL)
                .add(PALE_MOSSY_TUFF_BRICKS)
                .add(PALE_MOSSY_TUFF_BRICK_STAIRS)
                .add(PALE_MOSSY_TUFF_BRICK_SLAB)
                .add(PALE_MOSSY_TUFF_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(MOSSY_ACACIA_FENCE)
                .add(MOSSY_BAMBOO_FENCE)
                .add(MOSSY_BIRCH_FENCE)
                .add(MOSSY_CHERRY_FENCE)
                .add(MOSSY_CRIMSON_FENCE)
                .add(MOSSY_DARK_OAK_FENCE)
                .add(MOSSY_PALE_OAK_FENCE)
                .add(MOSSY_JUNGLE_FENCE)
                .add(MOSSY_MANGROVE_FENCE)
                .add(MOSSY_OAK_FENCE)
                .add(MOSSY_SPRUCE_FENCE)
                .add(MOSSY_WARPED_FENCE)
                .add(PALE_MOSSY_ACACIA_FENCE)
                .add(PALE_MOSSY_BAMBOO_FENCE)
                .add(PALE_MOSSY_BIRCH_FENCE)
                .add(PALE_MOSSY_CHERRY_FENCE)
                .add(PALE_MOSSY_CRIMSON_FENCE)
                .add(PALE_MOSSY_DARK_OAK_FENCE)
                .add(PALE_MOSSY_PALE_OAK_FENCE)
                .add(PALE_MOSSY_JUNGLE_FENCE)
                .add(PALE_MOSSY_MANGROVE_FENCE)
                .add(PALE_MOSSY_OAK_FENCE)
                .add(PALE_MOSSY_SPRUCE_FENCE)
                .add(PALE_MOSSY_WARPED_FENCE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(MOSSY_BRICK_WALL)
                .add(MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(MOSSY_DEEPSLATE_BRICK_WALL)
                .add(MOSSY_DEEPSLATE_TILE_WALL)
                .add(MOSSY_TUFF_WALL)
                .add(MOSSY_TUFF_BRICK_WALL)
                .add(PALE_MOSSY_COBBLESTONE_WALL)
                .add(PALE_MOSSY_STONE_BRICK_WALL)
                .add(PALE_MOSSY_BRICK_WALL)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_WALL)
                .add(PALE_MOSSY_DEEPSLATE_TILE_WALL)
                .add(PALE_MOSSY_TUFF_WALL)
                .add(PALE_MOSSY_TUFF_BRICK_WALL);

        getOrCreateTagBuilder(ModBlockTags.MOSSY_BLOCKS)
                .add(MOSSY_STONE)
                .add(MOSSY_STONE_STAIRS)
                .add(MOSSY_STONE_SLAB)
                .add(MOSSY_STONE_BUTTON)
                .add(MOSSY_STONE_PRESSURE_PLATE)
                .add(MOSSY_ACACIA_LOG)
                .add(MOSSY_ACACIA_WOOD)
                .add(MOSSY_ACACIA_PLANKS)
                .add(MOSSY_ACACIA_STAIRS)
                .add(MOSSY_ACACIA_SLAB)
                .add(MOSSY_ACACIA_FENCE)
                .add(MOSSY_ACACIA_FENCE_GATE)
                .add(MOSSY_ACACIA_PRESSURE_PLATE)
                .add(MOSSY_ACACIA_BUTTON)
                .add(MOSSY_BAMBOO_BLOCK)
                .add(MOSSY_BAMBOO_PLANKS)
                .add(MOSSY_BAMBOO_MOSAIC)
                .add(MOSSY_BAMBOO_MOSAIC_STAIRS)
                .add(MOSSY_BAMBOO_MOSAIC_SLAB)
                .add(MOSSY_BAMBOO_STAIRS)
                .add(MOSSY_BAMBOO_SLAB)
                .add(MOSSY_BAMBOO_FENCE)
                .add(MOSSY_BAMBOO_FENCE_GATE)
                .add(MOSSY_BAMBOO_PRESSURE_PLATE)
                .add(MOSSY_BAMBOO_BUTTON)
                .add(MOSSY_BIRCH_LOG)
                .add(MOSSY_BIRCH_WOOD)
                .add(MOSSY_BIRCH_PLANKS)
                .add(MOSSY_BIRCH_STAIRS)
                .add(MOSSY_BIRCH_SLAB)
                .add(MOSSY_BIRCH_FENCE)
                .add(MOSSY_BIRCH_FENCE_GATE)
                .add(MOSSY_BIRCH_PRESSURE_PLATE)
                .add(MOSSY_BIRCH_BUTTON)
                .add(MOSSY_CHERRY_LOG)
                .add(MOSSY_CHERRY_WOOD)
                .add(MOSSY_CHERRY_PLANKS)
                .add(MOSSY_CHERRY_STAIRS)
                .add(MOSSY_CHERRY_SLAB)
                .add(MOSSY_CHERRY_FENCE)
                .add(MOSSY_CHERRY_FENCE_GATE)
                .add(MOSSY_CHERRY_PRESSURE_PLATE)
                .add(MOSSY_CHERRY_BUTTON)
                .add(MOSSY_CRIMSON_STEM)
                .add(MOSSY_CRIMSON_HYPHAE)
                .add(MOSSY_CRIMSON_PLANKS)
                .add(MOSSY_CRIMSON_STAIRS)
                .add(MOSSY_CRIMSON_SLAB)
                .add(MOSSY_CRIMSON_FENCE)
                .add(MOSSY_CRIMSON_FENCE_GATE)
                .add(MOSSY_CRIMSON_PRESSURE_PLATE)
                .add(MOSSY_CRIMSON_BUTTON)
                .add(MOSSY_DARK_OAK_LOG)
                .add(MOSSY_DARK_OAK_WOOD)
                .add(MOSSY_DARK_OAK_PLANKS)
                .add(MOSSY_DARK_OAK_STAIRS)
                .add(MOSSY_DARK_OAK_SLAB)
                .add(MOSSY_DARK_OAK_FENCE)
                .add(MOSSY_DARK_OAK_FENCE_GATE)
                .add(MOSSY_DARK_OAK_PRESSURE_PLATE)
                .add(MOSSY_DARK_OAK_BUTTON)
                .add(MOSSY_PALE_OAK_LOG)
                .add(MOSSY_PALE_OAK_WOOD)
                .add(MOSSY_PALE_OAK_PLANKS)
                .add(MOSSY_PALE_OAK_STAIRS)
                .add(MOSSY_PALE_OAK_SLAB)
                .add(MOSSY_PALE_OAK_FENCE)
                .add(MOSSY_PALE_OAK_FENCE_GATE)
                .add(MOSSY_PALE_OAK_PRESSURE_PLATE)
                .add(MOSSY_PALE_OAK_BUTTON)
                .add(MOSSY_JUNGLE_LOG)
                .add(MOSSY_JUNGLE_WOOD)
                .add(MOSSY_JUNGLE_PLANKS)
                .add(MOSSY_JUNGLE_STAIRS)
                .add(MOSSY_JUNGLE_SLAB)
                .add(MOSSY_JUNGLE_FENCE)
                .add(MOSSY_JUNGLE_FENCE_GATE)
                .add(MOSSY_JUNGLE_PRESSURE_PLATE)
                .add(MOSSY_JUNGLE_BUTTON)
                .add(MOSSY_MANGROVE_LOG)
                .add(MOSSY_MANGROVE_WOOD)
                .add(MOSSY_MANGROVE_PLANKS)
                .add(MOSSY_MANGROVE_STAIRS)
                .add(MOSSY_MANGROVE_SLAB)
                .add(MOSSY_MANGROVE_FENCE)
                .add(MOSSY_MANGROVE_FENCE_GATE)
                .add(MOSSY_MANGROVE_PRESSURE_PLATE)
                .add(MOSSY_MANGROVE_BUTTON)
                .add(MOSSY_OAK_LOG)
                .add(MOSSY_OAK_WOOD)
                .add(MOSSY_OAK_PLANKS)
                .add(MOSSY_OAK_STAIRS)
                .add(MOSSY_OAK_SLAB)
                .add(MOSSY_OAK_FENCE)
                .add(MOSSY_OAK_FENCE_GATE)
                .add(MOSSY_OAK_PRESSURE_PLATE)
                .add(MOSSY_OAK_BUTTON)
                .add(MOSSY_SPRUCE_LOG)
                .add(MOSSY_SPRUCE_WOOD)
                .add(MOSSY_SPRUCE_PLANKS)
                .add(MOSSY_SPRUCE_STAIRS)
                .add(MOSSY_SPRUCE_SLAB)
                .add(MOSSY_SPRUCE_FENCE)
                .add(MOSSY_SPRUCE_FENCE_GATE)
                .add(MOSSY_SPRUCE_PRESSURE_PLATE)
                .add(MOSSY_SPRUCE_BUTTON)
                .add(MOSSY_WARPED_STEM)
                .add(MOSSY_WARPED_HYPHAE)
                .add(MOSSY_WARPED_PLANKS)
                .add(MOSSY_WARPED_STAIRS)
                .add(MOSSY_WARPED_SLAB)
                .add(MOSSY_WARPED_FENCE)
                .add(MOSSY_WARPED_FENCE_GATE)
                .add(MOSSY_WARPED_PRESSURE_PLATE)
                .add(MOSSY_WARPED_BUTTON)
                .add(MOSSY_TINTED_GLASS)
                .add(MOSSY_GLASS)
                .add(MOSSY_GLASS_PANE)
                .add(MOSSY_BLACK_STAINED_GLASS)
                .add(MOSSY_BLACK_STAINED_GLASS_PANE)
                .add(MOSSY_BLUE_STAINED_GLASS)
                .add(MOSSY_BLUE_STAINED_GLASS_PANE)
                .add(MOSSY_BROWN_STAINED_GLASS)
                .add(MOSSY_BROWN_STAINED_GLASS_PANE)
                .add(MOSSY_CYAN_STAINED_GLASS)
                .add(MOSSY_CYAN_STAINED_GLASS_PANE)
                .add(MOSSY_GRAY_STAINED_GLASS)
                .add(MOSSY_GRAY_STAINED_GLASS_PANE)
                .add(MOSSY_GREEN_STAINED_GLASS)
                .add(MOSSY_GREEN_STAINED_GLASS_PANE)
                .add(MOSSY_LIGHT_BLUE_STAINED_GLASS)
                .add(MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE)
                .add(MOSSY_LIGHT_GRAY_STAINED_GLASS)
                .add(MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE)
                .add(MOSSY_LIME_STAINED_GLASS)
                .add(MOSSY_LIME_STAINED_GLASS_PANE)
                .add(MOSSY_MAGENTA_STAINED_GLASS)
                .add(MOSSY_MAGENTA_STAINED_GLASS_PANE)
                .add(MOSSY_ORANGE_STAINED_GLASS)
                .add(MOSSY_ORANGE_STAINED_GLASS_PANE)
                .add(MOSSY_PINK_STAINED_GLASS)
                .add(MOSSY_PINK_STAINED_GLASS_PANE)
                .add(MOSSY_PURPLE_STAINED_GLASS)
                .add(MOSSY_PURPLE_STAINED_GLASS_PANE)
                .add(MOSSY_RED_STAINED_GLASS)
                .add(MOSSY_RED_STAINED_GLASS_PANE)
                .add(MOSSY_WHITE_STAINED_GLASS)
                .add(MOSSY_WHITE_STAINED_GLASS_PANE)
                .add(MOSSY_YELLOW_STAINED_GLASS)
                .add(MOSSY_YELLOW_STAINED_GLASS_PANE)
                .add(MOSSY_IRON_BARS)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.MOSSY_COBBLESTONE_STAIRS)
                .add(Blocks.MOSSY_COBBLESTONE_SLAB)
                .add(Blocks.MOSSY_COBBLESTONE_WALL)
                .add(Blocks.MOSSY_STONE_BRICKS)
                .add(Blocks.MOSSY_STONE_BRICK_STAIRS)
                .add(Blocks.MOSSY_STONE_BRICK_SLAB)
                .add(Blocks.MOSSY_STONE_BRICK_WALL)
                .add(Blocks.INFESTED_MOSSY_STONE_BRICKS)
                .add(INFESTED_MOSSY_CHISELED_STONE_BRICKS)
                .add(MOSSY_CHISELED_STONE_BRICKS)
                .add(MOSSY_BRICKS)
                .add(MOSSY_BRICK_SLAB)
                .add(MOSSY_BRICK_STAIRS)
                .add(MOSSY_BRICK_WALL)
                .add(MOSSY_OAK_DOOR)
                .add(MOSSY_SPRUCE_DOOR)
                .add(MOSSY_BIRCH_DOOR)
                .add(MOSSY_JUNGLE_DOOR)
                .add(MOSSY_ACACIA_DOOR)
                .add(MOSSY_DARK_OAK_DOOR)
                .add(MOSSY_PALE_OAK_DOOR)
                .add(MOSSY_MANGROVE_DOOR)
                .add(MOSSY_CHERRY_DOOR)
                .add(MOSSY_BAMBOO_DOOR)
                .add(MOSSY_CRIMSON_DOOR)
                .add(MOSSY_WARPED_DOOR)
                .add(MOSSY_IRON_DOOR)
                .add(MOSSY_OAK_TRAPDOOR)
                .add(MOSSY_SPRUCE_TRAPDOOR)
                .add(MOSSY_BIRCH_TRAPDOOR)
                .add(MOSSY_JUNGLE_TRAPDOOR)
                .add(MOSSY_ACACIA_TRAPDOOR)
                .add(MOSSY_DARK_OAK_TRAPDOOR)
                .add(MOSSY_PALE_OAK_TRAPDOOR)
                .add(MOSSY_MANGROVE_TRAPDOOR)
                .add(MOSSY_CHERRY_TRAPDOOR)
                .add(MOSSY_BAMBOO_TRAPDOOR)
                .add(MOSSY_CRIMSON_TRAPDOOR)
                .add(MOSSY_WARPED_TRAPDOOR)
                .add(MOSSY_IRON_TRAPDOOR)
                .add(MOSSY_DEEPSLATE)
                .add(MOSSY_COBBLED_DEEPSLATE)
                .add(MOSSY_COBBLED_DEEPSLATE_STAIRS)
                .add(MOSSY_COBBLED_DEEPSLATE_SLAB)
                .add(MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(MOSSY_DEEPSLATE_BRICKS)
                .add(MOSSY_DEEPSLATE_BRICK_STAIRS)
                .add(MOSSY_DEEPSLATE_BRICK_SLAB)
                .add(MOSSY_DEEPSLATE_BRICK_WALL)
                .add(MOSSY_DEEPSLATE_TILES)
                .add(MOSSY_DEEPSLATE_TILE_STAIRS)
                .add(MOSSY_DEEPSLATE_TILE_SLAB)
                .add(MOSSY_DEEPSLATE_TILE_WALL)
                .add(MOSSY_TUFF)
                .add(MOSSY_TUFF_STAIRS)
                .add(MOSSY_TUFF_SLAB)
                .add(MOSSY_TUFF_WALL)
                .add(MOSSY_TUFF_BRICKS)
                .add(MOSSY_TUFF_BRICK_STAIRS)
                .add(MOSSY_TUFF_BRICK_SLAB)
                .add(MOSSY_TUFF_BRICK_WALL);
        
        getOrCreateTagBuilder(ModBlockTags.PALE_MOSSY_BLOCKS)
                .add(PALE_MOSSY_STONE)
                .add(PALE_MOSSY_STONE_STAIRS)
                .add(PALE_MOSSY_STONE_SLAB)
                .add(PALE_MOSSY_STONE_BUTTON)
                .add(PALE_MOSSY_STONE_PRESSURE_PLATE)
                .add(PALE_MOSSY_COBBLESTONE)
                .add(PALE_MOSSY_COBBLESTONE_STAIRS)
                .add(PALE_MOSSY_COBBLESTONE_SLAB)
                .add(PALE_MOSSY_COBBLESTONE_WALL)
                .add(PALE_MOSSY_STONE_BRICKS)
                .add(PALE_MOSSY_STONE_BRICK_STAIRS)
                .add(PALE_MOSSY_STONE_BRICK_SLAB)
                .add(PALE_MOSSY_STONE_BRICK_WALL)
                .add(PALE_MOSSY_ACACIA_LOG)
                .add(PALE_MOSSY_ACACIA_WOOD)
                .add(PALE_MOSSY_ACACIA_PLANKS)
                .add(PALE_MOSSY_ACACIA_STAIRS)
                .add(PALE_MOSSY_ACACIA_SLAB)
                .add(PALE_MOSSY_ACACIA_FENCE)
                .add(PALE_MOSSY_ACACIA_FENCE_GATE)
                .add(PALE_MOSSY_ACACIA_PRESSURE_PLATE)
                .add(PALE_MOSSY_ACACIA_BUTTON)
                .add(PALE_MOSSY_BAMBOO_BLOCK)
                .add(PALE_MOSSY_BAMBOO_PLANKS)
                .add(PALE_MOSSY_BAMBOO_MOSAIC)
                .add(PALE_MOSSY_BAMBOO_MOSAIC_STAIRS)
                .add(PALE_MOSSY_BAMBOO_MOSAIC_SLAB)
                .add(PALE_MOSSY_BAMBOO_STAIRS)
                .add(PALE_MOSSY_BAMBOO_SLAB)
                .add(PALE_MOSSY_BAMBOO_FENCE)
                .add(PALE_MOSSY_BAMBOO_FENCE_GATE)
                .add(PALE_MOSSY_BAMBOO_PRESSURE_PLATE)
                .add(PALE_MOSSY_BAMBOO_BUTTON)
                .add(PALE_MOSSY_BIRCH_LOG)
                .add(PALE_MOSSY_BIRCH_WOOD)
                .add(PALE_MOSSY_BIRCH_PLANKS)
                .add(PALE_MOSSY_BIRCH_STAIRS)
                .add(PALE_MOSSY_BIRCH_SLAB)
                .add(PALE_MOSSY_BIRCH_FENCE)
                .add(PALE_MOSSY_BIRCH_FENCE_GATE)
                .add(PALE_MOSSY_BIRCH_PRESSURE_PLATE)
                .add(PALE_MOSSY_BIRCH_BUTTON)
                .add(PALE_MOSSY_CHERRY_LOG)
                .add(PALE_MOSSY_CHERRY_WOOD)
                .add(PALE_MOSSY_CHERRY_PLANKS)
                .add(PALE_MOSSY_CHERRY_STAIRS)
                .add(PALE_MOSSY_CHERRY_SLAB)
                .add(PALE_MOSSY_CHERRY_FENCE)
                .add(PALE_MOSSY_CHERRY_FENCE_GATE)
                .add(PALE_MOSSY_CHERRY_PRESSURE_PLATE)
                .add(PALE_MOSSY_CHERRY_BUTTON)
                .add(PALE_MOSSY_CRIMSON_STEM)
                .add(PALE_MOSSY_CRIMSON_HYPHAE)
                .add(PALE_MOSSY_CRIMSON_PLANKS)
                .add(PALE_MOSSY_CRIMSON_STAIRS)
                .add(PALE_MOSSY_CRIMSON_SLAB)
                .add(PALE_MOSSY_CRIMSON_FENCE)
                .add(PALE_MOSSY_CRIMSON_FENCE_GATE)
                .add(PALE_MOSSY_CRIMSON_PRESSURE_PLATE)
                .add(PALE_MOSSY_CRIMSON_BUTTON)
                .add(PALE_MOSSY_DARK_OAK_LOG)
                .add(PALE_MOSSY_DARK_OAK_WOOD)
                .add(PALE_MOSSY_DARK_OAK_PLANKS)
                .add(PALE_MOSSY_DARK_OAK_STAIRS)
                .add(PALE_MOSSY_DARK_OAK_SLAB)
                .add(PALE_MOSSY_DARK_OAK_FENCE)
                .add(PALE_MOSSY_DARK_OAK_FENCE_GATE)
                .add(PALE_MOSSY_DARK_OAK_PRESSURE_PLATE)
                .add(PALE_MOSSY_DARK_OAK_BUTTON)
                .add(PALE_MOSSY_PALE_OAK_LOG)
                .add(PALE_MOSSY_PALE_OAK_WOOD)
                .add(PALE_MOSSY_PALE_OAK_PLANKS)
                .add(PALE_MOSSY_PALE_OAK_STAIRS)
                .add(PALE_MOSSY_PALE_OAK_SLAB)
                .add(PALE_MOSSY_PALE_OAK_FENCE)
                .add(PALE_MOSSY_PALE_OAK_FENCE_GATE)
                .add(PALE_MOSSY_PALE_OAK_PRESSURE_PLATE)
                .add(PALE_MOSSY_PALE_OAK_BUTTON)
                .add(PALE_MOSSY_JUNGLE_LOG)
                .add(PALE_MOSSY_JUNGLE_WOOD)
                .add(PALE_MOSSY_JUNGLE_PLANKS)
                .add(PALE_MOSSY_JUNGLE_STAIRS)
                .add(PALE_MOSSY_JUNGLE_SLAB)
                .add(PALE_MOSSY_JUNGLE_FENCE)
                .add(PALE_MOSSY_JUNGLE_FENCE_GATE)
                .add(PALE_MOSSY_JUNGLE_PRESSURE_PLATE)
                .add(PALE_MOSSY_JUNGLE_BUTTON)
                .add(PALE_MOSSY_MANGROVE_LOG)
                .add(PALE_MOSSY_MANGROVE_WOOD)
                .add(PALE_MOSSY_MANGROVE_PLANKS)
                .add(PALE_MOSSY_MANGROVE_STAIRS)
                .add(PALE_MOSSY_MANGROVE_SLAB)
                .add(PALE_MOSSY_MANGROVE_FENCE)
                .add(PALE_MOSSY_MANGROVE_FENCE_GATE)
                .add(PALE_MOSSY_MANGROVE_PRESSURE_PLATE)
                .add(PALE_MOSSY_MANGROVE_BUTTON)
                .add(PALE_MOSSY_OAK_LOG)
                .add(PALE_MOSSY_OAK_WOOD)
                .add(PALE_MOSSY_OAK_PLANKS)
                .add(PALE_MOSSY_OAK_STAIRS)
                .add(PALE_MOSSY_OAK_SLAB)
                .add(PALE_MOSSY_OAK_FENCE)
                .add(PALE_MOSSY_OAK_FENCE_GATE)
                .add(PALE_MOSSY_OAK_PRESSURE_PLATE)
                .add(PALE_MOSSY_OAK_BUTTON)
                .add(PALE_MOSSY_SPRUCE_LOG)
                .add(PALE_MOSSY_SPRUCE_WOOD)
                .add(PALE_MOSSY_SPRUCE_PLANKS)
                .add(PALE_MOSSY_SPRUCE_STAIRS)
                .add(PALE_MOSSY_SPRUCE_SLAB)
                .add(PALE_MOSSY_SPRUCE_FENCE)
                .add(PALE_MOSSY_SPRUCE_FENCE_GATE)
                .add(PALE_MOSSY_SPRUCE_PRESSURE_PLATE)
                .add(PALE_MOSSY_SPRUCE_BUTTON)
                .add(PALE_MOSSY_WARPED_STEM)
                .add(PALE_MOSSY_WARPED_HYPHAE)
                .add(PALE_MOSSY_WARPED_PLANKS)
                .add(PALE_MOSSY_WARPED_STAIRS)
                .add(PALE_MOSSY_WARPED_SLAB)
                .add(PALE_MOSSY_WARPED_FENCE)
                .add(PALE_MOSSY_WARPED_FENCE_GATE)
                .add(PALE_MOSSY_WARPED_PRESSURE_PLATE)
                .add(PALE_MOSSY_WARPED_BUTTON)
                .add(PALE_MOSSY_TINTED_GLASS)
                .add(PALE_MOSSY_GLASS)
                .add(PALE_MOSSY_GLASS_PANE)
                .add(PALE_MOSSY_BLACK_STAINED_GLASS)
                .add(PALE_MOSSY_BLACK_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_BLUE_STAINED_GLASS)
                .add(PALE_MOSSY_BLUE_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_BROWN_STAINED_GLASS)
                .add(PALE_MOSSY_BROWN_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_CYAN_STAINED_GLASS)
                .add(PALE_MOSSY_CYAN_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_GRAY_STAINED_GLASS)
                .add(PALE_MOSSY_GRAY_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_GREEN_STAINED_GLASS)
                .add(PALE_MOSSY_GREEN_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS)
                .add(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS)
                .add(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_LIME_STAINED_GLASS)
                .add(PALE_MOSSY_LIME_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_MAGENTA_STAINED_GLASS)
                .add(PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_ORANGE_STAINED_GLASS)
                .add(PALE_MOSSY_ORANGE_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_PINK_STAINED_GLASS)
                .add(PALE_MOSSY_PINK_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_PURPLE_STAINED_GLASS)
                .add(PALE_MOSSY_PURPLE_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_RED_STAINED_GLASS)
                .add(PALE_MOSSY_RED_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_WHITE_STAINED_GLASS)
                .add(PALE_MOSSY_WHITE_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_YELLOW_STAINED_GLASS)
                .add(PALE_MOSSY_YELLOW_STAINED_GLASS_PANE)
                .add(PALE_MOSSY_IRON_BARS)
                .add(PALE_MOSSY_COBBLESTONE)
                .add(PALE_MOSSY_COBBLESTONE_STAIRS)
                .add(PALE_MOSSY_COBBLESTONE_SLAB)
                .add(PALE_MOSSY_COBBLESTONE_WALL)
                .add(PALE_MOSSY_STONE_BRICKS)
                .add(PALE_MOSSY_STONE_BRICK_STAIRS)
                .add(PALE_MOSSY_STONE_BRICK_SLAB)
                .add(PALE_MOSSY_STONE_BRICK_WALL)
                .add(PALE_MOSSY_CHISELED_STONE_BRICKS)
                .add(PALE_MOSSY_BRICKS)
                .add(PALE_MOSSY_BRICK_SLAB)
                .add(PALE_MOSSY_BRICK_STAIRS)
                .add(PALE_MOSSY_BRICK_WALL)
                .add(PALE_MOSSY_OAK_DOOR)
                .add(PALE_MOSSY_SPRUCE_DOOR)
                .add(PALE_MOSSY_BIRCH_DOOR)
                .add(PALE_MOSSY_JUNGLE_DOOR)
                .add(PALE_MOSSY_ACACIA_DOOR)
                .add(PALE_MOSSY_DARK_OAK_DOOR)
                .add(PALE_MOSSY_PALE_OAK_DOOR)
                .add(PALE_MOSSY_MANGROVE_DOOR)
                .add(PALE_MOSSY_CHERRY_DOOR)
                .add(PALE_MOSSY_BAMBOO_DOOR)
                .add(PALE_MOSSY_CRIMSON_DOOR)
                .add(PALE_MOSSY_WARPED_DOOR)
                .add(PALE_MOSSY_IRON_DOOR)
                .add(PALE_MOSSY_OAK_TRAPDOOR)
                .add(PALE_MOSSY_SPRUCE_TRAPDOOR)
                .add(PALE_MOSSY_BIRCH_TRAPDOOR)
                .add(PALE_MOSSY_JUNGLE_TRAPDOOR)
                .add(PALE_MOSSY_ACACIA_TRAPDOOR)
                .add(PALE_MOSSY_DARK_OAK_TRAPDOOR)
                .add(PALE_MOSSY_PALE_OAK_TRAPDOOR)
                .add(PALE_MOSSY_MANGROVE_TRAPDOOR)
                .add(PALE_MOSSY_CHERRY_TRAPDOOR)
                .add(PALE_MOSSY_BAMBOO_TRAPDOOR)
                .add(PALE_MOSSY_CRIMSON_TRAPDOOR)
                .add(PALE_MOSSY_WARPED_TRAPDOOR)
                .add(PALE_MOSSY_IRON_TRAPDOOR)
                .add(PALE_MOSSY_DEEPSLATE)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_SLAB)
                .add(PALE_MOSSY_COBBLED_DEEPSLATE_WALL)
                .add(PALE_MOSSY_DEEPSLATE_BRICKS)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_STAIRS)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_SLAB)
                .add(PALE_MOSSY_DEEPSLATE_BRICK_WALL)
                .add(PALE_MOSSY_DEEPSLATE_TILES)
                .add(PALE_MOSSY_DEEPSLATE_TILE_STAIRS)
                .add(PALE_MOSSY_DEEPSLATE_TILE_SLAB)
                .add(PALE_MOSSY_DEEPSLATE_TILE_WALL)
                .add(PALE_MOSSY_TUFF)
                .add(PALE_MOSSY_TUFF_STAIRS)
                .add(PALE_MOSSY_TUFF_SLAB)
                .add(PALE_MOSSY_TUFF_WALL)
                .add(PALE_MOSSY_TUFF_BRICKS)
                .add(PALE_MOSSY_TUFF_BRICK_STAIRS)
                .add(PALE_MOSSY_TUFF_BRICK_SLAB)
                .add(PALE_MOSSY_TUFF_BRICK_WALL);
    }
}