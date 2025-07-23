package com.devnemo.nemos.mossy.blocks.platform;

import com.devnemo.nemos.mossy.blocks.Constants;
import com.devnemo.nemos.mossy.blocks.NeoForgeNemosMossyBlocks;
import com.devnemo.nemos.mossy.blocks.platform.services.IRegistryHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;
import java.util.function.Supplier;

public class NeoForgeRegistryHelper implements IRegistryHelper {

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties properties) {
        return NeoForgeNemosMossyBlocks.BLOCKS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.BLOCK, id))));
    }

    @Override
    public Supplier<Block> registerBlock(String id, Function<BlockBehaviour.Properties, Block> function, Supplier<BlockBehaviour.Properties> properties) {
        return NeoForgeNemosMossyBlocks.BLOCKS.register(id, () -> function.apply(properties.get().setId(createResourceKey(Registries.BLOCK, id))));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Item.Properties properties) {
        return NeoForgeNemosMossyBlocks.ITEMS.register(id, () -> function.apply(properties.setId(createResourceKey(Registries.ITEM, id))));
    }

    @Override
    public Supplier<Item> registerItem(String id, Function<Item.Properties, Item> function, Supplier<Item.Properties> properties) {
        return NeoForgeNemosMossyBlocks.ITEMS.register(id, () -> function.apply(properties.get().setId(createResourceKey(Registries.ITEM, id))));
    }

    @Override
    public <T extends Entity> Supplier<EntityType<T>> registerEntity(String id, EntityType.Builder<T> entityTypeBuilder) {
        var resourceLocation = ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, id);
        var resourceKey = ResourceKey.create(Registries.ENTITY_TYPE, resourceLocation);

        return NeoForgeNemosMossyBlocks.ENTITIES.register(id, () -> entityTypeBuilder.build(resourceKey));
    }

    @Override
    public Supplier<SimpleParticleType> registerSimpleParticle(String id, boolean overrideLimiter) {
        return NeoForgeNemosMossyBlocks.PARTICLES.register(id, () -> new SimpleParticleType(overrideLimiter));
    }

    @Override
    public <T extends CreativeModeTab> Supplier<T> registerCreativeModeTab(String id, Supplier<T> creativeModeTab) {
        return NeoForgeNemosMossyBlocks.CREATIVE_TABS.register(id, creativeModeTab);
    }

    @Override
    public CreativeModeTab.Builder createCreativeModeTab() {
        return CreativeModeTab.builder();
    }

    @Override
    public Supplier<KeyMapping> registerKeyMapping(KeyMapping keyMapping) {
        return () -> keyMapping;
    }

    @Override
    public Supplier<Holder<Attribute>> registerAttribute(String id, Attribute attribute) {
        var deferredHolder = NeoForgeNemosMossyBlocks.ATTRIBUTE.register(id, () -> attribute);

        return () -> deferredHolder;
    }

    private static <T> ResourceKey<T> createResourceKey(ResourceKey<Registry<T>> registryResourceKey, String id) {
        return ResourceKey.create(registryResourceKey, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, id));
    }
}
