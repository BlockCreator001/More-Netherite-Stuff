package com.blocklegend001.morenetheritestuff.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier NETHERITE_T1 = new ForgeTier(4, 2282, 14f,
            0f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.NETHERITE_T1_INGOT.get()));

    public static final ForgeTier NETHERITE_T2 = new ForgeTier(4, 2313, 15f,
            0f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.NETHERITE_T2_INGOT.get()));

    public static final ForgeTier NETHERITE_T3 = new ForgeTier(4, 3874, 17f,
            0f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.NETHERITE_T3_INGOT.get()));

    public static final ForgeTier NETHERITE_T4 = new ForgeTier(4, 5997, 19f,
            0f, 10, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.NETHERITE_T4_INGOT.get()));
}
