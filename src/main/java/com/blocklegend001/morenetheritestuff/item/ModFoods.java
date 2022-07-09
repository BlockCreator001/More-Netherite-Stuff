package com.blocklegend001.morenetheritestuff.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties NETHERITE_T1_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 5000), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 2400), 1f).build();

    public static final FoodProperties NETHERITE_T2_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 7500, 1), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 4800, 1), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 1), 1f).build();

    public static final FoodProperties NETHERITE_T3_APPLE = new FoodProperties.Builder().nutrition(10).saturationMod(0.10f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 10000, 2), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 7200, 2), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4800, 2), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 2), 1f).build();

    public static final FoodProperties NETHERITE_T4_APPLE = new FoodProperties.Builder().nutrition(12).saturationMod(0.12f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12500, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 9600, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 4800, 3), 1f).build();

}