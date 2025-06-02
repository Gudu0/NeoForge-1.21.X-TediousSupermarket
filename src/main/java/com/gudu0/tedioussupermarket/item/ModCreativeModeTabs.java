package com.gudu0.tedioussupermarket.item;

import com.gudu0.tedioussupermarket.TediousSupermarket;
import com.gudu0.tedioussupermarket.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TediousSupermarket.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.gudusupermarket.bismuth_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.RAW_BISMUTH);
                    }).build());

    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MODE_TAB.register("bismuth_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TediousSupermarket.MOD_ID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.gudusupermarket.bismuth_blocks"))
                    .displayItems((parameters, output) -> {
                       output.accept(ModBlocks.BISMUTH_BLOCK);
                       output.accept(ModBlocks.BISMUTH_ORE);
                    }).build());


    public static final Supplier<CreativeModeTab> MORGANS_DISAPPOINTMENT = CREATIVE_MODE_TAB.register("morgans_disappointment",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MORGANS_DISAPPOINTMENT_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TediousSupermarket.MOD_ID, "bismuth_blocks_tab"))
                    .title(Component.translatable("creativetab.gudusupermarket.morgans_disappointment"))
                    .displayItems((parameters, output) -> {
                       output.accept(ModBlocks.MORGANS_DISAPPOINTMENT_BLOCK);
                       output.accept(ModItems.MORGANS_DISAPPOINTMENT);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
