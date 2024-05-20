package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-mossy-blocks-group";
    public static final List<ItemStack> items = new ArrayList<>();

    public static void registerItemGroups() {
        registerItemGroup("Nemo's Mossy Blocks", NEMOS_CARPENTRY_GROUP_ID, ModBlocks.MOSSY_STONE);
    }

    public static void registerItemGroup(String displayName, String path, Block iconBlock) {
        FabricItemGroupBuilder.create(new Identifier(MOD_ID, path))
                .icon(() -> new ItemStack(iconBlock))
                .appendItems((itemStacks) -> itemStacks.addAll(items))
                .build()
                .setName(displayName);
    }
}
