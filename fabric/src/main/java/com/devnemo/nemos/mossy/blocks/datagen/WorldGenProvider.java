package com.devnemo.nemos.mossy.blocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class WorldGenProvider extends FabricDynamicRegistryProvider {

    public WorldGenProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void configure(HolderLookup.Provider provider, Entries entries) {
        entries.addAll(provider.lookupOrThrow(Registries.CONFIGURED_FEATURE));
        entries.addAll(provider.lookupOrThrow(Registries.PLACED_FEATURE));
    }

    @Override
    public @NotNull String getName() {
        return "Nemo's Mossy Blocks World Gen";
    }
}
