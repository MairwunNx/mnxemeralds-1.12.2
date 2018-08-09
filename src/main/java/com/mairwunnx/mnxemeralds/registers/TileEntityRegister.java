package com.mairwunnx.mnxemeralds.registers;

import com.mairwunnx.mnxemeralds.blocks.TileEntityEmeraldFurnace;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRegister
{
    public  static void register()
    {
        TileEntity.register("mnxemeralds", TileEntityEmeraldFurnace.class);
    }
}
