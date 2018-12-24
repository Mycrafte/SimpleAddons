package com.keeptpa.simpleaddons.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class SimpleAddonsBLOCKS {
	public static Block blockSilver = new BlockSilver().setUnlocalizedName("silver");
    public static void init ()
    {
    	ForgeRegistries.BLOCKS.register(blockSilver.setRegistryName("silver"));
        ForgeRegistries.ITEMS.register(new ItemBlock(blockSilver).setRegistryName(blockSilver.getRegistryName()));
        OreDictionary.registerOre("oreSilver", blockSilver);
   
	}
    @SideOnly(Side.CLIENT)
   	public static void clientInit ()
   	{
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(blockSilver), 0, 
                new ModelResourceLocation(blockSilver.getRegistryName(), "inventory"));
    	//获得方块在手的物品并注册模型
   	}
}
