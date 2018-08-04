package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class emeraldfence extends BlockFence
{
    public emeraldfence(String name, float hardness, float resistance)
    {
        super(Material.IRON, Material.IRON.getMaterialMapColor());
        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setHardness(hardness);
        this.useNeighborBrightness = true;


    }
}
