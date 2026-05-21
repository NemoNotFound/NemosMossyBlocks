package com.nemonotfound.nemos.mossy.blocks.world.entity;

import com.nemonotfound.nemos.mossy.blocks.world.entity.projectile.MossBall;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;

public class NemosMossyEntityTypes {

    public static final EntityType<MossBall> MOSS_BALL = register("moss_ball", EntityType.Builder
            .<MossBall>of(MossBall::new, MobCategory.MISC)
            .noLootTable()
            .sized(0.25F, 0.25F)
            .clientTrackingRange(4)
            .updateInterval(10));

    public static void init() {}

    private static <T extends Entity> EntityType<T> register(String id, EntityType.Builder<T> entityTypeBuilder) {
        Identifier identifier = Identifier.fromNamespaceAndPath(MOD_ID, id);
        ResourceKey<EntityType<?>> resourceKey = ResourceKey.create(Registries.ENTITY_TYPE, identifier);

        return Registry.register(
                BuiltInRegistries.ENTITY_TYPE,
                identifier,
                entityTypeBuilder.build(resourceKey)
        );
    }
}
