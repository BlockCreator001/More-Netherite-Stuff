package com.blocklegend001.morenetheritestuff1182.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MORENETHERITESTUFF1182_TAB = new CreativeModeTab("morenetheritestuff1182tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_T1_INGOT.get());
        }
    };
}
