package com.nemonotfound.nemosmossyblocks.entity;

import com.nemonotfound.nemosmossyblocks.entity.projectile.thrown.MossBallEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class Entities {

    public static final EntityType<MossBallEntity> MOSS_BALL = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "moss_ball"), EntityType.Builder
                    .<MossBallEntity>create(MossBallEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.25f, 0.25f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
                    .build("moss_ball"));

    public static void registerEntities() {
        log.debug("Register entities");
    }

}
