package com.blocklegend001.morenetheritestuff.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MORENETHERITESTUFF_TAB = new CreativeModeTab("morenetheritestufftab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_T1_INGOT.get());
        }
    };
}
