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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.mairwunnx.mnxemeralds.registers.itemregister.*;

public class emeraldsuperarmor extends ItemArmor
{
    public static ItemArmor.ArmorMaterial materialIn = EnumHelper.addArmorMaterial("mnxemeralds:emerald_super_armor", "mnxemeralds:emerald_block", 14, new int[]{9, 14, 16, 9}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 7.0F);

    public emeraldsuperarmor(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setMaxDamage(3632);
        this.canRepair = true;
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {
        if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == KEY31 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == KEY30 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == KEY29 &&
                player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == KEY28)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 0, 2));
            player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 0, 2));
            player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 0, 1));
            player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 0, 0));
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
