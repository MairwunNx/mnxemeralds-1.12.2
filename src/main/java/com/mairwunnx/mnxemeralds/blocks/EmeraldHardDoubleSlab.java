package com.mairwunnx.mnxemeralds.blocks;

public class EmeraldHardDoubleSlab extends emeraldslab
{
    public EmeraldHardDoubleSlab(String name, float hardness, float resistance)
    {
        super(name, hardness, resistance);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}
