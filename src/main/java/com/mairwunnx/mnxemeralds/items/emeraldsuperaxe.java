package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class emeraldsuperaxe extends ItemAxe
{
    public emeraldsuperaxe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_axe", 6);
        this.setMaxDamage(3632);
        this.canRepair = true;
        this.efficiency = 29.0F;
        this.attackDamage = 26.0F;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
