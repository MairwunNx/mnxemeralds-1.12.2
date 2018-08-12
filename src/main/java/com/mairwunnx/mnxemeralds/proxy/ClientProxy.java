package com.mairwunnx.mnxemeralds.proxy;

import com.mairwunnx.mnxemeralds.registers.ModelRegister;
import com.mairwunnx.mnxemeralds.registers.blockregister;
import com.mairwunnx.mnxemeralds.registers.itemregister;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);

        itemregister.registerRender();

        ModelRegister.registerModels();

        blockregister.registerRender();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
