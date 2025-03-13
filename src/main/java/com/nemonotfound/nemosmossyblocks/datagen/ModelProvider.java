package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Block;
import net.minecraft.client.data.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.block.ModBlocks.*;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool mossyStoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_STONE);
        mossyStoneTexturePool.stairs(MOSSY_STONE_STAIRS);
        mossyStoneTexturePool.slab(MOSSY_STONE_SLAB);
        mossyStoneTexturePool.pressurePlate(MOSSY_STONE_PRESSURE_PLATE);
        mossyStoneTexturePool.button(MOSSY_STONE_BUTTON);

        BlockStateModelGenerator.BlockTexturePool mossyAcaciaPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_ACACIA_PLANKS);
        mossyAcaciaPlanksTexturePool.stairs(MOSSY_ACACIA_STAIRS);
        mossyAcaciaPlanksTexturePool.slab(MOSSY_ACACIA_SLAB);
        mossyAcaciaPlanksTexturePool.pressurePlate(MOSSY_ACACIA_PRESSURE_PLATE);
        mossyAcaciaPlanksTexturePool.button(MOSSY_ACACIA_BUTTON);
        mossyAcaciaPlanksTexturePool.fence(MOSSY_ACACIA_FENCE);
        mossyAcaciaPlanksTexturePool.fenceGate(MOSSY_ACACIA_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyBambooPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BAMBOO_PLANKS);
        mossyBambooPlanksTexturePool.stairs(MOSSY_BAMBOO_STAIRS);
        mossyBambooPlanksTexturePool.slab(MOSSY_BAMBOO_SLAB);
        mossyBambooPlanksTexturePool.pressurePlate(MOSSY_BAMBOO_PRESSURE_PLATE);
        mossyBambooPlanksTexturePool.button(MOSSY_BAMBOO_BUTTON);
        mossyBambooPlanksTexturePool.fence(MOSSY_BAMBOO_FENCE);
        mossyBambooPlanksTexturePool.fenceGate(MOSSY_BAMBOO_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyBirchPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BIRCH_PLANKS);
        mossyBirchPlanksTexturePool.stairs(MOSSY_BIRCH_STAIRS);
        mossyBirchPlanksTexturePool.slab(MOSSY_BIRCH_SLAB);
        mossyBirchPlanksTexturePool.pressurePlate(MOSSY_BIRCH_PRESSURE_PLATE);
        mossyBirchPlanksTexturePool.button(MOSSY_BIRCH_BUTTON);
        mossyBirchPlanksTexturePool.fence(MOSSY_BIRCH_FENCE);
        mossyBirchPlanksTexturePool.fenceGate(MOSSY_BIRCH_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyCherryPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_CHERRY_PLANKS);
        mossyCherryPlanksTexturePool.stairs(MOSSY_CHERRY_STAIRS);
        mossyCherryPlanksTexturePool.slab(MOSSY_CHERRY_SLAB);
        mossyCherryPlanksTexturePool.pressurePlate(MOSSY_CHERRY_PRESSURE_PLATE);
        mossyCherryPlanksTexturePool.button(MOSSY_CHERRY_BUTTON);
        mossyCherryPlanksTexturePool.fence(MOSSY_CHERRY_FENCE);
        mossyCherryPlanksTexturePool.fenceGate(MOSSY_CHERRY_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyCrimsonPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_CRIMSON_PLANKS);
        mossyCrimsonPlanksTexturePool.stairs(MOSSY_CRIMSON_STAIRS);
        mossyCrimsonPlanksTexturePool.slab(MOSSY_CRIMSON_SLAB);
        mossyCrimsonPlanksTexturePool.pressurePlate(MOSSY_CRIMSON_PRESSURE_PLATE);
        mossyCrimsonPlanksTexturePool.button(MOSSY_CRIMSON_BUTTON);
        mossyCrimsonPlanksTexturePool.fence(MOSSY_CRIMSON_FENCE);
        mossyCrimsonPlanksTexturePool.fenceGate(MOSSY_CRIMSON_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyDarkOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DARK_OAK_PLANKS);
        mossyDarkOakPlanksTexturePool.stairs(MOSSY_DARK_OAK_STAIRS);
        mossyDarkOakPlanksTexturePool.slab(MOSSY_DARK_OAK_SLAB);
        mossyDarkOakPlanksTexturePool.pressurePlate(MOSSY_DARK_OAK_PRESSURE_PLATE);
        mossyDarkOakPlanksTexturePool.button(MOSSY_DARK_OAK_BUTTON);
        mossyDarkOakPlanksTexturePool.fence(MOSSY_DARK_OAK_FENCE);
        mossyDarkOakPlanksTexturePool.fenceGate(MOSSY_DARK_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyPaleOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_PALE_OAK_PLANKS);
        mossyPaleOakPlanksTexturePool.stairs(MOSSY_PALE_OAK_STAIRS);
        mossyPaleOakPlanksTexturePool.slab(MOSSY_PALE_OAK_SLAB);
        mossyPaleOakPlanksTexturePool.pressurePlate(MOSSY_PALE_OAK_PRESSURE_PLATE);
        mossyPaleOakPlanksTexturePool.button(MOSSY_PALE_OAK_BUTTON);
        mossyPaleOakPlanksTexturePool.fence(MOSSY_PALE_OAK_FENCE);
        mossyPaleOakPlanksTexturePool.fenceGate(MOSSY_PALE_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyJunglePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_JUNGLE_PLANKS);
        mossyJunglePlanksTexturePool.stairs(MOSSY_JUNGLE_STAIRS);
        mossyJunglePlanksTexturePool.slab(MOSSY_JUNGLE_SLAB);
        mossyJunglePlanksTexturePool.pressurePlate(MOSSY_JUNGLE_PRESSURE_PLATE);
        mossyJunglePlanksTexturePool.button(MOSSY_JUNGLE_BUTTON);
        mossyJunglePlanksTexturePool.fence(MOSSY_JUNGLE_FENCE);
        mossyJunglePlanksTexturePool.fenceGate(MOSSY_JUNGLE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyMangrovePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_MANGROVE_PLANKS);
        mossyMangrovePlanksTexturePool.stairs(MOSSY_MANGROVE_STAIRS);
        mossyMangrovePlanksTexturePool.slab(MOSSY_MANGROVE_SLAB);
        mossyMangrovePlanksTexturePool.pressurePlate(MOSSY_MANGROVE_PRESSURE_PLATE);
        mossyMangrovePlanksTexturePool.button(MOSSY_MANGROVE_BUTTON);
        mossyMangrovePlanksTexturePool.fence(MOSSY_MANGROVE_FENCE);
        mossyMangrovePlanksTexturePool.fenceGate(MOSSY_MANGROVE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_OAK_PLANKS);
        mossyOakPlanksTexturePool.stairs(MOSSY_OAK_STAIRS);
        mossyOakPlanksTexturePool.slab(MOSSY_OAK_SLAB);
        mossyOakPlanksTexturePool.pressurePlate(MOSSY_OAK_PRESSURE_PLATE);
        mossyOakPlanksTexturePool.button(MOSSY_OAK_BUTTON);
        mossyOakPlanksTexturePool.fence(MOSSY_OAK_FENCE);
        mossyOakPlanksTexturePool.fenceGate(MOSSY_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossySprucePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_SPRUCE_PLANKS);
        mossySprucePlanksTexturePool.stairs(MOSSY_SPRUCE_STAIRS);
        mossySprucePlanksTexturePool.slab(MOSSY_SPRUCE_SLAB);
        mossySprucePlanksTexturePool.pressurePlate(MOSSY_SPRUCE_PRESSURE_PLATE);
        mossySprucePlanksTexturePool.button(MOSSY_SPRUCE_BUTTON);
        mossySprucePlanksTexturePool.fence(MOSSY_SPRUCE_FENCE);
        mossySprucePlanksTexturePool.fenceGate(MOSSY_SPRUCE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyWarpedPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_WARPED_PLANKS);
        mossyWarpedPlanksTexturePool.stairs(MOSSY_WARPED_STAIRS);
        mossyWarpedPlanksTexturePool.slab(MOSSY_WARPED_SLAB);
        mossyWarpedPlanksTexturePool.pressurePlate(MOSSY_WARPED_PRESSURE_PLATE);
        mossyWarpedPlanksTexturePool.button(MOSSY_WARPED_BUTTON);
        mossyWarpedPlanksTexturePool.fence(MOSSY_WARPED_FENCE);
        mossyWarpedPlanksTexturePool.fenceGate(MOSSY_WARPED_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool mossyBambooMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BAMBOO_MOSAIC);
        mossyBambooMosaicTexturePool.stairs(MOSSY_BAMBOO_MOSAIC_STAIRS);
        mossyBambooMosaicTexturePool.slab(MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.registerGlassAndPane(MOSSY_GLASS, MOSSY_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_BLACK_STAINED_GLASS, MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_BLUE_STAINED_GLASS, MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_BROWN_STAINED_GLASS, MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_CYAN_STAINED_GLASS, MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_GRAY_STAINED_GLASS, MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_GREEN_STAINED_GLASS, MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_LIGHT_BLUE_STAINED_GLASS, MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_LIGHT_GRAY_STAINED_GLASS, MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_LIME_STAINED_GLASS, MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_MAGENTA_STAINED_GLASS, MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_ORANGE_STAINED_GLASS, MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_PINK_STAINED_GLASS, MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_PURPLE_STAINED_GLASS, MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_RED_STAINED_GLASS, MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_TINTED_GLASS);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_WHITE_STAINED_GLASS, MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(MOSSY_YELLOW_STAINED_GLASS, MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.registerLog(MOSSY_ACACIA_LOG).log(MOSSY_ACACIA_LOG).wood(MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_BAMBOO_BLOCK).log(MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.registerLog(MOSSY_BIRCH_LOG).log(MOSSY_BIRCH_LOG).wood(MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_CHERRY_LOG).log(MOSSY_CHERRY_LOG).wood(MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_CRIMSON_STEM).log(MOSSY_CRIMSON_STEM).wood(MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.registerLog(MOSSY_DARK_OAK_LOG).log(MOSSY_DARK_OAK_LOG).wood(MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_PALE_OAK_LOG).log(MOSSY_PALE_OAK_LOG).wood(MOSSY_PALE_OAK_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_JUNGLE_LOG).log(MOSSY_JUNGLE_LOG).wood(MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_MANGROVE_LOG).log(MOSSY_MANGROVE_LOG).wood(MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_OAK_LOG).log(MOSSY_OAK_LOG).wood(MOSSY_OAK_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_SPRUCE_LOG).log(MOSSY_SPRUCE_LOG).wood(MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.registerLog(MOSSY_WARPED_STEM).stem(MOSSY_WARPED_STEM).wood(MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator, MOSSY_IRON_BARS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_CHISELED_STONE_BRICKS);
        blockStateModelGenerator.registerParented(MOSSY_CHISELED_STONE_BRICKS, INFESTED_MOSSY_CHISELED_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool mossyBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_BRICKS);
        mossyBricksTexturePool.stairs(MOSSY_BRICK_STAIRS);
        mossyBricksTexturePool.slab(MOSSY_BRICK_SLAB);
        mossyBricksTexturePool.wall(MOSSY_BRICK_WALL);

        blockStateModelGenerator.registerDoor(MOSSY_OAK_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(MOSSY_PALE_OAK_DOOR);
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
        blockStateModelGenerator.registerTrapdoor(MOSSY_PALE_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(MOSSY_IRON_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool mossyCobbledDeepslateTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_COBBLED_DEEPSLATE);
        mossyCobbledDeepslateTexturePool.stairs(MOSSY_COBBLED_DEEPSLATE_STAIRS);
        mossyCobbledDeepslateTexturePool.slab(MOSSY_COBBLED_DEEPSLATE_SLAB);
        mossyCobbledDeepslateTexturePool.wall(MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyDeepslateBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DEEPSLATE_BRICKS);
        mossyDeepslateBricksTexturePool.stairs(MOSSY_DEEPSLATE_BRICK_STAIRS);
        mossyDeepslateBricksTexturePool.slab(MOSSY_DEEPSLATE_BRICK_SLAB);
        mossyDeepslateBricksTexturePool.wall(MOSSY_DEEPSLATE_BRICK_WALL);
        
        registerDeepslate(blockStateModelGenerator, MOSSY_DEEPSLATE);

        BlockStateModelGenerator.BlockTexturePool mossyDeepslateTilesTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_DEEPSLATE_TILES);
        mossyDeepslateTilesTexturePool.stairs(MOSSY_DEEPSLATE_TILE_STAIRS);
        mossyDeepslateTilesTexturePool.slab(MOSSY_DEEPSLATE_TILE_SLAB);
        mossyDeepslateTilesTexturePool.wall(MOSSY_DEEPSLATE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyTuffTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_TUFF);
        mossyTuffTexturePool.stairs(MOSSY_TUFF_STAIRS);
        mossyTuffTexturePool.slab(MOSSY_TUFF_SLAB);
        mossyTuffTexturePool.wall(MOSSY_TUFF_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyTuffBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(MOSSY_TUFF_BRICKS);
        mossyTuffBricksTexturePool.stairs(MOSSY_TUFF_BRICK_STAIRS);
        mossyTuffBricksTexturePool.slab(MOSSY_TUFF_BRICK_SLAB);
        mossyTuffBricksTexturePool.wall(MOSSY_TUFF_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool paleMossyStoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_STONE);
        paleMossyStoneTexturePool.stairs(PALE_MOSSY_STONE_STAIRS);
        paleMossyStoneTexturePool.slab(PALE_MOSSY_STONE_SLAB);
        paleMossyStoneTexturePool.pressurePlate(PALE_MOSSY_STONE_PRESSURE_PLATE);
        paleMossyStoneTexturePool.button(PALE_MOSSY_STONE_BUTTON);

        BlockStateModelGenerator.BlockTexturePool paleMossyCobblestoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_COBBLESTONE);
        paleMossyCobblestoneTexturePool.stairs(PALE_MOSSY_COBBLESTONE_STAIRS);
        paleMossyCobblestoneTexturePool.slab(PALE_MOSSY_COBBLESTONE_SLAB);
        paleMossyCobblestoneTexturePool.wall(PALE_MOSSY_COBBLESTONE_WALL);

        BlockStateModelGenerator.BlockTexturePool paleMossyStoneBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_STONE_BRICKS);
        paleMossyStoneBricksTexturePool.stairs(PALE_MOSSY_STONE_BRICK_STAIRS);
        paleMossyStoneBricksTexturePool.slab(PALE_MOSSY_STONE_BRICK_SLAB);
        paleMossyStoneBricksTexturePool.wall(PALE_MOSSY_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool paleMossyAcaciaPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_ACACIA_PLANKS);
        paleMossyAcaciaPlanksTexturePool.stairs(PALE_MOSSY_ACACIA_STAIRS);
        paleMossyAcaciaPlanksTexturePool.slab(PALE_MOSSY_ACACIA_SLAB);
        paleMossyAcaciaPlanksTexturePool.pressurePlate(PALE_MOSSY_ACACIA_PRESSURE_PLATE);
        paleMossyAcaciaPlanksTexturePool.button(PALE_MOSSY_ACACIA_BUTTON);
        paleMossyAcaciaPlanksTexturePool.fence(PALE_MOSSY_ACACIA_FENCE);
        paleMossyAcaciaPlanksTexturePool.fenceGate(PALE_MOSSY_ACACIA_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyBambooPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_BAMBOO_PLANKS);
        paleMossyBambooPlanksTexturePool.stairs(PALE_MOSSY_BAMBOO_STAIRS);
        paleMossyBambooPlanksTexturePool.slab(PALE_MOSSY_BAMBOO_SLAB);
        paleMossyBambooPlanksTexturePool.pressurePlate(PALE_MOSSY_BAMBOO_PRESSURE_PLATE);
        paleMossyBambooPlanksTexturePool.button(PALE_MOSSY_BAMBOO_BUTTON);
        paleMossyBambooPlanksTexturePool.fence(PALE_MOSSY_BAMBOO_FENCE);
        paleMossyBambooPlanksTexturePool.fenceGate(PALE_MOSSY_BAMBOO_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyBirchPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_BIRCH_PLANKS);
        paleMossyBirchPlanksTexturePool.stairs(PALE_MOSSY_BIRCH_STAIRS);
        paleMossyBirchPlanksTexturePool.slab(PALE_MOSSY_BIRCH_SLAB);
        paleMossyBirchPlanksTexturePool.pressurePlate(PALE_MOSSY_BIRCH_PRESSURE_PLATE);
        paleMossyBirchPlanksTexturePool.button(PALE_MOSSY_BIRCH_BUTTON);
        paleMossyBirchPlanksTexturePool.fence(PALE_MOSSY_BIRCH_FENCE);
        paleMossyBirchPlanksTexturePool.fenceGate(PALE_MOSSY_BIRCH_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyCherryPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_CHERRY_PLANKS);
        paleMossyCherryPlanksTexturePool.stairs(PALE_MOSSY_CHERRY_STAIRS);
        paleMossyCherryPlanksTexturePool.slab(PALE_MOSSY_CHERRY_SLAB);
        paleMossyCherryPlanksTexturePool.pressurePlate(PALE_MOSSY_CHERRY_PRESSURE_PLATE);
        paleMossyCherryPlanksTexturePool.button(PALE_MOSSY_CHERRY_BUTTON);
        paleMossyCherryPlanksTexturePool.fence(PALE_MOSSY_CHERRY_FENCE);
        paleMossyCherryPlanksTexturePool.fenceGate(PALE_MOSSY_CHERRY_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyCrimsonPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_CRIMSON_PLANKS);
        paleMossyCrimsonPlanksTexturePool.stairs(PALE_MOSSY_CRIMSON_STAIRS);
        paleMossyCrimsonPlanksTexturePool.slab(PALE_MOSSY_CRIMSON_SLAB);
        paleMossyCrimsonPlanksTexturePool.pressurePlate(PALE_MOSSY_CRIMSON_PRESSURE_PLATE);
        paleMossyCrimsonPlanksTexturePool.button(PALE_MOSSY_CRIMSON_BUTTON);
        paleMossyCrimsonPlanksTexturePool.fence(PALE_MOSSY_CRIMSON_FENCE);
        paleMossyCrimsonPlanksTexturePool.fenceGate(PALE_MOSSY_CRIMSON_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyDarkOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_DARK_OAK_PLANKS);
        paleMossyDarkOakPlanksTexturePool.stairs(PALE_MOSSY_DARK_OAK_STAIRS);
        paleMossyDarkOakPlanksTexturePool.slab(PALE_MOSSY_DARK_OAK_SLAB);
        paleMossyDarkOakPlanksTexturePool.pressurePlate(PALE_MOSSY_DARK_OAK_PRESSURE_PLATE);
        paleMossyDarkOakPlanksTexturePool.button(PALE_MOSSY_DARK_OAK_BUTTON);
        paleMossyDarkOakPlanksTexturePool.fence(PALE_MOSSY_DARK_OAK_FENCE);
        paleMossyDarkOakPlanksTexturePool.fenceGate(PALE_MOSSY_DARK_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyPaleOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_PALE_OAK_PLANKS);
        paleMossyPaleOakPlanksTexturePool.stairs(PALE_MOSSY_PALE_OAK_STAIRS);
        paleMossyPaleOakPlanksTexturePool.slab(PALE_MOSSY_PALE_OAK_SLAB);
        paleMossyPaleOakPlanksTexturePool.pressurePlate(PALE_MOSSY_PALE_OAK_PRESSURE_PLATE);
        paleMossyPaleOakPlanksTexturePool.button(PALE_MOSSY_PALE_OAK_BUTTON);
        paleMossyPaleOakPlanksTexturePool.fence(PALE_MOSSY_PALE_OAK_FENCE);
        paleMossyPaleOakPlanksTexturePool.fenceGate(PALE_MOSSY_PALE_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyJunglePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_JUNGLE_PLANKS);
        paleMossyJunglePlanksTexturePool.stairs(PALE_MOSSY_JUNGLE_STAIRS);
        paleMossyJunglePlanksTexturePool.slab(PALE_MOSSY_JUNGLE_SLAB);
        paleMossyJunglePlanksTexturePool.pressurePlate(PALE_MOSSY_JUNGLE_PRESSURE_PLATE);
        paleMossyJunglePlanksTexturePool.button(PALE_MOSSY_JUNGLE_BUTTON);
        paleMossyJunglePlanksTexturePool.fence(PALE_MOSSY_JUNGLE_FENCE);
        paleMossyJunglePlanksTexturePool.fenceGate(PALE_MOSSY_JUNGLE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyMangrovePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_MANGROVE_PLANKS);
        paleMossyMangrovePlanksTexturePool.stairs(PALE_MOSSY_MANGROVE_STAIRS);
        paleMossyMangrovePlanksTexturePool.slab(PALE_MOSSY_MANGROVE_SLAB);
        paleMossyMangrovePlanksTexturePool.pressurePlate(PALE_MOSSY_MANGROVE_PRESSURE_PLATE);
        paleMossyMangrovePlanksTexturePool.button(PALE_MOSSY_MANGROVE_BUTTON);
        paleMossyMangrovePlanksTexturePool.fence(PALE_MOSSY_MANGROVE_FENCE);
        paleMossyMangrovePlanksTexturePool.fenceGate(PALE_MOSSY_MANGROVE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_OAK_PLANKS);
        paleMossyOakPlanksTexturePool.stairs(PALE_MOSSY_OAK_STAIRS);
        paleMossyOakPlanksTexturePool.slab(PALE_MOSSY_OAK_SLAB);
        paleMossyOakPlanksTexturePool.pressurePlate(PALE_MOSSY_OAK_PRESSURE_PLATE);
        paleMossyOakPlanksTexturePool.button(PALE_MOSSY_OAK_BUTTON);
        paleMossyOakPlanksTexturePool.fence(PALE_MOSSY_OAK_FENCE);
        paleMossyOakPlanksTexturePool.fenceGate(PALE_MOSSY_OAK_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossySprucePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_SPRUCE_PLANKS);
        paleMossySprucePlanksTexturePool.stairs(PALE_MOSSY_SPRUCE_STAIRS);
        paleMossySprucePlanksTexturePool.slab(PALE_MOSSY_SPRUCE_SLAB);
        paleMossySprucePlanksTexturePool.pressurePlate(PALE_MOSSY_SPRUCE_PRESSURE_PLATE);
        paleMossySprucePlanksTexturePool.button(PALE_MOSSY_SPRUCE_BUTTON);
        paleMossySprucePlanksTexturePool.fence(PALE_MOSSY_SPRUCE_FENCE);
        paleMossySprucePlanksTexturePool.fenceGate(PALE_MOSSY_SPRUCE_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyWarpedPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_WARPED_PLANKS);
        paleMossyWarpedPlanksTexturePool.stairs(PALE_MOSSY_WARPED_STAIRS);
        paleMossyWarpedPlanksTexturePool.slab(PALE_MOSSY_WARPED_SLAB);
        paleMossyWarpedPlanksTexturePool.pressurePlate(PALE_MOSSY_WARPED_PRESSURE_PLATE);
        paleMossyWarpedPlanksTexturePool.button(PALE_MOSSY_WARPED_BUTTON);
        paleMossyWarpedPlanksTexturePool.fence(PALE_MOSSY_WARPED_FENCE);
        paleMossyWarpedPlanksTexturePool.fenceGate(PALE_MOSSY_WARPED_FENCE_GATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyBambooMosaicTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_BAMBOO_MOSAIC);
        paleMossyBambooMosaicTexturePool.stairs(PALE_MOSSY_BAMBOO_MOSAIC_STAIRS);
        paleMossyBambooMosaicTexturePool.slab(PALE_MOSSY_BAMBOO_MOSAIC_SLAB);

        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_GLASS, PALE_MOSSY_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_BLACK_STAINED_GLASS, PALE_MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_BLUE_STAINED_GLASS, PALE_MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_BROWN_STAINED_GLASS, PALE_MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_CYAN_STAINED_GLASS, PALE_MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_GRAY_STAINED_GLASS, PALE_MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_GREEN_STAINED_GLASS, PALE_MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS, PALE_MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS, PALE_MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_LIME_STAINED_GLASS, PALE_MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_MAGENTA_STAINED_GLASS, PALE_MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_ORANGE_STAINED_GLASS, PALE_MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_PINK_STAINED_GLASS, PALE_MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_PURPLE_STAINED_GLASS, PALE_MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_RED_STAINED_GLASS, PALE_MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_TINTED_GLASS);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_WHITE_STAINED_GLASS, PALE_MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassAndPane(PALE_MOSSY_YELLOW_STAINED_GLASS, PALE_MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.registerLog(PALE_MOSSY_ACACIA_LOG).log(PALE_MOSSY_ACACIA_LOG).wood(PALE_MOSSY_ACACIA_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_BAMBOO_BLOCK).log(PALE_MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.registerLog(PALE_MOSSY_BIRCH_LOG).log(PALE_MOSSY_BIRCH_LOG).wood(PALE_MOSSY_BIRCH_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_CHERRY_LOG).log(PALE_MOSSY_CHERRY_LOG).wood(PALE_MOSSY_CHERRY_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_CRIMSON_STEM).log(PALE_MOSSY_CRIMSON_STEM).wood(PALE_MOSSY_CRIMSON_HYPHAE);
        blockStateModelGenerator.registerLog(PALE_MOSSY_DARK_OAK_LOG).log(PALE_MOSSY_DARK_OAK_LOG).wood(PALE_MOSSY_DARK_OAK_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_PALE_OAK_LOG).log(PALE_MOSSY_PALE_OAK_LOG).wood(PALE_MOSSY_PALE_OAK_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_JUNGLE_LOG).log(PALE_MOSSY_JUNGLE_LOG).wood(PALE_MOSSY_JUNGLE_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_MANGROVE_LOG).log(PALE_MOSSY_MANGROVE_LOG).wood(PALE_MOSSY_MANGROVE_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_OAK_LOG).log(PALE_MOSSY_OAK_LOG).wood(PALE_MOSSY_OAK_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_SPRUCE_LOG).log(PALE_MOSSY_SPRUCE_LOG).wood(PALE_MOSSY_SPRUCE_WOOD);
        blockStateModelGenerator.registerLog(PALE_MOSSY_WARPED_STEM).stem(PALE_MOSSY_WARPED_STEM).wood(PALE_MOSSY_WARPED_HYPHAE);

        registerIronBars(blockStateModelGenerator, PALE_MOSSY_IRON_BARS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_CHISELED_STONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool paleMossyBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_BRICKS);
        paleMossyBricksTexturePool.stairs(PALE_MOSSY_BRICK_STAIRS);
        paleMossyBricksTexturePool.slab(PALE_MOSSY_BRICK_SLAB);
        paleMossyBricksTexturePool.wall(PALE_MOSSY_BRICK_WALL);

        blockStateModelGenerator.registerDoor(PALE_MOSSY_OAK_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_SPRUCE_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_BIRCH_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_JUNGLE_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_ACACIA_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_DARK_OAK_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_PALE_OAK_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_MANGROVE_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_CHERRY_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_BAMBOO_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_CRIMSON_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_WARPED_DOOR);
        blockStateModelGenerator.registerDoor(PALE_MOSSY_IRON_DOOR);

        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_SPRUCE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_JUNGLE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_ACACIA_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_DARK_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_PALE_OAK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_MANGROVE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_CHERRY_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_BAMBOO_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_CRIMSON_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_WARPED_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(PALE_MOSSY_IRON_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool paleMossyCobbledDeepslateTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_COBBLED_DEEPSLATE);
        paleMossyCobbledDeepslateTexturePool.stairs(PALE_MOSSY_COBBLED_DEEPSLATE_STAIRS);
        paleMossyCobbledDeepslateTexturePool.slab(PALE_MOSSY_COBBLED_DEEPSLATE_SLAB);
        paleMossyCobbledDeepslateTexturePool.wall(PALE_MOSSY_COBBLED_DEEPSLATE_WALL);

        BlockStateModelGenerator.BlockTexturePool paleMossyDeepslateBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_DEEPSLATE_BRICKS);
        paleMossyDeepslateBricksTexturePool.stairs(PALE_MOSSY_DEEPSLATE_BRICK_STAIRS);
        paleMossyDeepslateBricksTexturePool.slab(PALE_MOSSY_DEEPSLATE_BRICK_SLAB);
        paleMossyDeepslateBricksTexturePool.wall(PALE_MOSSY_DEEPSLATE_BRICK_WALL);
        
        registerDeepslate(blockStateModelGenerator, PALE_MOSSY_DEEPSLATE);

        BlockStateModelGenerator.BlockTexturePool paleMossyDeepslateTilesTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_DEEPSLATE_TILES);
        paleMossyDeepslateTilesTexturePool.stairs(PALE_MOSSY_DEEPSLATE_TILE_STAIRS);
        paleMossyDeepslateTilesTexturePool.slab(PALE_MOSSY_DEEPSLATE_TILE_SLAB);
        paleMossyDeepslateTilesTexturePool.wall(PALE_MOSSY_DEEPSLATE_TILE_WALL);

        BlockStateModelGenerator.BlockTexturePool paleMossyTuffTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_TUFF);
        paleMossyTuffTexturePool.stairs(PALE_MOSSY_TUFF_STAIRS);
        paleMossyTuffTexturePool.slab(PALE_MOSSY_TUFF_SLAB);
        paleMossyTuffTexturePool.wall(PALE_MOSSY_TUFF_WALL);

        BlockStateModelGenerator.BlockTexturePool paleMossyTuffBricksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(PALE_MOSSY_TUFF_BRICKS);
        paleMossyTuffBricksTexturePool.stairs(PALE_MOSSY_TUFF_BRICK_STAIRS);
        paleMossyTuffBricksTexturePool.slab(PALE_MOSSY_TUFF_BRICK_SLAB);
        paleMossyTuffBricksTexturePool.wall(PALE_MOSSY_TUFF_BRICK_WALL);

        blockStateModelGenerator.registerWoolAndCarpet(CRIMSON_MOSS_BLOCK, CRIMSON_MOSS_CARPET);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MOSS_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PALE_MOSS_BALL, Models.GENERATED);
    }
    
    private void registerDeepslate(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        TexturedModel texturedModel = TexturedModel.SIDE_END_WALL.get(block);
        TextureMap textures = texturedModel.getTextures();
        Identifier baseModelId = texturedModel.getModel().upload(block, textures, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createDeepslateState(block, baseModelId, textures, blockStateModelGenerator.modelCollector));
    }

    private void registerIronBars(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = ModelIds.getBlockSubModelId(block, "_post_ends");
        Identifier identifier2 = ModelIds.getBlockSubModelId(block, "_post");
        Identifier identifier3 = ModelIds.getBlockSubModelId(block, "_cap");
        Identifier identifier4 = ModelIds.getBlockSubModelId(block, "_cap_alt");
        Identifier identifier5 = ModelIds.getBlockSubModelId(block, "_side");
        Identifier identifier6 = ModelIds.getBlockSubModelId(block, "_side_alt");

        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
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

        blockStateModelGenerator.registerItemModel(block);
    }
}
