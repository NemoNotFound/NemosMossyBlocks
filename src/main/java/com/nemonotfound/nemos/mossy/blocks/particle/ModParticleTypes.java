package com.nemonotfound.nemos.mossy.blocks.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.mossy.blocks.NemosMossyBlocks.MOD_ID;

public class ModParticleTypes {

    public static final SimpleParticleType ITEM_MOSS_BALL = registerSimpleParticle("item_moss_ball", false);

    private static SimpleParticleType registerSimpleParticle(String path, boolean alwaysShow) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, path), FabricParticleTypes
                .simple(alwaysShow));
    }
}
