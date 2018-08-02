package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemSpade;

public class emeraldblockshovel extends ItemSpade
{
    public emeraldblockshovel(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_shovel", 5);
        this.setMaxDamage(2432);
        this.canRepair = true;
        this.efficiency = 23.0F;
        this.attackDamage = 7.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
