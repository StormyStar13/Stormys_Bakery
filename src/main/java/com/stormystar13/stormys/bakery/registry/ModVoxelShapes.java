package com.stormystar13.stormys.bakery.registry;


import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.block.Block;


public class ModVoxelShapes {

    public static final VoxelShape TEACUP_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(3, 2, 7.5, 4, 4, 8.5),
            Block.createCuboidShape(5, 1, 10, 10, 6, 11),
            Block.createCuboidShape(10, 1, 6, 11, 6, 11),
            Block.createCuboidShape(5, 1, 5, 6, 6, 10),
            Block.createCuboidShape(6, 1, 5, 11, 6, 6),
            Block.createCuboidShape(4, 1, 7.5, 5, 2, 8.5),
            Block.createCuboidShape(4, 4, 7.5, 5, 5, 8.5),
            Block.createCuboidShape(4, 0, 4, 12, 1, 12));

    public static final VoxelShape DRINK_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(3, 2, 7.5, 4, 4, 8.5),
            Block.createCuboidShape(5, 1, 10, 10, 6, 11),
            Block.createCuboidShape(10, 1, 6, 11, 6, 11),
            Block.createCuboidShape(5, 1, 5, 6, 6, 10),
            Block.createCuboidShape(6, 1, 5, 11, 6, 6),
            Block.createCuboidShape(4, 1, 7.5, 5, 2, 8.5),
            Block.createCuboidShape(4, 4, 7.5, 5, 5, 8.5),
            Block.createCuboidShape(4, 0, 4, 12, 1, 12),
            Block.createCuboidShape(6, 1, 6, 10, 5, 10));

    public static final VoxelShape TABLE_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(13, 0, 0, 16, 13, 3),
            Block.createCuboidShape(13, 0, 13, 16, 13, 16),
            Block.createCuboidShape(0, 0, 13, 3, 13, 16),
            Block.createCuboidShape(0, 0, 0, 3, 13, 3),
            Block.createCuboidShape(0, 13, 0, 16, 16, 16));

    public static final VoxelShape MUFFIN_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(5, 2, 5, 11, 3.5, 11),
            Block.createCuboidShape(5.25, 0, 5.25, 10.75, 2, 10.75),
            Block.createCuboidShape(5.75, 3.5, 5.75, 10.25, 4.25, 10.25));


    public static final VoxelShape CROISSANT_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(6, 0, 6, 10, 2.5, 10),
            Block.createCuboidShape(5, 0, 7, 6, 2, 9.5),
            Block.createCuboidShape(10, 0, 7, 11, 2, 9.5),
            Block.createCuboidShape(11, 0, 7.5, 12, 1, 9),
            Block.createCuboidShape(4, 0, 7.5, 5, 1, 9));

    public static final VoxelShape CHOCOLATE_CROISSANT_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(5.5, 0, 6, 10.5, 2.5, 10),
            Block.createCuboidShape(5, 0, 7, 5.5, 2, 9),
            Block.createCuboidShape(10.5, 0, 7, 11, 2, 9));

    public static final VoxelShape CAKE_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(1, 0, 1, 15, 8, 15));


    public static final VoxelShape BERRY_TART_SHAPE = VoxelShapes.union(

            Block.createCuboidShape(6, 0, 6, 10, 1, 10),
            Block.createCuboidShape(6.2, 2, 6.2, 6.9, 2.7, 6.8999999999999995),
            Block.createCuboidShape(6.2, 2, 7.6, 6.9, 2.7, 8.299999999999999),
            Block.createCuboidShape(6.2, 2, 9.1, 6.9, 2.7, 9.799999999999999),
            Block.createCuboidShape(7.6, 2, 9.1, 8.299999999999999, 2.7, 9.799999999999999),
            Block.createCuboidShape(9.1, 2, 9.1, 9.799999999999999, 2.7, 9.799999999999999),
            Block.createCuboidShape(9.1, 2, 7.6, 9.799999999999999, 2.7, 8.299999999999999),
            Block.createCuboidShape(9.1, 2, 6.2, 9.799999999999999, 2.7, 6.8999999999999995),
            Block.createCuboidShape(7.6, 2, 6.2, 8.299999999999999, 2.7, 6.8999999999999995),
            Block.createCuboidShape(7, 1, 6, 10, 2, 7),
            Block.createCuboidShape(6, 1, 9, 9, 2, 10),
            Block.createCuboidShape(9, 1, 7, 10, 2, 10),
            Block.createCuboidShape(6, 1, 6, 7, 2, 9),
            Block.createCuboidShape(7, 1, 7, 9, 1.5, 9));


    //Chair
    public static final VoxelShape CHAIR_NORTH = VoxelShapes.union(

            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(2, 9, 2, 14, 16, 4));

    public static final VoxelShape CHAIR_SOUTH = VoxelShapes.union(

            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(2, 9, 12, 14, 16, 14));

    public static final VoxelShape CHAIR_WEST = VoxelShapes.union(

            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(2, 9, 2, 4, 16, 14));

    public static final VoxelShape CHAIR_EAST = VoxelShapes.union(

            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(2, 7, 2, 14, 9, 14),
            Block.createCuboidShape(12, 9, 2, 14, 16, 14));
}