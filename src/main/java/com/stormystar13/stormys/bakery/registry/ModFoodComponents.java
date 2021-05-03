package com.stormystar13.stormys.bakery.registry;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CHOCOLATE_BAR = (new FoodComponent.Builder().hunger(4).saturationModifier((float) .4)
            .alwaysEdible()).build();

    public static final FoodComponent DRINK = (new FoodComponent.Builder().hunger(2).saturationModifier((float) .3)
            .alwaysEdible()).build();

    public static final FoodComponent MUFFIN = (new FoodComponent.Builder().hunger(6).saturationModifier((float) .6)
            .alwaysEdible()).build();

    public static final FoodComponent FLAVORED_MUFFIN = (new FoodComponent.Builder().hunger(8).saturationModifier((float) .6)
            .alwaysEdible()).build();

    public static final FoodComponent BLUEBERRIES = (new FoodComponent.Builder().hunger(2).saturationModifier((float) .3)
            .alwaysEdible()).build();

    public static final FoodComponent CROISSANT = (new FoodComponent.Builder().hunger(4).saturationModifier((float) .4)
            .alwaysEdible()).build();

    public static final FoodComponent BUTTER = (new FoodComponent.Builder().hunger(4).saturationModifier((float) .5)
            .alwaysEdible()).build();

    public static final FoodComponent CAKE = (new FoodComponent.Builder().hunger(10).saturationModifier((float) .6))
            .build();

    public static final FoodComponent BERRY_TART = (new FoodComponent.Builder().hunger(4).saturationModifier((float) .4)
            .alwaysEdible()).build();
}
