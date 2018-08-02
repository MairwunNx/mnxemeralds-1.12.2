package com.mairwunnx.mnxemeralds.registers;

import com.mairwunnx.mnxemeralds.armor.emeraldarmor;
import com.mairwunnx.mnxemeralds.armor.emeraldblockarmor;
import com.mairwunnx.mnxemeralds.armor.emeraldsuperarmor;
import com.mairwunnx.mnxemeralds.food.emeraldnuggetapple;
import com.mairwunnx.mnxemeralds.food.emeraldnuggetcarrot;
import com.mairwunnx.mnxemeralds.food.emeraldsuperapple;
import com.mairwunnx.mnxemeralds.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.mairwunnx.mnxemeralds.mnxemeralds.defaultModTab;

public class itemregister
{
    public static Item KEY = new emeraldnugget("emerald_nugget").setCreativeTab(defaultModTab);
    public static Item KEY1 = new emeraldnuggetdust("emerald_nugget_dust").setCreativeTab(defaultModTab);
    public static Item KEY2 = new emeraldnuggetcarrot("emerald_nugget_carrot", 9, 18.0F, false).setCreativeTab(defaultModTab);
    public static Item KEY3 = new emeraldnuggetapple("emerald_nugget_apple", 6, 7.0F, false).setCreativeTab(defaultModTab);
    public static Item KEY4 = new emeraldsuperapple("emerald_super_apple", 8, 9.0F, false).setCreativeTab(defaultModTab);
    public static Item KEY5 = new emeraldaxe("emerald_axe").setCreativeTab(defaultModTab);
    public static Item KEY6 = new emeraldpickaxe("emerald_pickaxe").setCreativeTab(defaultModTab);
    public static Item KEY7 = new emeraldshovel("emerald_shovel").setCreativeTab(defaultModTab);
    public static Item KEY8 = new emeraldhoe("emerald_hoe").setCreativeTab(defaultModTab);
    public static Item KEY9 = new emeraldsword("emerald_sword").setCreativeTab(defaultModTab);
    public static Item KEY10 = new emeraldarmor("emerald_helmet", 1, EntityEquipmentSlot.HEAD).setCreativeTab(defaultModTab);
    public static Item KEY11 = new emeraldarmor("emerald_chestplate", 1, EntityEquipmentSlot.CHEST).setCreativeTab(defaultModTab);
    public static Item KEY12 = new emeraldarmor("emerald_leggings", 2, EntityEquipmentSlot.LEGS).setCreativeTab(defaultModTab);
    public static Item KEY13 = new emeraldarmor("emerald_boots", 1, EntityEquipmentSlot.FEET).setCreativeTab(defaultModTab);
    public static Item KEY14 = new emeraldblockaxe("emerald_block_axe").setCreativeTab(defaultModTab);
    public static Item KEY15 = new emeraldblockpickaxe("emerald_block_pickaxe").setCreativeTab(defaultModTab);
    public static Item KEY16 = new emeraldblockshovel("emerald_block_shovel").setCreativeTab(defaultModTab);
    public static Item KEY17 = new emeraldblockhoe("emerald_block_hoe").setCreativeTab(defaultModTab);
    public static Item KEY18 = new emeraldblocksword("emerald_block_sword").setCreativeTab(defaultModTab);
    public static Item KEY19 = new emeraldblockarmor("emerald_block_helmet", 1, EntityEquipmentSlot.HEAD).setCreativeTab(defaultModTab);
    public static Item KEY20 = new emeraldblockarmor("emerald_block_chestplate", 1, EntityEquipmentSlot.CHEST).setCreativeTab(defaultModTab);
    public static Item KEY21 = new emeraldblockarmor("emerald_block_leggings", 2, EntityEquipmentSlot.LEGS).setCreativeTab(defaultModTab);
    public static Item KEY22 = new emeraldblockarmor("emerald_block_boots", 1, EntityEquipmentSlot.FEET).setCreativeTab(defaultModTab);
    public static Item KEY23 = new emeraldsuperaxe("emerald_super_axe").setCreativeTab(defaultModTab);
    public static Item KEY24 = new emeraldsuperpickaxe("emerald_super_pickaxe").setCreativeTab(defaultModTab);
    public static Item KEY25 = new emeraldsuperhoe("emerald_super_hoe").setCreativeTab(defaultModTab);
    public static Item KEY26 = new emeraldsupershovel("emerald_super_shovel").setCreativeTab(defaultModTab);
    public static Item KEY27 = new emeraldsupersword("emerald_super_sword").setCreativeTab(defaultModTab);
    public static Item KEY28 = new emeraldsuperarmor("emerald_super_helmet", 1, EntityEquipmentSlot.HEAD).setCreativeTab(defaultModTab);
    public static Item KEY29 = new emeraldsuperarmor("emerald_super_chestplate", 1, EntityEquipmentSlot.CHEST).setCreativeTab(defaultModTab);
    public static Item KEY30 = new emeraldsuperarmor("emerald_super_leggings", 2, EntityEquipmentSlot.LEGS).setCreativeTab(defaultModTab);
    public static Item KEY31 = new emeraldsuperarmor("emerald_super_boots", 1, EntityEquipmentSlot.FEET).setCreativeTab(defaultModTab);

    public static void register()
    {
        setRegister(KEY);
        setRegister(KEY1);
        setRegister(KEY2);
        setRegister(KEY3);
        setRegister(KEY4);
        setRegister(KEY5);
        setRegister(KEY6);
        setRegister(KEY7);
        setRegister(KEY8);
        setRegister(KEY9);
        setRegister(KEY10);
        setRegister(KEY11);
        setRegister(KEY12);
        setRegister(KEY13);
        setRegister(KEY14);
        setRegister(KEY15);
        setRegister(KEY16);
        setRegister(KEY17);
        setRegister(KEY18);
        setRegister(KEY19);
        setRegister(KEY20);
        setRegister(KEY21);
        setRegister(KEY22);
        setRegister(KEY23);
        setRegister(KEY24);
        setRegister(KEY25);
        setRegister(KEY26);
        setRegister(KEY27);
        setRegister(KEY28);
        setRegister(KEY29);
        setRegister(KEY30);
        setRegister(KEY31);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        setRender(KEY);
        setRender(KEY1);
        setRender(KEY2);
        setRender(KEY3);
        setRender(KEY4);
        setRender(KEY5);
        setRender(KEY5);
        setRender(KEY6);
        setRender(KEY7);
        setRender(KEY8);
        setRender(KEY9);
        setRender(KEY10);
        setRender(KEY11);
        setRender(KEY12);
        setRender(KEY13);
        setRender(KEY14);
        setRender(KEY15);
        setRender(KEY16);
        setRender(KEY17);
        setRender(KEY18);
        setRender(KEY19);
        setRender(KEY20);
        setRender(KEY21);
        setRender(KEY22);
        setRender(KEY23);
        setRender(KEY24);
        setRender(KEY25);
        setRender(KEY26);
        setRender(KEY27);
        setRender(KEY28);
        setRender(KEY29);
        setRender(KEY30);
        setRender(KEY31);
    }

    private static void setRegister(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
