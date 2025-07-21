package com.devnemo.nemos.mossy.blocks.client.particle;

import com.devnemo.nemos.mossy.blocks.platform.Services;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.function.Supplier;

public class NemosMossyParticleTypes {

    public static final Supplier<SimpleParticleType> ITEM_MOSS_BALL = registerSimpleParticle("item_moss_ball", false);

    public static void init() {}

    private static  Supplier<SimpleParticleType> registerSimpleParticle(String id, boolean overrideLimiter) {
        return Services.REGISTRY_HELPER.registerSimpleParticle(id, overrideLimiter);
    }
}
