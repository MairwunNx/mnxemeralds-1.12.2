package com.mairwunnx.mnxemeralds.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import static com.mairwunnx.mnxemeralds.registers.itemregister.*;

public class emeraldarmor extends ItemArmor
{
    public static ItemArmor.ArmorMaterial materialIn = EnumHelper.addArmorMaterial("mnxemeralds:emerald_armor", "mnxemeralds:emerald", 9, new int[]{4, 7, 10, 4}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);

    public emeraldarmor(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setMaxDamage(1832);
        this.canRepair = true;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == KEY13 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == KEY12 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == KEY11 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == KEY10)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 0, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 0, 0));
        }

    }
}
