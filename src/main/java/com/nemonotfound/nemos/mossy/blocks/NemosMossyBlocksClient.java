package com.nemonotfound.nemos.mossy.blocks;

import com.nemonotfound.nemos.mossy.blocks.block.Blocks;
import com.nemonotfound.nemos.mossy.blocks.entity.ModEntityTypes;
import com.nemonotfound.nemos.mossy.blocks.particle.ModCrackParticle;
import com.nemonotfound.nemos.mossy.blocks.particle.ModParticleTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class NemosMossyBlocksClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_GLASS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BLACK_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BROWN_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_LIME_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_MAGENTA_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_ORANGE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_PURPLE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_RED_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_TINTED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_WHITE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_YELLOW_STAINED_GLASS, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_GLASS_PANE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BLACK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BROWN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_CYAN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_LIME_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_MAGENTA_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_ORANGE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_PINK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_PURPLE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_WHITE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_IRON_BARS, RenderLayer.getCutoutMipped());

		EntityRendererRegistry.register(ModEntityTypes.MOSS_BALL, FlyingItemEntityRenderer::new);

		ParticleFactoryRegistry.getInstance().register(ModParticleTypes.ITEM_MOSS_BALL, new ModCrackParticle.MossBallFactory());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_JUNGLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_ACACIA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_CHERRY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_IRON_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_OAK_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_ACACIA_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_CHERRY_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_CRIMSON_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_MANGROVE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_WARPED_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.MOSSY_IRON_TRAPDOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_GLASS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BLACK_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BROWN_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_LIME_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_MAGENTA_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_ORANGE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_PURPLE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_RED_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_TINTED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_WHITE_STAINED_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_YELLOW_STAINED_GLASS, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_GLASS_PANE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BLACK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BROWN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_CYAN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_LIME_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_ORANGE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_PINK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_PURPLE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_WHITE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_IRON_BARS, RenderLayer.getCutoutMipped());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_OAK_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_JUNGLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_ACACIA_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_CHERRY_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BAMBOO_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_IRON_DOOR, RenderLayer.getCutout());

		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_OAK_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_JUNGLE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_ACACIA_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_CHERRY_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_CRIMSON_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_MANGROVE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_WARPED_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.PALE_MOSSY_IRON_TRAPDOOR, RenderLayer.getCutout());
	}
}