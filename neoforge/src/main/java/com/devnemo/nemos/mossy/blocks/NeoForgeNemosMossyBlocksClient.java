package com.devnemo.nemos.mossy.blocks;

import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyCrackParticle;
import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyParticleTypes;
import com.devnemo.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

import static com.devnemo.nemos.mossy.blocks.Constants.MOD_ID;
import static com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks.*;

@Mod(value = MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public class NeoForgeNemosMossyBlocksClient {

    public NeoForgeNemosMossyBlocksClient() {
        CommonClient.init();
    }

    @SubscribeEvent
    public static void registerParticleProviders(RegisterParticleProvidersEvent event) {
        event.registerSpecial(NemosMossyParticleTypes.ITEM_MOSS_BALL.get(), new NemosMossyCrackParticle.MossBallFactory());
    }
    
    @SubscribeEvent
    public static void onClientSetuo(FMLClientSetupEvent event) {
        EntityRenderers.register(NemosMossyEntityTypes.MOSS_BALL.get(), ThrownItemRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(MOSSY_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_GLASS.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(PALE_MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_GLASS.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(CRIMSON_MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_GLASS.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BLACK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BROWN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_CYAN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_GREEN_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_LIME_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_MAGENTA_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_ORANGE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_PINK_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_PURPLE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_RED_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_TINTED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_WHITE_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_YELLOW_STAINED_GLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_GLASS_PANE.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BLACK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BROWN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_CYAN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_GREEN_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_LIME_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_MAGENTA_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_ORANGE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_PINK_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_PURPLE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_RED_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_WHITE_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_YELLOW_STAINED_GLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_IRON_BARS.get(), ChunkSectionLayer.CUTOUT_MIPPED);

        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_OAK_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_JUNGLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_ACACIA_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_CHERRY_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BAMBOO_DOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_IRON_DOOR.get(), ChunkSectionLayer.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_OAK_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_JUNGLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_ACACIA_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_CHERRY_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_BAMBOO_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_CRIMSON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_MANGROVE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_WARPED_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(WARPED_MOSSY_IRON_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
    }
}
