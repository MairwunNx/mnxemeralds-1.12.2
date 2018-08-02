package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class emeraldsupersword extends ItemSword
{
    public static Item.ToolMaterial material = EnumHelper.addToolMaterial("mnxemeralds:emerald_super_sword", 5, 3632, 50.0F, 23.0F, 12);

    public emeraldsupersword(String name)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.canRepair = true;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
