package com.blocklegend001.morenetheritestuff1182.util;

import com.blocklegend001.morenetheritestuff1182.MoreNetheriteStuff1182;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NETHERITE_T1_PAXEL_MINEABLE =
                tag("mineable/netherite_t1_paxel");

        public static final TagKey<Block> NETHERITE_T2_PAXEL_MINEABLE =
                tag("mineable/netherite_t2_paxel");

        public static final TagKey<Block> NETHERITE_T3_PAXEL_MINEABLE =
                tag("mineable/netherite_t3_paxel");

        public static final TagKey<Block> NETHERITE_T4_PAXEL_MINEABLE =
                tag("mineable/netherite_t4_paxel");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MoreNetheriteStuff1182.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> NETHERITE_T1_INGOT = forgeTag("ingots/netherite_t1_ingot");
        public static final TagKey<Item> NETHERITE_T2_INGOT = forgeTag("ingots/netherite_t2_ingot");
        public static final TagKey<Item> NETHERITE_T3_INGOT = forgeTag("ingots/netherite_t3_ingot");
        public static final TagKey<Item> NETHERITE_T4_INGOT = forgeTag("ingots/netherite_t4_ingot");
        public static final TagKey<Item> NETHERITE_T1_BLOCK = forgeTag("block/netherite_t1_block");
        public static final TagKey<Item> NETHERITE_T2_BLOCK = forgeTag("block/netherite_t2_block");
        public static final TagKey<Item> NETHERITE_T3_BLOCK = forgeTag("block/netherite_t3_block");
        public static final TagKey<Item> NETHERITE_T4_BLOCK = forgeTag("block/netherite_t4_block");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MoreNetheriteStuff1182.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
