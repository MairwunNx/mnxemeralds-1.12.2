package com.mairwunnx.mnxemeralds.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
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

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack item = playerIn.getHeldItem(handIn);
        Vec3d aim = playerIn.getLookVec();
        EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1, 1,1);

        fireball.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);
        fireball.accelerationX = aim.x * 0.1;
        fireball.accelerationY = aim.y * 0.1;
        fireball.accelerationZ = aim.z * 0.1;
        fireball.explosionPower = 13;

        worldIn.spawnEntity(fireball);

        item.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
