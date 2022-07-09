package com.blocklegend001.morenetheritestuff.util;

import com.blocklegend001.morenetheritestuff.MoreNetheriteStuffMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final Tags.IOptionalNamedTag<Block> NETHERITE_T1_PAXEL_MINEABLE =
                tag("mineable/netherite_t1_paxel");

        public static final Tags.IOptionalNamedTag<Block> NETHERITE_T2_PAXEL_MINEABLE =
                tag("mineable/netherite_t2_paxel");

        public static final Tags.IOptionalNamedTag<Block> NETHERITE_T3_PAXEL_MINEABLE =
                tag("mineable/netherite_t3_paxel");

        public static final Tags.IOptionalNamedTag<Block> NETHERITE_T4_PAXEL_MINEABLE =
                tag("mineable/netherite_t4_paxel");

        private static Tags.IOptionalNamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(MoreNetheriteStuffMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T1_INGOT = forgeTag("ingots/netherite_t1_ingot");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T2_INGOT = forgeTag("ingots/netherite_t2_ingot");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T3_INGOT = forgeTag("ingots/netherite_t3_ingot");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T4_INGOT = forgeTag("ingots/netherite_t4_ingot");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T1_BLOCK = forgeTag("block/netherite_t1_block");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T2_BLOCK = forgeTag("block/netherite_t2_block");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T3_BLOCK = forgeTag("block/netherite_t3_block");
        public static final Tags.IOptionalNamedTag<Item> NETHERITE_T4_BLOCK = forgeTag("block/netherite_t4_block");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(MoreNetheriteStuffMod.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
