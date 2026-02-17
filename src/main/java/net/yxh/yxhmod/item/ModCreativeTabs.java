package net.yxh.yxhmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yxh.yxhmod.Yxhsmod;
import net.yxh.yxhmod.block.ModBlocks;


public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATEIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Yxhsmod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> TEST_ITEM_TAB = CREATEIVE_MOD_TABS.register("testmodtab",()->new CreativeModeTab.Builder(CreativeModeTab.Row.TOP, 0).icon(()->new ItemStack(ModItems.Reg_ITEM.get())).title(Component.translatable("模组列表")).displayItems((params, output)->{
        output.accept(ModItems.Reg_ITEM.get());
        output.accept(ModItems.OK_ITEM.get());
        output.accept(ModBlocks.TEST_BLOCK.get());
        output.accept(ModBlocks.FINISH_BLOCK.get());
    }).build());
    public static void register(BusGroup eventBus){
        CREATEIVE_MOD_TABS.register(eventBus);
    }
}
