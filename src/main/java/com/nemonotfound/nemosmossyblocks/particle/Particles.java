package com.nemonotfound.nemosmossyblocks.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;

public class Particles {

    public static final DefaultParticleType ITEM_MOSS_BALL = registerSimpleParticle("item_moss_ball", false);

    private static DefaultParticleType registerSimpleParticle(String path, boolean alwaysShow) {
        return Registry.register(Registry.PARTICLE_TYPE, new Identifier(MOD_ID, path), FabricParticleTypes
                .simple(alwaysShow));
    }
}
