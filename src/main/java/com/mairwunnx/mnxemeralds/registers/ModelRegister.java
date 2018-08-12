package com.mairwunnx.mnxemeralds.registers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.mairwunnx.mnxemeralds.registers.blockregister.KEY11;

public class ModelRegister
{
    @SubscribeEvent
    public static void registerModels()
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(KEY11), 0, new ModelResourceLocation(KEY11.getRegistryName(), "inventory"));
    }
}
