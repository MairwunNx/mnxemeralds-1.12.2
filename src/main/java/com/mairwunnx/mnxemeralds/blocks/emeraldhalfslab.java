package com.mairwunnx.mnxemeralds.blocks;

public class emeraldhalfslab extends emeraldslab
{
    public emeraldhalfslab(String name, float hardness, float resistance)
    {
        super(name, hardness, resistance);
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }
}
