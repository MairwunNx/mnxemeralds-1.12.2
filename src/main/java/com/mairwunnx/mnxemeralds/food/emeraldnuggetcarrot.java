package com.mairwunnx.mnxemeralds.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import static com.mairwunnx.mnxemeralds.mnxemeralds.defaultModTab;

public class emeraldnuggetcarrot extends ItemFood
{
    public static Item emeraldcarrot = new emeraldnuggetcarrot("Emerald nugget carrot", 9, 18.0F, false).setCreativeTab(defaultModTab);

    public emeraldnuggetcarrot(String name, int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        super.onFoodEaten(stack, worldIn, player);

        player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 5000, 0));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 2400, 1));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(26), 2400, 0));
    }
}
