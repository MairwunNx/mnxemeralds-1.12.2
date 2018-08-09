package com.mairwunnx.mnxemeralds.blocks;

import net.minecraft.block.state.IBlockState;

public class EmeraldHardHalfSlab extends EmeraldHardSlab
{
    public EmeraldHardHalfSlab(String name, float hardness, float resistance)
    {
        super(name, hardness, resistance);
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumBlockHalf)state.getValue(HALF)).ordinal() + 1;
    }
}
