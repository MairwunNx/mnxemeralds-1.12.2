package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;

public class emeraldwall extends BlockWall
{
    public emeraldwall(String name, float resistance, float hardness, Block modelBlock)
    {
        super(modelBlock);
        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setHardness(hardness);
        this.useNeighborBrightness = true;
        setLightLevel(20.0F);
    }
}
