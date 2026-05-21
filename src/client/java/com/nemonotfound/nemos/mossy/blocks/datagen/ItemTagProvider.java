package com.nemonotfound.nemos.mossy.blocks.datagen;

import com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemos.mossy.blocks.tags.NemosMossyItemTags.*;

public class ItemTagProvider extends FabricTagsProvider.ItemTagsProvider {


    public ItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider) {
        valueLookupBuilder(MOSSY_PLANKS)
                .add(MossyItems.MOSSY_ACACIA_PLANKS)
                .add(MossyItems.MOSSY_BAMBOO_PLANKS)
                .add(MossyItems.MOSSY_BIRCH_PLANKS)
                .add(MossyItems.MOSSY_CHERRY_PLANKS)
                .add(MossyItems.MOSSY_CRIMSON_PLANKS)
                .add(MossyItems.MOSSY_DARK_OAK_PLANKS)
                .add(MossyItems.MOSSY_PALE_OAK_PLANKS)
                .add(MossyItems.MOSSY_JUNGLE_PLANKS)
                .add(MossyItems.MOSSY_MANGROVE_PLANKS)
                .add(MossyItems.MOSSY_OAK_PLANKS)
                .add(MossyItems.MOSSY_SPRUCE_PLANKS)
                .add(MossyItems.MOSSY_WARPED_PLANKS);
        
        valueLookupBuilder(MOSSY_STAINED_GLASS)
                .add(MossyItems.MOSSY_BLACK_STAINED_GLASS)
                .add(MossyItems.MOSSY_BLUE_STAINED_GLASS)
                .add(MossyItems.MOSSY_BROWN_STAINED_GLASS)
                .add(MossyItems.MOSSY_CYAN_STAINED_GLASS)
                .add(MossyItems.MOSSY_GRAY_STAINED_GLASS)
                .add(MossyItems.MOSSY_GREEN_STAINED_GLASS)
                .add(MossyItems.MOSSY_LIGHT_BLUE_STAINED_GLASS)
                .add(MossyItems.MOSSY_LIGHT_GRAY_STAINED_GLASS)
                .add(MossyItems.MOSSY_LIME_STAINED_GLASS)
                .add(MossyItems.MOSSY_MAGENTA_STAINED_GLASS)
                .add(MossyItems.MOSSY_ORANGE_STAINED_GLASS)
                .add(MossyItems.MOSSY_PINK_STAINED_GLASS)
                .add(MossyItems.MOSSY_PURPLE_STAINED_GLASS)
                .add(MossyItems.MOSSY_RED_STAINED_GLASS)
                .add(MossyItems.MOSSY_WHITE_STAINED_GLASS)
                .add(MossyItems.MOSSY_YELLOW_STAINED_GLASS);

        valueLookupBuilder(MOSSY_ACACIA_WOOD)
                .add(MossyItems.MOSSY_ACACIA_LOG)
                .add(MossyItems.MOSSY_ACACIA_WOOD);
        valueLookupBuilder(MOSSY_BAMBOO_BLOCKS)
                .add(MossyItems.MOSSY_BAMBOO_BLOCK);
        valueLookupBuilder(MOSSY_BIRCH_WOOD)
                .add(MossyItems.MOSSY_BIRCH_LOG)
                .add(MossyItems.MOSSY_BIRCH_WOOD);
        valueLookupBuilder(MOSSY_CHERRY_WOOD)
                .add(MossyItems.MOSSY_CHERRY_LOG)
                .add(MossyItems.MOSSY_CHERRY_WOOD);
        valueLookupBuilder(MOSSY_CRIMSON_WOOD)
                .add(MossyItems.MOSSY_CRIMSON_STEM)
                .add(MossyItems.MOSSY_CRIMSON_HYPHAE);
        valueLookupBuilder(MOSSY_DARK_OAK_WOOD)
                .add(MossyItems.MOSSY_DARK_OAK_LOG)
                .add(MossyItems.MOSSY_DARK_OAK_WOOD);
        valueLookupBuilder(MOSSY_PALE_OAK_WOOD)
                .add(MossyItems.MOSSY_PALE_OAK_LOG)
                .add(MossyItems.MOSSY_PALE_OAK_WOOD);
        valueLookupBuilder(MOSSY_JUNGLE_WOOD)
                .add(MossyItems.MOSSY_JUNGLE_LOG)
                .add(MossyItems.MOSSY_JUNGLE_WOOD);
        valueLookupBuilder(MOSSY_MANGROVE_WOOD)
                .add(MossyItems.MOSSY_MANGROVE_LOG)
                .add(MossyItems.MOSSY_MANGROVE_WOOD);
        valueLookupBuilder(MOSSY_OAK_WOOD)
                .add(MossyItems.MOSSY_OAK_LOG)
                .add(MossyItems.MOSSY_OAK_WOOD);
        valueLookupBuilder(MOSSY_SPRUCE_WOOD)
                .add(MossyItems.MOSSY_SPRUCE_LOG)
                .add(MossyItems.MOSSY_SPRUCE_WOOD);
        valueLookupBuilder(MOSSY_WARPED_WOOD)
                .add(MossyItems.MOSSY_WARPED_STEM)
                .add(MossyItems.MOSSY_WARPED_HYPHAE);

        valueLookupBuilder(PALE_MOSSY_PLANKS)
                .add(MossyItems.PALE_MOSSY_ACACIA_PLANKS)
                .add(MossyItems.PALE_MOSSY_BAMBOO_PLANKS)
                .add(MossyItems.PALE_MOSSY_BIRCH_PLANKS)
                .add(MossyItems.PALE_MOSSY_CHERRY_PLANKS)
                .add(MossyItems.PALE_MOSSY_CRIMSON_PLANKS)
                .add(MossyItems.PALE_MOSSY_DARK_OAK_PLANKS)
                .add(MossyItems.PALE_MOSSY_PALE_OAK_PLANKS)
                .add(MossyItems.PALE_MOSSY_JUNGLE_PLANKS)
                .add(MossyItems.PALE_MOSSY_MANGROVE_PLANKS)
                .add(MossyItems.PALE_MOSSY_OAK_PLANKS)
                .add(MossyItems.PALE_MOSSY_SPRUCE_PLANKS)
                .add(MossyItems.PALE_MOSSY_WARPED_PLANKS);

        valueLookupBuilder(PALE_MOSSY_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_BLACK_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_BLUE_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_BROWN_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_CYAN_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_GRAY_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_GREEN_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_LIME_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_MAGENTA_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_ORANGE_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_PINK_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_PURPLE_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_RED_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_WHITE_STAINED_GLASS)
                .add(MossyItems.PALE_MOSSY_YELLOW_STAINED_GLASS);

        valueLookupBuilder(PALE_MOSSY_ACACIA_WOOD)
                .add(MossyItems.PALE_MOSSY_ACACIA_LOG)
                .add(MossyItems.PALE_MOSSY_ACACIA_WOOD);
        valueLookupBuilder(PALE_MOSSY_BAMBOO_BLOCKS)
                .add(MossyItems.PALE_MOSSY_BAMBOO_BLOCK);
        valueLookupBuilder(PALE_MOSSY_BIRCH_WOOD)
                .add(MossyItems.PALE_MOSSY_BIRCH_LOG)
                .add(MossyItems.PALE_MOSSY_BIRCH_WOOD);
        valueLookupBuilder(PALE_MOSSY_CHERRY_WOOD)
                .add(MossyItems.PALE_MOSSY_CHERRY_LOG)
                .add(MossyItems.PALE_MOSSY_CHERRY_WOOD);
        valueLookupBuilder(PALE_MOSSY_CRIMSON_WOOD)
                .add(MossyItems.PALE_MOSSY_CRIMSON_STEM)
                .add(MossyItems.PALE_MOSSY_CRIMSON_HYPHAE);
        valueLookupBuilder(PALE_MOSSY_DARK_OAK_WOOD)
                .add(MossyItems.PALE_MOSSY_DARK_OAK_LOG)
                .add(MossyItems.PALE_MOSSY_DARK_OAK_WOOD);
        valueLookupBuilder(PALE_MOSSY_PALE_OAK_WOOD)
                .add(MossyItems.PALE_MOSSY_PALE_OAK_LOG)
                .add(MossyItems.PALE_MOSSY_PALE_OAK_WOOD);
        valueLookupBuilder(PALE_MOSSY_JUNGLE_WOOD)
                .add(MossyItems.PALE_MOSSY_JUNGLE_LOG)
                .add(MossyItems.PALE_MOSSY_JUNGLE_WOOD);
        valueLookupBuilder(PALE_MOSSY_MANGROVE_WOOD)
                .add(MossyItems.PALE_MOSSY_MANGROVE_LOG)
                .add(MossyItems.PALE_MOSSY_MANGROVE_WOOD);
        valueLookupBuilder(PALE_MOSSY_OAK_WOOD)
                .add(MossyItems.PALE_MOSSY_OAK_LOG)
                .add(MossyItems.PALE_MOSSY_OAK_WOOD);
        valueLookupBuilder(PALE_MOSSY_SPRUCE_WOOD)
                .add(MossyItems.PALE_MOSSY_SPRUCE_LOG)
                .add(MossyItems.PALE_MOSSY_SPRUCE_WOOD);
        valueLookupBuilder(PALE_MOSSY_WARPED_WOOD)
                .add(MossyItems.PALE_MOSSY_WARPED_STEM)
                .add(MossyItems.PALE_MOSSY_WARPED_HYPHAE);

        valueLookupBuilder(CRIMSON_MOSSY_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_ACACIA_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_BAMBOO_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_BIRCH_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_CHERRY_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_CRIMSON_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_DARK_OAK_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_PALE_OAK_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_JUNGLE_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_MANGROVE_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_OAK_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_SPRUCE_PLANKS)
                .add(MossyItems.CRIMSON_MOSSY_WARPED_PLANKS);

        valueLookupBuilder(CRIMSON_MOSSY_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_BLACK_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_BLUE_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_BROWN_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_CYAN_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_GRAY_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_GREEN_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_LIME_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_MAGENTA_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_ORANGE_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_PINK_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_PURPLE_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_RED_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_WHITE_STAINED_GLASS)
                .add(MossyItems.CRIMSON_MOSSY_YELLOW_STAINED_GLASS);

        valueLookupBuilder(CRIMSON_MOSSY_ACACIA_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_ACACIA_LOG)
                .add(MossyItems.CRIMSON_MOSSY_ACACIA_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_BAMBOO_BLOCKS)
                .add(MossyItems.CRIMSON_MOSSY_BAMBOO_BLOCK);
        valueLookupBuilder(CRIMSON_MOSSY_BIRCH_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_BIRCH_LOG)
                .add(MossyItems.CRIMSON_MOSSY_BIRCH_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_CHERRY_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_CHERRY_LOG)
                .add(MossyItems.CRIMSON_MOSSY_CHERRY_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_CRIMSON_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_CRIMSON_STEM)
                .add(MossyItems.CRIMSON_MOSSY_CRIMSON_HYPHAE);
        valueLookupBuilder(CRIMSON_MOSSY_DARK_OAK_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_DARK_OAK_LOG)
                .add(MossyItems.CRIMSON_MOSSY_DARK_OAK_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_PALE_OAK_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_PALE_OAK_LOG)
                .add(MossyItems.CRIMSON_MOSSY_PALE_OAK_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_JUNGLE_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_JUNGLE_LOG)
                .add(MossyItems.CRIMSON_MOSSY_JUNGLE_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_MANGROVE_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_MANGROVE_LOG)
                .add(MossyItems.CRIMSON_MOSSY_MANGROVE_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_OAK_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_OAK_LOG)
                .add(MossyItems.CRIMSON_MOSSY_OAK_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_SPRUCE_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_SPRUCE_LOG)
                .add(MossyItems.CRIMSON_MOSSY_SPRUCE_WOOD);
        valueLookupBuilder(CRIMSON_MOSSY_WARPED_WOOD)
                .add(MossyItems.CRIMSON_MOSSY_WARPED_STEM)
                .add(MossyItems.CRIMSON_MOSSY_WARPED_HYPHAE);

        valueLookupBuilder(WARPED_MOSSY_PLANKS)
                .add(MossyItems.WARPED_MOSSY_ACACIA_PLANKS)
                .add(MossyItems.WARPED_MOSSY_BAMBOO_PLANKS)
                .add(MossyItems.WARPED_MOSSY_BIRCH_PLANKS)
                .add(MossyItems.WARPED_MOSSY_CHERRY_PLANKS)
                .add(MossyItems.WARPED_MOSSY_CRIMSON_PLANKS)
                .add(MossyItems.WARPED_MOSSY_DARK_OAK_PLANKS)
                .add(MossyItems.WARPED_MOSSY_PALE_OAK_PLANKS)
                .add(MossyItems.WARPED_MOSSY_JUNGLE_PLANKS)
                .add(MossyItems.WARPED_MOSSY_MANGROVE_PLANKS)
                .add(MossyItems.WARPED_MOSSY_OAK_PLANKS)
                .add(MossyItems.WARPED_MOSSY_SPRUCE_PLANKS)
                .add(MossyItems.WARPED_MOSSY_WARPED_PLANKS);

        valueLookupBuilder(WARPED_MOSSY_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_BLACK_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_BLUE_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_BROWN_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_CYAN_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_GRAY_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_GREEN_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_LIME_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_MAGENTA_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_ORANGE_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_PINK_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_PURPLE_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_RED_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_WHITE_STAINED_GLASS)
                .add(MossyItems.WARPED_MOSSY_YELLOW_STAINED_GLASS);

        valueLookupBuilder(WARPED_MOSSY_ACACIA_WOOD)
                .add(MossyItems.WARPED_MOSSY_ACACIA_LOG)
                .add(MossyItems.WARPED_MOSSY_ACACIA_WOOD);
        valueLookupBuilder(WARPED_MOSSY_BAMBOO_BLOCKS)
                .add(MossyItems.WARPED_MOSSY_BAMBOO_BLOCK);
        valueLookupBuilder(WARPED_MOSSY_BIRCH_WOOD)
                .add(MossyItems.WARPED_MOSSY_BIRCH_LOG)
                .add(MossyItems.WARPED_MOSSY_BIRCH_WOOD);
        valueLookupBuilder(WARPED_MOSSY_CHERRY_WOOD)
                .add(MossyItems.WARPED_MOSSY_CHERRY_LOG)
                .add(MossyItems.WARPED_MOSSY_CHERRY_WOOD);
        valueLookupBuilder(WARPED_MOSSY_CRIMSON_WOOD)
                .add(MossyItems.WARPED_MOSSY_CRIMSON_STEM)
                .add(MossyItems.WARPED_MOSSY_CRIMSON_HYPHAE);
        valueLookupBuilder(WARPED_MOSSY_DARK_OAK_WOOD)
                .add(MossyItems.WARPED_MOSSY_DARK_OAK_LOG)
                .add(MossyItems.WARPED_MOSSY_DARK_OAK_WOOD);
        valueLookupBuilder(WARPED_MOSSY_PALE_OAK_WOOD)
                .add(MossyItems.WARPED_MOSSY_PALE_OAK_LOG)
                .add(MossyItems.WARPED_MOSSY_PALE_OAK_WOOD);
        valueLookupBuilder(WARPED_MOSSY_JUNGLE_WOOD)
                .add(MossyItems.WARPED_MOSSY_JUNGLE_LOG)
                .add(MossyItems.WARPED_MOSSY_JUNGLE_WOOD);
        valueLookupBuilder(WARPED_MOSSY_MANGROVE_WOOD)
                .add(MossyItems.WARPED_MOSSY_MANGROVE_LOG)
                .add(MossyItems.WARPED_MOSSY_MANGROVE_WOOD);
        valueLookupBuilder(WARPED_MOSSY_OAK_WOOD)
                .add(MossyItems.WARPED_MOSSY_OAK_LOG)
                .add(MossyItems.WARPED_MOSSY_OAK_WOOD);
        valueLookupBuilder(WARPED_MOSSY_SPRUCE_WOOD)
                .add(MossyItems.WARPED_MOSSY_SPRUCE_LOG)
                .add(MossyItems.WARPED_MOSSY_SPRUCE_WOOD);
        valueLookupBuilder(WARPED_MOSSY_WARPED_WOOD)
                .add(MossyItems.WARPED_MOSSY_WARPED_STEM)
                .add(MossyItems.WARPED_MOSSY_WARPED_HYPHAE);
    }
}
