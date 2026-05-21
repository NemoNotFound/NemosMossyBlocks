package com.nemonotfound.nemos.mossy.blocks;

import com.nemonotfound.nemos.mossy.blocks.core.particles.NemosMossyParticleTypes;
import com.nemonotfound.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import com.nemonotfound.nemos.mossy.blocks.world.item.MossyCreativeModeTabs;
import com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems;
import com.nemonotfound.nemos.mossy.blocks.world.level.block.MossyBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosMossyBlocks implements ModInitializer {

    public static final String MOD_ID = "nemos_mossy_blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("WE WANT MORE MOSS!");

        MossyBlocks.init();
        NemosMossyEntityTypes.init();
        MossyItems.init();
        MossyCreativeModeTabs.init();
        NemosMossyParticleTypes.init();
    }
}
