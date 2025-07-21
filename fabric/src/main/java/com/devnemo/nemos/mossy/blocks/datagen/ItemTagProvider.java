package com.devnemo.nemos.mossy.blocks.datagen;

import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

import static com.devnemo.nemos.mossy.blocks.tags.NemosMossyItemTags.*;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(MOSSY_PLANKS)
                .add(NemosMossyItems.MOSSY_ACACIA_PLANKS.get())
                .add(NemosMossyItems.MOSSY_BAMBOO_PLANKS.get())
                .add(NemosMossyItems.MOSSY_BIRCH_PLANKS.get())
                .add(NemosMossyItems.MOSSY_CHERRY_PLANKS.get())
                .add(NemosMossyItems.MOSSY_CRIMSON_PLANKS.get())
                .add(NemosMossyItems.MOSSY_DARK_OAK_PLANKS.get())
                .add(NemosMossyItems.MOSSY_PALE_OAK_PLANKS.get())
                .add(NemosMossyItems.MOSSY_JUNGLE_PLANKS.get())
                .add(NemosMossyItems.MOSSY_MANGROVE_PLANKS.get())
                .add(NemosMossyItems.MOSSY_OAK_PLANKS.get())
                .add(NemosMossyItems.MOSSY_SPRUCE_PLANKS.get())
                .add(NemosMossyItems.MOSSY_WARPED_PLANKS.get());
        
        valueLookupBuilder(MOSSY_STAINED_GLASS)
                .add(NemosMossyItems.MOSSY_BLACK_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_BROWN_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_CYAN_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_GREEN_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_LIGHT_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_LIGHT_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_LIME_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_MAGENTA_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_ORANGE_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_PINK_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_PURPLE_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_RED_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_WHITE_STAINED_GLASS.get())
                .add(NemosMossyItems.MOSSY_YELLOW_STAINED_GLASS.get());

        valueLookupBuilder(MOSSY_ACACIA_WOOD)
                .add(NemosMossyItems.MOSSY_ACACIA_LOG.get())
                .add(NemosMossyItems.MOSSY_ACACIA_WOOD.get());
        valueLookupBuilder(MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyItems.MOSSY_BAMBOO_BLOCK.get());
        valueLookupBuilder(MOSSY_BIRCH_WOOD)
                .add(NemosMossyItems.MOSSY_BIRCH_LOG.get())
                .add(NemosMossyItems.MOSSY_BIRCH_WOOD.get());
        valueLookupBuilder(MOSSY_CHERRY_WOOD)
                .add(NemosMossyItems.MOSSY_CHERRY_LOG.get())
                .add(NemosMossyItems.MOSSY_CHERRY_WOOD.get());
        valueLookupBuilder(MOSSY_CRIMSON_WOOD)
                .add(NemosMossyItems.MOSSY_CRIMSON_STEM.get())
                .add(NemosMossyItems.MOSSY_CRIMSON_HYPHAE.get());
        valueLookupBuilder(MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyItems.MOSSY_DARK_OAK_LOG.get())
                .add(NemosMossyItems.MOSSY_DARK_OAK_WOOD.get());
        valueLookupBuilder(MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyItems.MOSSY_PALE_OAK_LOG.get())
                .add(NemosMossyItems.MOSSY_PALE_OAK_WOOD.get());
        valueLookupBuilder(MOSSY_JUNGLE_WOOD)
                .add(NemosMossyItems.MOSSY_JUNGLE_LOG.get())
                .add(NemosMossyItems.MOSSY_JUNGLE_WOOD.get());
        valueLookupBuilder(MOSSY_MANGROVE_WOOD)
                .add(NemosMossyItems.MOSSY_MANGROVE_LOG.get())
                .add(NemosMossyItems.MOSSY_MANGROVE_WOOD.get());
        valueLookupBuilder(MOSSY_OAK_WOOD)
                .add(NemosMossyItems.MOSSY_OAK_LOG.get())
                .add(NemosMossyItems.MOSSY_OAK_WOOD.get());
        valueLookupBuilder(MOSSY_SPRUCE_WOOD)
                .add(NemosMossyItems.MOSSY_SPRUCE_LOG.get())
                .add(NemosMossyItems.MOSSY_SPRUCE_WOOD.get());
        valueLookupBuilder(MOSSY_WARPED_WOOD)
                .add(NemosMossyItems.MOSSY_WARPED_STEM.get())
                .add(NemosMossyItems.MOSSY_WARPED_HYPHAE.get());

        valueLookupBuilder(PALE_MOSSY_PLANKS)
                .add(NemosMossyItems.PALE_MOSSY_ACACIA_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_BAMBOO_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_BIRCH_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_CHERRY_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_CRIMSON_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_DARK_OAK_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_PALE_OAK_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_JUNGLE_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_MANGROVE_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_OAK_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_SPRUCE_PLANKS.get())
                .add(NemosMossyItems.PALE_MOSSY_WARPED_PLANKS.get());

        valueLookupBuilder(PALE_MOSSY_STAINED_GLASS)
                .add(NemosMossyItems.PALE_MOSSY_BLACK_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_BROWN_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_CYAN_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_GREEN_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_LIME_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_MAGENTA_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_ORANGE_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_PINK_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_PURPLE_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_RED_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_WHITE_STAINED_GLASS.get())
                .add(NemosMossyItems.PALE_MOSSY_YELLOW_STAINED_GLASS.get());

        valueLookupBuilder(PALE_MOSSY_ACACIA_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_ACACIA_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_ACACIA_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyItems.PALE_MOSSY_BAMBOO_BLOCK.get());
        valueLookupBuilder(PALE_MOSSY_BIRCH_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_BIRCH_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_BIRCH_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_CHERRY_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_CHERRY_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_CHERRY_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_CRIMSON_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_CRIMSON_STEM.get())
                .add(NemosMossyItems.PALE_MOSSY_CRIMSON_HYPHAE.get());
        valueLookupBuilder(PALE_MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_DARK_OAK_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_DARK_OAK_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_PALE_OAK_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_PALE_OAK_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_JUNGLE_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_JUNGLE_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_JUNGLE_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_MANGROVE_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_MANGROVE_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_MANGROVE_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_OAK_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_OAK_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_OAK_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_SPRUCE_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_SPRUCE_LOG.get())
                .add(NemosMossyItems.PALE_MOSSY_SPRUCE_WOOD.get());
        valueLookupBuilder(PALE_MOSSY_WARPED_WOOD)
                .add(NemosMossyItems.PALE_MOSSY_WARPED_STEM.get())
                .add(NemosMossyItems.PALE_MOSSY_WARPED_HYPHAE.get());

        valueLookupBuilder(CRIMSON_MOSSY_PLANKS)
                .add(NemosMossyItems.CRIMSON_MOSSY_ACACIA_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_BAMBOO_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_BIRCH_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_CHERRY_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_CRIMSON_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_PALE_OAK_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_JUNGLE_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_MANGROVE_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_OAK_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_SPRUCE_PLANKS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_WARPED_PLANKS.get());

        valueLookupBuilder(CRIMSON_MOSSY_STAINED_GLASS)
                .add(NemosMossyItems.CRIMSON_MOSSY_BLACK_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_BROWN_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_CYAN_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_GREEN_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_LIME_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_ORANGE_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_PINK_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_PURPLE_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_RED_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_WHITE_STAINED_GLASS.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_YELLOW_STAINED_GLASS.get());

        valueLookupBuilder(CRIMSON_MOSSY_ACACIA_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_ACACIA_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_ACACIA_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyItems.CRIMSON_MOSSY_BAMBOO_BLOCK.get());
        valueLookupBuilder(CRIMSON_MOSSY_BIRCH_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_BIRCH_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_BIRCH_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_CHERRY_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_CHERRY_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_CHERRY_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_CRIMSON_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_CRIMSON_STEM.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_CRIMSON_HYPHAE.get());
        valueLookupBuilder(CRIMSON_MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_DARK_OAK_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_PALE_OAK_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_PALE_OAK_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_JUNGLE_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_JUNGLE_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_JUNGLE_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_MANGROVE_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_MANGROVE_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_MANGROVE_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_OAK_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_OAK_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_OAK_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_SPRUCE_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_SPRUCE_LOG.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_SPRUCE_WOOD.get());
        valueLookupBuilder(CRIMSON_MOSSY_WARPED_WOOD)
                .add(NemosMossyItems.CRIMSON_MOSSY_WARPED_STEM.get())
                .add(NemosMossyItems.CRIMSON_MOSSY_WARPED_HYPHAE.get());

        valueLookupBuilder(WARPED_MOSSY_PLANKS)
                .add(NemosMossyItems.WARPED_MOSSY_ACACIA_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_BAMBOO_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_BIRCH_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_CHERRY_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_CRIMSON_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_DARK_OAK_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_PALE_OAK_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_JUNGLE_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_MANGROVE_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_OAK_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_SPRUCE_PLANKS.get())
                .add(NemosMossyItems.WARPED_MOSSY_WARPED_PLANKS.get());

        valueLookupBuilder(WARPED_MOSSY_STAINED_GLASS)
                .add(NemosMossyItems.WARPED_MOSSY_BLACK_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_BROWN_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_CYAN_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_GREEN_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_LIME_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_MAGENTA_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_ORANGE_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_PINK_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_PURPLE_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_RED_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_WHITE_STAINED_GLASS.get())
                .add(NemosMossyItems.WARPED_MOSSY_YELLOW_STAINED_GLASS.get());

        valueLookupBuilder(WARPED_MOSSY_ACACIA_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_ACACIA_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_ACACIA_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyItems.WARPED_MOSSY_BAMBOO_BLOCK.get());
        valueLookupBuilder(WARPED_MOSSY_BIRCH_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_BIRCH_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_BIRCH_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_CHERRY_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_CHERRY_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_CHERRY_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_CRIMSON_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_CRIMSON_STEM.get())
                .add(NemosMossyItems.WARPED_MOSSY_CRIMSON_HYPHAE.get());
        valueLookupBuilder(WARPED_MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_DARK_OAK_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_DARK_OAK_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_PALE_OAK_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_PALE_OAK_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_JUNGLE_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_JUNGLE_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_JUNGLE_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_MANGROVE_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_MANGROVE_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_MANGROVE_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_OAK_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_OAK_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_OAK_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_SPRUCE_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_SPRUCE_LOG.get())
                .add(NemosMossyItems.WARPED_MOSSY_SPRUCE_WOOD.get());
        valueLookupBuilder(WARPED_MOSSY_WARPED_WOOD)
                .add(NemosMossyItems.WARPED_MOSSY_WARPED_STEM.get())
                .add(NemosMossyItems.WARPED_MOSSY_WARPED_HYPHAE.get());
    }
}
