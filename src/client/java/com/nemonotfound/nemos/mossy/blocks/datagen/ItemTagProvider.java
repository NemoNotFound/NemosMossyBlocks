package com.nemonotfound.nemos.mossy.blocks.datagen;

import com.nemonotfound.nemos.mossy.blocks.reference.NemosMossyBlockItemIds;
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
        this.tag(MOSSY_PLANKS)
                .add(NemosMossyBlockItemIds.MOSSY_ACACIA_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_BAMBOO_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_BIRCH_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_CHERRY_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_CRIMSON_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_DARK_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_PALE_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_JUNGLE_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_MANGROVE_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_SPRUCE_PLANKS.item())
                .add(NemosMossyBlockItemIds.MOSSY_WARPED_PLANKS.item());
        
        this.tag(MOSSY_STAINED_GLASS)
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.black().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.blue().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.brown().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.cyan().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.gray().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.green().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.lightBlue().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.lightGray().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.lime().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.magenta().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.orange().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.pink().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.purple().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.red().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.white().item())
                .add(NemosMossyBlockItemIds.MOSSY_STAINED_GLASS.yellow().item());

        this.tag(MOSSY_ACACIA_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_ACACIA_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_ACACIA_WOOD.item());
        this.tag(MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyBlockItemIds.MOSSY_BAMBOO_BLOCK.item());
        this.tag(MOSSY_BIRCH_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_BIRCH_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_BIRCH_WOOD.item());
        this.tag(MOSSY_CHERRY_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_CHERRY_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_CHERRY_WOOD.item());
        this.tag(MOSSY_CRIMSON_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_CRIMSON_STEM.item())
                .add(NemosMossyBlockItemIds.MOSSY_CRIMSON_HYPHAE.item());
        this.tag(MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_DARK_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_DARK_OAK_WOOD.item());
        this.tag(MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_PALE_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_PALE_OAK_WOOD.item());
        this.tag(MOSSY_JUNGLE_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_JUNGLE_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_JUNGLE_WOOD.item());
        this.tag(MOSSY_MANGROVE_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_MANGROVE_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_MANGROVE_WOOD.item());
        this.tag(MOSSY_OAK_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_OAK_WOOD.item());
        this.tag(MOSSY_SPRUCE_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_SPRUCE_LOG.item())
                .add(NemosMossyBlockItemIds.MOSSY_SPRUCE_WOOD.item());
        this.tag(MOSSY_WARPED_WOOD)
                .add(NemosMossyBlockItemIds.MOSSY_WARPED_STEM.item())
                .add(NemosMossyBlockItemIds.MOSSY_WARPED_HYPHAE.item());

        this.tag(PALE_MOSSY_PLANKS)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_ACACIA_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_BAMBOO_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_BIRCH_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_CHERRY_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_CRIMSON_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_DARK_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_PALE_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_JUNGLE_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_MANGROVE_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_SPRUCE_PLANKS.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_WARPED_PLANKS.item());

        this.tag(PALE_MOSSY_STAINED_GLASS)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.black().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.blue().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.brown().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.cyan().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.gray().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.green().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.lightBlue().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.lightGray().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.lime().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.magenta().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.orange().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.pink().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.purple().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.red().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.white().item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_STAINED_GLASS.yellow().item());

        this.tag(PALE_MOSSY_ACACIA_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_ACACIA_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_ACACIA_WOOD.item());
        this.tag(PALE_MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_BAMBOO_BLOCK.item());
        this.tag(PALE_MOSSY_BIRCH_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_BIRCH_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_BIRCH_WOOD.item());
        this.tag(PALE_MOSSY_CHERRY_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_CHERRY_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_CHERRY_WOOD.item());
        this.tag(PALE_MOSSY_CRIMSON_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_CRIMSON_STEM.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_CRIMSON_HYPHAE.item());
        this.tag(PALE_MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_DARK_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_DARK_OAK_WOOD.item());
        this.tag(PALE_MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_PALE_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_PALE_OAK_WOOD.item());
        this.tag(PALE_MOSSY_JUNGLE_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_JUNGLE_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_JUNGLE_WOOD.item());
        this.tag(PALE_MOSSY_MANGROVE_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_MANGROVE_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_MANGROVE_WOOD.item());
        this.tag(PALE_MOSSY_OAK_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_OAK_WOOD.item());
        this.tag(PALE_MOSSY_SPRUCE_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_SPRUCE_LOG.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_SPRUCE_WOOD.item());
        this.tag(PALE_MOSSY_WARPED_WOOD)
                .add(NemosMossyBlockItemIds.PALE_MOSSY_WARPED_STEM.item())
                .add(NemosMossyBlockItemIds.PALE_MOSSY_WARPED_HYPHAE.item());

        this.tag(CRIMSON_MOSSY_PLANKS)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_ACACIA_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_BAMBOO_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_BIRCH_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_CHERRY_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_CRIMSON_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_DARK_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_PALE_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_JUNGLE_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_MANGROVE_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_SPRUCE_PLANKS.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_WARPED_PLANKS.item());

        this.tag(CRIMSON_MOSSY_STAINED_GLASS)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.black().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.blue().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.brown().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.cyan().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.gray().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.green().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.lightBlue().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.lightGray().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.lime().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.magenta().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.orange().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.pink().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.purple().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.red().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.white().item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_STAINED_GLASS.yellow().item());

        this.tag(CRIMSON_MOSSY_ACACIA_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_ACACIA_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_ACACIA_WOOD.item());
        this.tag(CRIMSON_MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_BAMBOO_BLOCK.item());
        this.tag(CRIMSON_MOSSY_BIRCH_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_BIRCH_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_BIRCH_WOOD.item());
        this.tag(CRIMSON_MOSSY_CHERRY_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_CHERRY_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_CHERRY_WOOD.item());
        this.tag(CRIMSON_MOSSY_CRIMSON_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_CRIMSON_STEM.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_CRIMSON_HYPHAE.item());
        this.tag(CRIMSON_MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_DARK_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_DARK_OAK_WOOD.item());
        this.tag(CRIMSON_MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_PALE_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_PALE_OAK_WOOD.item());
        this.tag(CRIMSON_MOSSY_JUNGLE_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_JUNGLE_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_JUNGLE_WOOD.item());
        this.tag(CRIMSON_MOSSY_MANGROVE_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_MANGROVE_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_MANGROVE_WOOD.item());
        this.tag(CRIMSON_MOSSY_OAK_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_OAK_WOOD.item());
        this.tag(CRIMSON_MOSSY_SPRUCE_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_SPRUCE_LOG.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_SPRUCE_WOOD.item());
        this.tag(CRIMSON_MOSSY_WARPED_WOOD)
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_WARPED_STEM.item())
                .add(NemosMossyBlockItemIds.CRIMSON_MOSSY_WARPED_HYPHAE.item());

        this.tag(WARPED_MOSSY_PLANKS)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_ACACIA_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_BAMBOO_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_BIRCH_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_CHERRY_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_CRIMSON_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_DARK_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_PALE_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_JUNGLE_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_MANGROVE_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_OAK_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_SPRUCE_PLANKS.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_WARPED_PLANKS.item());

        this.tag(WARPED_MOSSY_STAINED_GLASS)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.black().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.blue().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.brown().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.cyan().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.gray().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.green().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.lightBlue().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.lightGray().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.lime().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.magenta().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.orange().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.pink().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.purple().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.red().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.white().item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_STAINED_GLASS.yellow().item());

        this.tag(WARPED_MOSSY_ACACIA_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_ACACIA_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_ACACIA_WOOD.item());
        this.tag(WARPED_MOSSY_BAMBOO_BLOCKS)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_BAMBOO_BLOCK.item());
        this.tag(WARPED_MOSSY_BIRCH_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_BIRCH_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_BIRCH_WOOD.item());
        this.tag(WARPED_MOSSY_CHERRY_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_CHERRY_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_CHERRY_WOOD.item());
        this.tag(WARPED_MOSSY_CRIMSON_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_CRIMSON_STEM.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_CRIMSON_HYPHAE.item());
        this.tag(WARPED_MOSSY_DARK_OAK_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_DARK_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_DARK_OAK_WOOD.item());
        this.tag(WARPED_MOSSY_PALE_OAK_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_PALE_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_PALE_OAK_WOOD.item());
        this.tag(WARPED_MOSSY_JUNGLE_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_JUNGLE_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_JUNGLE_WOOD.item());
        this.tag(WARPED_MOSSY_MANGROVE_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_MANGROVE_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_MANGROVE_WOOD.item());
        this.tag(WARPED_MOSSY_OAK_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_OAK_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_OAK_WOOD.item());
        this.tag(WARPED_MOSSY_SPRUCE_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_SPRUCE_LOG.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_SPRUCE_WOOD.item());
        this.tag(WARPED_MOSSY_WARPED_WOOD)
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_WARPED_STEM.item())
                .add(NemosMossyBlockItemIds.WARPED_MOSSY_WARPED_HYPHAE.item());
    }
}
