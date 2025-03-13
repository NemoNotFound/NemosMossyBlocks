package com.nemonotfound.nemos.mossy.blocks.entity;

import com.nemonotfound.nemos.mossy.blocks.entity.projectile.thrown.MossBallEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.log;

public class ModEntityTypes {

    public static final EntityType<MossBallEntity> MOSS_BALL = registerEntityType("moss_ball", EntityType.Builder
                    .<MossBallEntity>create(MossBallEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10));

    public static void registerEntities() {
        log.info("Registering entities");
    }

    public static <T extends Entity> EntityType<T> registerEntityType(String path, EntityType.Builder<T> entityTypeBuilder) {
        Identifier id = Identifier.of(MOD_ID, path);
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, id);

        return Registry.register(Registries.ENTITY_TYPE, key, entityTypeBuilder.build(key));
    }

}
