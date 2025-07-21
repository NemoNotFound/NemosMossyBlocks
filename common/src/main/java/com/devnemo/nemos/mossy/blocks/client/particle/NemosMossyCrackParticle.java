package com.devnemo.nemos.mossy.blocks.client.particle;

import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.BreakingItemParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class NemosMossyCrackParticle extends BreakingItemParticle {

    protected NemosMossyCrackParticle(ClientLevel level, double x, double y, double z, ItemStackRenderState itemStackRenderState) {
        super(level, x, y, z, itemStackRenderState);
    }

    public static class MossBallFactory extends BreakingItemParticle.ItemParticleProvider<SimpleParticleType> {

        @Override
        public Particle createParticle(@NotNull SimpleParticleType simpleParticleType, @NotNull ClientLevel clientLevel,
                                       double d, double e, double f, double g, double h, double i) {
            return new NemosMossyCrackParticle(clientLevel, d, e, f, this.calculateState(new ItemStack(NemosMossyItems.MOSS_BALL.get()), clientLevel));
        }
    }
}
