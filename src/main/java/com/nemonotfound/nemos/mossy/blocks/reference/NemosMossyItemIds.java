package com.nemonotfound.nemos.mossy.blocks.reference;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;

public class NemosMossyItemIds {

    public static final ResourceKey<Item> MOSS_BALL = create("moss_ball");
    public static final ResourceKey<Item> PALE_MOSS_BALL = create("pale_moss_ball");
    public static final ResourceKey<Item> CRIMSON_MOSS_BALL = create("crimson_moss_ball");
    public static final ResourceKey<Item> WARPED_MOSS_BALL = create("warped_moss_ball");

    private static ResourceKey<Item> create(final String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }
}
