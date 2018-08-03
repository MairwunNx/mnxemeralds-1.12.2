package com.mairwunnx.mnxemeralds.loots;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class dungeonloot extends Event
{
    @SubscribeEvent
    public void onLoot(LootTableLoadEvent e)
    {
        if (LootTableList.CHESTS_SPAWN_BONUS_CHEST.equals(e.getName()))
        {
            ResourceLocation loc = new ResourceLocation("mnxemeralds", "chests/mnxemeralds_spawn_bonus_chest");
            LootTable customLootTable = e.getLootTableManager().getLootTableFromLocation(loc);
            e.setTable(customLootTable);
        }
    }
}
