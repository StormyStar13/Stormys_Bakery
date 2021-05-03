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



public class ModBlocks {


   //Blocks
    public static final Block CHOCOLATE_BLOCK = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.STONE).breakInstantly());

    public static final Block TEACUP = new Block(FabricBlockSettings.
            of(Material.STONE).breakByHand(true).sounds(BlockSoundGroup.GLASS).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.TEACUP_SHAPE;
        }
    };

    public static final Block COFFEE = new Block(FabricBlockSettings.
            of(Material.STONE).breakByHand(true).sounds(BlockSoundGroup.GLASS).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.DRINK_SHAPE;
        }

    };

    public static final Block HOT_CHOCOLATE = new Block(FabricBlockSettings.
            of(Material.STONE).breakByHand(true).sounds(BlockSoundGroup.GLASS).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.DRINK_SHAPE;
        }


    };

    public static final Block GREEN_TEA = new Block(FabricBlockSettings.
            of(Material.STONE).breakByHand(true).sounds(BlockSoundGroup.GLASS).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.DRINK_SHAPE;

        }
    };

    public static final Block MUFFIN = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.MUFFIN_SHAPE;

        }
    };

    public static final Block SWEET_BERRY_MUFFIN = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.MUFFIN_SHAPE;

        }
    };

    public static final Block BLUEBERRY_MUFFIN = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.MUFFIN_SHAPE;

        }
    };

    public static final Block CROISSANT = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.CROISSANT_SHAPE;

        }
    };

    public static final Block CHOCOLATE_CROISSANT = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.CHOCOLATE_CROISSANT_SHAPE;

        }
    };

    public static final Block BERRY_TART = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.BERRY_TART_SHAPE;

        }
    };

    public static final Block CARROT_CAKE = new Block(FabricBlockSettings.
            of(Material.CAKE).breakByHand(true).sounds(BlockSoundGroup.CROP).breakInstantly()) {

        @SuppressWarnings("deprecation")
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
            return ModVoxelShapes.CAKE_SHAPE;

        }
    };


    //Registry
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "chocolate_block"), CHOCOLATE_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "teacup"), TEACUP);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "coffee"), COFFEE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "hot_chocolate"), HOT_CHOCOLATE);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "green_tea"), GREEN_TEA);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "muffin"), MUFFIN);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "sweet_berry_muffin"), SWEET_BERRY_MUFFIN);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "blueberry_muffin"), BLUEBERRY_MUFFIN);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "croissant"), CROISSANT);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "chocolate_croissant"), CHOCOLATE_CROISSANT);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "berry_tart"), BERRY_TART);

        Registry.register(Registry.BLOCK, new Identifier(StormysBakery.MOD_ID, "carrot_cake"), CARROT_CAKE);

    }
}
