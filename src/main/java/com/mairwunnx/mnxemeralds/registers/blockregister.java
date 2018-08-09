package com.mairwunnx.mnxemeralds.registers;

import com.mairwunnx.mnxemeralds.blocks.*;
import net.minecraft.block.Block;
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
    public static Block KEY1 = new emeraldfence("emerald_fence", 13.5F, 20.0F).setCreativeTab(defaultModTab);
    public static Block KEY2 = new emeraldhalfslab("emerald_slab", 13.5F, 20.0F).setCreativeTab(defaultModTab);
    public static Block KEY3 = new emeraldstairs("emerald_stairs", 13.5F, 20.0F, KEY.getDefaultState()).setCreativeTab(defaultModTab);
    public static Block KEY4 = new emeraldwall("emerald_wall", 13.5F, 20.0F, KEY).setCreativeTab(defaultModTab);
    public static Block KEY5 = new emeraldfurnace(false ,"emerald_furnace").setCreativeTab(defaultModTab);
    public static Block KEY6 = new emeraldfurnace(true ,"emerald_furnace_on");

    public static void register()
    {
        setRegister(KEY);
        setRegister(KEY1);
        setRegister(KEY2);
        setRegister(KEY3);
        setRegister(KEY4);
        setRegister(KEY5);
        setRegister(KEY6);
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
        setRender(KEY6);
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
