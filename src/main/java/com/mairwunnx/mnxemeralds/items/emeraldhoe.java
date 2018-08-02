package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemHoe;

public class emeraldhoe extends ItemHoe
{
    public emeraldhoe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_hoe", 4);
        this.setMaxDamage(1832);
        this.canRepair = true;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
