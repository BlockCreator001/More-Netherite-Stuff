package com.blocklegend001.morenetheritestuff1182.item.custom;

import com.blocklegend001.morenetheritestuff1182.util.ModTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;

public class PaxelItemT2 extends DiggerItem implements Vanishable {

    public PaxelItemT2(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.NETHERITE_T2_PAXEL_MINEABLE, pProperties);
    }
}

