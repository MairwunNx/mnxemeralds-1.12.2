package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;

public class EmeraldHardWall extends BlockWall
{
    public EmeraldHardWall(String name, float resistance, float hardness, Block modelBlock)
    {
        super(modelBlock);
        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setHardness(hardness);
        setLightLevel(20.0F);
        this.useNeighborBrightness = true;
    }
}
