package com.mairwunnx.mnxemeralds.drop;

import java.util.Random;
import com.mairwunnx.mnxemeralds.registers.itemregister;
import net.minecraft.entity.passive.*;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class villager
{
    public static double rand;
    public Random r = new Random();

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        if(event.getEntityLiving() instanceof EntityVillager)
        {
            event.getEntityLiving().dropItem(itemregister.KEY3, r.nextInt(2));
        }
    }
}
