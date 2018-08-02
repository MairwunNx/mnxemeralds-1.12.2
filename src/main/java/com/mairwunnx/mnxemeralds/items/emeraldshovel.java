package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemSpade;

public class emeraldshovel extends ItemSpade
{
    public emeraldshovel(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_shovel", 4);
        this.setMaxDamage(1832);
        this.canRepair = true;
        this.efficiency = 18.0F;
        this.attackDamage = 5.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
