package com.stormystar13.stormys.bakery.registry;

import com.stormystar13.stormys.bakery.StormysBakery;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ModFurniture {


    //Tables
    public static final Block OAK_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    public static final Block BIRCH_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    public static final Block SPRUCE_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    public static final Block JUNGLE_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    public static final Block ACACIA_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    public static final Block DARK_OAK_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    public static final Block STONE_TABLE = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TABLE_SHAPE;

        }
    };

    //Chairs
    public static final Block OAK_CHAIR = new Block(FabricBlockSettings.of(Material.WOOD).
            breakByHand(true).sounds(BlockSoundGroup.WOOD).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.CHAIR_NORTH;

        }
    };


    //Registry
    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "oak_table"), OAK_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "birch_table"), BIRCH_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "spruce_table"), SPRUCE_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "jungle_table"), JUNGLE_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "acacia_table"), ACACIA_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "dark_oak_table"), DARK_OAK_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "stone_table"), STONE_TABLE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "oak_chair"), OAK_CHAIR);
    }

}
