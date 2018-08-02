package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemAxe;

public class emeraldaxe extends ItemAxe
{
    public emeraldaxe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_axe", 4);
        this.setMaxDamage(1832);
        this.canRepair = true;
        this.efficiency = 18.0F;
        this.attackDamage = 12.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
