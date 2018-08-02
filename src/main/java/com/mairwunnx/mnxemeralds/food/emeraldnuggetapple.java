package com.mairwunnx.mnxemeralds.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import static com.mairwunnx.mnxemeralds.mnxemeralds.defaultModTab;

public class emeraldnuggetapple extends ItemFood
{
    public static Item emeraldapple = new emeraldnuggetapple("Emerald nugget apple", 6, 7.0F, false).setCreativeTab(defaultModTab);

    public emeraldnuggetapple(String name, int amount, float saturation, boolean isWolfFood)
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

        player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 200, 1));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(22), 2400, 1));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 2400, 1));
    }
}
