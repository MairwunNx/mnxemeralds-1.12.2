package com.mairwunnx.mnxemeralds.food;

import com.mojang.realmsclient.gui.ChatFormatting;
import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.mairwunnx.mnxemeralds.mnxemeralds.defaultModTab;

public class emeraldsuperapple extends ItemFood
{
    public static Item emeraldapple1 = new emeraldsuperapple( "Emerald super apple", 8, 9.0F, false).setCreativeTab(defaultModTab);

    public emeraldsuperapple(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setAlwaysEdible();
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        super.onFoodEaten(stack, worldIn, player);

        player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 300, 2));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(22), 2400, 2));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 2400, 2));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 2400, 2));
    }
}
