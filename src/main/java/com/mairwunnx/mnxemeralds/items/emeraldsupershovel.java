package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class emeraldsupershovel extends ItemSpade
{
    public emeraldsupershovel(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_shovel", 6);
        this.setMaxDamage(3632);
        this.canRepair = true;
        this.efficiency = 29.0F;
        this.attackDamage = 10.0F;
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
