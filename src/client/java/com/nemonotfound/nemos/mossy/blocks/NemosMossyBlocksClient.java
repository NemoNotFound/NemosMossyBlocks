package com.nemonotfound.nemos.mossy.blocks;

import com.nemonotfound.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

public class NemosMossyBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRenderers.register(NemosMossyEntityTypes.MOSS_BALL, ThrownItemRenderer::new);

        //ParticleFactoryRegistry.getInstance().register(NemosMossyParticleTypes.ITEM_MOSS_BALL.get(), new NemosMossyCrackParticle.MossBallFactory());
    }
}
