package com.mairwunnx.mnxemeralds.blocks;

public class emeralddoubleslab extends emeraldslab
{
    public emeralddoubleslab(String name, float hardness, float resistance)
    {
        super(name, hardness, resistance);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}
