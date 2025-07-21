package com.devnemo.nemos.mossy.blocks.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static com.devnemo.nemos.mossy.blocks.Constants.MOD_ID;

public class NemosMossyBlockTags {

    public static final TagKey<Block> MOSSY_BLOCKS = create("mossy_blocks");
    public static final TagKey<Block> PALE_MOSSY_BLOCKS = create("pale_mossy_blocks");
    public static final TagKey<Block> CRIMSON_MOSSY_BLOCKS = create("crimson_mossy_blocks");
    public static final TagKey<Block> CRIMSON_MOSS_REPLACEABLE = create("crimson_moss_replaceable");
    public static final TagKey<Block> WARPED_MOSSY_BLOCKS = create("warped_mossy_blocks");
    public static final TagKey<Block> WARPED_MOSS_REPLACEABLE = create("warped_moss_replaceable");
    public static final TagKey<Block> FUNGUS_PLANTABLE_ON = create("fungus_plantable_on");
    public static final TagKey<Block> ROOTS_PLANTABLE_ON = create("roots_plantable_on");

    private static TagKey<Block> create(String id) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, id));
    }
}
