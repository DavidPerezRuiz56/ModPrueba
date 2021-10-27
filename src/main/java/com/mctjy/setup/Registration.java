package com.mctjy.setup;


import com.mctjy.items.TestItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
	
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "tutorial");
	
	 public static void init() {
		 IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	     ITEMS.register(bus);

	 }
	 
	 public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new TestItem(new Item.Properties()));
}
