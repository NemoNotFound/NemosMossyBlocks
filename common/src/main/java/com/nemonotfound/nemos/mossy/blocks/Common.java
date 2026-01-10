package com.nemonotfound.nemos.mossy.blocks;

import com.nemonotfound.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import com.nemonotfound.nemos.mossy.blocks.world.item.NemosMossyCreativeModeTabs;
import com.nemonotfound.nemos.mossy.blocks.world.item.NemosMossyItems;
import com.nemonotfound.nemos.mossy.blocks.world.level.block.NemosMossyBlocks;

public class Common {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Mossy Blocks");

        NemosMossyBlocks.init();
        NemosMossyEntityTypes.init();
        NemosMossyItems.init();
        NemosMossyCreativeModeTabs.init();
    }
}