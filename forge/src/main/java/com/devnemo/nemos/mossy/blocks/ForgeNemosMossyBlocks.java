package com.devnemo.nemos.mossy.blocks;

import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyCrackParticle;
import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyParticleTypes;
import com.devnemo.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.devnemo.nemos.mossy.blocks.Constants.MOD_ID;
import static com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks.*;

@Mod(MOD_ID)
public class ForgeNemosMossyBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredRegister<Attribute> ATTRIBUTE = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, MOD_ID);
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, MOD_ID);

    public ForgeNemosMossyBlocks(FMLJavaModLoadingContext context) {
        final var modBusGroup = context.getModBusGroup();
        Common.init();
        CommonClient.init();

        BLOCKS.register(modBusGroup);
        ENTITIES.register(modBusGroup);
        ITEMS.register(modBusGroup);
        CREATIVE_TABS.register(modBusGroup);
        ATTRIBUTE.register(modBusGroup);
        PARTICLES.register(modBusGroup);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEventHandler {

        @SubscribeEvent
        public static void registerParticleProviders(RegisterParticleProvidersEvent event) {
            event.registerSpecial(NemosMossyParticleTypes.ITEM_MOSS_BALL.get(), new NemosMossyCrackParticle.MossBallFactory());
        }

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
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
}