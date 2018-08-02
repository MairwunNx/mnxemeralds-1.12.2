package com.mairwunnx.mnxemeralds.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import static com.mairwunnx.mnxemeralds.registers.itemregister.*;

public class emeraldblockarmor extends ItemArmor
{
    public static ItemArmor.ArmorMaterial materialIn = EnumHelper.addArmorMaterial("mnxemeralds:emerald_block_armor", "mnxemeralds:emerald_block", 11, new int[]{7, 12, 13, 7}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);

    public emeraldblockarmor(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setMaxDamage(2432);
        this.canRepair = true;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == KEY22 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == KEY21 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == KEY20 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == KEY19)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 0, 2));
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 0, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 0, 0));
        }
    }
}
