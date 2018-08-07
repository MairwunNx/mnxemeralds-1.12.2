package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.BlockFurnace;

public class emeraldfurnace extends BlockFurnace
{
    protected emeraldfurnace(boolean isBurning)
    {
        super(isBurning);
        this.needsRandomTick = false;
    }
}
