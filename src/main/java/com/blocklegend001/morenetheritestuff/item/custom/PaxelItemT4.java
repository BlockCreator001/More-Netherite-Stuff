package com.blocklegend001.morenetheritestuff.item.custom;

import com.blocklegend001.morenetheritestuff.util.ModTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;

public class PaxelItemT4 extends DiggerItem implements Vanishable {

    public PaxelItemT4(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.NETHERITE_T4_PAXEL_MINEABLE, pProperties);
    }
}

