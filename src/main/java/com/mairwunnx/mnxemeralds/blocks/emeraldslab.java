package com.mairwunnx.mnxemeralds.blocks;

import com.mairwunnx.mnxemeralds.registers.blockregister;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public abstract class emeraldslab extends BlockSlab
{
    public emeraldslab(String name, float hardness, float resistance)
    {
        super(Material.IRON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setResistance(resistance);
        setHardness(hardness);
        this.useNeighborBrightness = true;
        setLightLevel(20.0F);

        IBlockState state = this.blockState.getBaseState();

        if(!this.isDouble())
        {
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        setDefaultState(state);
    }

    @Override
    public String getUnlocalizedName(int meta)
    {
        return null;
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
            return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return 0;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {

        return ((EnumBlockHalf)state.getValue(HALF)).ordinal() + 1;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(blockregister.KEY2);
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {HALF});
    }

    @Override
    public IProperty<?> getVariantProperty()
    {
        return HALF;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return EnumBlockHalf.BOTTOM;
    }


}
