package com.nemonotfound.nemos.mossy.blocks.datagen;

import com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static com.nemonotfound.nemos.mossy.blocks.world.level.block.MossyBlocks.*;
import static net.minecraft.client.data.models.BlockModelGenerators.plainModel;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider mossyStoneTexturePool = blockStateModelGenerator.family(MOSSY_STONE);
        mossyStoneTexturePool.stairs(MOSSY_STONE_STAIRS);
        mossyStoneTexturePool.slab(MOSSY_STONE_SLAB);
        mossyStoneTexturePool.pressurePlate(MOSSY_STONE_PRESSURE_PLATE);
        mossyStoneTexturePool.button(MOSSY_STONE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider mossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(MOSSY_ACACIA_PLANKS);
        mossyAcaciaPlanksTexturePool.stairs(MOSSY_ACACIA_STAIRS);
        mossyAcaciaPlanksTexturePool.slab(MOSSY_ACACIA_SLAB);
        mossyAcaciaPlanksTexturePool.pressurePlate(MOSSY_ACACIA_PRESSURE_PLATE);
        mossyAcaciaPlanksTexturePool.button(MOSSY_ACACIA_BUTTON);
        mossyAcaciaPlanksTexturePool.fence(MOSSY_ACACIA_FENCE);
        mossyAcaciaPlanksTexturePool.fenceGate(MOSSY_ACACIA_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyBambooPlanksTexturePool = blockStateModelGenerator.family(MOSSY_BAMBOO_PLANKS);
        mossyBambooPlanksTexturePool.stairs(MOSSY_BAMBOO_STAIRS);
        mossyBambooPlanksTexturePool.slab(MOSSY_BAMBOO_SLAB);
        mossyBambooPlanksTexturePool.pressurePlate(MOSSY_BAMBOO_PRESSURE_PLATE);
        mossyBambooPlanksTexturePool.button(MOSSY_BAMBOO_BUTTON);
        mossyBambooPlanksTexturePool.fence(MOSSY_BAMBOO_FENCE);
        mossyBambooPlanksTexturePool.fenceGate(MOSSY_BAMBOO_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyBirchPlanksTexturePool = blockStateModelGenerator.family(MOSSY_BIRCH_PLANKS);
        mossyBirchPlanksTexturePool.stairs(MOSSY_BIRCH_STAIRS);
        mossyBirchPlanksTexturePool.slab(MOSSY_BIRCH_SLAB);
        mossyBirchPlanksTexturePool.pressurePlate(MOSSY_BIRCH_PRESSURE_PLATE);
        mossyBirchPlanksTexturePool.button(MOSSY_BIRCH_BUTTON);
        mossyBirchPlanksTexturePool.fence(MOSSY_BIRCH_FENCE);
        mossyBirchPlanksTexturePool.fenceGate(MOSSY_BIRCH_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyCherryPlanksTexturePool = blockStateModelGenerator.family(MOSSY_CHERRY_PLANKS);
        mossyCherryPlanksTexturePool.stairs(MOSSY_CHERRY_STAIRS);
        mossyCherryPlanksTexturePool.slab(MOSSY_CHERRY_SLAB);
        mossyCherryPlanksTexturePool.pressurePlate(MOSSY_CHERRY_PRESSURE_PLATE);
        mossyCherryPlanksTexturePool.button(MOSSY_CHERRY_BUTTON);
        mossyCherryPlanksTexturePool.fence(MOSSY_CHERRY_FENCE);
        mossyCherryPlanksTexturePool.fenceGate(MOSSY_CHERRY_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(MOSSY_CRIMSON_PLANKS);
        mossyCrimsonPlanksTexturePool.stairs(MOSSY_CRIMSON_STAIRS);
        mossyCrimsonPlanksTexturePool.slab(MOSSY_CRIMSON_SLAB);
        mossyCrimsonPlanksTexturePool.pressurePlate(MOSSY_CRIMSON_PRESSURE_PLATE);
        mossyCrimsonPlanksTexturePool.button(MOSSY_CRIMSON_BUTTON);
        mossyCrimsonPlanksTexturePool.fence(MOSSY_CRIMSON_FENCE);
        mossyCrimsonPlanksTexturePool.fenceGate(MOSSY_CRIMSON_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(MOSSY_DARK_OAK_PLANKS);
        mossyDarkOakPlanksTexturePool.stairs(MOSSY_DARK_OAK_STAIRS);
        mossyDarkOakPlanksTexturePool.slab(MOSSY_DARK_OAK_SLAB);
        mossyDarkOakPlanksTexturePool.pressurePlate(MOSSY_DARK_OAK_PRESSURE_PLATE);
        mossyDarkOakPlanksTexturePool.button(MOSSY_DARK_OAK_BUTTON);
        mossyDarkOakPlanksTexturePool.fence(MOSSY_DARK_OAK_FENCE);
        mossyDarkOakPlanksTexturePool.fenceGate(MOSSY_DARK_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(MOSSY_PALE_OAK_PLANKS);
        mossyPaleOakPlanksTexturePool.stairs(MOSSY_PALE_OAK_STAIRS);
        mossyPaleOakPlanksTexturePool.slab(MOSSY_PALE_OAK_SLAB);
        mossyPaleOakPlanksTexturePool.pressurePlate(MOSSY_PALE_OAK_PRESSURE_PLATE);
        mossyPaleOakPlanksTexturePool.button(MOSSY_PALE_OAK_BUTTON);
        mossyPaleOakPlanksTexturePool.fence(MOSSY_PALE_OAK_FENCE);
        mossyPaleOakPlanksTexturePool.fenceGate(MOSSY_PALE_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyJunglePlanksTexturePool = blockStateModelGenerator.family(MOSSY_JUNGLE_PLANKS);
        mossyJunglePlanksTexturePool.stairs(MOSSY_JUNGLE_STAIRS);
        mossyJunglePlanksTexturePool.slab(MOSSY_JUNGLE_SLAB);
        mossyJunglePlanksTexturePool.pressurePlate(MOSSY_JUNGLE_PRESSURE_PLATE);
        mossyJunglePlanksTexturePool.button(MOSSY_JUNGLE_BUTTON);
        mossyJunglePlanksTexturePool.fence(MOSSY_JUNGLE_FENCE);
        mossyJunglePlanksTexturePool.fenceGate(MOSSY_JUNGLE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyMangrovePlanksTexturePool = blockStateModelGenerator.family(MOSSY_MANGROVE_PLANKS);
        mossyMangrovePlanksTexturePool.stairs(MOSSY_MANGROVE_STAIRS);
        mossyMangrovePlanksTexturePool.slab(MOSSY_MANGROVE_SLAB);
        mossyMangrovePlanksTexturePool.pressurePlate(MOSSY_MANGROVE_PRESSURE_PLATE);
        mossyMangrovePlanksTexturePool.button(MOSSY_MANGROVE_BUTTON);
        mossyMangrovePlanksTexturePool.fence(MOSSY_MANGROVE_FENCE);
        mossyMangrovePlanksTexturePool.fenceGate(MOSSY_MANGROVE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyOakPlanksTexturePool = blockStateModelGenerator.family(MOSSY_OAK_PLANKS);
        mossyOakPlanksTexturePool.stairs(MOSSY_OAK_STAIRS);
        mossyOakPlanksTexturePool.slab(MOSSY_OAK_SLAB);
        mossyOakPlanksTexturePool.pressurePlate(MOSSY_OAK_PRESSURE_PLATE);
        mossyOakPlanksTexturePool.button(MOSSY_OAK_BUTTON);
        mossyOakPlanksTexturePool.fence(MOSSY_OAK_FENCE);
        mossyOakPlanksTexturePool.fenceGate(MOSSY_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossySprucePlanksTexturePool = blockStateModelGenerator.family(MOSSY_SPRUCE_PLANKS);
        mossySprucePlanksTexturePool.stairs(MOSSY_SPRUCE_STAIRS);
        mossySprucePlanksTexturePool.slab(MOSSY_SPRUCE_SLAB);
        mossySprucePlanksTexturePool.pressurePlate(MOSSY_SPRUCE_PRESSURE_PLATE);
        mossySprucePlanksTexturePool.button(MOSSY_SPRUCE_BUTTON);
        mossySprucePlanksTexturePool.fence(MOSSY_SPRUCE_FENCE);
        mossySprucePlanksTexturePool.fenceGate(MOSSY_SPRUCE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyWarpedPlanksTexturePool = blockStateModelGenerator.family(MOSSY_WARPED_PLANKS);
        mossyWarpedPlanksTexturePool.stairs(MOSSY_WARPED_STAIRS);
        mossyWarpedPlanksTexturePool.slab(MOSSY_WARPED_SLAB);
        mossyWarpedPlanksTexturePool.pressurePlate(MOSSY_WARPED_PRESSURE_PLATE);
        mossyWarpedPlanksTexturePool.button(MOSSY_WARPED_BUTTON);
        mossyWarpedPlanksTexturePool.fence(MOSSY_WARPED_FENCE);
        mossyWarpedPlanksTexturePool.fenceGate(MOSSY_WARPED_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider mossyBambooMosaicTexturePool = blockStateModelGenerator.family(MOSSY_BAMBOO_MOSAIC);
        mossyBambooMosaicTexturePool.stairs(MOSSY_BAMBOO_MOSAIC_STAIRS);
        mossyBambooMosaicTexturePool.slab(MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.createGlassBlocks(MOSSY_GLASS, MOSSY_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_BLACK_STAINED_GLASS, MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_BLUE_STAINED_GLASS, MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_BROWN_STAINED_GLASS, MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_CYAN_STAINED_GLASS, MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_GRAY_STAINED_GLASS, MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_GREEN_STAINED_GLASS, MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_LIGHT_BLUE_STAINED_GLASS, MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_LIGHT_GRAY_STAINED_GLASS, MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_LIME_STAINED_GLASS, MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_MAGENTA_STAINED_GLASS, MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_ORANGE_STAINED_GLASS, MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_PINK_STAINED_GLASS, MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_PURPLE_STAINED_GLASS, MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_RED_STAINED_GLASS, MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.family(MOSSY_TINTED_GLASS);
        blockStateModelGenerator.createGlassBlocks(MOSSY_WHITE_STAINED_GLASS, MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(MOSSY_YELLOW_STAINED_GLASS, MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.woodProvider(MOSSY_ACACIA_LOG).log(MOSSY_ACACIA_LOG).wood(MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_BAMBOO_BLOCK).log(MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.woodProvider(MOSSY_BIRCH_LOG).log(MOSSY_BIRCH_LOG).wood(MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_CHERRY_LOG).log(MOSSY_CHERRY_LOG).wood(MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_CRIMSON_STEM).log(MOSSY_CRIMSON_STEM).wood(MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.woodProvider(MOSSY_DARK_OAK_LOG).log(MOSSY_DARK_OAK_LOG).wood(MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_PALE_OAK_LOG).log(MOSSY_PALE_OAK_LOG).wood(MOSSY_PALE_OAK_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_JUNGLE_LOG).log(MOSSY_JUNGLE_LOG).wood(MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_MANGROVE_LOG).log(MOSSY_MANGROVE_LOG).wood(MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_OAK_LOG).log(MOSSY_OAK_LOG).wood(MOSSY_OAK_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_SPRUCE_LOG).log(MOSSY_SPRUCE_LOG).wood(MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.woodProvider(MOSSY_WARPED_STEM).log(MOSSY_WARPED_STEM).wood(MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator, MOSSY_IRON_BARS);

        blockStateModelGenerator.family(MOSSY_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.copyModel(MOSSY_CHISELED_STONE_BRICKS, INFESTED_MOSSY_CHISELED_STONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider mossyBricksTexturePool = blockStateModelGenerator.family(MOSSY_BRICKS);
        mossyBricksTexturePool.stairs(MOSSY_BRICK_STAIRS);
        mossyBricksTexturePool.slab(MOSSY_BRICK_SLAB);
        mossyBricksTexturePool.wall(MOSSY_BRICK_WALL);

        blockStateModelGenerator.createDoor(MOSSY_OAK_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_PALE_OAK_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_MANGROVE_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_CHERRY_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_BAMBOO_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_CRIMSON_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_WARPED_DOOR);
        blockStateModelGenerator.createDoor(MOSSY_IRON_DOOR);

        blockStateModelGenerator.createTrapdoor(MOSSY_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_ACACIA_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_PALE_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(MOSSY_IRON_TRAPDOOR);

        BlockModelGenerators.BlockFamilyProvider mossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(MOSSY_COBBLED_DEEPSLATE);
        mossyCobbledDeepslateTexturePool.stairs(MOSSY_COBBLED_DEEPSLATE_STAIRS);
        mossyCobbledDeepslateTexturePool.slab(MOSSY_COBBLED_DEEPSLATE_SLAB);
        mossyCobbledDeepslateTexturePool.wall(MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockModelGenerators.BlockFamilyProvider mossyDeepslateBricksTexturePool = blockStateModelGenerator.family(MOSSY_DEEPSLATE_BRICKS);
        mossyDeepslateBricksTexturePool.stairs(MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossyDeepslateBricksTexturePool.slab(MOSSY_DEEPSLATE_BRICK_SLAB);
        mossyDeepslateBricksTexturePool.wall(MOSSY_DEEPSLATE_BRICK_WALL);

        registerDeepslate(blockStateModelGenerator, MOSSY_DEEPSLATE);

        BlockModelGenerators.BlockFamilyProvider mossyDeepslateTilesTexturePool = blockStateModelGenerator.family(MOSSY_DEEPSLATE_TILES);
        mossyDeepslateTilesTexturePool.stairs(MOSSY_DEEPSLATE_TILE_STAIRS);
        mossyDeepslateTilesTexturePool.slab(MOSSY_DEEPSLATE_TILE_SLAB);
        mossyDeepslateTilesTexturePool.wall(MOSSY_DEEPSLATE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider mossyTuffTexturePool = blockStateModelGenerator.family(MOSSY_TUFF);
        mossyTuffTexturePool.stairs(MOSSY_TUFF_STAIRS);
        mossyTuffTexturePool.slab(MOSSY_TUFF_SLAB);
        mossyTuffTexturePool.wall(MOSSY_TUFF_WALL);

        BlockModelGenerators.BlockFamilyProvider mossyTuffBricksTexturePool = blockStateModelGenerator.family(MOSSY_TUFF_BRICKS);
        mossyTuffBricksTexturePool.stairs(MOSSY_TUFF_BRICK_STAIRS);
        mossyTuffBricksTexturePool.slab(MOSSY_TUFF_BRICK_SLAB);
        mossyTuffBricksTexturePool.wall(MOSSY_TUFF_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider paleMossyStoneTexturePool = blockStateModelGenerator.family(PALE_MOSSY_STONE);
        paleMossyStoneTexturePool.stairs(PALE_MOSSY_STONE_STAIRS);
        paleMossyStoneTexturePool.slab(PALE_MOSSY_STONE_SLAB);
        paleMossyStoneTexturePool.pressurePlate(PALE_MOSSY_STONE_PRESSURE_PLATE);
        paleMossyStoneTexturePool.button(PALE_MOSSY_STONE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider paleMossyCobblestoneTexturePool = blockStateModelGenerator.family(PALE_MOSSY_COBBLESTONE);
        paleMossyCobblestoneTexturePool.stairs(PALE_MOSSY_COBBLESTONE_STAIRS);
        paleMossyCobblestoneTexturePool.slab(PALE_MOSSY_COBBLESTONE_SLAB);
        paleMossyCobblestoneTexturePool.wall(PALE_MOSSY_COBBLESTONE_WALL);

        BlockModelGenerators.BlockFamilyProvider paleMossyStoneBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_STONE_BRICKS);
        paleMossyStoneBricksTexturePool.stairs(PALE_MOSSY_STONE_BRICK_STAIRS);
        paleMossyStoneBricksTexturePool.slab(PALE_MOSSY_STONE_BRICK_SLAB);
        paleMossyStoneBricksTexturePool.wall(PALE_MOSSY_STONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider paleMossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_ACACIA_PLANKS);
        paleMossyAcaciaPlanksTexturePool.stairs(PALE_MOSSY_ACACIA_STAIRS);
        paleMossyAcaciaPlanksTexturePool.slab(PALE_MOSSY_ACACIA_SLAB);
        paleMossyAcaciaPlanksTexturePool.pressurePlate(PALE_MOSSY_ACACIA_PRESSURE_PLATE);
        paleMossyAcaciaPlanksTexturePool.button(PALE_MOSSY_ACACIA_BUTTON);
        paleMossyAcaciaPlanksTexturePool.fence(PALE_MOSSY_ACACIA_FENCE);
        paleMossyAcaciaPlanksTexturePool.fenceGate(PALE_MOSSY_ACACIA_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyBambooPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BAMBOO_PLANKS);
        paleMossyBambooPlanksTexturePool.stairs(PALE_MOSSY_BAMBOO_STAIRS);
        paleMossyBambooPlanksTexturePool.slab(PALE_MOSSY_BAMBOO_SLAB);
        paleMossyBambooPlanksTexturePool.pressurePlate(PALE_MOSSY_BAMBOO_PRESSURE_PLATE);
        paleMossyBambooPlanksTexturePool.button(PALE_MOSSY_BAMBOO_BUTTON);
        paleMossyBambooPlanksTexturePool.fence(PALE_MOSSY_BAMBOO_FENCE);
        paleMossyBambooPlanksTexturePool.fenceGate(PALE_MOSSY_BAMBOO_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyBirchPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BIRCH_PLANKS);
        paleMossyBirchPlanksTexturePool.stairs(PALE_MOSSY_BIRCH_STAIRS);
        paleMossyBirchPlanksTexturePool.slab(PALE_MOSSY_BIRCH_SLAB);
        paleMossyBirchPlanksTexturePool.pressurePlate(PALE_MOSSY_BIRCH_PRESSURE_PLATE);
        paleMossyBirchPlanksTexturePool.button(PALE_MOSSY_BIRCH_BUTTON);
        paleMossyBirchPlanksTexturePool.fence(PALE_MOSSY_BIRCH_FENCE);
        paleMossyBirchPlanksTexturePool.fenceGate(PALE_MOSSY_BIRCH_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyCherryPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_CHERRY_PLANKS);
        paleMossyCherryPlanksTexturePool.stairs(PALE_MOSSY_CHERRY_STAIRS);
        paleMossyCherryPlanksTexturePool.slab(PALE_MOSSY_CHERRY_SLAB);
        paleMossyCherryPlanksTexturePool.pressurePlate(PALE_MOSSY_CHERRY_PRESSURE_PLATE);
        paleMossyCherryPlanksTexturePool.button(PALE_MOSSY_CHERRY_BUTTON);
        paleMossyCherryPlanksTexturePool.fence(PALE_MOSSY_CHERRY_FENCE);
        paleMossyCherryPlanksTexturePool.fenceGate(PALE_MOSSY_CHERRY_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_CRIMSON_PLANKS);
        paleMossyCrimsonPlanksTexturePool.stairs(PALE_MOSSY_CRIMSON_STAIRS);
        paleMossyCrimsonPlanksTexturePool.slab(PALE_MOSSY_CRIMSON_SLAB);
        paleMossyCrimsonPlanksTexturePool.pressurePlate(PALE_MOSSY_CRIMSON_PRESSURE_PLATE);
        paleMossyCrimsonPlanksTexturePool.button(PALE_MOSSY_CRIMSON_BUTTON);
        paleMossyCrimsonPlanksTexturePool.fence(PALE_MOSSY_CRIMSON_FENCE);
        paleMossyCrimsonPlanksTexturePool.fenceGate(PALE_MOSSY_CRIMSON_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_DARK_OAK_PLANKS);
        paleMossyDarkOakPlanksTexturePool.stairs(PALE_MOSSY_DARK_OAK_STAIRS);
        paleMossyDarkOakPlanksTexturePool.slab(PALE_MOSSY_DARK_OAK_SLAB);
        paleMossyDarkOakPlanksTexturePool.pressurePlate(PALE_MOSSY_DARK_OAK_PRESSURE_PLATE);
        paleMossyDarkOakPlanksTexturePool.button(PALE_MOSSY_DARK_OAK_BUTTON);
        paleMossyDarkOakPlanksTexturePool.fence(PALE_MOSSY_DARK_OAK_FENCE);
        paleMossyDarkOakPlanksTexturePool.fenceGate(PALE_MOSSY_DARK_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_PALE_OAK_PLANKS);
        paleMossyPaleOakPlanksTexturePool.stairs(PALE_MOSSY_PALE_OAK_STAIRS);
        paleMossyPaleOakPlanksTexturePool.slab(PALE_MOSSY_PALE_OAK_SLAB);
        paleMossyPaleOakPlanksTexturePool.pressurePlate(PALE_MOSSY_PALE_OAK_PRESSURE_PLATE);
        paleMossyPaleOakPlanksTexturePool.button(PALE_MOSSY_PALE_OAK_BUTTON);
        paleMossyPaleOakPlanksTexturePool.fence(PALE_MOSSY_PALE_OAK_FENCE);
        paleMossyPaleOakPlanksTexturePool.fenceGate(PALE_MOSSY_PALE_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyJunglePlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_JUNGLE_PLANKS);
        paleMossyJunglePlanksTexturePool.stairs(PALE_MOSSY_JUNGLE_STAIRS);
        paleMossyJunglePlanksTexturePool.slab(PALE_MOSSY_JUNGLE_SLAB);
        paleMossyJunglePlanksTexturePool.pressurePlate(PALE_MOSSY_JUNGLE_PRESSURE_PLATE);
        paleMossyJunglePlanksTexturePool.button(PALE_MOSSY_JUNGLE_BUTTON);
        paleMossyJunglePlanksTexturePool.fence(PALE_MOSSY_JUNGLE_FENCE);
        paleMossyJunglePlanksTexturePool.fenceGate(PALE_MOSSY_JUNGLE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyMangrovePlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_MANGROVE_PLANKS);
        paleMossyMangrovePlanksTexturePool.stairs(PALE_MOSSY_MANGROVE_STAIRS);
        paleMossyMangrovePlanksTexturePool.slab(PALE_MOSSY_MANGROVE_SLAB);
        paleMossyMangrovePlanksTexturePool.pressurePlate(PALE_MOSSY_MANGROVE_PRESSURE_PLATE);
        paleMossyMangrovePlanksTexturePool.button(PALE_MOSSY_MANGROVE_BUTTON);
        paleMossyMangrovePlanksTexturePool.fence(PALE_MOSSY_MANGROVE_FENCE);
        paleMossyMangrovePlanksTexturePool.fenceGate(PALE_MOSSY_MANGROVE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyOakPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_OAK_PLANKS);
        paleMossyOakPlanksTexturePool.stairs(PALE_MOSSY_OAK_STAIRS);
        paleMossyOakPlanksTexturePool.slab(PALE_MOSSY_OAK_SLAB);
        paleMossyOakPlanksTexturePool.pressurePlate(PALE_MOSSY_OAK_PRESSURE_PLATE);
        paleMossyOakPlanksTexturePool.button(PALE_MOSSY_OAK_BUTTON);
        paleMossyOakPlanksTexturePool.fence(PALE_MOSSY_OAK_FENCE);
        paleMossyOakPlanksTexturePool.fenceGate(PALE_MOSSY_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossySprucePlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_SPRUCE_PLANKS);
        paleMossySprucePlanksTexturePool.stairs(PALE_MOSSY_SPRUCE_STAIRS);
        paleMossySprucePlanksTexturePool.slab(PALE_MOSSY_SPRUCE_SLAB);
        paleMossySprucePlanksTexturePool.pressurePlate(PALE_MOSSY_SPRUCE_PRESSURE_PLATE);
        paleMossySprucePlanksTexturePool.button(PALE_MOSSY_SPRUCE_BUTTON);
        paleMossySprucePlanksTexturePool.fence(PALE_MOSSY_SPRUCE_FENCE);
        paleMossySprucePlanksTexturePool.fenceGate(PALE_MOSSY_SPRUCE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyWarpedPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_WARPED_PLANKS);
        paleMossyWarpedPlanksTexturePool.stairs(PALE_MOSSY_WARPED_STAIRS);
        paleMossyWarpedPlanksTexturePool.slab(PALE_MOSSY_WARPED_SLAB);
        paleMossyWarpedPlanksTexturePool.pressurePlate(PALE_MOSSY_WARPED_PRESSURE_PLATE);
        paleMossyWarpedPlanksTexturePool.button(PALE_MOSSY_WARPED_BUTTON);
        paleMossyWarpedPlanksTexturePool.fence(PALE_MOSSY_WARPED_FENCE);
        paleMossyWarpedPlanksTexturePool.fenceGate(PALE_MOSSY_WARPED_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyBambooMosaicTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BAMBOO_MOSAIC);
        paleMossyBambooMosaicTexturePool.stairs(PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);
        paleMossyBambooMosaicTexturePool.slab(PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_GLASS, PALE_MOSSY_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_BLACK_STAINED_GLASS, PALE_MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_BLUE_STAINED_GLASS, PALE_MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_BROWN_STAINED_GLASS, PALE_MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_CYAN_STAINED_GLASS, PALE_MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_GRAY_STAINED_GLASS, PALE_MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_GREEN_STAINED_GLASS, PALE_MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_LIME_STAINED_GLASS, PALE_MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_MAGENTA_STAINED_GLASS, PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_ORANGE_STAINED_GLASS, PALE_MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_PINK_STAINED_GLASS, PALE_MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_PURPLE_STAINED_GLASS, PALE_MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_RED_STAINED_GLASS, PALE_MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.family(PALE_MOSSY_TINTED_GLASS);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_WHITE_STAINED_GLASS, PALE_MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_YELLOW_STAINED_GLASS, PALE_MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.woodProvider(PALE_MOSSY_ACACIA_LOG).log(PALE_MOSSY_ACACIA_LOG).wood(PALE_MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_BAMBOO_BLOCK).log(PALE_MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_BIRCH_LOG).log(PALE_MOSSY_BIRCH_LOG).wood(PALE_MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_CHERRY_LOG).log(PALE_MOSSY_CHERRY_LOG).wood(PALE_MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_CRIMSON_STEM).log(PALE_MOSSY_CRIMSON_STEM).wood(PALE_MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_DARK_OAK_LOG).log(PALE_MOSSY_DARK_OAK_LOG).wood(PALE_MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_PALE_OAK_LOG).log(PALE_MOSSY_PALE_OAK_LOG).wood(PALE_MOSSY_PALE_OAK_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_JUNGLE_LOG).log(PALE_MOSSY_JUNGLE_LOG).wood(PALE_MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_MANGROVE_LOG).log(PALE_MOSSY_MANGROVE_LOG).wood(PALE_MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_OAK_LOG).log(PALE_MOSSY_OAK_LOG).wood(PALE_MOSSY_OAK_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_SPRUCE_LOG).log(PALE_MOSSY_SPRUCE_LOG).wood(PALE_MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.woodProvider(PALE_MOSSY_WARPED_STEM).log(PALE_MOSSY_WARPED_STEM).wood(PALE_MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator, PALE_MOSSY_IRON_BARS);

        blockStateModelGenerator.family(PALE_MOSSY_CHISELED_STONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider paleMossyBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BRICKS);
        paleMossyBricksTexturePool.stairs(PALE_MOSSY_BRICK_STAIRS);
        paleMossyBricksTexturePool.slab(PALE_MOSSY_BRICK_SLAB);
        paleMossyBricksTexturePool.wall(PALE_MOSSY_BRICK_WALL);

        blockStateModelGenerator.createDoor(PALE_MOSSY_OAK_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_PALE_OAK_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_MANGROVE_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_CHERRY_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_BAMBOO_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_CRIMSON_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_WARPED_DOOR);
        blockStateModelGenerator.createDoor(PALE_MOSSY_IRON_DOOR);

        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_ACACIA_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_PALE_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_IRON_TRAPDOOR);

        BlockModelGenerators.BlockFamilyProvider paleMossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(PALE_MOSSY_COBBLED_DEEPSLATE);
        paleMossyCobbledDeepslateTexturePool.stairs(PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS);
        paleMossyCobbledDeepslateTexturePool.slab(PALE_MOSSY_COBBLED_DEEPSLATE_SLAB);
        paleMossyCobbledDeepslateTexturePool.wall(PALE_MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockModelGenerators.BlockFamilyProvider paleMossyDeepslateBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_DEEPSLATE_BRICKS);
        paleMossyDeepslateBricksTexturePool.stairs(PALE_MOSSY_DEEPSLATE_BRICK_STAIRS);
        paleMossyDeepslateBricksTexturePool.slab(PALE_MOSSY_DEEPSLATE_BRICK_SLAB);
        paleMossyDeepslateBricksTexturePool.wall(PALE_MOSSY_DEEPSLATE_BRICK_WALL);

        registerDeepslate(blockStateModelGenerator, PALE_MOSSY_DEEPSLATE);

        BlockModelGenerators.BlockFamilyProvider paleMossyDeepslateTilesTexturePool = blockStateModelGenerator.family(PALE_MOSSY_DEEPSLATE_TILES);
        paleMossyDeepslateTilesTexturePool.stairs(PALE_MOSSY_DEEPSLATE_TILE_STAIRS);
        paleMossyDeepslateTilesTexturePool.slab(PALE_MOSSY_DEEPSLATE_TILE_SLAB);
        paleMossyDeepslateTilesTexturePool.wall(PALE_MOSSY_DEEPSLATE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider paleMossyTuffTexturePool = blockStateModelGenerator.family(PALE_MOSSY_TUFF);
        paleMossyTuffTexturePool.stairs(PALE_MOSSY_TUFF_STAIRS);
        paleMossyTuffTexturePool.slab(PALE_MOSSY_TUFF_SLAB);
        paleMossyTuffTexturePool.wall(PALE_MOSSY_TUFF_WALL);

        BlockModelGenerators.BlockFamilyProvider paleMossyTuffBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_TUFF_BRICKS);
        paleMossyTuffBricksTexturePool.stairs(PALE_MOSSY_TUFF_BRICK_STAIRS);
        paleMossyTuffBricksTexturePool.slab(PALE_MOSSY_TUFF_BRICK_SLAB);
        paleMossyTuffBricksTexturePool.wall(PALE_MOSSY_TUFF_BRICK_WALL);

        blockStateModelGenerator.createFullAndCarpetBlocks(CRIMSON_MOSS_BLOCK, CRIMSON_MOSS_CARPET);
        BlockModelGenerators.BlockFamilyProvider crimsonMossyStoneTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_STONE);
        crimsonMossyStoneTexturePool.stairs(CRIMSON_MOSSY_STONE_STAIRS);
        crimsonMossyStoneTexturePool.slab(CRIMSON_MOSSY_STONE_SLAB);
        crimsonMossyStoneTexturePool.pressurePlate(CRIMSON_MOSSY_STONE_PRESSURE_PLATE);
        crimsonMossyStoneTexturePool.button(CRIMSON_MOSSY_STONE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCobblestoneTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_COBBLESTONE);
        crimsonMossyCobblestoneTexturePool.stairs(CRIMSON_MOSSY_COBBLESTONE_STAIRS);
        crimsonMossyCobblestoneTexturePool.slab(CRIMSON_MOSSY_COBBLESTONE_SLAB);
        crimsonMossyCobblestoneTexturePool.wall(CRIMSON_MOSSY_COBBLESTONE_WALL);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyStoneBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_STONE_BRICKS);
        crimsonMossyStoneBricksTexturePool.stairs(CRIMSON_MOSSY_STONE_BRICK_STAIRS);
        crimsonMossyStoneBricksTexturePool.slab(CRIMSON_MOSSY_STONE_BRICK_SLAB);
        crimsonMossyStoneBricksTexturePool.wall(CRIMSON_MOSSY_STONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_ACACIA_PLANKS);
        crimsonMossyAcaciaPlanksTexturePool.stairs(CRIMSON_MOSSY_ACACIA_STAIRS);
        crimsonMossyAcaciaPlanksTexturePool.slab(CRIMSON_MOSSY_ACACIA_SLAB);
        crimsonMossyAcaciaPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE);
        crimsonMossyAcaciaPlanksTexturePool.button(CRIMSON_MOSSY_ACACIA_BUTTON);
        crimsonMossyAcaciaPlanksTexturePool.fence(CRIMSON_MOSSY_ACACIA_FENCE);
        crimsonMossyAcaciaPlanksTexturePool.fenceGate(CRIMSON_MOSSY_ACACIA_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBambooPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BAMBOO_PLANKS);
        crimsonMossyBambooPlanksTexturePool.stairs(CRIMSON_MOSSY_BAMBOO_STAIRS);
        crimsonMossyBambooPlanksTexturePool.slab(CRIMSON_MOSSY_BAMBOO_SLAB);
        crimsonMossyBambooPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE);
        crimsonMossyBambooPlanksTexturePool.button(CRIMSON_MOSSY_BAMBOO_BUTTON);
        crimsonMossyBambooPlanksTexturePool.fence(CRIMSON_MOSSY_BAMBOO_FENCE);
        crimsonMossyBambooPlanksTexturePool.fenceGate(CRIMSON_MOSSY_BAMBOO_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBirchPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BIRCH_PLANKS);
        crimsonMossyBirchPlanksTexturePool.stairs(CRIMSON_MOSSY_BIRCH_STAIRS);
        crimsonMossyBirchPlanksTexturePool.slab(CRIMSON_MOSSY_BIRCH_SLAB);
        crimsonMossyBirchPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE);
        crimsonMossyBirchPlanksTexturePool.button(CRIMSON_MOSSY_BIRCH_BUTTON);
        crimsonMossyBirchPlanksTexturePool.fence(CRIMSON_MOSSY_BIRCH_FENCE);
        crimsonMossyBirchPlanksTexturePool.fenceGate(CRIMSON_MOSSY_BIRCH_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCherryPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_CHERRY_PLANKS);
        crimsonMossyCherryPlanksTexturePool.stairs(CRIMSON_MOSSY_CHERRY_STAIRS);
        crimsonMossyCherryPlanksTexturePool.slab(CRIMSON_MOSSY_CHERRY_SLAB);
        crimsonMossyCherryPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE);
        crimsonMossyCherryPlanksTexturePool.button(CRIMSON_MOSSY_CHERRY_BUTTON);
        crimsonMossyCherryPlanksTexturePool.fence(CRIMSON_MOSSY_CHERRY_FENCE);
        crimsonMossyCherryPlanksTexturePool.fenceGate(CRIMSON_MOSSY_CHERRY_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_CRIMSON_PLANKS);
        crimsonMossyCrimsonPlanksTexturePool.stairs(CRIMSON_MOSSY_CRIMSON_STAIRS);
        crimsonMossyCrimsonPlanksTexturePool.slab(CRIMSON_MOSSY_CRIMSON_SLAB);
        crimsonMossyCrimsonPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE);
        crimsonMossyCrimsonPlanksTexturePool.button(CRIMSON_MOSSY_CRIMSON_BUTTON);
        crimsonMossyCrimsonPlanksTexturePool.fence(CRIMSON_MOSSY_CRIMSON_FENCE);
        crimsonMossyCrimsonPlanksTexturePool.fenceGate(CRIMSON_MOSSY_CRIMSON_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_DARK_OAK_PLANKS);
        crimsonMossyDarkOakPlanksTexturePool.stairs(CRIMSON_MOSSY_DARK_OAK_STAIRS);
        crimsonMossyDarkOakPlanksTexturePool.slab(CRIMSON_MOSSY_DARK_OAK_SLAB);
        crimsonMossyDarkOakPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE);
        crimsonMossyDarkOakPlanksTexturePool.button(CRIMSON_MOSSY_DARK_OAK_BUTTON);
        crimsonMossyDarkOakPlanksTexturePool.fence(CRIMSON_MOSSY_DARK_OAK_FENCE);
        crimsonMossyDarkOakPlanksTexturePool.fenceGate(CRIMSON_MOSSY_DARK_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_PALE_OAK_PLANKS);
        crimsonMossyPaleOakPlanksTexturePool.stairs(CRIMSON_MOSSY_PALE_OAK_STAIRS);
        crimsonMossyPaleOakPlanksTexturePool.slab(CRIMSON_MOSSY_PALE_OAK_SLAB);
        crimsonMossyPaleOakPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_PALE_OAK_PRESSURE_PLATE);
        crimsonMossyPaleOakPlanksTexturePool.button(CRIMSON_MOSSY_PALE_OAK_BUTTON);
        crimsonMossyPaleOakPlanksTexturePool.fence(CRIMSON_MOSSY_PALE_OAK_FENCE);
        crimsonMossyPaleOakPlanksTexturePool.fenceGate(CRIMSON_MOSSY_PALE_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyJunglePlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_JUNGLE_PLANKS);
        crimsonMossyJunglePlanksTexturePool.stairs(CRIMSON_MOSSY_JUNGLE_STAIRS);
        crimsonMossyJunglePlanksTexturePool.slab(CRIMSON_MOSSY_JUNGLE_SLAB);
        crimsonMossyJunglePlanksTexturePool.pressurePlate(CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE);
        crimsonMossyJunglePlanksTexturePool.button(CRIMSON_MOSSY_JUNGLE_BUTTON);
        crimsonMossyJunglePlanksTexturePool.fence(CRIMSON_MOSSY_JUNGLE_FENCE);
        crimsonMossyJunglePlanksTexturePool.fenceGate(CRIMSON_MOSSY_JUNGLE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyMangrovePlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_MANGROVE_PLANKS);
        crimsonMossyMangrovePlanksTexturePool.stairs(CRIMSON_MOSSY_MANGROVE_STAIRS);
        crimsonMossyMangrovePlanksTexturePool.slab(CRIMSON_MOSSY_MANGROVE_SLAB);
        crimsonMossyMangrovePlanksTexturePool.pressurePlate(CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE);
        crimsonMossyMangrovePlanksTexturePool.button(CRIMSON_MOSSY_MANGROVE_BUTTON);
        crimsonMossyMangrovePlanksTexturePool.fence(CRIMSON_MOSSY_MANGROVE_FENCE);
        crimsonMossyMangrovePlanksTexturePool.fenceGate(CRIMSON_MOSSY_MANGROVE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyOakPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_OAK_PLANKS);
        crimsonMossyOakPlanksTexturePool.stairs(CRIMSON_MOSSY_OAK_STAIRS);
        crimsonMossyOakPlanksTexturePool.slab(CRIMSON_MOSSY_OAK_SLAB);
        crimsonMossyOakPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_OAK_PRESSURE_PLATE);
        crimsonMossyOakPlanksTexturePool.button(CRIMSON_MOSSY_OAK_BUTTON);
        crimsonMossyOakPlanksTexturePool.fence(CRIMSON_MOSSY_OAK_FENCE);
        crimsonMossyOakPlanksTexturePool.fenceGate(CRIMSON_MOSSY_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossySprucePlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_SPRUCE_PLANKS);
        crimsonMossySprucePlanksTexturePool.stairs(CRIMSON_MOSSY_SPRUCE_STAIRS);
        crimsonMossySprucePlanksTexturePool.slab(CRIMSON_MOSSY_SPRUCE_SLAB);
        crimsonMossySprucePlanksTexturePool.pressurePlate(CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE);
        crimsonMossySprucePlanksTexturePool.button(CRIMSON_MOSSY_SPRUCE_BUTTON);
        crimsonMossySprucePlanksTexturePool.fence(CRIMSON_MOSSY_SPRUCE_FENCE);
        crimsonMossySprucePlanksTexturePool.fenceGate(CRIMSON_MOSSY_SPRUCE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyWarpedPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_WARPED_PLANKS);
        crimsonMossyWarpedPlanksTexturePool.stairs(CRIMSON_MOSSY_WARPED_STAIRS);
        crimsonMossyWarpedPlanksTexturePool.slab(CRIMSON_MOSSY_WARPED_SLAB);
        crimsonMossyWarpedPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_WARPED_PRESSURE_PLATE);
        crimsonMossyWarpedPlanksTexturePool.button(CRIMSON_MOSSY_WARPED_BUTTON);
        crimsonMossyWarpedPlanksTexturePool.fence(CRIMSON_MOSSY_WARPED_FENCE);
        crimsonMossyWarpedPlanksTexturePool.fenceGate(CRIMSON_MOSSY_WARPED_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBambooMosaicTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BAMBOO_MOSAIC);
        crimsonMossyBambooMosaicTexturePool.stairs(CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS);
        crimsonMossyBambooMosaicTexturePool.slab(CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_GLASS, CRIMSON_MOSSY_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_BLACK_STAINED_GLASS, CRIMSON_MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_BLUE_STAINED_GLASS, CRIMSON_MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_BROWN_STAINED_GLASS, CRIMSON_MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_CYAN_STAINED_GLASS, CRIMSON_MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_GRAY_STAINED_GLASS, CRIMSON_MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_GREEN_STAINED_GLASS, CRIMSON_MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS, CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_LIME_STAINED_GLASS, CRIMSON_MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_MAGENTA_STAINED_GLASS, CRIMSON_MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_ORANGE_STAINED_GLASS, CRIMSON_MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_PINK_STAINED_GLASS, CRIMSON_MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_PURPLE_STAINED_GLASS, CRIMSON_MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_RED_STAINED_GLASS, CRIMSON_MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.family(CRIMSON_MOSSY_TINTED_GLASS);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_WHITE_STAINED_GLASS, CRIMSON_MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_YELLOW_STAINED_GLASS, CRIMSON_MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_ACACIA_LOG).log(CRIMSON_MOSSY_ACACIA_LOG).wood(CRIMSON_MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_BAMBOO_BLOCK).log(CRIMSON_MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_BIRCH_LOG).log(CRIMSON_MOSSY_BIRCH_LOG).wood(CRIMSON_MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_CHERRY_LOG).log(CRIMSON_MOSSY_CHERRY_LOG).wood(CRIMSON_MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_CRIMSON_STEM).log(CRIMSON_MOSSY_CRIMSON_STEM).wood(CRIMSON_MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_DARK_OAK_LOG).log(CRIMSON_MOSSY_DARK_OAK_LOG).wood(CRIMSON_MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_PALE_OAK_LOG).log(CRIMSON_MOSSY_PALE_OAK_LOG).wood(CRIMSON_MOSSY_PALE_OAK_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_JUNGLE_LOG).log(CRIMSON_MOSSY_JUNGLE_LOG).wood(CRIMSON_MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_MANGROVE_LOG).log(CRIMSON_MOSSY_MANGROVE_LOG).wood(CRIMSON_MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_OAK_LOG).log(CRIMSON_MOSSY_OAK_LOG).wood(CRIMSON_MOSSY_OAK_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_SPRUCE_LOG).log(CRIMSON_MOSSY_SPRUCE_LOG).wood(CRIMSON_MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_WARPED_STEM).log(CRIMSON_MOSSY_WARPED_STEM).wood(CRIMSON_MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator, CRIMSON_MOSSY_IRON_BARS);

        blockStateModelGenerator.family(CRIMSON_MOSSY_CHISELED_STONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BRICKS);
        crimsonMossyBricksTexturePool.stairs(CRIMSON_MOSSY_BRICK_STAIRS);
        crimsonMossyBricksTexturePool.slab(CRIMSON_MOSSY_BRICK_SLAB);
        crimsonMossyBricksTexturePool.wall(CRIMSON_MOSSY_BRICK_WALL);

        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_OAK_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_PALE_OAK_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_MANGROVE_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_CHERRY_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_BAMBOO_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_CRIMSON_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_WARPED_DOOR);
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_IRON_DOOR);

        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_ACACIA_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_PALE_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_IRON_TRAPDOOR);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_COBBLED_DEEPSLATE);
        crimsonMossyCobbledDeepslateTexturePool.stairs(CRIMSON_MOSSY_COBBLED_DEEPSLATE_STAIRS);
        crimsonMossyCobbledDeepslateTexturePool.slab(CRIMSON_MOSSY_COBBLED_DEEPSLATE_SLAB);
        crimsonMossyCobbledDeepslateTexturePool.wall(CRIMSON_MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyDeepslateBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_DEEPSLATE_BRICKS);
        crimsonMossyDeepslateBricksTexturePool.stairs(CRIMSON_MOSSY_DEEPSLATE_BRICK_STAIRS);
        crimsonMossyDeepslateBricksTexturePool.slab(CRIMSON_MOSSY_DEEPSLATE_BRICK_SLAB);
        crimsonMossyDeepslateBricksTexturePool.wall(CRIMSON_MOSSY_DEEPSLATE_BRICK_WALL);

        registerDeepslate(blockStateModelGenerator, CRIMSON_MOSSY_DEEPSLATE);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyDeepslateTilesTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_DEEPSLATE_TILES);
        crimsonMossyDeepslateTilesTexturePool.stairs(CRIMSON_MOSSY_DEEPSLATE_TILE_STAIRS);
        crimsonMossyDeepslateTilesTexturePool.slab(CRIMSON_MOSSY_DEEPSLATE_TILE_SLAB);
        crimsonMossyDeepslateTilesTexturePool.wall(CRIMSON_MOSSY_DEEPSLATE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyTuffTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_TUFF);
        crimsonMossyTuffTexturePool.stairs(CRIMSON_MOSSY_TUFF_STAIRS);
        crimsonMossyTuffTexturePool.slab(CRIMSON_MOSSY_TUFF_SLAB);
        crimsonMossyTuffTexturePool.wall(CRIMSON_MOSSY_TUFF_WALL);

        BlockModelGenerators.BlockFamilyProvider crimsonMossyTuffBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_TUFF_BRICKS);
        crimsonMossyTuffBricksTexturePool.stairs(CRIMSON_MOSSY_TUFF_BRICK_STAIRS);
        crimsonMossyTuffBricksTexturePool.slab(CRIMSON_MOSSY_TUFF_BRICK_SLAB);
        crimsonMossyTuffBricksTexturePool.wall(CRIMSON_MOSSY_TUFF_BRICK_WALL);

        blockStateModelGenerator.createFullAndCarpetBlocks(WARPED_MOSS_BLOCK, WARPED_MOSS_CARPET);
        BlockModelGenerators.BlockFamilyProvider warpedMossyStoneTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_STONE);
        warpedMossyStoneTexturePool.stairs(WARPED_MOSSY_STONE_STAIRS);
        warpedMossyStoneTexturePool.slab(WARPED_MOSSY_STONE_SLAB);
        warpedMossyStoneTexturePool.pressurePlate(WARPED_MOSSY_STONE_PRESSURE_PLATE);
        warpedMossyStoneTexturePool.button(WARPED_MOSSY_STONE_BUTTON);

        BlockModelGenerators.BlockFamilyProvider warpedMossyCobblestoneTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_COBBLESTONE);
        warpedMossyCobblestoneTexturePool.stairs(WARPED_MOSSY_COBBLESTONE_STAIRS);
        warpedMossyCobblestoneTexturePool.slab(WARPED_MOSSY_COBBLESTONE_SLAB);
        warpedMossyCobblestoneTexturePool.wall(WARPED_MOSSY_COBBLESTONE_WALL);

        BlockModelGenerators.BlockFamilyProvider warpedMossyStoneBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_STONE_BRICKS);
        warpedMossyStoneBricksTexturePool.stairs(WARPED_MOSSY_STONE_BRICK_STAIRS);
        warpedMossyStoneBricksTexturePool.slab(WARPED_MOSSY_STONE_BRICK_SLAB);
        warpedMossyStoneBricksTexturePool.wall(WARPED_MOSSY_STONE_BRICK_WALL);

        BlockModelGenerators.BlockFamilyProvider warpedMossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_ACACIA_PLANKS);
        warpedMossyAcaciaPlanksTexturePool.stairs(WARPED_MOSSY_ACACIA_STAIRS);
        warpedMossyAcaciaPlanksTexturePool.slab(WARPED_MOSSY_ACACIA_SLAB);
        warpedMossyAcaciaPlanksTexturePool.pressurePlate(WARPED_MOSSY_ACACIA_PRESSURE_PLATE);
        warpedMossyAcaciaPlanksTexturePool.button(WARPED_MOSSY_ACACIA_BUTTON);
        warpedMossyAcaciaPlanksTexturePool.fence(WARPED_MOSSY_ACACIA_FENCE);
        warpedMossyAcaciaPlanksTexturePool.fenceGate(WARPED_MOSSY_ACACIA_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyBambooPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BAMBOO_PLANKS);
        warpedMossyBambooPlanksTexturePool.stairs(WARPED_MOSSY_BAMBOO_STAIRS);
        warpedMossyBambooPlanksTexturePool.slab(WARPED_MOSSY_BAMBOO_SLAB);
        warpedMossyBambooPlanksTexturePool.pressurePlate(WARPED_MOSSY_BAMBOO_PRESSURE_PLATE);
        warpedMossyBambooPlanksTexturePool.button(WARPED_MOSSY_BAMBOO_BUTTON);
        warpedMossyBambooPlanksTexturePool.fence(WARPED_MOSSY_BAMBOO_FENCE);
        warpedMossyBambooPlanksTexturePool.fenceGate(WARPED_MOSSY_BAMBOO_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyBirchPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BIRCH_PLANKS);
        warpedMossyBirchPlanksTexturePool.stairs(WARPED_MOSSY_BIRCH_STAIRS);
        warpedMossyBirchPlanksTexturePool.slab(WARPED_MOSSY_BIRCH_SLAB);
        warpedMossyBirchPlanksTexturePool.pressurePlate(WARPED_MOSSY_BIRCH_PRESSURE_PLATE);
        warpedMossyBirchPlanksTexturePool.button(WARPED_MOSSY_BIRCH_BUTTON);
        warpedMossyBirchPlanksTexturePool.fence(WARPED_MOSSY_BIRCH_FENCE);
        warpedMossyBirchPlanksTexturePool.fenceGate(WARPED_MOSSY_BIRCH_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyCherryPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_CHERRY_PLANKS);
        warpedMossyCherryPlanksTexturePool.stairs(WARPED_MOSSY_CHERRY_STAIRS);
        warpedMossyCherryPlanksTexturePool.slab(WARPED_MOSSY_CHERRY_SLAB);
        warpedMossyCherryPlanksTexturePool.pressurePlate(WARPED_MOSSY_CHERRY_PRESSURE_PLATE);
        warpedMossyCherryPlanksTexturePool.button(WARPED_MOSSY_CHERRY_BUTTON);
        warpedMossyCherryPlanksTexturePool.fence(WARPED_MOSSY_CHERRY_FENCE);
        warpedMossyCherryPlanksTexturePool.fenceGate(WARPED_MOSSY_CHERRY_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_CRIMSON_PLANKS);
        warpedMossyCrimsonPlanksTexturePool.stairs(WARPED_MOSSY_CRIMSON_STAIRS);
        warpedMossyCrimsonPlanksTexturePool.slab(WARPED_MOSSY_CRIMSON_SLAB);
        warpedMossyCrimsonPlanksTexturePool.pressurePlate(WARPED_MOSSY_CRIMSON_PRESSURE_PLATE);
        warpedMossyCrimsonPlanksTexturePool.button(WARPED_MOSSY_CRIMSON_BUTTON);
        warpedMossyCrimsonPlanksTexturePool.fence(WARPED_MOSSY_CRIMSON_FENCE);
        warpedMossyCrimsonPlanksTexturePool.fenceGate(WARPED_MOSSY_CRIMSON_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_DARK_OAK_PLANKS);
        warpedMossyDarkOakPlanksTexturePool.stairs(WARPED_MOSSY_DARK_OAK_STAIRS);
        warpedMossyDarkOakPlanksTexturePool.slab(WARPED_MOSSY_DARK_OAK_SLAB);
        warpedMossyDarkOakPlanksTexturePool.pressurePlate(WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE);
        warpedMossyDarkOakPlanksTexturePool.button(WARPED_MOSSY_DARK_OAK_BUTTON);
        warpedMossyDarkOakPlanksTexturePool.fence(WARPED_MOSSY_DARK_OAK_FENCE);
        warpedMossyDarkOakPlanksTexturePool.fenceGate(WARPED_MOSSY_DARK_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_PALE_OAK_PLANKS);
        warpedMossyPaleOakPlanksTexturePool.stairs(WARPED_MOSSY_PALE_OAK_STAIRS);
        warpedMossyPaleOakPlanksTexturePool.slab(WARPED_MOSSY_PALE_OAK_SLAB);
        warpedMossyPaleOakPlanksTexturePool.pressurePlate(WARPED_MOSSY_PALE_OAK_PRESSURE_PLATE);
        warpedMossyPaleOakPlanksTexturePool.button(WARPED_MOSSY_PALE_OAK_BUTTON);
        warpedMossyPaleOakPlanksTexturePool.fence(WARPED_MOSSY_PALE_OAK_FENCE);
        warpedMossyPaleOakPlanksTexturePool.fenceGate(WARPED_MOSSY_PALE_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyJunglePlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_JUNGLE_PLANKS);
        warpedMossyJunglePlanksTexturePool.stairs(WARPED_MOSSY_JUNGLE_STAIRS);
        warpedMossyJunglePlanksTexturePool.slab(WARPED_MOSSY_JUNGLE_SLAB);
        warpedMossyJunglePlanksTexturePool.pressurePlate(WARPED_MOSSY_JUNGLE_PRESSURE_PLATE);
        warpedMossyJunglePlanksTexturePool.button(WARPED_MOSSY_JUNGLE_BUTTON);
        warpedMossyJunglePlanksTexturePool.fence(WARPED_MOSSY_JUNGLE_FENCE);
        warpedMossyJunglePlanksTexturePool.fenceGate(WARPED_MOSSY_JUNGLE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyMangrovePlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_MANGROVE_PLANKS);
        warpedMossyMangrovePlanksTexturePool.stairs(WARPED_MOSSY_MANGROVE_STAIRS);
        warpedMossyMangrovePlanksTexturePool.slab(WARPED_MOSSY_MANGROVE_SLAB);
        warpedMossyMangrovePlanksTexturePool.pressurePlate(WARPED_MOSSY_MANGROVE_PRESSURE_PLATE);
        warpedMossyMangrovePlanksTexturePool.button(WARPED_MOSSY_MANGROVE_BUTTON);
        warpedMossyMangrovePlanksTexturePool.fence(WARPED_MOSSY_MANGROVE_FENCE);
        warpedMossyMangrovePlanksTexturePool.fenceGate(WARPED_MOSSY_MANGROVE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyOakPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_OAK_PLANKS);
        warpedMossyOakPlanksTexturePool.stairs(WARPED_MOSSY_OAK_STAIRS);
        warpedMossyOakPlanksTexturePool.slab(WARPED_MOSSY_OAK_SLAB);
        warpedMossyOakPlanksTexturePool.pressurePlate(WARPED_MOSSY_OAK_PRESSURE_PLATE);
        warpedMossyOakPlanksTexturePool.button(WARPED_MOSSY_OAK_BUTTON);
        warpedMossyOakPlanksTexturePool.fence(WARPED_MOSSY_OAK_FENCE);
        warpedMossyOakPlanksTexturePool.fenceGate(WARPED_MOSSY_OAK_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossySprucePlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_SPRUCE_PLANKS);
        warpedMossySprucePlanksTexturePool.stairs(WARPED_MOSSY_SPRUCE_STAIRS);
        warpedMossySprucePlanksTexturePool.slab(WARPED_MOSSY_SPRUCE_SLAB);
        warpedMossySprucePlanksTexturePool.pressurePlate(WARPED_MOSSY_SPRUCE_PRESSURE_PLATE);
        warpedMossySprucePlanksTexturePool.button(WARPED_MOSSY_SPRUCE_BUTTON);
        warpedMossySprucePlanksTexturePool.fence(WARPED_MOSSY_SPRUCE_FENCE);
        warpedMossySprucePlanksTexturePool.fenceGate(WARPED_MOSSY_SPRUCE_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyWarpedPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_WARPED_PLANKS);
        warpedMossyWarpedPlanksTexturePool.stairs(WARPED_MOSSY_WARPED_STAIRS);
        warpedMossyWarpedPlanksTexturePool.slab(WARPED_MOSSY_WARPED_SLAB);
        warpedMossyWarpedPlanksTexturePool.pressurePlate(WARPED_MOSSY_WARPED_PRESSURE_PLATE);
        warpedMossyWarpedPlanksTexturePool.button(WARPED_MOSSY_WARPED_BUTTON);
        warpedMossyWarpedPlanksTexturePool.fence(WARPED_MOSSY_WARPED_FENCE);
        warpedMossyWarpedPlanksTexturePool.fenceGate(WARPED_MOSSY_WARPED_FENCE_GATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyBambooMosaicTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BAMBOO_MOSAIC);
        warpedMossyBambooMosaicTexturePool.stairs(WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS);
        warpedMossyBambooMosaicTexturePool.slab(WARPED_MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_GLASS, WARPED_MOSSY_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_BLACK_STAINED_GLASS, WARPED_MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_BLUE_STAINED_GLASS, WARPED_MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_BROWN_STAINED_GLASS, WARPED_MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_CYAN_STAINED_GLASS, WARPED_MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_GRAY_STAINED_GLASS, WARPED_MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_GREEN_STAINED_GLASS, WARPED_MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS, WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS, WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_LIME_STAINED_GLASS, WARPED_MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_MAGENTA_STAINED_GLASS, WARPED_MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_ORANGE_STAINED_GLASS, WARPED_MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_PINK_STAINED_GLASS, WARPED_MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_PURPLE_STAINED_GLASS, WARPED_MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_RED_STAINED_GLASS, WARPED_MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.family(WARPED_MOSSY_TINTED_GLASS);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_WHITE_STAINED_GLASS, WARPED_MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_YELLOW_STAINED_GLASS, WARPED_MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.woodProvider(WARPED_MOSSY_ACACIA_LOG).log(WARPED_MOSSY_ACACIA_LOG).wood(WARPED_MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_BAMBOO_BLOCK).log(WARPED_MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_BIRCH_LOG).log(WARPED_MOSSY_BIRCH_LOG).wood(WARPED_MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_CHERRY_LOG).log(WARPED_MOSSY_CHERRY_LOG).wood(WARPED_MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_CRIMSON_STEM).log(WARPED_MOSSY_CRIMSON_STEM).wood(WARPED_MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_DARK_OAK_LOG).log(WARPED_MOSSY_DARK_OAK_LOG).wood(WARPED_MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_PALE_OAK_LOG).log(WARPED_MOSSY_PALE_OAK_LOG).wood(WARPED_MOSSY_PALE_OAK_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_JUNGLE_LOG).log(WARPED_MOSSY_JUNGLE_LOG).wood(WARPED_MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_MANGROVE_LOG).log(WARPED_MOSSY_MANGROVE_LOG).wood(WARPED_MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_OAK_LOG).log(WARPED_MOSSY_OAK_LOG).wood(WARPED_MOSSY_OAK_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_SPRUCE_LOG).log(WARPED_MOSSY_SPRUCE_LOG).wood(WARPED_MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_WARPED_STEM).log(WARPED_MOSSY_WARPED_STEM).wood(WARPED_MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator, WARPED_MOSSY_IRON_BARS);

        blockStateModelGenerator.family(WARPED_MOSSY_CHISELED_STONE_BRICKS);

        BlockModelGenerators.BlockFamilyProvider warpedMossyBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BRICKS);
        warpedMossyBricksTexturePool.stairs(WARPED_MOSSY_BRICK_STAIRS);
        warpedMossyBricksTexturePool.slab(WARPED_MOSSY_BRICK_SLAB);
        warpedMossyBricksTexturePool.wall(WARPED_MOSSY_BRICK_WALL);

        blockStateModelGenerator.createDoor(WARPED_MOSSY_OAK_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_PALE_OAK_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_MANGROVE_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_CHERRY_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_BAMBOO_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_CRIMSON_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_WARPED_DOOR);
        blockStateModelGenerator.createDoor(WARPED_MOSSY_IRON_DOOR);

        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_ACACIA_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_PALE_OAK_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_IRON_TRAPDOOR);

        BlockModelGenerators.BlockFamilyProvider warpedMossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_COBBLED_DEEPSLATE);
        warpedMossyCobbledDeepslateTexturePool.stairs(WARPED_MOSSY_COBBLED_DEEPSLATE_STAIRS);
        warpedMossyCobbledDeepslateTexturePool.slab(WARPED_MOSSY_COBBLED_DEEPSLATE_SLAB);
        warpedMossyCobbledDeepslateTexturePool.wall(WARPED_MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockModelGenerators.BlockFamilyProvider warpedMossyDeepslateBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_DEEPSLATE_BRICKS);
        warpedMossyDeepslateBricksTexturePool.stairs(WARPED_MOSSY_DEEPSLATE_BRICK_STAIRS);
        warpedMossyDeepslateBricksTexturePool.slab(WARPED_MOSSY_DEEPSLATE_BRICK_SLAB);
        warpedMossyDeepslateBricksTexturePool.wall(WARPED_MOSSY_DEEPSLATE_BRICK_WALL);

        registerDeepslate(blockStateModelGenerator, WARPED_MOSSY_DEEPSLATE);

        BlockModelGenerators.BlockFamilyProvider warpedMossyDeepslateTilesTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_DEEPSLATE_TILES);
        warpedMossyDeepslateTilesTexturePool.stairs(WARPED_MOSSY_DEEPSLATE_TILE_STAIRS);
        warpedMossyDeepslateTilesTexturePool.slab(WARPED_MOSSY_DEEPSLATE_TILE_SLAB);
        warpedMossyDeepslateTilesTexturePool.wall(WARPED_MOSSY_DEEPSLATE_TILE_WALL);

        BlockModelGenerators.BlockFamilyProvider warpedMossyTuffTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_TUFF);
        warpedMossyTuffTexturePool.stairs(WARPED_MOSSY_TUFF_STAIRS);
        warpedMossyTuffTexturePool.slab(WARPED_MOSSY_TUFF_SLAB);
        warpedMossyTuffTexturePool.wall(WARPED_MOSSY_TUFF_WALL);

        BlockModelGenerators.BlockFamilyProvider warpedMossyTuffBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_TUFF_BRICKS);
        warpedMossyTuffBricksTexturePool.stairs(WARPED_MOSSY_TUFF_BRICK_STAIRS);
        warpedMossyTuffBricksTexturePool.slab(WARPED_MOSSY_TUFF_BRICK_SLAB);
        warpedMossyTuffBricksTexturePool.wall(WARPED_MOSSY_TUFF_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(MossyItems.MOSS_BALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MossyItems.PALE_MOSS_BALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MossyItems.CRIMSON_MOSS_BALL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(MossyItems.WARPED_MOSS_BALL, ModelTemplates.FLAT_ITEM);
    }
    
    private void registerDeepslate(BlockModelGenerators blockStateModelGenerator, Block block) {
        var texturedModel = TexturedModel.COLUMN_WITH_WALL.get(block);
        var textures = texturedModel.getMapping();
        var baseModelId = texturedModel.getTemplate().create(block, textures, blockStateModelGenerator.modelOutput);
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createMirroredColumnGenerator(block, plainModel(baseModelId), textures, blockStateModelGenerator.modelOutput));
    }

    private void registerIronBars(BlockModelGenerators blockStateModelGenerator, Block block) {
        var weightedVariant = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block, "_post_ends"));
        var weightedVariant2 = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block, "_post"));
        var weightedVariant3 = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block, "_cap"));
        var weightedVariant4 = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block, "_cap_alt"));
        var weightedVariant5 = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block, "_side"));
        var weightedVariant6 = BlockModelGenerators.plainVariant(ModelLocationUtils.getModelLocation(block, "_side_alt"));
        blockStateModelGenerator.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(weightedVariant)
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.NORTH, false)
                                .term(BlockStateProperties.EAST, false)
                                .term(BlockStateProperties.SOUTH, false)
                                .term(BlockStateProperties.WEST, false), weightedVariant2)
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.NORTH, true)
                                .term(BlockStateProperties.EAST, false)
                                .term(BlockStateProperties.SOUTH, false)
                                .term(BlockStateProperties.WEST, false), weightedVariant3)
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.NORTH, false)
                                .term(BlockStateProperties.EAST, true)
                                .term(BlockStateProperties.SOUTH, false)
                                .term(BlockStateProperties.WEST, false), weightedVariant3.with(BlockModelGenerators.Y_ROT_90))
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.NORTH, false)
                                .term(BlockStateProperties.EAST, false)
                                .term(BlockStateProperties.SOUTH, true)
                                .term(BlockStateProperties.WEST, false), weightedVariant4)
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.NORTH, false)
                                .term(BlockStateProperties.EAST, false)
                                .term(BlockStateProperties.SOUTH, false)
                                .term(BlockStateProperties.WEST, true), weightedVariant4.with(BlockModelGenerators.Y_ROT_90))
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.NORTH, true), weightedVariant5)
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.EAST, true), weightedVariant5.with(BlockModelGenerators.Y_ROT_90))
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.SOUTH, true), weightedVariant6)
                        .with(BlockModelGenerators.condition()
                                .term(BlockStateProperties.WEST, true), weightedVariant6.with(BlockModelGenerators.Y_ROT_90)));
        blockStateModelGenerator.registerSimpleFlatItemModel(block);
    }
}
