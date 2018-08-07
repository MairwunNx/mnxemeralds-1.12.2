package com.mairwunnx.mnxemeralds.drop;

import com.mairwunnx.mnxemeralds.registers.itemregister;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class villager
{
    public static double rand;
    public Random r = new Random();

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event)
    {
        if(event.getEntityLiving() instanceof EntityVillager)
        {
            event.getEntityLiving().dropItem(itemregister.KEY1, r.nextInt(3));
        }
    }
}
