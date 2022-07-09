package com.blocklegend001.morenetheritestuff1182.item;

import com.blocklegend001.morenetheritestuff1182.MoreNetheriteStuff1182;
import com.blocklegend001.morenetheritestuff1182.item.custom.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreNetheriteStuff1182.MOD_ID);

    public static final RegistryObject<Item> NETHERITE_T1_INGOT = ITEMS.register("netherite_t1_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_INGOT = ITEMS.register("netherite_t2_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_INGOT = ITEMS.register("netherite_t3_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_INGOT = ITEMS.register("netherite_t4_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_APPLE = ITEMS.register("netherite_t1_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB).food(ModFoods.NETHERITE_T1_APPLE)));

    public static final RegistryObject<Item> NETHERITE_T2_APPLE = ITEMS.register("netherite_t2_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB).food(ModFoods.NETHERITE_T2_APPLE)));

    public static final RegistryObject<Item> NETHERITE_T3_APPLE = ITEMS.register("netherite_t3_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB).food(ModFoods.NETHERITE_T3_APPLE)));

    public static final RegistryObject<Item> NETHERITE_4_APPLE = ITEMS.register("netherite_t4_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB).food(ModFoods.NETHERITE_T4_APPLE)));

    public static final RegistryObject<Item> NETHERITE_T1_SWORD = ITEMS.register("netherite_t1_sword",
            () -> new SwordItem(ModTiers.NETHERITE_T1, 13, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_SWORD = ITEMS.register("netherite_t2_sword",
            () -> new SwordItem(ModTiers.NETHERITE_T2, 15, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_SWORD = ITEMS.register("netherite_t3_sword",
            () -> new SwordItem(ModTiers.NETHERITE_T3, 18, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_SWORD = ITEMS.register("netherite_t4_sword",
            () -> new SwordItem(ModTiers.NETHERITE_T4, 20, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_PICKAXE = ITEMS.register("netherite_t1_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE_T1, 7, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_PICKAXE = ITEMS.register("netherite_t2_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE_T2, 7, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_PICKAXE = ITEMS.register("netherite_t3_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE_T3, 7, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_PICKAXE = ITEMS.register("netherite_t4_pickaxe",
            () -> new PickaxeItem(ModTiers.NETHERITE_T4, 7, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_AXE = ITEMS.register("netherite_t1_axe",
            () -> new AxeItem(ModTiers.NETHERITE_T1, 11, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_AXE = ITEMS.register("netherite_t2_axe",
            () -> new AxeItem(ModTiers.NETHERITE_T2, 13, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_AXE = ITEMS.register("netherite_t3_axe",
            () -> new AxeItem(ModTiers.NETHERITE_T3, 15, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_AXE = ITEMS.register("netherite_t4_axe",
            () -> new AxeItem(ModTiers.NETHERITE_T4, 17, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_SHOVEL = ITEMS.register("netherite_t1_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE_T1, 6, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_SHOVEL = ITEMS.register("netherite_t2_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE_T2, 7, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_SHOVEL = ITEMS.register("netherite_t3_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE_T3, 8, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_SHOVEL = ITEMS.register("netherite_t4_shovel",
            () -> new ShovelItem(ModTiers.NETHERITE_T4, 9, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_HOE = ITEMS.register("netherite_t1_hoe",
            () -> new HoeItem(ModTiers.NETHERITE_T1, 0, -1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_HOE = ITEMS.register("netherite_t2_hoe",
            () -> new HoeItem(ModTiers.NETHERITE_T2, 0, -1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_HOE = ITEMS.register("netherite_t3_hoe",
            () -> new HoeItem(ModTiers.NETHERITE_T3, 0, -1.5f,
                   new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_HOE = ITEMS.register("netherite_t4_hoe",
            () -> new HoeItem(ModTiers.NETHERITE_T4, 0, -1.5f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_PAXEL = ITEMS.register("netherite_t1_paxel",
            () -> new PaxelItemT1(ModTiers.NETHERITE_T1, 11, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_PAXEL = ITEMS.register("netherite_t2_paxel",
            () -> new PaxelItemT2(ModTiers.NETHERITE_T2, 13, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_PAXEL = ITEMS.register("netherite_t3_paxel",
            () -> new PaxelItemT3(ModTiers.NETHERITE_T3, 15, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_PAXEL = ITEMS.register("netherite_t4_paxel",
            () -> new PaxelItemT4(ModTiers.NETHERITE_T4, 17, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_HELMET = ITEMS.register("netherite_t1_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T1, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_HELMET = ITEMS.register("netherite_t2_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T2, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_HELMET = ITEMS.register("netherite_t3_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T3, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_HELMET = ITEMS.register("netherite_t4_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T4, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_CHESTPLATE = ITEMS.register("netherite_t1_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T1, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_CHESTPLATE = ITEMS.register("netherite_t2_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T2, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_CHESTPLATE = ITEMS.register("netherite_t3_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T3, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_CHESTPLATE = ITEMS.register("netherite_t4_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T4, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_LEGGINGS = ITEMS.register("netherite_t1_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T1, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_LEGGINGS = ITEMS.register("netherite_t2_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T2, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_LEGGINGS = ITEMS.register("netherite_t3_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T3, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_LEGGINGS = ITEMS.register("netherite_t4_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_T4, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T1_BOOTS = ITEMS.register("netherite_t1_boots",
            () -> new ModArmorItemT1(ModArmorMaterials.NETHERITE_T1, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T2_BOOTS = ITEMS.register("netherite_t2_boots",
            () -> new ModArmorItemT2(ModArmorMaterials.NETHERITE_T2, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T3_BOOTS = ITEMS.register("netherite_t3_boots",
            () -> new ModArmorItemT3(ModArmorMaterials.NETHERITE_T3, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> NETHERITE_T4_BOOTS = ITEMS.register("netherite_t4_boots",
            () -> new ModArmorItemT4(ModArmorMaterials.NETHERITE_T4, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB)));

    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().tab(ModCreativeModeTab.MORENETHERITESTUFF1182_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
