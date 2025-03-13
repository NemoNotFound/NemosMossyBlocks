package com.nemonotfound.nemos.mossy.blocks;

import com.nemonotfound.nemos.mossy.blocks.block.Blocks;
import com.nemonotfound.nemos.mossy.blocks.entity.ModEntityTypes;
import com.nemonotfound.nemos.mossy.blocks.item.ItemGroups;
import com.nemonotfound.nemos.mossy.blocks.item.Items;
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