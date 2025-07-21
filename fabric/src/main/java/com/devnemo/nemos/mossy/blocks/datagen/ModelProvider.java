package com.devnemo.nemos.mossy.blocks.datagen;

import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static com.devnemo.nemos.mossy.blocks.world.level.block.NemosMossyBlocks.*;
import static net.minecraft.client.data.models.BlockModelGenerators.plainModel;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        BlockModelGenerators.BlockFamilyProvider mossyStoneTexturePool = blockStateModelGenerator.family(MOSSY_STONE.get());
        mossyStoneTexturePool.stairs(MOSSY_STONE_STAIRS.get());
        mossyStoneTexturePool.slab(MOSSY_STONE_SLAB.get());
        mossyStoneTexturePool.pressurePlate(MOSSY_STONE_PRESSURE_PLATE.get());
        mossyStoneTexturePool.button(MOSSY_STONE_BUTTON.get());

        BlockModelGenerators.BlockFamilyProvider mossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(MOSSY_ACACIA_PLANKS.get());
        mossyAcaciaPlanksTexturePool.stairs(MOSSY_ACACIA_STAIRS.get());
        mossyAcaciaPlanksTexturePool.slab(MOSSY_ACACIA_SLAB.get());
        mossyAcaciaPlanksTexturePool.pressurePlate(MOSSY_ACACIA_PRESSURE_PLATE.get());
        mossyAcaciaPlanksTexturePool.button(MOSSY_ACACIA_BUTTON.get());
        mossyAcaciaPlanksTexturePool.fence(MOSSY_ACACIA_FENCE.get());
        mossyAcaciaPlanksTexturePool.fenceGate(MOSSY_ACACIA_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyBambooPlanksTexturePool = blockStateModelGenerator.family(MOSSY_BAMBOO_PLANKS.get());
        mossyBambooPlanksTexturePool.stairs(MOSSY_BAMBOO_STAIRS.get());
        mossyBambooPlanksTexturePool.slab(MOSSY_BAMBOO_SLAB.get());
        mossyBambooPlanksTexturePool.pressurePlate(MOSSY_BAMBOO_PRESSURE_PLATE.get());
        mossyBambooPlanksTexturePool.button(MOSSY_BAMBOO_BUTTON.get());
        mossyBambooPlanksTexturePool.fence(MOSSY_BAMBOO_FENCE.get());
        mossyBambooPlanksTexturePool.fenceGate(MOSSY_BAMBOO_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyBirchPlanksTexturePool = blockStateModelGenerator.family(MOSSY_BIRCH_PLANKS.get());
        mossyBirchPlanksTexturePool.stairs(MOSSY_BIRCH_STAIRS.get());
        mossyBirchPlanksTexturePool.slab(MOSSY_BIRCH_SLAB.get());
        mossyBirchPlanksTexturePool.pressurePlate(MOSSY_BIRCH_PRESSURE_PLATE.get());
        mossyBirchPlanksTexturePool.button(MOSSY_BIRCH_BUTTON.get());
        mossyBirchPlanksTexturePool.fence(MOSSY_BIRCH_FENCE.get());
        mossyBirchPlanksTexturePool.fenceGate(MOSSY_BIRCH_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyCherryPlanksTexturePool = blockStateModelGenerator.family(MOSSY_CHERRY_PLANKS.get());
        mossyCherryPlanksTexturePool.stairs(MOSSY_CHERRY_STAIRS.get());
        mossyCherryPlanksTexturePool.slab(MOSSY_CHERRY_SLAB.get());
        mossyCherryPlanksTexturePool.pressurePlate(MOSSY_CHERRY_PRESSURE_PLATE.get());
        mossyCherryPlanksTexturePool.button(MOSSY_CHERRY_BUTTON.get());
        mossyCherryPlanksTexturePool.fence(MOSSY_CHERRY_FENCE.get());
        mossyCherryPlanksTexturePool.fenceGate(MOSSY_CHERRY_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(MOSSY_CRIMSON_PLANKS.get());
        mossyCrimsonPlanksTexturePool.stairs(MOSSY_CRIMSON_STAIRS.get());
        mossyCrimsonPlanksTexturePool.slab(MOSSY_CRIMSON_SLAB.get());
        mossyCrimsonPlanksTexturePool.pressurePlate(MOSSY_CRIMSON_PRESSURE_PLATE.get());
        mossyCrimsonPlanksTexturePool.button(MOSSY_CRIMSON_BUTTON.get());
        mossyCrimsonPlanksTexturePool.fence(MOSSY_CRIMSON_FENCE.get());
        mossyCrimsonPlanksTexturePool.fenceGate(MOSSY_CRIMSON_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(MOSSY_DARK_OAK_PLANKS.get());
        mossyDarkOakPlanksTexturePool.stairs(MOSSY_DARK_OAK_STAIRS.get());
        mossyDarkOakPlanksTexturePool.slab(MOSSY_DARK_OAK_SLAB.get());
        mossyDarkOakPlanksTexturePool.pressurePlate(MOSSY_DARK_OAK_PRESSURE_PLATE.get());
        mossyDarkOakPlanksTexturePool.button(MOSSY_DARK_OAK_BUTTON.get());
        mossyDarkOakPlanksTexturePool.fence(MOSSY_DARK_OAK_FENCE.get());
        mossyDarkOakPlanksTexturePool.fenceGate(MOSSY_DARK_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(MOSSY_PALE_OAK_PLANKS.get());
        mossyPaleOakPlanksTexturePool.stairs(MOSSY_PALE_OAK_STAIRS.get());
        mossyPaleOakPlanksTexturePool.slab(MOSSY_PALE_OAK_SLAB.get());
        mossyPaleOakPlanksTexturePool.pressurePlate(MOSSY_PALE_OAK_PRESSURE_PLATE.get());
        mossyPaleOakPlanksTexturePool.button(MOSSY_PALE_OAK_BUTTON.get());
        mossyPaleOakPlanksTexturePool.fence(MOSSY_PALE_OAK_FENCE.get());
        mossyPaleOakPlanksTexturePool.fenceGate(MOSSY_PALE_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyJunglePlanksTexturePool = blockStateModelGenerator.family(MOSSY_JUNGLE_PLANKS.get());
        mossyJunglePlanksTexturePool.stairs(MOSSY_JUNGLE_STAIRS.get());
        mossyJunglePlanksTexturePool.slab(MOSSY_JUNGLE_SLAB.get());
        mossyJunglePlanksTexturePool.pressurePlate(MOSSY_JUNGLE_PRESSURE_PLATE.get());
        mossyJunglePlanksTexturePool.button(MOSSY_JUNGLE_BUTTON.get());
        mossyJunglePlanksTexturePool.fence(MOSSY_JUNGLE_FENCE.get());
        mossyJunglePlanksTexturePool.fenceGate(MOSSY_JUNGLE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyMangrovePlanksTexturePool = blockStateModelGenerator.family(MOSSY_MANGROVE_PLANKS.get());
        mossyMangrovePlanksTexturePool.stairs(MOSSY_MANGROVE_STAIRS.get());
        mossyMangrovePlanksTexturePool.slab(MOSSY_MANGROVE_SLAB.get());
        mossyMangrovePlanksTexturePool.pressurePlate(MOSSY_MANGROVE_PRESSURE_PLATE.get());
        mossyMangrovePlanksTexturePool.button(MOSSY_MANGROVE_BUTTON.get());
        mossyMangrovePlanksTexturePool.fence(MOSSY_MANGROVE_FENCE.get());
        mossyMangrovePlanksTexturePool.fenceGate(MOSSY_MANGROVE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyOakPlanksTexturePool = blockStateModelGenerator.family(MOSSY_OAK_PLANKS.get());
        mossyOakPlanksTexturePool.stairs(MOSSY_OAK_STAIRS.get());
        mossyOakPlanksTexturePool.slab(MOSSY_OAK_SLAB.get());
        mossyOakPlanksTexturePool.pressurePlate(MOSSY_OAK_PRESSURE_PLATE.get());
        mossyOakPlanksTexturePool.button(MOSSY_OAK_BUTTON.get());
        mossyOakPlanksTexturePool.fence(MOSSY_OAK_FENCE.get());
        mossyOakPlanksTexturePool.fenceGate(MOSSY_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossySprucePlanksTexturePool = blockStateModelGenerator.family(MOSSY_SPRUCE_PLANKS.get());
        mossySprucePlanksTexturePool.stairs(MOSSY_SPRUCE_STAIRS.get());
        mossySprucePlanksTexturePool.slab(MOSSY_SPRUCE_SLAB.get());
        mossySprucePlanksTexturePool.pressurePlate(MOSSY_SPRUCE_PRESSURE_PLATE.get());
        mossySprucePlanksTexturePool.button(MOSSY_SPRUCE_BUTTON.get());
        mossySprucePlanksTexturePool.fence(MOSSY_SPRUCE_FENCE.get());
        mossySprucePlanksTexturePool.fenceGate(MOSSY_SPRUCE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyWarpedPlanksTexturePool = blockStateModelGenerator.family(MOSSY_WARPED_PLANKS.get());
        mossyWarpedPlanksTexturePool.stairs(MOSSY_WARPED_STAIRS.get());
        mossyWarpedPlanksTexturePool.slab(MOSSY_WARPED_SLAB.get());
        mossyWarpedPlanksTexturePool.pressurePlate(MOSSY_WARPED_PRESSURE_PLATE.get());
        mossyWarpedPlanksTexturePool.button(MOSSY_WARPED_BUTTON.get());
        mossyWarpedPlanksTexturePool.fence(MOSSY_WARPED_FENCE.get());
        mossyWarpedPlanksTexturePool.fenceGate(MOSSY_WARPED_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyBambooMosaicTexturePool = blockStateModelGenerator.family(MOSSY_BAMBOO_MOSAIC.get());
        mossyBambooMosaicTexturePool.stairs(MOSSY_BAMBOO_MOSAIC_STAIRS.get());
        mossyBambooMosaicTexturePool.slab(MOSSY_BAMBOO_MOSAIC_SLAB.get());

        blockStateModelGenerator.createGlassBlocks(MOSSY_GLASS.get(), MOSSY_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_BLACK_STAINED_GLASS.get(), MOSSY_BLACK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_BLUE_STAINED_GLASS.get(), MOSSY_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_BROWN_STAINED_GLASS.get(), MOSSY_BROWN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_CYAN_STAINED_GLASS.get(), MOSSY_CYAN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_GRAY_STAINED_GLASS.get(), MOSSY_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_GREEN_STAINED_GLASS.get(), MOSSY_GREEN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_LIME_STAINED_GLASS.get(), MOSSY_LIME_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_MAGENTA_STAINED_GLASS.get(), MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_ORANGE_STAINED_GLASS.get(), MOSSY_ORANGE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_PINK_STAINED_GLASS.get(), MOSSY_PINK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_PURPLE_STAINED_GLASS.get(), MOSSY_PURPLE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_RED_STAINED_GLASS.get(), MOSSY_RED_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.family(MOSSY_TINTED_GLASS.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_WHITE_STAINED_GLASS.get(), MOSSY_WHITE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(MOSSY_YELLOW_STAINED_GLASS.get(), MOSSY_YELLOW_STAINED_GLASS_PANE.get());

        blockStateModelGenerator.woodProvider(MOSSY_ACACIA_LOG.get()).log(MOSSY_ACACIA_LOG.get()).wood(MOSSY_ACACIA_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_BAMBOO_BLOCK.get()).log(MOSSY_BAMBOO_BLOCK.get());
        blockStateModelGenerator.woodProvider(MOSSY_BIRCH_LOG.get()).log(MOSSY_BIRCH_LOG.get()).wood(MOSSY_BIRCH_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_CHERRY_LOG.get()).log(MOSSY_CHERRY_LOG.get()).wood(MOSSY_CHERRY_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_CRIMSON_STEM.get()).log(MOSSY_CRIMSON_STEM.get()).wood(MOSSY_CRIMSON_HYPHAE.get());
        blockStateModelGenerator.woodProvider(MOSSY_DARK_OAK_LOG.get()).log(MOSSY_DARK_OAK_LOG.get()).wood(MOSSY_DARK_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_PALE_OAK_LOG.get()).log(MOSSY_PALE_OAK_LOG.get()).wood(MOSSY_PALE_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_JUNGLE_LOG.get()).log(MOSSY_JUNGLE_LOG.get()).wood(MOSSY_JUNGLE_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_MANGROVE_LOG.get()).log(MOSSY_MANGROVE_LOG.get()).wood(MOSSY_MANGROVE_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_OAK_LOG.get()).log(MOSSY_OAK_LOG.get()).wood(MOSSY_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_SPRUCE_LOG.get()).log(MOSSY_SPRUCE_LOG.get()).wood(MOSSY_SPRUCE_WOOD.get());
        blockStateModelGenerator.woodProvider(MOSSY_WARPED_STEM.get()).log(MOSSY_WARPED_STEM.get()).wood(MOSSY_WARPED_HYPHAE.get());

        registerIronBars(blockStateModelGenerator, MOSSY_IRON_BARS.get());

        blockStateModelGenerator.family(MOSSY_CHISELED_STONE_BRICKS.get());
        blockStateModelGenerator.copyModel(MOSSY_CHISELED_STONE_BRICKS.get(), INFESTED_MOSSY_CHISELED_STONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider mossyBricksTexturePool = blockStateModelGenerator.family(MOSSY_BRICKS.get());
        mossyBricksTexturePool.stairs(MOSSY_BRICK_STAIRS.get());
        mossyBricksTexturePool.slab(MOSSY_BRICK_SLAB.get());
        mossyBricksTexturePool.wall(MOSSY_BRICK_WALL.get());

        blockStateModelGenerator.createDoor(MOSSY_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_SPRUCE_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_BIRCH_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_JUNGLE_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_ACACIA_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_DARK_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_PALE_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_MANGROVE_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_CHERRY_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_BAMBOO_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_CRIMSON_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_WARPED_DOOR.get());
        blockStateModelGenerator.createDoor(MOSSY_IRON_DOOR.get());

        blockStateModelGenerator.createTrapdoor(MOSSY_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_SPRUCE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_BIRCH_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_JUNGLE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_ACACIA_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_DARK_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_PALE_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_MANGROVE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_CHERRY_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_BAMBOO_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_CRIMSON_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_WARPED_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(MOSSY_IRON_TRAPDOOR.get());

        BlockModelGenerators.BlockFamilyProvider mossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(MOSSY_COBBLED_DEEPSLATE.get());
        mossyCobbledDeepslateTexturePool.stairs(MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
        mossyCobbledDeepslateTexturePool.slab(MOSSY_COBBLED_DEEPSLATE_SLAB.get());
        mossyCobbledDeepslateTexturePool.wall(MOSSY_COBBLED_DEEPSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider mossyDeepslateBricksTexturePool = blockStateModelGenerator.family(MOSSY_DEEPSLATE_BRICKS.get());
        mossyDeepslateBricksTexturePool.stairs(MOSSY_DEEPSLATE_BRICK_STAIRS.get());
        mossyDeepslateBricksTexturePool.slab(MOSSY_DEEPSLATE_BRICK_SLAB.get());
        mossyDeepslateBricksTexturePool.wall(MOSSY_DEEPSLATE_BRICK_WALL.get());

        registerDeepslate(blockStateModelGenerator, MOSSY_DEEPSLATE.get());

        BlockModelGenerators.BlockFamilyProvider mossyDeepslateTilesTexturePool = blockStateModelGenerator.family(MOSSY_DEEPSLATE_TILES.get());
        mossyDeepslateTilesTexturePool.stairs(MOSSY_DEEPSLATE_TILE_STAIRS.get());
        mossyDeepslateTilesTexturePool.slab(MOSSY_DEEPSLATE_TILE_SLAB.get());
        mossyDeepslateTilesTexturePool.wall(MOSSY_DEEPSLATE_TILE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider mossyTuffTexturePool = blockStateModelGenerator.family(MOSSY_TUFF.get());
        mossyTuffTexturePool.stairs(MOSSY_TUFF_STAIRS.get());
        mossyTuffTexturePool.slab(MOSSY_TUFF_SLAB.get());
        mossyTuffTexturePool.wall(MOSSY_TUFF_WALL.get());

        BlockModelGenerators.BlockFamilyProvider mossyTuffBricksTexturePool = blockStateModelGenerator.family(MOSSY_TUFF_BRICKS.get());
        mossyTuffBricksTexturePool.stairs(MOSSY_TUFF_BRICK_STAIRS.get());
        mossyTuffBricksTexturePool.slab(MOSSY_TUFF_BRICK_SLAB.get());
        mossyTuffBricksTexturePool.wall(MOSSY_TUFF_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyStoneTexturePool = blockStateModelGenerator.family(PALE_MOSSY_STONE.get());
        paleMossyStoneTexturePool.stairs(PALE_MOSSY_STONE_STAIRS.get());
        paleMossyStoneTexturePool.slab(PALE_MOSSY_STONE_SLAB.get());
        paleMossyStoneTexturePool.pressurePlate(PALE_MOSSY_STONE_PRESSURE_PLATE.get());
        paleMossyStoneTexturePool.button(PALE_MOSSY_STONE_BUTTON.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyCobblestoneTexturePool = blockStateModelGenerator.family(PALE_MOSSY_COBBLESTONE.get());
        paleMossyCobblestoneTexturePool.stairs(PALE_MOSSY_COBBLESTONE_STAIRS.get());
        paleMossyCobblestoneTexturePool.slab(PALE_MOSSY_COBBLESTONE_SLAB.get());
        paleMossyCobblestoneTexturePool.wall(PALE_MOSSY_COBBLESTONE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyStoneBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_STONE_BRICKS.get());
        paleMossyStoneBricksTexturePool.stairs(PALE_MOSSY_STONE_BRICK_STAIRS.get());
        paleMossyStoneBricksTexturePool.slab(PALE_MOSSY_STONE_BRICK_SLAB.get());
        paleMossyStoneBricksTexturePool.wall(PALE_MOSSY_STONE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_ACACIA_PLANKS.get());
        paleMossyAcaciaPlanksTexturePool.stairs(PALE_MOSSY_ACACIA_STAIRS.get());
        paleMossyAcaciaPlanksTexturePool.slab(PALE_MOSSY_ACACIA_SLAB.get());
        paleMossyAcaciaPlanksTexturePool.pressurePlate(PALE_MOSSY_ACACIA_PRESSURE_PLATE.get());
        paleMossyAcaciaPlanksTexturePool.button(PALE_MOSSY_ACACIA_BUTTON.get());
        paleMossyAcaciaPlanksTexturePool.fence(PALE_MOSSY_ACACIA_FENCE.get());
        paleMossyAcaciaPlanksTexturePool.fenceGate(PALE_MOSSY_ACACIA_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyBambooPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BAMBOO_PLANKS.get());
        paleMossyBambooPlanksTexturePool.stairs(PALE_MOSSY_BAMBOO_STAIRS.get());
        paleMossyBambooPlanksTexturePool.slab(PALE_MOSSY_BAMBOO_SLAB.get());
        paleMossyBambooPlanksTexturePool.pressurePlate(PALE_MOSSY_BAMBOO_PRESSURE_PLATE.get());
        paleMossyBambooPlanksTexturePool.button(PALE_MOSSY_BAMBOO_BUTTON.get());
        paleMossyBambooPlanksTexturePool.fence(PALE_MOSSY_BAMBOO_FENCE.get());
        paleMossyBambooPlanksTexturePool.fenceGate(PALE_MOSSY_BAMBOO_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyBirchPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BIRCH_PLANKS.get());
        paleMossyBirchPlanksTexturePool.stairs(PALE_MOSSY_BIRCH_STAIRS.get());
        paleMossyBirchPlanksTexturePool.slab(PALE_MOSSY_BIRCH_SLAB.get());
        paleMossyBirchPlanksTexturePool.pressurePlate(PALE_MOSSY_BIRCH_PRESSURE_PLATE.get());
        paleMossyBirchPlanksTexturePool.button(PALE_MOSSY_BIRCH_BUTTON.get());
        paleMossyBirchPlanksTexturePool.fence(PALE_MOSSY_BIRCH_FENCE.get());
        paleMossyBirchPlanksTexturePool.fenceGate(PALE_MOSSY_BIRCH_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyCherryPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_CHERRY_PLANKS.get());
        paleMossyCherryPlanksTexturePool.stairs(PALE_MOSSY_CHERRY_STAIRS.get());
        paleMossyCherryPlanksTexturePool.slab(PALE_MOSSY_CHERRY_SLAB.get());
        paleMossyCherryPlanksTexturePool.pressurePlate(PALE_MOSSY_CHERRY_PRESSURE_PLATE.get());
        paleMossyCherryPlanksTexturePool.button(PALE_MOSSY_CHERRY_BUTTON.get());
        paleMossyCherryPlanksTexturePool.fence(PALE_MOSSY_CHERRY_FENCE.get());
        paleMossyCherryPlanksTexturePool.fenceGate(PALE_MOSSY_CHERRY_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_CRIMSON_PLANKS.get());
        paleMossyCrimsonPlanksTexturePool.stairs(PALE_MOSSY_CRIMSON_STAIRS.get());
        paleMossyCrimsonPlanksTexturePool.slab(PALE_MOSSY_CRIMSON_SLAB.get());
        paleMossyCrimsonPlanksTexturePool.pressurePlate(PALE_MOSSY_CRIMSON_PRESSURE_PLATE.get());
        paleMossyCrimsonPlanksTexturePool.button(PALE_MOSSY_CRIMSON_BUTTON.get());
        paleMossyCrimsonPlanksTexturePool.fence(PALE_MOSSY_CRIMSON_FENCE.get());
        paleMossyCrimsonPlanksTexturePool.fenceGate(PALE_MOSSY_CRIMSON_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_DARK_OAK_PLANKS.get());
        paleMossyDarkOakPlanksTexturePool.stairs(PALE_MOSSY_DARK_OAK_STAIRS.get());
        paleMossyDarkOakPlanksTexturePool.slab(PALE_MOSSY_DARK_OAK_SLAB.get());
        paleMossyDarkOakPlanksTexturePool.pressurePlate(PALE_MOSSY_DARK_OAK_PRESSURE_PLATE.get());
        paleMossyDarkOakPlanksTexturePool.button(PALE_MOSSY_DARK_OAK_BUTTON.get());
        paleMossyDarkOakPlanksTexturePool.fence(PALE_MOSSY_DARK_OAK_FENCE.get());
        paleMossyDarkOakPlanksTexturePool.fenceGate(PALE_MOSSY_DARK_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_PALE_OAK_PLANKS.get());
        paleMossyPaleOakPlanksTexturePool.stairs(PALE_MOSSY_PALE_OAK_STAIRS.get());
        paleMossyPaleOakPlanksTexturePool.slab(PALE_MOSSY_PALE_OAK_SLAB.get());
        paleMossyPaleOakPlanksTexturePool.pressurePlate(PALE_MOSSY_PALE_OAK_PRESSURE_PLATE.get());
        paleMossyPaleOakPlanksTexturePool.button(PALE_MOSSY_PALE_OAK_BUTTON.get());
        paleMossyPaleOakPlanksTexturePool.fence(PALE_MOSSY_PALE_OAK_FENCE.get());
        paleMossyPaleOakPlanksTexturePool.fenceGate(PALE_MOSSY_PALE_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyJunglePlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_JUNGLE_PLANKS.get());
        paleMossyJunglePlanksTexturePool.stairs(PALE_MOSSY_JUNGLE_STAIRS.get());
        paleMossyJunglePlanksTexturePool.slab(PALE_MOSSY_JUNGLE_SLAB.get());
        paleMossyJunglePlanksTexturePool.pressurePlate(PALE_MOSSY_JUNGLE_PRESSURE_PLATE.get());
        paleMossyJunglePlanksTexturePool.button(PALE_MOSSY_JUNGLE_BUTTON.get());
        paleMossyJunglePlanksTexturePool.fence(PALE_MOSSY_JUNGLE_FENCE.get());
        paleMossyJunglePlanksTexturePool.fenceGate(PALE_MOSSY_JUNGLE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyMangrovePlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_MANGROVE_PLANKS.get());
        paleMossyMangrovePlanksTexturePool.stairs(PALE_MOSSY_MANGROVE_STAIRS.get());
        paleMossyMangrovePlanksTexturePool.slab(PALE_MOSSY_MANGROVE_SLAB.get());
        paleMossyMangrovePlanksTexturePool.pressurePlate(PALE_MOSSY_MANGROVE_PRESSURE_PLATE.get());
        paleMossyMangrovePlanksTexturePool.button(PALE_MOSSY_MANGROVE_BUTTON.get());
        paleMossyMangrovePlanksTexturePool.fence(PALE_MOSSY_MANGROVE_FENCE.get());
        paleMossyMangrovePlanksTexturePool.fenceGate(PALE_MOSSY_MANGROVE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyOakPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_OAK_PLANKS.get());
        paleMossyOakPlanksTexturePool.stairs(PALE_MOSSY_OAK_STAIRS.get());
        paleMossyOakPlanksTexturePool.slab(PALE_MOSSY_OAK_SLAB.get());
        paleMossyOakPlanksTexturePool.pressurePlate(PALE_MOSSY_OAK_PRESSURE_PLATE.get());
        paleMossyOakPlanksTexturePool.button(PALE_MOSSY_OAK_BUTTON.get());
        paleMossyOakPlanksTexturePool.fence(PALE_MOSSY_OAK_FENCE.get());
        paleMossyOakPlanksTexturePool.fenceGate(PALE_MOSSY_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossySprucePlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_SPRUCE_PLANKS.get());
        paleMossySprucePlanksTexturePool.stairs(PALE_MOSSY_SPRUCE_STAIRS.get());
        paleMossySprucePlanksTexturePool.slab(PALE_MOSSY_SPRUCE_SLAB.get());
        paleMossySprucePlanksTexturePool.pressurePlate(PALE_MOSSY_SPRUCE_PRESSURE_PLATE.get());
        paleMossySprucePlanksTexturePool.button(PALE_MOSSY_SPRUCE_BUTTON.get());
        paleMossySprucePlanksTexturePool.fence(PALE_MOSSY_SPRUCE_FENCE.get());
        paleMossySprucePlanksTexturePool.fenceGate(PALE_MOSSY_SPRUCE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyWarpedPlanksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_WARPED_PLANKS.get());
        paleMossyWarpedPlanksTexturePool.stairs(PALE_MOSSY_WARPED_STAIRS.get());
        paleMossyWarpedPlanksTexturePool.slab(PALE_MOSSY_WARPED_SLAB.get());
        paleMossyWarpedPlanksTexturePool.pressurePlate(PALE_MOSSY_WARPED_PRESSURE_PLATE.get());
        paleMossyWarpedPlanksTexturePool.button(PALE_MOSSY_WARPED_BUTTON.get());
        paleMossyWarpedPlanksTexturePool.fence(PALE_MOSSY_WARPED_FENCE.get());
        paleMossyWarpedPlanksTexturePool.fenceGate(PALE_MOSSY_WARPED_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyBambooMosaicTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BAMBOO_MOSAIC.get());
        paleMossyBambooMosaicTexturePool.stairs(PALE_MOSSY_BAMBOO_MOSAIC_STAIRS.get());
        paleMossyBambooMosaicTexturePool.slab(PALE_MOSSY_BAMBOO_MOSAIC_SLAB.get());

        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_GLASS.get(), PALE_MOSSY_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_BLACK_STAINED_GLASS.get(), PALE_MOSSY_BLACK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_BLUE_STAINED_GLASS.get(), PALE_MOSSY_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_BROWN_STAINED_GLASS.get(), PALE_MOSSY_BROWN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_CYAN_STAINED_GLASS.get(), PALE_MOSSY_CYAN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_GRAY_STAINED_GLASS.get(), PALE_MOSSY_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_GREEN_STAINED_GLASS.get(), PALE_MOSSY_GREEN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_LIME_STAINED_GLASS.get(), PALE_MOSSY_LIME_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_MAGENTA_STAINED_GLASS.get(), PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_ORANGE_STAINED_GLASS.get(), PALE_MOSSY_ORANGE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_PINK_STAINED_GLASS.get(), PALE_MOSSY_PINK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_PURPLE_STAINED_GLASS.get(), PALE_MOSSY_PURPLE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_RED_STAINED_GLASS.get(), PALE_MOSSY_RED_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.family(PALE_MOSSY_TINTED_GLASS.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_WHITE_STAINED_GLASS.get(), PALE_MOSSY_WHITE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(PALE_MOSSY_YELLOW_STAINED_GLASS.get(), PALE_MOSSY_YELLOW_STAINED_GLASS_PANE.get());

        blockStateModelGenerator.woodProvider(PALE_MOSSY_ACACIA_LOG.get()).log(PALE_MOSSY_ACACIA_LOG.get()).wood(PALE_MOSSY_ACACIA_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_BAMBOO_BLOCK.get()).log(PALE_MOSSY_BAMBOO_BLOCK.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_BIRCH_LOG.get()).log(PALE_MOSSY_BIRCH_LOG.get()).wood(PALE_MOSSY_BIRCH_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_CHERRY_LOG.get()).log(PALE_MOSSY_CHERRY_LOG.get()).wood(PALE_MOSSY_CHERRY_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_CRIMSON_STEM.get()).log(PALE_MOSSY_CRIMSON_STEM.get()).wood(PALE_MOSSY_CRIMSON_HYPHAE.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_DARK_OAK_LOG.get()).log(PALE_MOSSY_DARK_OAK_LOG.get()).wood(PALE_MOSSY_DARK_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_PALE_OAK_LOG.get()).log(PALE_MOSSY_PALE_OAK_LOG.get()).wood(PALE_MOSSY_PALE_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_JUNGLE_LOG.get()).log(PALE_MOSSY_JUNGLE_LOG.get()).wood(PALE_MOSSY_JUNGLE_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_MANGROVE_LOG.get()).log(PALE_MOSSY_MANGROVE_LOG.get()).wood(PALE_MOSSY_MANGROVE_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_OAK_LOG.get()).log(PALE_MOSSY_OAK_LOG.get()).wood(PALE_MOSSY_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_SPRUCE_LOG.get()).log(PALE_MOSSY_SPRUCE_LOG.get()).wood(PALE_MOSSY_SPRUCE_WOOD.get());
        blockStateModelGenerator.woodProvider(PALE_MOSSY_WARPED_STEM.get()).log(PALE_MOSSY_WARPED_STEM.get()).wood(PALE_MOSSY_WARPED_HYPHAE.get());

        registerIronBars(blockStateModelGenerator, PALE_MOSSY_IRON_BARS.get());

        blockStateModelGenerator.family(PALE_MOSSY_CHISELED_STONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_BRICKS.get());
        paleMossyBricksTexturePool.stairs(PALE_MOSSY_BRICK_STAIRS.get());
        paleMossyBricksTexturePool.slab(PALE_MOSSY_BRICK_SLAB.get());
        paleMossyBricksTexturePool.wall(PALE_MOSSY_BRICK_WALL.get());

        blockStateModelGenerator.createDoor(PALE_MOSSY_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_SPRUCE_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_BIRCH_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_JUNGLE_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_ACACIA_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_DARK_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_PALE_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_MANGROVE_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_CHERRY_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_BAMBOO_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_CRIMSON_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_WARPED_DOOR.get());
        blockStateModelGenerator.createDoor(PALE_MOSSY_IRON_DOOR.get());

        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_SPRUCE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_BIRCH_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_JUNGLE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_ACACIA_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_DARK_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_PALE_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_MANGROVE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_CHERRY_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_BAMBOO_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_CRIMSON_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_WARPED_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(PALE_MOSSY_IRON_TRAPDOOR.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(PALE_MOSSY_COBBLED_DEEPSLATE.get());
        paleMossyCobbledDeepslateTexturePool.stairs(PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
        paleMossyCobbledDeepslateTexturePool.slab(PALE_MOSSY_COBBLED_DEEPSLATE_SLAB.get());
        paleMossyCobbledDeepslateTexturePool.wall(PALE_MOSSY_COBBLED_DEEPSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyDeepslateBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_DEEPSLATE_BRICKS.get());
        paleMossyDeepslateBricksTexturePool.stairs(PALE_MOSSY_DEEPSLATE_BRICK_STAIRS.get());
        paleMossyDeepslateBricksTexturePool.slab(PALE_MOSSY_DEEPSLATE_BRICK_SLAB.get());
        paleMossyDeepslateBricksTexturePool.wall(PALE_MOSSY_DEEPSLATE_BRICK_WALL.get());

        registerDeepslate(blockStateModelGenerator, PALE_MOSSY_DEEPSLATE.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyDeepslateTilesTexturePool = blockStateModelGenerator.family(PALE_MOSSY_DEEPSLATE_TILES.get());
        paleMossyDeepslateTilesTexturePool.stairs(PALE_MOSSY_DEEPSLATE_TILE_STAIRS.get());
        paleMossyDeepslateTilesTexturePool.slab(PALE_MOSSY_DEEPSLATE_TILE_SLAB.get());
        paleMossyDeepslateTilesTexturePool.wall(PALE_MOSSY_DEEPSLATE_TILE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyTuffTexturePool = blockStateModelGenerator.family(PALE_MOSSY_TUFF.get());
        paleMossyTuffTexturePool.stairs(PALE_MOSSY_TUFF_STAIRS.get());
        paleMossyTuffTexturePool.slab(PALE_MOSSY_TUFF_SLAB.get());
        paleMossyTuffTexturePool.wall(PALE_MOSSY_TUFF_WALL.get());

        BlockModelGenerators.BlockFamilyProvider paleMossyTuffBricksTexturePool = blockStateModelGenerator.family(PALE_MOSSY_TUFF_BRICKS.get());
        paleMossyTuffBricksTexturePool.stairs(PALE_MOSSY_TUFF_BRICK_STAIRS.get());
        paleMossyTuffBricksTexturePool.slab(PALE_MOSSY_TUFF_BRICK_SLAB.get());
        paleMossyTuffBricksTexturePool.wall(PALE_MOSSY_TUFF_BRICK_WALL.get());

        blockStateModelGenerator.createFullAndCarpetBlocks(CRIMSON_MOSS_BLOCK.get(), CRIMSON_MOSS_CARPET.get());
        BlockModelGenerators.BlockFamilyProvider crimsonMossyStoneTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_STONE.get());
        crimsonMossyStoneTexturePool.stairs(CRIMSON_MOSSY_STONE_STAIRS.get());
        crimsonMossyStoneTexturePool.slab(CRIMSON_MOSSY_STONE_SLAB.get());
        crimsonMossyStoneTexturePool.pressurePlate(CRIMSON_MOSSY_STONE_PRESSURE_PLATE.get());
        crimsonMossyStoneTexturePool.button(CRIMSON_MOSSY_STONE_BUTTON.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCobblestoneTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_COBBLESTONE.get());
        crimsonMossyCobblestoneTexturePool.stairs(CRIMSON_MOSSY_COBBLESTONE_STAIRS.get());
        crimsonMossyCobblestoneTexturePool.slab(CRIMSON_MOSSY_COBBLESTONE_SLAB.get());
        crimsonMossyCobblestoneTexturePool.wall(CRIMSON_MOSSY_COBBLESTONE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyStoneBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_STONE_BRICKS.get());
        crimsonMossyStoneBricksTexturePool.stairs(CRIMSON_MOSSY_STONE_BRICK_STAIRS.get());
        crimsonMossyStoneBricksTexturePool.slab(CRIMSON_MOSSY_STONE_BRICK_SLAB.get());
        crimsonMossyStoneBricksTexturePool.wall(CRIMSON_MOSSY_STONE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_ACACIA_PLANKS.get());
        crimsonMossyAcaciaPlanksTexturePool.stairs(CRIMSON_MOSSY_ACACIA_STAIRS.get());
        crimsonMossyAcaciaPlanksTexturePool.slab(CRIMSON_MOSSY_ACACIA_SLAB.get());
        crimsonMossyAcaciaPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_ACACIA_PRESSURE_PLATE.get());
        crimsonMossyAcaciaPlanksTexturePool.button(CRIMSON_MOSSY_ACACIA_BUTTON.get());
        crimsonMossyAcaciaPlanksTexturePool.fence(CRIMSON_MOSSY_ACACIA_FENCE.get());
        crimsonMossyAcaciaPlanksTexturePool.fenceGate(CRIMSON_MOSSY_ACACIA_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBambooPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BAMBOO_PLANKS.get());
        crimsonMossyBambooPlanksTexturePool.stairs(CRIMSON_MOSSY_BAMBOO_STAIRS.get());
        crimsonMossyBambooPlanksTexturePool.slab(CRIMSON_MOSSY_BAMBOO_SLAB.get());
        crimsonMossyBambooPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_BAMBOO_PRESSURE_PLATE.get());
        crimsonMossyBambooPlanksTexturePool.button(CRIMSON_MOSSY_BAMBOO_BUTTON.get());
        crimsonMossyBambooPlanksTexturePool.fence(CRIMSON_MOSSY_BAMBOO_FENCE.get());
        crimsonMossyBambooPlanksTexturePool.fenceGate(CRIMSON_MOSSY_BAMBOO_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBirchPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BIRCH_PLANKS.get());
        crimsonMossyBirchPlanksTexturePool.stairs(CRIMSON_MOSSY_BIRCH_STAIRS.get());
        crimsonMossyBirchPlanksTexturePool.slab(CRIMSON_MOSSY_BIRCH_SLAB.get());
        crimsonMossyBirchPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_BIRCH_PRESSURE_PLATE.get());
        crimsonMossyBirchPlanksTexturePool.button(CRIMSON_MOSSY_BIRCH_BUTTON.get());
        crimsonMossyBirchPlanksTexturePool.fence(CRIMSON_MOSSY_BIRCH_FENCE.get());
        crimsonMossyBirchPlanksTexturePool.fenceGate(CRIMSON_MOSSY_BIRCH_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCherryPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_CHERRY_PLANKS.get());
        crimsonMossyCherryPlanksTexturePool.stairs(CRIMSON_MOSSY_CHERRY_STAIRS.get());
        crimsonMossyCherryPlanksTexturePool.slab(CRIMSON_MOSSY_CHERRY_SLAB.get());
        crimsonMossyCherryPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_CHERRY_PRESSURE_PLATE.get());
        crimsonMossyCherryPlanksTexturePool.button(CRIMSON_MOSSY_CHERRY_BUTTON.get());
        crimsonMossyCherryPlanksTexturePool.fence(CRIMSON_MOSSY_CHERRY_FENCE.get());
        crimsonMossyCherryPlanksTexturePool.fenceGate(CRIMSON_MOSSY_CHERRY_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_CRIMSON_PLANKS.get());
        crimsonMossyCrimsonPlanksTexturePool.stairs(CRIMSON_MOSSY_CRIMSON_STAIRS.get());
        crimsonMossyCrimsonPlanksTexturePool.slab(CRIMSON_MOSSY_CRIMSON_SLAB.get());
        crimsonMossyCrimsonPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_CRIMSON_PRESSURE_PLATE.get());
        crimsonMossyCrimsonPlanksTexturePool.button(CRIMSON_MOSSY_CRIMSON_BUTTON.get());
        crimsonMossyCrimsonPlanksTexturePool.fence(CRIMSON_MOSSY_CRIMSON_FENCE.get());
        crimsonMossyCrimsonPlanksTexturePool.fenceGate(CRIMSON_MOSSY_CRIMSON_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_DARK_OAK_PLANKS.get());
        crimsonMossyDarkOakPlanksTexturePool.stairs(CRIMSON_MOSSY_DARK_OAK_STAIRS.get());
        crimsonMossyDarkOakPlanksTexturePool.slab(CRIMSON_MOSSY_DARK_OAK_SLAB.get());
        crimsonMossyDarkOakPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_DARK_OAK_PRESSURE_PLATE.get());
        crimsonMossyDarkOakPlanksTexturePool.button(CRIMSON_MOSSY_DARK_OAK_BUTTON.get());
        crimsonMossyDarkOakPlanksTexturePool.fence(CRIMSON_MOSSY_DARK_OAK_FENCE.get());
        crimsonMossyDarkOakPlanksTexturePool.fenceGate(CRIMSON_MOSSY_DARK_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_PALE_OAK_PLANKS.get());
        crimsonMossyPaleOakPlanksTexturePool.stairs(CRIMSON_MOSSY_PALE_OAK_STAIRS.get());
        crimsonMossyPaleOakPlanksTexturePool.slab(CRIMSON_MOSSY_PALE_OAK_SLAB.get());
        crimsonMossyPaleOakPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_PALE_OAK_PRESSURE_PLATE.get());
        crimsonMossyPaleOakPlanksTexturePool.button(CRIMSON_MOSSY_PALE_OAK_BUTTON.get());
        crimsonMossyPaleOakPlanksTexturePool.fence(CRIMSON_MOSSY_PALE_OAK_FENCE.get());
        crimsonMossyPaleOakPlanksTexturePool.fenceGate(CRIMSON_MOSSY_PALE_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyJunglePlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_JUNGLE_PLANKS.get());
        crimsonMossyJunglePlanksTexturePool.stairs(CRIMSON_MOSSY_JUNGLE_STAIRS.get());
        crimsonMossyJunglePlanksTexturePool.slab(CRIMSON_MOSSY_JUNGLE_SLAB.get());
        crimsonMossyJunglePlanksTexturePool.pressurePlate(CRIMSON_MOSSY_JUNGLE_PRESSURE_PLATE.get());
        crimsonMossyJunglePlanksTexturePool.button(CRIMSON_MOSSY_JUNGLE_BUTTON.get());
        crimsonMossyJunglePlanksTexturePool.fence(CRIMSON_MOSSY_JUNGLE_FENCE.get());
        crimsonMossyJunglePlanksTexturePool.fenceGate(CRIMSON_MOSSY_JUNGLE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyMangrovePlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_MANGROVE_PLANKS.get());
        crimsonMossyMangrovePlanksTexturePool.stairs(CRIMSON_MOSSY_MANGROVE_STAIRS.get());
        crimsonMossyMangrovePlanksTexturePool.slab(CRIMSON_MOSSY_MANGROVE_SLAB.get());
        crimsonMossyMangrovePlanksTexturePool.pressurePlate(CRIMSON_MOSSY_MANGROVE_PRESSURE_PLATE.get());
        crimsonMossyMangrovePlanksTexturePool.button(CRIMSON_MOSSY_MANGROVE_BUTTON.get());
        crimsonMossyMangrovePlanksTexturePool.fence(CRIMSON_MOSSY_MANGROVE_FENCE.get());
        crimsonMossyMangrovePlanksTexturePool.fenceGate(CRIMSON_MOSSY_MANGROVE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyOakPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_OAK_PLANKS.get());
        crimsonMossyOakPlanksTexturePool.stairs(CRIMSON_MOSSY_OAK_STAIRS.get());
        crimsonMossyOakPlanksTexturePool.slab(CRIMSON_MOSSY_OAK_SLAB.get());
        crimsonMossyOakPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_OAK_PRESSURE_PLATE.get());
        crimsonMossyOakPlanksTexturePool.button(CRIMSON_MOSSY_OAK_BUTTON.get());
        crimsonMossyOakPlanksTexturePool.fence(CRIMSON_MOSSY_OAK_FENCE.get());
        crimsonMossyOakPlanksTexturePool.fenceGate(CRIMSON_MOSSY_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossySprucePlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_SPRUCE_PLANKS.get());
        crimsonMossySprucePlanksTexturePool.stairs(CRIMSON_MOSSY_SPRUCE_STAIRS.get());
        crimsonMossySprucePlanksTexturePool.slab(CRIMSON_MOSSY_SPRUCE_SLAB.get());
        crimsonMossySprucePlanksTexturePool.pressurePlate(CRIMSON_MOSSY_SPRUCE_PRESSURE_PLATE.get());
        crimsonMossySprucePlanksTexturePool.button(CRIMSON_MOSSY_SPRUCE_BUTTON.get());
        crimsonMossySprucePlanksTexturePool.fence(CRIMSON_MOSSY_SPRUCE_FENCE.get());
        crimsonMossySprucePlanksTexturePool.fenceGate(CRIMSON_MOSSY_SPRUCE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyWarpedPlanksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_WARPED_PLANKS.get());
        crimsonMossyWarpedPlanksTexturePool.stairs(CRIMSON_MOSSY_WARPED_STAIRS.get());
        crimsonMossyWarpedPlanksTexturePool.slab(CRIMSON_MOSSY_WARPED_SLAB.get());
        crimsonMossyWarpedPlanksTexturePool.pressurePlate(CRIMSON_MOSSY_WARPED_PRESSURE_PLATE.get());
        crimsonMossyWarpedPlanksTexturePool.button(CRIMSON_MOSSY_WARPED_BUTTON.get());
        crimsonMossyWarpedPlanksTexturePool.fence(CRIMSON_MOSSY_WARPED_FENCE.get());
        crimsonMossyWarpedPlanksTexturePool.fenceGate(CRIMSON_MOSSY_WARPED_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBambooMosaicTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BAMBOO_MOSAIC.get());
        crimsonMossyBambooMosaicTexturePool.stairs(CRIMSON_MOSSY_BAMBOO_MOSAIC_STAIRS.get());
        crimsonMossyBambooMosaicTexturePool.slab(CRIMSON_MOSSY_BAMBOO_MOSAIC_SLAB.get());

        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_GLASS.get(), CRIMSON_MOSSY_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_BLACK_STAINED_GLASS.get(), CRIMSON_MOSSY_BLACK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_BLUE_STAINED_GLASS.get(), CRIMSON_MOSSY_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_BROWN_STAINED_GLASS.get(), CRIMSON_MOSSY_BROWN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_CYAN_STAINED_GLASS.get(), CRIMSON_MOSSY_CYAN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_GRAY_STAINED_GLASS.get(), CRIMSON_MOSSY_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_GREEN_STAINED_GLASS.get(), CRIMSON_MOSSY_GREEN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), CRIMSON_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), CRIMSON_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_LIME_STAINED_GLASS.get(), CRIMSON_MOSSY_LIME_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_MAGENTA_STAINED_GLASS.get(), CRIMSON_MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_ORANGE_STAINED_GLASS.get(), CRIMSON_MOSSY_ORANGE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_PINK_STAINED_GLASS.get(), CRIMSON_MOSSY_PINK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_PURPLE_STAINED_GLASS.get(), CRIMSON_MOSSY_PURPLE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_RED_STAINED_GLASS.get(), CRIMSON_MOSSY_RED_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.family(CRIMSON_MOSSY_TINTED_GLASS.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_WHITE_STAINED_GLASS.get(), CRIMSON_MOSSY_WHITE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(CRIMSON_MOSSY_YELLOW_STAINED_GLASS.get(), CRIMSON_MOSSY_YELLOW_STAINED_GLASS_PANE.get());

        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_ACACIA_LOG.get()).log(CRIMSON_MOSSY_ACACIA_LOG.get()).wood(CRIMSON_MOSSY_ACACIA_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_BAMBOO_BLOCK.get()).log(CRIMSON_MOSSY_BAMBOO_BLOCK.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_BIRCH_LOG.get()).log(CRIMSON_MOSSY_BIRCH_LOG.get()).wood(CRIMSON_MOSSY_BIRCH_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_CHERRY_LOG.get()).log(CRIMSON_MOSSY_CHERRY_LOG.get()).wood(CRIMSON_MOSSY_CHERRY_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_CRIMSON_STEM.get()).log(CRIMSON_MOSSY_CRIMSON_STEM.get()).wood(CRIMSON_MOSSY_CRIMSON_HYPHAE.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_DARK_OAK_LOG.get()).log(CRIMSON_MOSSY_DARK_OAK_LOG.get()).wood(CRIMSON_MOSSY_DARK_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_PALE_OAK_LOG.get()).log(CRIMSON_MOSSY_PALE_OAK_LOG.get()).wood(CRIMSON_MOSSY_PALE_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_JUNGLE_LOG.get()).log(CRIMSON_MOSSY_JUNGLE_LOG.get()).wood(CRIMSON_MOSSY_JUNGLE_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_MANGROVE_LOG.get()).log(CRIMSON_MOSSY_MANGROVE_LOG.get()).wood(CRIMSON_MOSSY_MANGROVE_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_OAK_LOG.get()).log(CRIMSON_MOSSY_OAK_LOG.get()).wood(CRIMSON_MOSSY_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_SPRUCE_LOG.get()).log(CRIMSON_MOSSY_SPRUCE_LOG.get()).wood(CRIMSON_MOSSY_SPRUCE_WOOD.get());
        blockStateModelGenerator.woodProvider(CRIMSON_MOSSY_WARPED_STEM.get()).log(CRIMSON_MOSSY_WARPED_STEM.get()).wood(CRIMSON_MOSSY_WARPED_HYPHAE.get());

        registerIronBars(blockStateModelGenerator, CRIMSON_MOSSY_IRON_BARS.get());

        blockStateModelGenerator.family(CRIMSON_MOSSY_CHISELED_STONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_BRICKS.get());
        crimsonMossyBricksTexturePool.stairs(CRIMSON_MOSSY_BRICK_STAIRS.get());
        crimsonMossyBricksTexturePool.slab(CRIMSON_MOSSY_BRICK_SLAB.get());
        crimsonMossyBricksTexturePool.wall(CRIMSON_MOSSY_BRICK_WALL.get());

        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_SPRUCE_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_BIRCH_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_JUNGLE_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_ACACIA_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_DARK_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_PALE_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_MANGROVE_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_CHERRY_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_BAMBOO_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_CRIMSON_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_WARPED_DOOR.get());
        blockStateModelGenerator.createDoor(CRIMSON_MOSSY_IRON_DOOR.get());

        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_SPRUCE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_BIRCH_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_JUNGLE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_ACACIA_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_DARK_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_PALE_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_MANGROVE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_CHERRY_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_BAMBOO_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_CRIMSON_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_WARPED_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(CRIMSON_MOSSY_IRON_TRAPDOOR.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_COBBLED_DEEPSLATE.get());
        crimsonMossyCobbledDeepslateTexturePool.stairs(CRIMSON_MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
        crimsonMossyCobbledDeepslateTexturePool.slab(CRIMSON_MOSSY_COBBLED_DEEPSLATE_SLAB.get());
        crimsonMossyCobbledDeepslateTexturePool.wall(CRIMSON_MOSSY_COBBLED_DEEPSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyDeepslateBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_DEEPSLATE_BRICKS.get());
        crimsonMossyDeepslateBricksTexturePool.stairs(CRIMSON_MOSSY_DEEPSLATE_BRICK_STAIRS.get());
        crimsonMossyDeepslateBricksTexturePool.slab(CRIMSON_MOSSY_DEEPSLATE_BRICK_SLAB.get());
        crimsonMossyDeepslateBricksTexturePool.wall(CRIMSON_MOSSY_DEEPSLATE_BRICK_WALL.get());

        registerDeepslate(blockStateModelGenerator, CRIMSON_MOSSY_DEEPSLATE.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyDeepslateTilesTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_DEEPSLATE_TILES.get());
        crimsonMossyDeepslateTilesTexturePool.stairs(CRIMSON_MOSSY_DEEPSLATE_TILE_STAIRS.get());
        crimsonMossyDeepslateTilesTexturePool.slab(CRIMSON_MOSSY_DEEPSLATE_TILE_SLAB.get());
        crimsonMossyDeepslateTilesTexturePool.wall(CRIMSON_MOSSY_DEEPSLATE_TILE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyTuffTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_TUFF.get());
        crimsonMossyTuffTexturePool.stairs(CRIMSON_MOSSY_TUFF_STAIRS.get());
        crimsonMossyTuffTexturePool.slab(CRIMSON_MOSSY_TUFF_SLAB.get());
        crimsonMossyTuffTexturePool.wall(CRIMSON_MOSSY_TUFF_WALL.get());

        BlockModelGenerators.BlockFamilyProvider crimsonMossyTuffBricksTexturePool = blockStateModelGenerator.family(CRIMSON_MOSSY_TUFF_BRICKS.get());
        crimsonMossyTuffBricksTexturePool.stairs(CRIMSON_MOSSY_TUFF_BRICK_STAIRS.get());
        crimsonMossyTuffBricksTexturePool.slab(CRIMSON_MOSSY_TUFF_BRICK_SLAB.get());
        crimsonMossyTuffBricksTexturePool.wall(CRIMSON_MOSSY_TUFF_BRICK_WALL.get());

        blockStateModelGenerator.createFullAndCarpetBlocks(WARPED_MOSS_BLOCK.get(), WARPED_MOSS_CARPET.get());
        BlockModelGenerators.BlockFamilyProvider warpedMossyStoneTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_STONE.get());
        warpedMossyStoneTexturePool.stairs(WARPED_MOSSY_STONE_STAIRS.get());
        warpedMossyStoneTexturePool.slab(WARPED_MOSSY_STONE_SLAB.get());
        warpedMossyStoneTexturePool.pressurePlate(WARPED_MOSSY_STONE_PRESSURE_PLATE.get());
        warpedMossyStoneTexturePool.button(WARPED_MOSSY_STONE_BUTTON.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyCobblestoneTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_COBBLESTONE.get());
        warpedMossyCobblestoneTexturePool.stairs(WARPED_MOSSY_COBBLESTONE_STAIRS.get());
        warpedMossyCobblestoneTexturePool.slab(WARPED_MOSSY_COBBLESTONE_SLAB.get());
        warpedMossyCobblestoneTexturePool.wall(WARPED_MOSSY_COBBLESTONE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyStoneBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_STONE_BRICKS.get());
        warpedMossyStoneBricksTexturePool.stairs(WARPED_MOSSY_STONE_BRICK_STAIRS.get());
        warpedMossyStoneBricksTexturePool.slab(WARPED_MOSSY_STONE_BRICK_SLAB.get());
        warpedMossyStoneBricksTexturePool.wall(WARPED_MOSSY_STONE_BRICK_WALL.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyAcaciaPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_ACACIA_PLANKS.get());
        warpedMossyAcaciaPlanksTexturePool.stairs(WARPED_MOSSY_ACACIA_STAIRS.get());
        warpedMossyAcaciaPlanksTexturePool.slab(WARPED_MOSSY_ACACIA_SLAB.get());
        warpedMossyAcaciaPlanksTexturePool.pressurePlate(WARPED_MOSSY_ACACIA_PRESSURE_PLATE.get());
        warpedMossyAcaciaPlanksTexturePool.button(WARPED_MOSSY_ACACIA_BUTTON.get());
        warpedMossyAcaciaPlanksTexturePool.fence(WARPED_MOSSY_ACACIA_FENCE.get());
        warpedMossyAcaciaPlanksTexturePool.fenceGate(WARPED_MOSSY_ACACIA_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyBambooPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BAMBOO_PLANKS.get());
        warpedMossyBambooPlanksTexturePool.stairs(WARPED_MOSSY_BAMBOO_STAIRS.get());
        warpedMossyBambooPlanksTexturePool.slab(WARPED_MOSSY_BAMBOO_SLAB.get());
        warpedMossyBambooPlanksTexturePool.pressurePlate(WARPED_MOSSY_BAMBOO_PRESSURE_PLATE.get());
        warpedMossyBambooPlanksTexturePool.button(WARPED_MOSSY_BAMBOO_BUTTON.get());
        warpedMossyBambooPlanksTexturePool.fence(WARPED_MOSSY_BAMBOO_FENCE.get());
        warpedMossyBambooPlanksTexturePool.fenceGate(WARPED_MOSSY_BAMBOO_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyBirchPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BIRCH_PLANKS.get());
        warpedMossyBirchPlanksTexturePool.stairs(WARPED_MOSSY_BIRCH_STAIRS.get());
        warpedMossyBirchPlanksTexturePool.slab(WARPED_MOSSY_BIRCH_SLAB.get());
        warpedMossyBirchPlanksTexturePool.pressurePlate(WARPED_MOSSY_BIRCH_PRESSURE_PLATE.get());
        warpedMossyBirchPlanksTexturePool.button(WARPED_MOSSY_BIRCH_BUTTON.get());
        warpedMossyBirchPlanksTexturePool.fence(WARPED_MOSSY_BIRCH_FENCE.get());
        warpedMossyBirchPlanksTexturePool.fenceGate(WARPED_MOSSY_BIRCH_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyCherryPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_CHERRY_PLANKS.get());
        warpedMossyCherryPlanksTexturePool.stairs(WARPED_MOSSY_CHERRY_STAIRS.get());
        warpedMossyCherryPlanksTexturePool.slab(WARPED_MOSSY_CHERRY_SLAB.get());
        warpedMossyCherryPlanksTexturePool.pressurePlate(WARPED_MOSSY_CHERRY_PRESSURE_PLATE.get());
        warpedMossyCherryPlanksTexturePool.button(WARPED_MOSSY_CHERRY_BUTTON.get());
        warpedMossyCherryPlanksTexturePool.fence(WARPED_MOSSY_CHERRY_FENCE.get());
        warpedMossyCherryPlanksTexturePool.fenceGate(WARPED_MOSSY_CHERRY_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyCrimsonPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_CRIMSON_PLANKS.get());
        warpedMossyCrimsonPlanksTexturePool.stairs(WARPED_MOSSY_CRIMSON_STAIRS.get());
        warpedMossyCrimsonPlanksTexturePool.slab(WARPED_MOSSY_CRIMSON_SLAB.get());
        warpedMossyCrimsonPlanksTexturePool.pressurePlate(WARPED_MOSSY_CRIMSON_PRESSURE_PLATE.get());
        warpedMossyCrimsonPlanksTexturePool.button(WARPED_MOSSY_CRIMSON_BUTTON.get());
        warpedMossyCrimsonPlanksTexturePool.fence(WARPED_MOSSY_CRIMSON_FENCE.get());
        warpedMossyCrimsonPlanksTexturePool.fenceGate(WARPED_MOSSY_CRIMSON_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyDarkOakPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_DARK_OAK_PLANKS.get());
        warpedMossyDarkOakPlanksTexturePool.stairs(WARPED_MOSSY_DARK_OAK_STAIRS.get());
        warpedMossyDarkOakPlanksTexturePool.slab(WARPED_MOSSY_DARK_OAK_SLAB.get());
        warpedMossyDarkOakPlanksTexturePool.pressurePlate(WARPED_MOSSY_DARK_OAK_PRESSURE_PLATE.get());
        warpedMossyDarkOakPlanksTexturePool.button(WARPED_MOSSY_DARK_OAK_BUTTON.get());
        warpedMossyDarkOakPlanksTexturePool.fence(WARPED_MOSSY_DARK_OAK_FENCE.get());
        warpedMossyDarkOakPlanksTexturePool.fenceGate(WARPED_MOSSY_DARK_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyPaleOakPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_PALE_OAK_PLANKS.get());
        warpedMossyPaleOakPlanksTexturePool.stairs(WARPED_MOSSY_PALE_OAK_STAIRS.get());
        warpedMossyPaleOakPlanksTexturePool.slab(WARPED_MOSSY_PALE_OAK_SLAB.get());
        warpedMossyPaleOakPlanksTexturePool.pressurePlate(WARPED_MOSSY_PALE_OAK_PRESSURE_PLATE.get());
        warpedMossyPaleOakPlanksTexturePool.button(WARPED_MOSSY_PALE_OAK_BUTTON.get());
        warpedMossyPaleOakPlanksTexturePool.fence(WARPED_MOSSY_PALE_OAK_FENCE.get());
        warpedMossyPaleOakPlanksTexturePool.fenceGate(WARPED_MOSSY_PALE_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyJunglePlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_JUNGLE_PLANKS.get());
        warpedMossyJunglePlanksTexturePool.stairs(WARPED_MOSSY_JUNGLE_STAIRS.get());
        warpedMossyJunglePlanksTexturePool.slab(WARPED_MOSSY_JUNGLE_SLAB.get());
        warpedMossyJunglePlanksTexturePool.pressurePlate(WARPED_MOSSY_JUNGLE_PRESSURE_PLATE.get());
        warpedMossyJunglePlanksTexturePool.button(WARPED_MOSSY_JUNGLE_BUTTON.get());
        warpedMossyJunglePlanksTexturePool.fence(WARPED_MOSSY_JUNGLE_FENCE.get());
        warpedMossyJunglePlanksTexturePool.fenceGate(WARPED_MOSSY_JUNGLE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyMangrovePlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_MANGROVE_PLANKS.get());
        warpedMossyMangrovePlanksTexturePool.stairs(WARPED_MOSSY_MANGROVE_STAIRS.get());
        warpedMossyMangrovePlanksTexturePool.slab(WARPED_MOSSY_MANGROVE_SLAB.get());
        warpedMossyMangrovePlanksTexturePool.pressurePlate(WARPED_MOSSY_MANGROVE_PRESSURE_PLATE.get());
        warpedMossyMangrovePlanksTexturePool.button(WARPED_MOSSY_MANGROVE_BUTTON.get());
        warpedMossyMangrovePlanksTexturePool.fence(WARPED_MOSSY_MANGROVE_FENCE.get());
        warpedMossyMangrovePlanksTexturePool.fenceGate(WARPED_MOSSY_MANGROVE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyOakPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_OAK_PLANKS.get());
        warpedMossyOakPlanksTexturePool.stairs(WARPED_MOSSY_OAK_STAIRS.get());
        warpedMossyOakPlanksTexturePool.slab(WARPED_MOSSY_OAK_SLAB.get());
        warpedMossyOakPlanksTexturePool.pressurePlate(WARPED_MOSSY_OAK_PRESSURE_PLATE.get());
        warpedMossyOakPlanksTexturePool.button(WARPED_MOSSY_OAK_BUTTON.get());
        warpedMossyOakPlanksTexturePool.fence(WARPED_MOSSY_OAK_FENCE.get());
        warpedMossyOakPlanksTexturePool.fenceGate(WARPED_MOSSY_OAK_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossySprucePlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_SPRUCE_PLANKS.get());
        warpedMossySprucePlanksTexturePool.stairs(WARPED_MOSSY_SPRUCE_STAIRS.get());
        warpedMossySprucePlanksTexturePool.slab(WARPED_MOSSY_SPRUCE_SLAB.get());
        warpedMossySprucePlanksTexturePool.pressurePlate(WARPED_MOSSY_SPRUCE_PRESSURE_PLATE.get());
        warpedMossySprucePlanksTexturePool.button(WARPED_MOSSY_SPRUCE_BUTTON.get());
        warpedMossySprucePlanksTexturePool.fence(WARPED_MOSSY_SPRUCE_FENCE.get());
        warpedMossySprucePlanksTexturePool.fenceGate(WARPED_MOSSY_SPRUCE_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyWarpedPlanksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_WARPED_PLANKS.get());
        warpedMossyWarpedPlanksTexturePool.stairs(WARPED_MOSSY_WARPED_STAIRS.get());
        warpedMossyWarpedPlanksTexturePool.slab(WARPED_MOSSY_WARPED_SLAB.get());
        warpedMossyWarpedPlanksTexturePool.pressurePlate(WARPED_MOSSY_WARPED_PRESSURE_PLATE.get());
        warpedMossyWarpedPlanksTexturePool.button(WARPED_MOSSY_WARPED_BUTTON.get());
        warpedMossyWarpedPlanksTexturePool.fence(WARPED_MOSSY_WARPED_FENCE.get());
        warpedMossyWarpedPlanksTexturePool.fenceGate(WARPED_MOSSY_WARPED_FENCE_GATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyBambooMosaicTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BAMBOO_MOSAIC.get());
        warpedMossyBambooMosaicTexturePool.stairs(WARPED_MOSSY_BAMBOO_MOSAIC_STAIRS.get());
        warpedMossyBambooMosaicTexturePool.slab(WARPED_MOSSY_BAMBOO_MOSAIC_SLAB.get());

        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_GLASS.get(), WARPED_MOSSY_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_BLACK_STAINED_GLASS.get(), WARPED_MOSSY_BLACK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_BLUE_STAINED_GLASS.get(), WARPED_MOSSY_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_BROWN_STAINED_GLASS.get(), WARPED_MOSSY_BROWN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_CYAN_STAINED_GLASS.get(), WARPED_MOSSY_CYAN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_GRAY_STAINED_GLASS.get(), WARPED_MOSSY_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_GREEN_STAINED_GLASS.get(), WARPED_MOSSY_GREEN_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS.get(), WARPED_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS.get(), WARPED_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_LIME_STAINED_GLASS.get(), WARPED_MOSSY_LIME_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_MAGENTA_STAINED_GLASS.get(), WARPED_MOSSY_MAGENTA_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_ORANGE_STAINED_GLASS.get(), WARPED_MOSSY_ORANGE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_PINK_STAINED_GLASS.get(), WARPED_MOSSY_PINK_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_PURPLE_STAINED_GLASS.get(), WARPED_MOSSY_PURPLE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_RED_STAINED_GLASS.get(), WARPED_MOSSY_RED_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.family(WARPED_MOSSY_TINTED_GLASS.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_WHITE_STAINED_GLASS.get(), WARPED_MOSSY_WHITE_STAINED_GLASS_PANE.get());
        blockStateModelGenerator.createGlassBlocks(WARPED_MOSSY_YELLOW_STAINED_GLASS.get(), WARPED_MOSSY_YELLOW_STAINED_GLASS_PANE.get());

        blockStateModelGenerator.woodProvider(WARPED_MOSSY_ACACIA_LOG.get()).log(WARPED_MOSSY_ACACIA_LOG.get()).wood(WARPED_MOSSY_ACACIA_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_BAMBOO_BLOCK.get()).log(WARPED_MOSSY_BAMBOO_BLOCK.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_BIRCH_LOG.get()).log(WARPED_MOSSY_BIRCH_LOG.get()).wood(WARPED_MOSSY_BIRCH_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_CHERRY_LOG.get()).log(WARPED_MOSSY_CHERRY_LOG.get()).wood(WARPED_MOSSY_CHERRY_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_CRIMSON_STEM.get()).log(WARPED_MOSSY_CRIMSON_STEM.get()).wood(WARPED_MOSSY_CRIMSON_HYPHAE.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_DARK_OAK_LOG.get()).log(WARPED_MOSSY_DARK_OAK_LOG.get()).wood(WARPED_MOSSY_DARK_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_PALE_OAK_LOG.get()).log(WARPED_MOSSY_PALE_OAK_LOG.get()).wood(WARPED_MOSSY_PALE_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_JUNGLE_LOG.get()).log(WARPED_MOSSY_JUNGLE_LOG.get()).wood(WARPED_MOSSY_JUNGLE_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_MANGROVE_LOG.get()).log(WARPED_MOSSY_MANGROVE_LOG.get()).wood(WARPED_MOSSY_MANGROVE_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_OAK_LOG.get()).log(WARPED_MOSSY_OAK_LOG.get()).wood(WARPED_MOSSY_OAK_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_SPRUCE_LOG.get()).log(WARPED_MOSSY_SPRUCE_LOG.get()).wood(WARPED_MOSSY_SPRUCE_WOOD.get());
        blockStateModelGenerator.woodProvider(WARPED_MOSSY_WARPED_STEM.get()).log(WARPED_MOSSY_WARPED_STEM.get()).wood(WARPED_MOSSY_WARPED_HYPHAE.get());

        registerIronBars(blockStateModelGenerator, WARPED_MOSSY_IRON_BARS.get());

        blockStateModelGenerator.family(WARPED_MOSSY_CHISELED_STONE_BRICKS.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_BRICKS.get());
        warpedMossyBricksTexturePool.stairs(WARPED_MOSSY_BRICK_STAIRS.get());
        warpedMossyBricksTexturePool.slab(WARPED_MOSSY_BRICK_SLAB.get());
        warpedMossyBricksTexturePool.wall(WARPED_MOSSY_BRICK_WALL.get());

        blockStateModelGenerator.createDoor(WARPED_MOSSY_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_SPRUCE_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_BIRCH_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_JUNGLE_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_ACACIA_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_DARK_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_PALE_OAK_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_MANGROVE_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_CHERRY_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_BAMBOO_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_CRIMSON_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_WARPED_DOOR.get());
        blockStateModelGenerator.createDoor(WARPED_MOSSY_IRON_DOOR.get());

        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_SPRUCE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_BIRCH_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_JUNGLE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_ACACIA_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_DARK_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_PALE_OAK_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_MANGROVE_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_CHERRY_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_BAMBOO_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_CRIMSON_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_WARPED_TRAPDOOR.get());
        blockStateModelGenerator.createTrapdoor(WARPED_MOSSY_IRON_TRAPDOOR.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyCobbledDeepslateTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_COBBLED_DEEPSLATE.get());
        warpedMossyCobbledDeepslateTexturePool.stairs(WARPED_MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
        warpedMossyCobbledDeepslateTexturePool.slab(WARPED_MOSSY_COBBLED_DEEPSLATE_SLAB.get());
        warpedMossyCobbledDeepslateTexturePool.wall(WARPED_MOSSY_COBBLED_DEEPSLATE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyDeepslateBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_DEEPSLATE_BRICKS.get());
        warpedMossyDeepslateBricksTexturePool.stairs(WARPED_MOSSY_DEEPSLATE_BRICK_STAIRS.get());
        warpedMossyDeepslateBricksTexturePool.slab(WARPED_MOSSY_DEEPSLATE_BRICK_SLAB.get());
        warpedMossyDeepslateBricksTexturePool.wall(WARPED_MOSSY_DEEPSLATE_BRICK_WALL.get());

        registerDeepslate(blockStateModelGenerator, WARPED_MOSSY_DEEPSLATE.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyDeepslateTilesTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_DEEPSLATE_TILES.get());
        warpedMossyDeepslateTilesTexturePool.stairs(WARPED_MOSSY_DEEPSLATE_TILE_STAIRS.get());
        warpedMossyDeepslateTilesTexturePool.slab(WARPED_MOSSY_DEEPSLATE_TILE_SLAB.get());
        warpedMossyDeepslateTilesTexturePool.wall(WARPED_MOSSY_DEEPSLATE_TILE_WALL.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyTuffTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_TUFF.get());
        warpedMossyTuffTexturePool.stairs(WARPED_MOSSY_TUFF_STAIRS.get());
        warpedMossyTuffTexturePool.slab(WARPED_MOSSY_TUFF_SLAB.get());
        warpedMossyTuffTexturePool.wall(WARPED_MOSSY_TUFF_WALL.get());

        BlockModelGenerators.BlockFamilyProvider warpedMossyTuffBricksTexturePool = blockStateModelGenerator.family(WARPED_MOSSY_TUFF_BRICKS.get());
        warpedMossyTuffBricksTexturePool.stairs(WARPED_MOSSY_TUFF_BRICK_STAIRS.get());
        warpedMossyTuffBricksTexturePool.slab(WARPED_MOSSY_TUFF_BRICK_SLAB.get());
        warpedMossyTuffBricksTexturePool.wall(WARPED_MOSSY_TUFF_BRICK_WALL.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(NemosMossyItems.MOSS_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(NemosMossyItems.PALE_MOSS_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(NemosMossyItems.CRIMSON_MOSS_BALL.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(NemosMossyItems.WARPED_MOSS_BALL.get(), ModelTemplates.FLAT_ITEM);
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
