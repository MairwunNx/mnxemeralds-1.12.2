package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class EmeraldHardFence extends BlockFence
{
    public EmeraldHardFence(String name, float hardness, float resistance)
    {
        super(Material.IRON, Material.IRON.getMaterialMapColor());
        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setHardness(hardness);
        setLightLevel(20.0F);
        this.useNeighborBrightness = true;
    }
}
