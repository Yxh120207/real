package net.yxh.yxhmod.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yxh.yxhmod.Yxhsmod;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Yxhsmod.MOD_ID);
    public static final RegistryObject<Item> Reg_ITEM = ITEMS.register("regitem",()->new  Item(new Item.Properties().setId(ITEMS.key("regitem"))));
    public static final RegistryObject<Item> OK_ITEM = ITEMS.register("okitem",()->new  Item(new Item.Properties().setId(ITEMS.key("okitem"))));
    public static void register(BusGroup eventBus){
        ITEMS.register(eventBus);
    }
}
