package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemPickaxe;

public class emeraldblockpickaxe extends ItemPickaxe
{
    public emeraldblockpickaxe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_pickaxe", 5);
        this.setMaxDamage(2432);
        this.canRepair = true;
        this.efficiency = 23.0F;
        this.attackDamage = 9.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
