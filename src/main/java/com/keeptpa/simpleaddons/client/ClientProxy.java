package com.keeptpa.simpleaddons.client;

import com.keeptpa.simpleaddons.common.CommonProxy;
import com.keeptpa.simpleaddons.common.block.SimpleAddonsBLOCKS;
import com.keeptpa.simpleaddons.common.item.SimpleAddonsITEMS;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        SimpleAddonsITEMS.clientInit();
        SimpleAddonsBLOCKS.clientInit();
        //客户端所需的注册模型
    }
    
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }
}