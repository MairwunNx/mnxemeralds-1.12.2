package com.mairwunnx.mnxemeralds.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class emeraldblocksword extends ItemSword
{
    public static Item.ToolMaterial material = EnumHelper.addToolMaterial("mnxemeralds:emerald_sword", 4, 2432, 50.0F, 13.0F, 12);

    public emeraldblocksword(String name)
    {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.canRepair = true;
    }
}
