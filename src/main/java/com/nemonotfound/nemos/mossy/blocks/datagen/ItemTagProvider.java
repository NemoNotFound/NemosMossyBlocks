package com.nemonotfound.nemos.mossy.blocks.datagen;

import com.nemonotfound.nemos.mossy.blocks.block.Blocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.mossy.blocks.registry.tag.ItemTags.*;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(MOSSY_PLANKS)
                .add(Blocks.MOSSY_ACACIA_PLANKS.asItem())
                .add(Blocks.MOSSY_BAMBOO_PLANKS.asItem())
                .add(Blocks.MOSSY_BIRCH_PLANKS.asItem())
                .add(Blocks.MOSSY_CHERRY_PLANKS.asItem())
                .add(Blocks.MOSSY_CRIMSON_PLANKS.asItem())
                .add(Blocks.MOSSY_DARK_OAK_PLANKS.asItem())
                .add(Blocks.MOSSY_PALE_OAK_PLANKS.asItem())
                .add(Blocks.MOSSY_JUNGLE_PLANKS.asItem())
                .add(Blocks.MOSSY_MANGROVE_PLANKS.asItem())
                .add(Blocks.MOSSY_OAK_PLANKS.asItem())
                .add(Blocks.MOSSY_SPRUCE_PLANKS.asItem())
                .add(Blocks.MOSSY_WARPED_PLANKS.asItem());
        
        getOrCreateTagBuilder(MOSSY_STAINED_GLASS)
                .add(Blocks.MOSSY_BLACK_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_BROWN_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_CYAN_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_GREEN_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_LIGHT_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_LIGHT_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_LIME_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_MAGENTA_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_ORANGE_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_PINK_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_PURPLE_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_RED_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_WHITE_STAINED_GLASS.asItem())
                .add(Blocks.MOSSY_YELLOW_STAINED_GLASS.asItem());

        getOrCreateTagBuilder(MOSSY_ACACIA_WOOD)
                .add(Blocks.MOSSY_ACACIA_LOG.asItem())
                .add(Blocks.MOSSY_ACACIA_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_BAMBOO_BLOCKS)
                .add(Blocks.MOSSY_BAMBOO_BLOCK.asItem());
        getOrCreateTagBuilder(MOSSY_BIRCH_WOOD)
                .add(Blocks.MOSSY_BIRCH_LOG.asItem())
                .add(Blocks.MOSSY_BIRCH_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_CHERRY_WOOD)
                .add(Blocks.MOSSY_CHERRY_LOG.asItem())
                .add(Blocks.MOSSY_CHERRY_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_CRIMSON_WOOD)
                .add(Blocks.MOSSY_CRIMSON_STEM.asItem())
                .add(Blocks.MOSSY_CRIMSON_HYPHAE.asItem());
        getOrCreateTagBuilder(MOSSY_DARK_OAK_WOOD)
                .add(Blocks.MOSSY_DARK_OAK_LOG.asItem())
                .add(Blocks.MOSSY_DARK_OAK_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_PALE_OAK_WOOD)
                .add(Blocks.MOSSY_PALE_OAK_LOG.asItem())
                .add(Blocks.MOSSY_PALE_OAK_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_JUNGLE_WOOD)
                .add(Blocks.MOSSY_JUNGLE_LOG.asItem())
                .add(Blocks.MOSSY_JUNGLE_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_MANGROVE_WOOD)
                .add(Blocks.MOSSY_MANGROVE_LOG.asItem())
                .add(Blocks.MOSSY_MANGROVE_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_OAK_WOOD)
                .add(Blocks.MOSSY_OAK_LOG.asItem())
                .add(Blocks.MOSSY_OAK_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_SPRUCE_WOOD)
                .add(Blocks.MOSSY_SPRUCE_LOG.asItem())
                .add(Blocks.MOSSY_SPRUCE_WOOD.asItem());
        getOrCreateTagBuilder(MOSSY_WARPED_WOOD)
                .add(Blocks.MOSSY_WARPED_STEM.asItem())
                .add(Blocks.MOSSY_WARPED_HYPHAE.asItem());

        getOrCreateTagBuilder(PALE_MOSSY_PLANKS)
                .add(Blocks.PALE_MOSSY_ACACIA_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_BAMBOO_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_BIRCH_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_CHERRY_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_CRIMSON_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_DARK_OAK_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_PALE_OAK_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_JUNGLE_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_MANGROVE_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_OAK_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_SPRUCE_PLANKS.asItem())
                .add(Blocks.PALE_MOSSY_WARPED_PLANKS.asItem());

        getOrCreateTagBuilder(PALE_MOSSY_STAINED_GLASS)
                .add(Blocks.PALE_MOSSY_BLACK_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_BROWN_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_CYAN_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_GREEN_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_LIME_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_MAGENTA_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_ORANGE_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_PINK_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_PURPLE_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_RED_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_WHITE_STAINED_GLASS.asItem())
                .add(Blocks.PALE_MOSSY_YELLOW_STAINED_GLASS.asItem());

        getOrCreateTagBuilder(PALE_MOSSY_ACACIA_WOOD)
                .add(Blocks.PALE_MOSSY_ACACIA_LOG.asItem())
                .add(Blocks.PALE_MOSSY_ACACIA_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_BAMBOO_BLOCKS)
                .add(Blocks.PALE_MOSSY_BAMBOO_BLOCK.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_BIRCH_WOOD)
                .add(Blocks.PALE_MOSSY_BIRCH_LOG.asItem())
                .add(Blocks.PALE_MOSSY_BIRCH_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_CHERRY_WOOD)
                .add(Blocks.PALE_MOSSY_CHERRY_LOG.asItem())
                .add(Blocks.PALE_MOSSY_CHERRY_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_CRIMSON_WOOD)
                .add(Blocks.PALE_MOSSY_CRIMSON_STEM.asItem())
                .add(Blocks.PALE_MOSSY_CRIMSON_HYPHAE.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_DARK_OAK_WOOD)
                .add(Blocks.PALE_MOSSY_DARK_OAK_LOG.asItem())
                .add(Blocks.PALE_MOSSY_DARK_OAK_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_PALE_OAK_WOOD)
                .add(Blocks.PALE_MOSSY_PALE_OAK_LOG.asItem())
                .add(Blocks.PALE_MOSSY_PALE_OAK_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_JUNGLE_WOOD)
                .add(Blocks.PALE_MOSSY_JUNGLE_LOG.asItem())
                .add(Blocks.PALE_MOSSY_JUNGLE_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_MANGROVE_WOOD)
                .add(Blocks.PALE_MOSSY_MANGROVE_LOG.asItem())
                .add(Blocks.PALE_MOSSY_MANGROVE_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_OAK_WOOD)
                .add(Blocks.PALE_MOSSY_OAK_LOG.asItem())
                .add(Blocks.PALE_MOSSY_OAK_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_SPRUCE_WOOD)
                .add(Blocks.PALE_MOSSY_SPRUCE_LOG.asItem())
                .add(Blocks.PALE_MOSSY_SPRUCE_WOOD.asItem());
        getOrCreateTagBuilder(PALE_MOSSY_WARPED_WOOD)
                .add(Blocks.PALE_MOSSY_WARPED_STEM.asItem())
                .add(Blocks.PALE_MOSSY_WARPED_HYPHAE.asItem());

        getOrCreateTagBuilder(CRIMSON_MOSSY_PLANKS)
                .add(Blocks.CRIMSON_MOSSY_ACACIA_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_BAMBOO_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_BIRCH_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_CHERRY_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_CRIMSON_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_DARK_OAK_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_PALE_OAK_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_JUNGLE_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_MANGROVE_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_OAK_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_SPRUCE_PLANKS.asItem())
                .add(Blocks.CRIMSON_MOSSY_WARPED_PLANKS.asItem());

        getOrCreateTagBuilder(CRIMSON_MOSSY_STAINED_GLASS)
                .add(Blocks.CRIMSON_MOSSY_BLACK_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_BROWN_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_CYAN_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_GREEN_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_LIME_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_ORANGE_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_PINK_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_PURPLE_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_RED_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_WHITE_STAINED_GLASS.asItem())
                .add(Blocks.CRIMSON_MOSSY_YELLOW_STAINED_GLASS.asItem());

        getOrCreateTagBuilder(CRIMSON_MOSSY_ACACIA_WOOD)
                .add(Blocks.CRIMSON_MOSSY_ACACIA_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_ACACIA_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_BAMBOO_BLOCKS)
                .add(Blocks.CRIMSON_MOSSY_BAMBOO_BLOCK.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_BIRCH_WOOD)
                .add(Blocks.CRIMSON_MOSSY_BIRCH_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_BIRCH_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_CHERRY_WOOD)
                .add(Blocks.CRIMSON_MOSSY_CHERRY_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_CHERRY_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_CRIMSON_WOOD)
                .add(Blocks.CRIMSON_MOSSY_CRIMSON_STEM.asItem())
                .add(Blocks.CRIMSON_MOSSY_CRIMSON_HYPHAE.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_DARK_OAK_WOOD)
                .add(Blocks.CRIMSON_MOSSY_DARK_OAK_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_DARK_OAK_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_PALE_OAK_WOOD)
                .add(Blocks.CRIMSON_MOSSY_PALE_OAK_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_PALE_OAK_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_JUNGLE_WOOD)
                .add(Blocks.CRIMSON_MOSSY_JUNGLE_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_JUNGLE_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_MANGROVE_WOOD)
                .add(Blocks.CRIMSON_MOSSY_MANGROVE_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_MANGROVE_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_OAK_WOOD)
                .add(Blocks.CRIMSON_MOSSY_OAK_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_OAK_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_SPRUCE_WOOD)
                .add(Blocks.CRIMSON_MOSSY_SPRUCE_LOG.asItem())
                .add(Blocks.CRIMSON_MOSSY_SPRUCE_WOOD.asItem());
        getOrCreateTagBuilder(CRIMSON_MOSSY_WARPED_WOOD)
                .add(Blocks.CRIMSON_MOSSY_WARPED_STEM.asItem())
                .add(Blocks.CRIMSON_MOSSY_WARPED_HYPHAE.asItem());

        getOrCreateTagBuilder(WARPED_MOSSY_PLANKS)
                .add(Blocks.WARPED_MOSSY_ACACIA_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_BAMBOO_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_BIRCH_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_CHERRY_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_CRIMSON_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_DARK_OAK_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_PALE_OAK_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_JUNGLE_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_MANGROVE_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_OAK_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_SPRUCE_PLANKS.asItem())
                .add(Blocks.WARPED_MOSSY_WARPED_PLANKS.asItem());

        getOrCreateTagBuilder(WARPED_MOSSY_STAINED_GLASS)
                .add(Blocks.WARPED_MOSSY_BLACK_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_BROWN_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_CYAN_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_GREEN_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_LIME_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_MAGENTA_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_ORANGE_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_PINK_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_PURPLE_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_RED_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_WHITE_STAINED_GLASS.asItem())
                .add(Blocks.WARPED_MOSSY_YELLOW_STAINED_GLASS.asItem());

        getOrCreateTagBuilder(WARPED_MOSSY_ACACIA_WOOD)
                .add(Blocks.WARPED_MOSSY_ACACIA_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_ACACIA_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_BAMBOO_BLOCKS)
                .add(Blocks.WARPED_MOSSY_BAMBOO_BLOCK.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_BIRCH_WOOD)
                .add(Blocks.WARPED_MOSSY_BIRCH_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_BIRCH_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_CHERRY_WOOD)
                .add(Blocks.WARPED_MOSSY_CHERRY_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_CHERRY_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_CRIMSON_WOOD)
                .add(Blocks.WARPED_MOSSY_CRIMSON_STEM.asItem())
                .add(Blocks.WARPED_MOSSY_CRIMSON_HYPHAE.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_DARK_OAK_WOOD)
                .add(Blocks.WARPED_MOSSY_DARK_OAK_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_DARK_OAK_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_PALE_OAK_WOOD)
                .add(Blocks.WARPED_MOSSY_PALE_OAK_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_PALE_OAK_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_JUNGLE_WOOD)
                .add(Blocks.WARPED_MOSSY_JUNGLE_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_JUNGLE_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_MANGROVE_WOOD)
                .add(Blocks.WARPED_MOSSY_MANGROVE_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_MANGROVE_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_OAK_WOOD)
                .add(Blocks.WARPED_MOSSY_OAK_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_OAK_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_SPRUCE_WOOD)
                .add(Blocks.WARPED_MOSSY_SPRUCE_LOG.asItem())
                .add(Blocks.WARPED_MOSSY_SPRUCE_WOOD.asItem());
        getOrCreateTagBuilder(WARPED_MOSSY_WARPED_WOOD)
                .add(Blocks.WARPED_MOSSY_WARPED_STEM.asItem())
                .add(Blocks.WARPED_MOSSY_WARPED_HYPHAE.asItem());
    }
}
