package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.client.BlockStateModelGenerator.BlockTexturePool;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.block.ModBlocks.*;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockTexturePool mossyStoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_STONE);
        mossyStoneTexturePool.stairs(MOSSY_STONE_STAIRS);
        mossyStoneTexturePool.slab(MOSSY_STONE_SLAB);
        mossyStoneTexturePool.pressurePlate(MOSSY_STONE_PRESSURE_PLATE);
        mossyStoneTexturePool.button(MOSSY_STONE_BUTTON);

        BlockTexturePool mossyAcaciaPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_ACACIA_PLANKS);
        mossyAcaciaPlanksTexturePool.stairs(MOSSY_ACACIA_STAIRS);
        mossyAcaciaPlanksTexturePool.slab(MOSSY_ACACIA_SLAB);
        mossyAcaciaPlanksTexturePool.pressurePlate(MOSSY_ACACIA_PRESSURE_PLATE);
        mossyAcaciaPlanksTexturePool.button(MOSSY_ACACIA_BUTTON);
        mossyAcaciaPlanksTexturePool.fence(MOSSY_ACACIA_FENCE);
        mossyAcaciaPlanksTexturePool.fenceGate(MOSSY_ACACIA_FENCE_GATE);

        BlockTexturePool mossyBambooPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BAMBOO_PLANKS);
        mossyBambooPlanksTexturePool.stairs(MOSSY_BAMBOO_STAIRS);
        mossyBambooPlanksTexturePool.slab(MOSSY_BAMBOO_SLAB);
        mossyBambooPlanksTexturePool.pressurePlate(MOSSY_BAMBOO_PRESSURE_PLATE);
        mossyBambooPlanksTexturePool.button(MOSSY_BAMBOO_BUTTON);
        mossyBambooPlanksTexturePool.fence(MOSSY_BAMBOO_FENCE);
        mossyBambooPlanksTexturePool.fenceGate(MOSSY_BAMBOO_FENCE_GATE);

        BlockTexturePool mossyBirchPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BIRCH_PLANKS);
        mossyBirchPlanksTexturePool.stairs(MOSSY_BIRCH_STAIRS);
        mossyBirchPlanksTexturePool.slab(MOSSY_BIRCH_SLAB);
        mossyBirchPlanksTexturePool.pressurePlate(MOSSY_BIRCH_PRESSURE_PLATE);
        mossyBirchPlanksTexturePool.button(MOSSY_BIRCH_BUTTON);
        mossyBirchPlanksTexturePool.fence(MOSSY_BIRCH_FENCE);
        mossyBirchPlanksTexturePool.fenceGate(MOSSY_BIRCH_FENCE_GATE);

        BlockTexturePool mossyCherryPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_CHERRY_PLANKS);
        mossyCherryPlanksTexturePool.stairs(MOSSY_CHERRY_STAIRS);
        mossyCherryPlanksTexturePool.slab(MOSSY_CHERRY_SLAB);
        mossyCherryPlanksTexturePool.pressurePlate(MOSSY_CHERRY_PRESSURE_PLATE);
        mossyCherryPlanksTexturePool.button(MOSSY_CHERRY_BUTTON);
        mossyCherryPlanksTexturePool.fence(MOSSY_CHERRY_FENCE);
        mossyCherryPlanksTexturePool.fenceGate(MOSSY_CHERRY_FENCE_GATE);

        BlockTexturePool mossyCrimsonPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_CRIMSON_PLANKS);
        mossyCrimsonPlanksTexturePool.stairs(MOSSY_CRIMSON_STAIRS);
        mossyCrimsonPlanksTexturePool.slab(MOSSY_CRIMSON_SLAB);
        mossyCrimsonPlanksTexturePool.pressurePlate(MOSSY_CRIMSON_PRESSURE_PLATE);
        mossyCrimsonPlanksTexturePool.button(MOSSY_CRIMSON_BUTTON);
        mossyCrimsonPlanksTexturePool.fence(MOSSY_CRIMSON_FENCE);
        mossyCrimsonPlanksTexturePool.fenceGate(MOSSY_CRIMSON_FENCE_GATE);

        BlockTexturePool mossyDarkOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DARK_OAK_PLANKS);
        mossyDarkOakPlanksTexturePool.stairs(MOSSY_DARK_OAK_STAIRS);
        mossyDarkOakPlanksTexturePool.slab(MOSSY_DARK_OAK_SLAB);
        mossyDarkOakPlanksTexturePool.pressurePlate(MOSSY_DARK_OAK_PRESSURE_PLATE);
        mossyDarkOakPlanksTexturePool.button(MOSSY_DARK_OAK_BUTTON);
        mossyDarkOakPlanksTexturePool.fence(MOSSY_DARK_OAK_FENCE);
        mossyDarkOakPlanksTexturePool.fenceGate(MOSSY_DARK_OAK_FENCE_GATE);

        BlockTexturePool mossyJunglePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_JUNGLE_PLANKS);
        mossyJunglePlanksTexturePool.stairs(MOSSY_JUNGLE_STAIRS);
        mossyJunglePlanksTexturePool.slab(MOSSY_JUNGLE_SLAB);
        mossyJunglePlanksTexturePool.pressurePlate(MOSSY_JUNGLE_PRESSURE_PLATE);
        mossyJunglePlanksTexturePool.button(MOSSY_JUNGLE_BUTTON);
        mossyJunglePlanksTexturePool.fence(MOSSY_JUNGLE_FENCE);
        mossyJunglePlanksTexturePool.fenceGate(MOSSY_JUNGLE_FENCE_GATE);

        BlockTexturePool mossyMangrovePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_MANGROVE_PLANKS);
        mossyMangrovePlanksTexturePool.stairs(MOSSY_MANGROVE_STAIRS);
        mossyMangrovePlanksTexturePool.slab(MOSSY_MANGROVE_SLAB);
        mossyMangrovePlanksTexturePool.pressurePlate(MOSSY_MANGROVE_PRESSURE_PLATE);
        mossyMangrovePlanksTexturePool.button(MOSSY_MANGROVE_BUTTON);
        mossyMangrovePlanksTexturePool.fence(MOSSY_MANGROVE_FENCE);
        mossyMangrovePlanksTexturePool.fenceGate(MOSSY_MANGROVE_FENCE_GATE);

        BlockTexturePool mossyOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_OAK_PLANKS);
        mossyOakPlanksTexturePool.stairs(MOSSY_OAK_STAIRS);
        mossyOakPlanksTexturePool.slab(MOSSY_OAK_SLAB);
        mossyOakPlanksTexturePool.pressurePlate(MOSSY_OAK_PRESSURE_PLATE);
        mossyOakPlanksTexturePool.button(MOSSY_OAK_BUTTON);
        mossyOakPlanksTexturePool.fence(MOSSY_OAK_FENCE);
        mossyOakPlanksTexturePool.fenceGate(MOSSY_OAK_FENCE_GATE);

        BlockTexturePool mossySprucePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_SPRUCE_PLANKS);
        mossySprucePlanksTexturePool.stairs(MOSSY_SPRUCE_STAIRS);
        mossySprucePlanksTexturePool.slab(MOSSY_SPRUCE_SLAB);
        mossySprucePlanksTexturePool.pressurePlate(MOSSY_SPRUCE_PRESSURE_PLATE);
        mossySprucePlanksTexturePool.button(MOSSY_SPRUCE_BUTTON);
        mossySprucePlanksTexturePool.fence(MOSSY_SPRUCE_FENCE);
        mossySprucePlanksTexturePool.fenceGate(MOSSY_SPRUCE_FENCE_GATE);

        BlockTexturePool mossyWarpedPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_WARPED_PLANKS);
        mossyWarpedPlanksTexturePool.stairs(MOSSY_WARPED_STAIRS);
        mossyWarpedPlanksTexturePool.slab(MOSSY_WARPED_SLAB);
        mossyWarpedPlanksTexturePool.pressurePlate(MOSSY_WARPED_PRESSURE_PLATE);
        mossyWarpedPlanksTexturePool.button(MOSSY_WARPED_BUTTON);
        mossyWarpedPlanksTexturePool.fence(MOSSY_WARPED_FENCE);
        mossyWarpedPlanksTexturePool.fenceGate(MOSSY_WARPED_FENCE_GATE);

        BlockTexturePool mossyBambooMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BAMBOO_MOSAIC);
        mossyBambooMosaicTexturePool.stairs(MOSSY_BAMBOO_MOSAIC_STAIRS);
        mossyBambooMosaicTexturePool.slab(MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.registerGlassPane(MOSSY_GLASS, MOSSY_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_BLACK_STAINED_GLASS, MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_BLUE_STAINED_GLASS, MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_BROWN_STAINED_GLASS, MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_CYAN_STAINED_GLASS, MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_GRAY_STAINED_GLASS, MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_GREEN_STAINED_GLASS, MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_LIGHT_BLUE_STAINED_GLASS, MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_LIGHT_GRAY_STAINED_GLASS, MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_LIME_STAINED_GLASS, MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_MAGENTA_STAINED_GLASS, MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_ORANGE_STAINED_GLASS, MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_PINK_STAINED_GLASS, MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_PURPLE_STAINED_GLASS, MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_RED_STAINED_GLASS, MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_TINTED_GLASS);
        blockStateModelGenerator.registerGlassPane(MOSSY_WHITE_STAINED_GLASS, MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(MOSSY_YELLOW_STAINED_GLASS, MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.registerLog(MOSSY_ACACIA_LOG).log(MOSSY_ACACIA_LOG).wood(MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_BAMBOO_BLOCK).log(MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.registerLog(MOSSY_BIRCH_LOG).log(MOSSY_BIRCH_LOG).wood(MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_CHERRY_LOG).log(MOSSY_CHERRY_LOG).wood(MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_CRIMSON_STEM).log(MOSSY_CRIMSON_STEM).wood(MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.registerLog(MOSSY_DARK_OAK_LOG).log(MOSSY_DARK_OAK_LOG).wood(MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_JUNGLE_LOG).log(MOSSY_JUNGLE_LOG).wood(MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_MANGROVE_LOG).log(MOSSY_MANGROVE_LOG).wood(MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_OAK_LOG).log(MOSSY_OAK_LOG).wood(MOSSY_OAK_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_SPRUCE_LOG).log(MOSSY_SPRUCE_LOG).wood(MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_WARPED_STEM).stem(MOSSY_WARPED_STEM).wood(MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator);

        blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerParented(MOSSY_CHISELED_STONE_BRICKS, INFESTED_MOSSY_CHISELED_STONE_BRICKS);

        BlockTexturePool mossyBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BRICKS);
        mossyBricksTexturePool.stairs(MOSSY_BRICK_STAIRS);
        mossyBricksTexturePool.slab(MOSSY_BRICK_SLAB);
        mossyBricksTexturePool.wall(MOSSY_BRICK_WALL);

        blockStateModelGenerator.registerDoor(MOSSY_OAK_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_MANGROVE_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_BAMBOO_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_CRIMSON_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_WARPED_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_IRON_DOOR);

        blockStateModelGenerator.registerTrapdoor(MOSSY_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_ACACIA_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_IRON_TRAPDOOR);

        BlockTexturePool mossyCobbledDeepslateTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_COBBLED_DEEPSLATE);
        mossyCobbledDeepslateTexturePool.stairs(MOSSY_COBBLED_DEEPSLATE_STAIRS);
        mossyCobbledDeepslateTexturePool.slab(MOSSY_COBBLED_DEEPSLATE_SLAB);
        mossyCobbledDeepslateTexturePool.wall(MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockTexturePool mossyDeepslateBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DEEPSLATE_BRICKS);
        mossyDeepslateBricksTexturePool.stairs(MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossyDeepslateBricksTexturePool.slab(MOSSY_DEEPSLATE_BRICK_SLAB);
        mossyDeepslateBricksTexturePool.wall(MOSSY_DEEPSLATE_BRICK_WALL);

        TexturedModel texturedModel = TexturedModel.SIDE_END_WALL.get(MOSSY_DEEPSLATE);
        TextureMap textures = texturedModel.getTextures();
        Identifier baseModelId = texturedModel.getModel().upload(MOSSY_DEEPSLATE, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createDeepslateState(MOSSY_DEEPSLATE, baseModelId, textures, blockStateModelGenerator.modelCollector));

        BlockTexturePool mossyDeepslateTilesTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DEEPSLATE_TILES);
        mossyDeepslateTilesTexturePool.stairs(MOSSY_DEEPSLATE_TILE_STAIRS);
        mossyDeepslateTilesTexturePool.slab(MOSSY_DEEPSLATE_TILE_SLAB);
        mossyDeepslateTilesTexturePool.wall(MOSSY_DEEPSLATE_TILE_WALL);

        blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_TUFF);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MOSS_BALL, Models.GENERATED);
    }

    private void registerIronBars(BlockStateModelGenerator blockStateModelGenerator) {
        Identifier identifier = ModelIds.getBlockSubModelId(MOSSY_IRON_BARS, "_post_ends");
        Identifier identifier2 = ModelIds.getBlockSubModelId(MOSSY_IRON_BARS, "_post");
        Identifier identifier3 = ModelIds.getBlockSubModelId(MOSSY_IRON_BARS, "_cap");
        Identifier identifier4 = ModelIds.getBlockSubModelId(MOSSY_IRON_BARS, "_cap_alt");
        Identifier identifier5 = ModelIds.getBlockSubModelId(MOSSY_IRON_BARS, "_side");
        Identifier identifier6 = ModelIds.getBlockSubModelId(MOSSY_IRON_BARS, "_side_alt");

        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(MOSSY_IRON_BARS)
                .with(BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
                .with(When.create()
                        .set(Properties.NORTH, false).set(Properties.EAST, false)
                        .set(Properties.SOUTH, false).set(Properties.WEST, false), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, identifier2))
                .with(When.create().set(Properties.NORTH, true)
                                .set(Properties.EAST, false)
                                .set(Properties.SOUTH, false)
                                .set(Properties.WEST, false),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier3))
                .with(When.create()
                        .set(Properties.NORTH, false)
                        .set(Properties.EAST, true)
                        .set(Properties.SOUTH, false)
                        .set(Properties.WEST, false), BlockStateVariant.create().put(VariantSettings.MODEL, identifier3)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create().set(Properties.NORTH, false)
                        .set(Properties.EAST, false)
                        .set(Properties.SOUTH, true)
                        .set(Properties.WEST, false), BlockStateVariant.create().put(VariantSettings.MODEL, identifier4))
                .with(When.create()
                        .set(Properties.NORTH, false).set(Properties.EAST, false)
                        .set(Properties.SOUTH, false)
                        .set(Properties.WEST, true), BlockStateVariant.create().put(VariantSettings.MODEL, identifier4)
                        .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create()
                        .set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, identifier5))
                .with(When.create()
                        .set(Properties.EAST, true), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, identifier5).put(VariantSettings.Y, VariantSettings.Rotation.R90))
                .with(When.create()
                        .set(Properties.SOUTH, true), BlockStateVariant.create()
                        .put(VariantSettings.MODEL, identifier6))
                .with(When.create()
                                .set(Properties.WEST, true),
                        BlockStateVariant.create().put(VariantSettings.MODEL, identifier6).put(VariantSettings.Y,
                                VariantSettings.Rotation.R90)));

        blockStateModelGenerator.registerItemModel(MOSSY_IRON_BARS);
    }
}
