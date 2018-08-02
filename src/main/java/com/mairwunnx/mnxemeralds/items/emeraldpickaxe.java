package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemPickaxe;

public class emeraldpickaxe extends ItemPickaxe
{
    public emeraldpickaxe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_pickaxe", 4);
        this.setMaxDamage(1832);
        this.canRepair = true;
        this.efficiency = 18.0F;
        this.attackDamage = 6.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
