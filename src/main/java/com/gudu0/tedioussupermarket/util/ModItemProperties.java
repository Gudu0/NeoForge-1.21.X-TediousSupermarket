package com.gudu0.tedioussupermarket.util;

import com.gudu0.tedioussupermarket.TediousSupermarket;
import com.gudu0.tedioussupermarket.component.ModDataComponents;
import com.gudu0.tedioussupermarket.item.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class ModItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(ModItems.CHISEL.get(), ResourceLocation.fromNamespaceAndPath(TediousSupermarket.MOD_ID, "used"),
                (stack, level, entity, seed) -> stack.get(ModDataComponents.COORDINATES) != null ? 1f : 0f);

    }
}
