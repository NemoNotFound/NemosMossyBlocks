package com.nemonotfound.nemos.mossy.blocks.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;

public class BlockTags {

    public static final TagKey<Block> MOSSY_BLOCKS = of("mossy_blocks");
    public static final TagKey<Block> PALE_MOSSY_BLOCKS = of("pale_mossy_blocks");
    public static final TagKey<Block> CRIMSON_MOSS_REPLACEABLE = of("crimson_moss_replaceable");
    public static final TagKey<Block> FUNGUS_PLANTABLE_ON = of("fungus_plantable_on");
    public static final TagKey<Block> ROOTS_PLANTABLE_ON = of("roots_plantable_on");

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, id));
    }
}
