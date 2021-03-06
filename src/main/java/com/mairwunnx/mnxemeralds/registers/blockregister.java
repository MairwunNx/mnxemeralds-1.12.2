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
    public static Block KEY4 = new emeraldwall("emerald_wall", 20.0F, 13.5F, KEY).setCreativeTab(defaultModTab);

    public static Block KEY5 = new emeraldfurnace(false ,"emerald_furnace", 13.5F, 20.0F).setCreativeTab(defaultModTab);
    public static Block KEY6 = new emeraldfurnace(true ,"lit_emerald_furnace", 13.5F, 20.0F);

    public static Block KEY11 = new EmeraldChest("emerald_chest", 13.5F, 20.0F).setCreativeTab(defaultModTab);

    public static Block KEY7 = new EmeraldHardStairs("emerald_hard_stairs", 17.5F, 24.0F, KEY.getDefaultState()).setCreativeTab(defaultModTab);
    public static Block KEY8 = new EmeraldHardWall("emerald_hard_wall", 24.0F, 17.5F, KEY4).setCreativeTab(defaultModTab);
    public static Block KEY9 = new EmeraldHardHalfSlab("emerald_hard_slab", 17.5F, 24.0F).setCreativeTab(defaultModTab);
    public static Block KEY10 = new EmeraldHardFence("emerald_hard_fence", 17.5F, 24.0F).setCreativeTab(defaultModTab);

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
        setRender(KEY7);
        setRender(KEY8);
        setRender(KEY9);
        setRender(KEY10);
        setRender(KEY11);
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
