package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class emeraldstairs extends BlockStairs
{
    public emeraldstairs(String name, float hardness, float resistance, IBlockState modelState)
    {
        super(modelState);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setLightLevel(20.0F);
        this.useNeighborBrightness = true;
    }
}
