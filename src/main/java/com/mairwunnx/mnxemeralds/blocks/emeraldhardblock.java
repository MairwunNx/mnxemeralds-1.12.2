package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class emeraldhardblock extends Block
{
    public emeraldhardblock(String name)
    {
        super(Material.IRON);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.blockHardness = 13.5F;
        this.blockResistance = 20.0F;
        this.blockSoundType = SoundType.METAL;
    }
}
