package com.mairwunnx.mnxemeralds;

import com.mairwunnx.mnxemeralds.drop.villager;
import com.mairwunnx.mnxemeralds.proxy.CommonProxy;
import com.mairwunnx.mnxemeralds.registers.itemregister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = mnxemeralds.MODID, name = mnxemeralds.NAME, version = mnxemeralds.VERSION)

public class mnxemeralds
{
    private static Logger logger;
    public static final String MODID = "mnxemeralds";
    public static final String NAME = "mnxemeralds";
    public static final String VERSION = "1.0.1.0";

    @SidedProxy(clientSide = "com.mairwunnx.mnxemeralds.proxy.ClientProxy", serverSide = "com.mairwunnx.mnxemeralds.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs defaultModTab = new CreativeTabs("mnxemeralds")
    {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(itemregister.KEY);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);

        logger = event.getModLog();

        logger.info("mnxemeralds mod starting preInitialization event.");

        itemregister.register();

        MinecraftForge.EVENT_BUS.register(new villager());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);

        logger.info("mnxemeralds mod starting Initialization event.");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
