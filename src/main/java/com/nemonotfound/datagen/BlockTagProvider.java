package com.nemonotfound.datagen;

import com.nemonotfound.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.MOSSY_ACACIA_PLANKS)
                .add(ModBlocks.MOSSY_ACACIA_STAIRS)
                .add(ModBlocks.MOSSY_ACACIA_SLAB)
                .add(ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_ACACIA_BUTTON)
                .add(ModBlocks.MOSSY_ACACIA_FENCE)
                .add(ModBlocks.MOSSY_ACACIA_FENCE_GATE)
                .add(ModBlocks.MOSSY_BAMBOO_PLANKS)
                .add(ModBlocks.MOSSY_BAMBOO_STAIRS)
                .add(ModBlocks.MOSSY_BAMBOO_SLAB)
                .add(ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_BAMBOO_BUTTON)
                .add(ModBlocks.MOSSY_BAMBOO_FENCE)
                .add(ModBlocks.MOSSY_BAMBOO_FENCE_GATE)
                .add(ModBlocks.MOSSY_BIRCH_PLANKS)
                .add(ModBlocks.MOSSY_BIRCH_STAIRS)
                .add(ModBlocks.MOSSY_BIRCH_SLAB)
                .add(ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_BIRCH_BUTTON)
                .add(ModBlocks.MOSSY_BIRCH_FENCE)
                .add(ModBlocks.MOSSY_BIRCH_FENCE_GATE)
                .add(ModBlocks.MOSSY_CHERRY_PLANKS)
                .add(ModBlocks.MOSSY_CHERRY_STAIRS)
                .add(ModBlocks.MOSSY_CHERRY_SLAB)
                .add(ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_CHERRY_BUTTON)
                .add(ModBlocks.MOSSY_CHERRY_FENCE)
                .add(ModBlocks.MOSSY_CHERRY_FENCE_GATE)
                .add(ModBlocks.MOSSY_CRIMSON_PLANKS)
                .add(ModBlocks.MOSSY_CRIMSON_STAIRS)
                .add(ModBlocks.MOSSY_CRIMSON_SLAB)
                .add(ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_CRIMSON_BUTTON)
                .add(ModBlocks.MOSSY_CRIMSON_FENCE)
                .add(ModBlocks.MOSSY_CRIMSON_FENCE_GATE)
                .add(ModBlocks.MOSSY_DARK_OAK_PLANKS)
                .add(ModBlocks.MOSSY_DARK_OAK_STAIRS)
                .add(ModBlocks.MOSSY_DARK_OAK_SLAB)
                .add(ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_DARK_OAK_BUTTON)
                .add(ModBlocks.MOSSY_DARK_OAK_FENCE)
                .add(ModBlocks.MOSSY_DARK_OAK_FENCE_GATE)
                .add(ModBlocks.MOSSY_JUNGLE_PLANKS)
                .add(ModBlocks.MOSSY_JUNGLE_STAIRS)
                .add(ModBlocks.MOSSY_JUNGLE_SLAB)
                .add(ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_JUNGLE_BUTTON)
                .add(ModBlocks.MOSSY_JUNGLE_FENCE)
                .add(ModBlocks.MOSSY_JUNGLE_FENCE_GATE)
                .add(ModBlocks.MOSSY_MANGROVE_PLANKS)
                .add(ModBlocks.MOSSY_MANGROVE_STAIRS)
                .add(ModBlocks.MOSSY_MANGROVE_SLAB)
                .add(ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_MANGROVE_BUTTON)
                .add(ModBlocks.MOSSY_MANGROVE_FENCE)
                .add(ModBlocks.MOSSY_MANGROVE_FENCE_GATE)
                .add(ModBlocks.MOSSY_OAK_PLANKS)
                .add(ModBlocks.MOSSY_OAK_STAIRS)
                .add(ModBlocks.MOSSY_OAK_SLAB)
                .add(ModBlocks.MOSSY_OAK_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_OAK_BUTTON)
                .add(ModBlocks.MOSSY_OAK_FENCE)
                .add(ModBlocks.MOSSY_OAK_FENCE_GATE)
                .add(ModBlocks.MOSSY_SPRUCE_PLANKS)
                .add(ModBlocks.MOSSY_SPRUCE_STAIRS)
                .add(ModBlocks.MOSSY_SPRUCE_SLAB)
                .add(ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_SPRUCE_BUTTON)
                .add(ModBlocks.MOSSY_SPRUCE_FENCE)
                .add(ModBlocks.MOSSY_SPRUCE_FENCE_GATE)
                .add(ModBlocks.MOSSY_WARPED_PLANKS)
                .add(ModBlocks.MOSSY_WARPED_STAIRS)
                .add(ModBlocks.MOSSY_WARPED_SLAB)
                .add(ModBlocks.MOSSY_WARPED_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_WARPED_BUTTON)
                .add(ModBlocks.MOSSY_WARPED_FENCE)
                .add(ModBlocks.MOSSY_WARPED_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_STONE)
                .add(ModBlocks.MOSSY_STONE_STAIRS)
                .add(ModBlocks.MOSSY_STONE_SLAB)
                .add(ModBlocks.MOSSY_STONE_PRESSURE_PLATE)
                .add(ModBlocks.MOSSY_STONE_BUTTON);
    }
}
