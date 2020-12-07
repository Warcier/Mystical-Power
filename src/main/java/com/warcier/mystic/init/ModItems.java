package com.warcier.mystic.init;

import com.warcier.mystic.Mystic;
import com.warcier.mystic.util.enums.ModArmorMaterial;
import com.warcier.mystic.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mystic.MODID);

    // Items
    public static final RegistryObject<Item> MYSTIC_PEARL = ITEMS.register("mystic_pearl", () -> new Item(new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<Item> ENCHANTED_MYSTIC_PEARL = ITEMS.register("enchanted_mystic_pearl", () -> new Item(new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<Item> MIST = ITEMS.register("mist", () -> new Item(new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<Item> ROD = ITEMS.register("rod", () -> new Item(new Item.Properties().group(Mystic.TAB)));

    // Block Items
    public static final RegistryObject<Item> MIST_ORE= ITEMS.register("mist_ore",
            () -> new BlockItem(ModBlock.MIST_ORE.get(), new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<Item> MIST_BLOCK= ITEMS.register("mist_block",
            () -> new BlockItem(ModBlock.MIST_BLOCK.get(), new Item.Properties().group(Mystic.TAB)));

    //Tools
    public static final RegistryObject<AxeItem> MYSTICAL_AXE = ITEMS.register("mystical_axe",
            () -> new AxeItem(ModItemTier.MYSTIC_PEARL, 4, -2.5F, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<PickaxeItem> MYSTICAL_PICKAXE = ITEMS.register("mystical_pickaxe",
            () -> new PickaxeItem(ModItemTier.MYSTIC_PEARL, 1, -2.1F, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<SwordItem> MYSTICAL_SWORD = ITEMS.register("mystical_sword",
            () -> new SwordItem(ModItemTier.MYSTIC_PEARL, 10, -1F, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<ShovelItem> MYSTICAL_SHOVEL = ITEMS.register("mystical_shovel",
            () -> new ShovelItem(ModItemTier.MYSTIC_PEARL, 0.5F, -2.0F, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<HoeItem> MYSTICAL_HOE = ITEMS.register("mystical_hoe",
            () -> new HoeItem(ModItemTier.MYSTIC_PEARL, -2, -2.0F, new Item.Properties().group(Mystic.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> MYSTICAL_HELMET = ITEMS.register("mystical_helmet",
            () -> new ArmorItem(ModArmorMaterial.MYSTIC_PEARL, EquipmentSlotType.HEAD, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<ArmorItem> MYSTICAL_CHESTPLATE = ITEMS.register("mystical_chestplate",
            () -> new ArmorItem(ModArmorMaterial.MYSTIC_PEARL, EquipmentSlotType.CHEST, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<ArmorItem> MYSTICAL_LEGGINGS = ITEMS.register("mystical_leggings",
            () -> new ArmorItem(ModArmorMaterial.MYSTIC_PEARL, EquipmentSlotType.LEGS, new Item.Properties().group(Mystic.TAB)));

    public static final RegistryObject<ArmorItem> MYSTICAL_BOOTS = ITEMS.register("mystical_boots",
            () -> new ArmorItem(ModArmorMaterial.MYSTIC_PEARL, EquipmentSlotType.FEET, new Item.Properties().group(Mystic.TAB)));

}
