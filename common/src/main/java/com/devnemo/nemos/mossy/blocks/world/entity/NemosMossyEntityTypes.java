package com.devnemo.nemos.mossy.blocks.world.entity;

import com.devnemo.nemos.mossy.blocks.platform.Services;
import com.devnemo.nemos.mossy.blocks.world.entity.projectile.MossBall;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class NemosMossyEntityTypes {

    public static final Supplier<EntityType<MossBall>> MOSS_BALL = register("moss_ball", EntityType.Builder
            .<MossBall>of(MossBall::new, MobCategory.MISC)
            .noLootTable()
            .sized(0.25F, 0.25F)
            .clientTrackingRange(4)
            .updateInterval(10));

    public static void init() {}

    private static <T extends Entity> Supplier<EntityType<T>> register(String id, EntityType.Builder<T> entityTypeBuilder) {
        return Services.REGISTRY_HELPER.registerEntity(id, entityTypeBuilder);
    }
}
