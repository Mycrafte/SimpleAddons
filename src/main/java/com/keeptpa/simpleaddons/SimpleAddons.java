package com.keeptpa.simpleaddons;

import com.keeptpa.simpleaddons.client.ClientProxy;
import com.keeptpa.simpleaddons.common.CommonProxy;
import com.keeptpa.simpleaddons.common.item.SimpleAddonsITEMS;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "simpleaddons",name = "simpleaddons",version = "1.0")
public class SimpleAddons {
	
    @SidedProxy(clientSide = "com.keeptpa.simpleaddons.client.ClientProxy", 
            serverSide = "com.keeptpa.simpleaddons.common.CommonProxy")
    public static CommonProxy proxy;
    
    @Instance("simpleaddons")
    public static SimpleAddons instance;
    
    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
         	proxy.preInit(event);
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
	        proxy.init(event);
	    }
}
