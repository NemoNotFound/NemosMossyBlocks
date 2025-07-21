package com.devnemo.nemos.mossy.blocks;

import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyCrackParticle;
import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyParticleTypes;
import com.devnemo.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import static com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks.*;

public class FabricNemosMossyBlocksClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        CommonClient.init();

        BlockRenderLayerMap.putBlock(MOSSY_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        EntityRendererRegistry.register(NemosMossyEntityTypes.MOSS_BALL.get(), ThrownItemRenderer::new);

        ParticleFactoryRegistry.getInstance().register(NemosMossyParticleTypes.ITEM_MOSS_BALL.get(), new NemosMossyCrackParticle.MossBallFactory());

        BlockRenderLayerMap.putBlock(MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(PALE_MOSSY_GLASS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(PALE_MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(PALE_MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        BlockRenderLayerMap.putBlock(PALE_MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(PALE_MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(PALE_MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_GLASS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(CRIMSON_MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(WARPED_MOSSY_GLASS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(WARPED_MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(WARPED_MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        BlockRenderLayerMap.putBlock(WARPED_MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(WARPED_MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(WARPED_MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
    }
}
