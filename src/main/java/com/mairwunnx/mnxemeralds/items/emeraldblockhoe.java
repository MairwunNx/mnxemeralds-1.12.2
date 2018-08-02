package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemHoe;

public class emeraldblockhoe extends ItemHoe
{
    public emeraldblockhoe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_hoe", 5);
        this.setMaxDamage(2432);
        this.canRepair = true;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
