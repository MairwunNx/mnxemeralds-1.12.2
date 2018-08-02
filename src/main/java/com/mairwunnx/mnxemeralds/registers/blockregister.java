package com.mairwunnx.mnxemeralds.registers;

import com.mairwunnx.mnxemeralds.blocks.emeraldhardblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.mairwunnx.mnxemeralds.mnxemeralds.defaultModTab;

public class blockregister
{
    public static Block KEY = new emeraldhardblock("emerald_hard_block").setCreativeTab(defaultModTab);

    public static void register()
    {
        setRegister(KEY);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        setRender(KEY);
    }

    private static void setRegister(Block block)
    {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
