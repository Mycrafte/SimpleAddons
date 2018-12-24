package com.keeptpa.simpleaddons.common.world.gen;

import com.keeptpa.simpleaddons.common.block.SimpleAddonsBLOCKS;

import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class OreGenEventHandler {

	

private static WorldGenerator worldGenMinable = new WorldGenMinable(SimpleAddonsBLOCKS.blockSilver.getDefaultState(), 5);
public static void init()
{
     MinecraftForge.ORE_GEN_BUS.register(OreGenEventHandler.class);
}
@SubscribeEvent
public static void onGenerateMinable(OreGenEvent.GenerateMinable event)
{
        for(int i = 0; i < 2; i++)          //循环生成2次矿脉
        {
            //随机一个地点，作为生成矿脉的中心
            BlockPos genPos = new BlockPos(
                            event.getPos().getX() + event.getRand().nextInt(16),16+
                event.getRand().nextInt(8),
                event.getPos().getZ() + event.getRand().nextInt(16));
            worldGenMinable.generate(event.getWorld(), event.getRand(), genPos);
        }
    }
}


