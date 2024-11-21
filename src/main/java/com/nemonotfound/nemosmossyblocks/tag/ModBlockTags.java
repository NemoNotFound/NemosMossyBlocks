package com.nemonotfound.nemosmossyblocks.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;

public class ModBlockTags {

    public static final TagKey<Block> MOSSY_BLOCKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "mossy_blocks"));
    public static final TagKey<Block> PALE_MOSSY_BLOCKS = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, "pale_mossy_blocks"));
}
