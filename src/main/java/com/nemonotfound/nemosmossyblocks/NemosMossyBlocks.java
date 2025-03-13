package com.nemonotfound.nemosmossyblocks;

import com.nemonotfound.nemosmossyblocks.block.Blocks;
import com.nemonotfound.nemosmossyblocks.entity.ModEntityTypes;
import com.nemonotfound.nemosmossyblocks.item.ItemGroups;
import com.nemonotfound.nemosmossyblocks.item.Items;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosMossyBlocks implements ModInitializer {

	public static final String MOD_ID = "nemos-mossy-blocks";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Mossy Blocks!");
		Blocks.registerBlocks();
		Items.registerItems();
		ItemGroups.registerItemGroups();
		ModEntityTypes.registerEntities();
	}
}