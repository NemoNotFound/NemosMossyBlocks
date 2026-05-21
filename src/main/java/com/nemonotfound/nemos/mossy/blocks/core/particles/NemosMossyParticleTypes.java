package com.nemonotfound.nemos.mossy.blocks.core.particles;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;

public class NemosMossyParticleTypes {

    public static final SimpleParticleType ITEM_MOSS_BALL = registerSimpleParticle("item_moss_ball", false);

    public static void init() {
    }

    private static SimpleParticleType registerSimpleParticle(String id, boolean overrideLimiter) {
        return Registry.register(
                BuiltInRegistries.PARTICLE_TYPE,
                Identifier.fromNamespaceAndPath(MOD_ID, id),
                FabricParticleTypes.simple(overrideLimiter)
        );
    }
}
