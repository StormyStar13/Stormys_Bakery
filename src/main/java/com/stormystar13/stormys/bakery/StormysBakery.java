package com.stormystar13.stormys.bakery;

import com.stormystar13.stormys.bakery.registry.ModBlocks;
import com.stormystar13.stormys.bakery.registry.ModFurniture;
import com.stormystar13.stormys.bakery.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class StormysBakery implements ModInitializer {

    public static final String MOD_ID = "stormysbakery";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModFurniture.registerBlocks();

    }
}
