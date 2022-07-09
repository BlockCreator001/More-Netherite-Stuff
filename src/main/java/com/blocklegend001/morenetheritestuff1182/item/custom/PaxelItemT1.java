package com.blocklegend001.morenetheritestuff1182.item.custom;

import com.blocklegend001.morenetheritestuff1182.util.ModTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;

public class PaxelItemT1 extends DiggerItem implements Vanishable {

    public PaxelItemT1(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.NETHERITE_T1_PAXEL_MINEABLE, pProperties);
    }
}

