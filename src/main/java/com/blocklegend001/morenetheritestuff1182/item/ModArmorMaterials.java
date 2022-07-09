package com.blocklegend001.morenetheritestuff1182.item;

import com.blocklegend001.morenetheritestuff1182.MoreNetheriteStuff1182;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    NETHERITE_T1("netherite_t1", 150, new int[]{5, 10, 14, 5}, 21,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.NETHERITE_T1_INGOT.get());
    }),

    NETHERITE_T2("netherite_t2", 250, new int[]{6, 13, 19, 7}, 21,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 5.5F, 0.2F, () -> {
        return Ingredient.of(ModItems.NETHERITE_T2_INGOT.get());
    }),

    NETHERITE_T3("netherite_t3", 300, new int[]{9, 15, 24, 10}, 21,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 5.7F, 0.2F, () -> {
        return Ingredient.of(ModItems.NETHERITE_T3_INGOT.get());
    }),

    NETHERITE_T4("netherite_t4", 350, new int[]{13, 19, 29, 14}, 21,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 5.9F, 0.2F, () -> {
        return Ingredient.of(ModItems.NETHERITE_T4_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                      SoundEvent sound, float toughness,
                      float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return MoreNetheriteStuff1182.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
