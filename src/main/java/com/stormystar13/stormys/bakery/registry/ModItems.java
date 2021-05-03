package com.stormystar13.stormys.bakery.registry;


import com.stormystar13.stormys.bakery.StormysBakery;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.*;

public class ModItems {

    //Items
    public static final Item CHOCOLATE_BAR = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(ModFoodComponents.CHOCOLATE_BAR));

    public static final Item BLUEBERRIES = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(ModFoodComponents.BLUEBERRIES));

    public static final Item BUTTER = new Item(new Item.Settings().group(ItemGroup.FOOD)
            .food(ModFoodComponents.BUTTER));


    //Blocks
    public static final BlockItem CHOCOLATE_BLOCK = new BlockItem(ModBlocks.CHOCOLATE_BLOCK, new Item.Settings()
            .group(ItemGroup.FOOD));

    public static final BlockItem TEACUP = new BlockItem(ModBlocks.TEACUP, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem COFFEE = new BlockItem(ModBlocks.COFFEE, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.DRINK));

    public static final BlockItem HOT_CHOCOLATE = new BlockItem(ModBlocks.HOT_CHOCOLATE, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.DRINK));

    public static final BlockItem GREEN_TEA = new BlockItem(ModBlocks.GREEN_TEA, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.DRINK));

    public static final BlockItem MUFFIN = new BlockItem(ModBlocks.MUFFIN, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.MUFFIN));

    public static final BlockItem SWEET_BERRY_MUFFIN = new BlockItem(ModBlocks.SWEET_BERRY_MUFFIN, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.FLAVORED_MUFFIN));

    public static final BlockItem BLUEBERRY_MUFFIN = new BlockItem(ModBlocks.BLUEBERRY_MUFFIN, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.FLAVORED_MUFFIN));

    public static final BlockItem CROISSANT = new BlockItem(ModBlocks.CROISSANT, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.CROISSANT));

    public static final BlockItem CHOCOLATE_CROISSANT = new BlockItem(ModBlocks.CHOCOLATE_CROISSANT, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.CROISSANT));

    public static final BlockItem BERRY_TART = new BlockItem(ModBlocks.BERRY_TART, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.BERRY_TART));

    public static final BlockItem CARROT_CAKE = new BlockItem(ModBlocks.CARROT_CAKE, new Item.Settings()
            .group(ItemGroup.FOOD).food(ModFoodComponents.CAKE));


    //Furniture
    public static final BlockItem OAK_TABLE = new BlockItem(ModFurniture.OAK_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem BIRCH_TABLE = new BlockItem(ModFurniture.BIRCH_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem SPRUCE_TABLE = new BlockItem(ModFurniture.SPRUCE_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem JUNGLE_TABLE = new BlockItem(ModFurniture.JUNGLE_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem ACACIA_TABLE= new BlockItem(ModFurniture.ACACIA_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem DARK_OAK_TABLE = new BlockItem(ModFurniture.DARK_OAK_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem STONE_TABLE = new BlockItem(ModFurniture.STONE_TABLE, new Item.Settings()
            .group(ItemGroup.DECORATIONS));

    public static final BlockItem OAK_CHAIR = new BlockItem(ModFurniture.OAK_CHAIR, new Item.Settings()
            .group(ItemGroup.DECORATIONS));


    //Registry
    public static void registerItems() {
        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "chocolate_bar"), CHOCOLATE_BAR);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "chocolate_block"), CHOCOLATE_BLOCK);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "blueberries"), BLUEBERRIES);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "butter"), BUTTER);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "teacup"), TEACUP);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "coffee"), COFFEE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "hot_chocolate"), HOT_CHOCOLATE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "green_tea"), GREEN_TEA);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "muffin"), MUFFIN);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "sweet_berry_muffin"), SWEET_BERRY_MUFFIN);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "blueberry_muffin"), BLUEBERRY_MUFFIN);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "croissant"), CROISSANT);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "chocolate_croissant"), CHOCOLATE_CROISSANT);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "berry_tart"), BERRY_TART);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "carrot_cake"), CARROT_CAKE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "oak_table"), OAK_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "spruce_table"), SPRUCE_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "birch_table"), BIRCH_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "jungle_table"), JUNGLE_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "acacia_table"), ACACIA_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "dark_oak_table"), DARK_OAK_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "stone_table"), STONE_TABLE);

        Registry.register(ITEM, new Identifier(StormysBakery.MOD_ID, "oak_chair"), OAK_CHAIR);

    }
}
