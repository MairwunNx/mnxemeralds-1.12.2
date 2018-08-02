package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class emeraldsword extends ItemSword
{
    public static Item.ToolMaterial material = EnumHelper.addToolMaterial("mnxemeralds:emerald_sword", 3, 1832, 50.0F, 6.0F, 12);

    public emeraldsword(String name)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.canRepair = true;
    }
}
