package com.keeptpa.simpleaddons.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSilver extends Block
{

	public BlockSilver() {
		super(Material.ROCK);
		this.setLightLevel(0.8f);
		this.setSoundType(SoundType.STONE);//表示方块踩上去的声音
		this.setHardness(2.0f);//表示方块硬度 黑曜石的硬度为50
		this.setHarvestLevel("pickaxe", 2);//pickaxe表示镐子（axe表示斧子 shovel表示铲子） 2表示铁镐以上才能挖掘（3-钻石 1-石 0-木/金）
	}
}
