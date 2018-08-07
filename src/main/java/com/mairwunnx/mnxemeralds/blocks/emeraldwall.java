package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;

import static com.mairwunnx.mnxemeralds.mnxemeralds.defaultModTab;

public class emeraldwall extends BlockWall
{
    public emeraldwall(String name, float resistance, float hardness, Block modelBlock)
    {
        super(modelBlock);
        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setCreativeTab(defaultModTab);
        setHardness(hardness);
        this.useNeighborBrightness = true;
        setLightLevel(20.0F);
    }
}
