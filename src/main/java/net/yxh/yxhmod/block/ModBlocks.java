package net.yxh.yxhmod.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yxh.yxhmod.Yxhsmod;
import net.yxh.yxhmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS=DeferredRegister.create(ForgeRegistries.BLOCKS, Yxhsmod.MOD_ID);
    public static final RegistryObject<Block> TEST_BLOCK=registerBlock("testblock",()->new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.BAMBOO).setId(BLOCKS.key("testblock"))));
    public static final RegistryObject<Block> FINISH_BLOCK=registerBlock("finishblock",()->new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.ANVIL).setId(BLOCKS.key("finishblock"))));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        ModItems.ITEMS.register(name,()->new BlockItem(toReturn.get(),new Item.Properties().setId(ModItems.ITEMS.key(name))));
        return toReturn;
    }
    public static void register(BusGroup eventBus)
    {

        BLOCKS.register(eventBus);
    }
}
