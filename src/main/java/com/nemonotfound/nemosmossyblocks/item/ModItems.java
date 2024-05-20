package com.nemonotfound.nemosmossyblocks.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class ModItems {

    public static final Item MOSS_BALL = registerItem("moss_ball",
            new MossBallItem(new Item.Settings().maxCount(16).group(ItemGroup.COMBAT)));

    public static void registerItems() {
        log.debug("Register items");
    }

    private static Item registerItem(String path, Item item) {
        Item registeredItem = Registry.register(Registry.ITEM, new Identifier(MOD_ID, path), item);
        ModItemGroups.items.add(new ItemStack(registeredItem));

        return item;
    }
}
