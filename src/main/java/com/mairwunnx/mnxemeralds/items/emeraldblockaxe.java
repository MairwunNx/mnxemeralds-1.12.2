package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemAxe;

public class emeraldblockaxe extends ItemAxe
{
    public emeraldblockaxe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_axe", 5);
        this.setMaxDamage(2432);
        this.canRepair = true;
        this.efficiency = 23.0F;
        this.attackDamage = 18.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
