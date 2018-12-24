package com.keeptpa.simpleaddons.common.item;


import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry.Impl;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class SimpleAddonsITEMS 
{
// public static Item itemLove = new ItemFood().setUnlocalizedName("love");
	public static void init()
	{
	//	ForgeRegistries.ITEMS.register(itemLove.setRegistryName("com_love"));//这个就是json要用的
	
	}
	 @SideOnly(Side.CLIENT)
	public static void clientInit ()
	{
	//	 ModelLoader.setCustomModelResourceLocation(itemLove, 0, new ModelResourceLocation(itemLove.getRegistryName(), "inventory"));
		 //模型，天晓得为什么手持的平面物品还要模型
	}
}