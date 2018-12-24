package com.keeptpa.simpleaddons.common;
import com.keeptpa.simpleaddons.SimpleAddons;
import com.keeptpa.simpleaddons.common.block.SimpleAddonsBLOCKS;
import com.keeptpa.simpleaddons.common.item.SimpleAddonsITEMS;
import com.keeptpa.simpleaddons.common.world.gen.OreGenEventHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	   SimpleAddonsITEMS.init();
           SimpleAddonsBLOCKS.init();
    }
    
    public void init(FMLInitializationEvent event)
    {
    	OreGenEventHandler.init();
    }
}