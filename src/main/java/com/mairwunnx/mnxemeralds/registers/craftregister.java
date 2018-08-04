package com.mairwunnx.mnxemeralds.registers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class craftregister
{
    public static void register()
    {
        registerRecipes("emerald");
        registerRecipes("emerald_nugget");
        registerRecipes("emerald_nugget_dust");
        registerRecipes("emerald_nugget_carrot");
        registerRecipes("emerald_nugget_apple");
        registerRecipes("emerald_super_apple");
        registerRecipes("emerald_axe");
        registerRecipes("emerald_block_axe");
        registerRecipes("emerald_pickaxe");
        registerRecipes("emerald_block_pickaxe");
        registerRecipes("emerald_shovel");
        registerRecipes("emerald_block_shovel");
        registerRecipes("emerald_hoe");
        registerRecipes("emerald_block_hoe");
        registerRecipes("emerald_sword");
        registerRecipes("emerald_block_sword");
        registerRecipes("emerald_hard_block");
        registerRecipes("emerald_helmet");
        registerRecipes("emerald_block_helmet");
        registerRecipes("emerald_block_chestplate");
        registerRecipes("emerald_block_leggings");
        registerRecipes("emerald_block_boots");
        registerRecipes("emerald_super_axe");
        registerRecipes("emerald_super_pickaxe");
        registerRecipes("emerald_super_shovel");
        registerRecipes("emerald_super_hoe");
        registerRecipes("emerald_super_sword");
        registerRecipes("emerald_super_helmet");
        registerRecipes("emerald_super_chestplate");
        registerRecipes("emerald_super_leggings");
        registerRecipes("emerald_super_boots");
        registerRecipes("emerald_fence");
        registerRecipes("emerald_slab");
    }

    private static void registerRecipes(String name)
    {
        CraftingHelper.register(new ResourceLocation("mnxemeralds", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
    }
}
