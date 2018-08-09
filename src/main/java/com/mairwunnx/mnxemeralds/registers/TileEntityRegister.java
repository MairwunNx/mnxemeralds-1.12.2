package com.mairwunnx.mnxemeralds.registers;

import com.mairwunnx.mnxemeralds.blocks.TileEntityEmeraldFurnace;
import com.mairwunnx.mnxemeralds.tiles.TileEntityEmeraldChest;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRegister
{
    public  static void register()
    {
        TileEntity.register("ID0", TileEntityEmeraldFurnace.class);
        TileEntity.register("ID1", TileEntityEmeraldChest.class);
    }
}
