package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class emeraldsuperhoe extends ItemHoe
{
    public emeraldsuperhoe(String name)
    {
        super(ToolMaterial.DIAMOND);
        this.setHarvestLevel("Diamond_hoe", 6);
        this.setMaxDamage(3632);
        this.canRepair = true;
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
