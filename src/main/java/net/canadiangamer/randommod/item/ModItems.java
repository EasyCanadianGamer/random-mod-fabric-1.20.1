package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.fluid.ModFluids;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RANDOMITE_INGOT = registerItem("randomite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_RANDOMITE = registerItem("raw_randomite", new Item(new Item.Settings()));

    public static final Item AIRPOD_CASE = registerItem("airpod_case", new FullAirpodsCaseItem(new Item.Settings().maxCount(1)));
    public static final Item AIRPOD_CASE_EMPTY = registerItem("airpod_case_empty",new Item(new Item.Settings()));

    public static final Item RANDOM_MEAT_COOKED = registerItem("random_meat_cooked", new Item(new Item.Settings().food(ModFoodComponents.RANDOM_MEAT_COOKED)));
    public static final Item RANDOM_MEAT_RAW = registerItem("random_meat_raw", new Item(new Item.Settings().food(ModFoodComponents.RANDOM_MEAT_RAW)));
    public static final Item COCAINE = registerItem("cocaine", new CocaineItem(new Item.Settings().food(ModFoodComponents.COCAINE)));



    public static final Item RANDOMITE_PICKAXE = registerItem("randomite_pickaxe",
            new PickaxeItem(ModToolMaterials.RANDOMITE_INGOT,  new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RANDOMITE_INGOT,2, 2f))));

    public static final Item RANDOMITE_AXE = registerItem("randomite_axe",
            new AxeItem(ModToolMaterials.RANDOMITE_INGOT,  new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RANDOMITE_INGOT,25, 2f))));

    public static final Item RANDOMITE_SHOVEL = registerItem("randomite_shovel",
            new ShovelItem(ModToolMaterials.RANDOMITE_INGOT,  new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RANDOMITE_INGOT,0, 0f))));

    public static final Item RANDOMITE_SWORD = registerItem("randomite_sword",
            new SwordItem(ModToolMaterials.RANDOMITE_INGOT,  new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RANDOMITE_INGOT,20, 10f))));
    public static final Item RANDOMITE_HOE = registerItem("randomite_hoe",
            new HoeItem(ModToolMaterials.RANDOMITE_INGOT,  new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RANDOMITE_INGOT,0, 0f))));


    public static final Item AIRPODS = registerItem("airpods",
            new AirpodsArmorItem(ModArmorMaterials.AIRPODS_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item RANDOMITE_HELMET = registerItem("randomite_helmet",
            new ArmorItem(ModArmorMaterials.RANDOMITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item RANDOMITE_CHESTPLATE = registerItem("randomite_chestplate",
            new ArmorItem(ModArmorMaterials.RANDOMITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item RANDOMITE_LEGGINGS = registerItem("randomite_leggings",
            new ArmorItem(ModArmorMaterials.RANDOMITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item RANDOMITE_BOOTS = registerItem("randomite_boots",
            new ArmorItem(ModArmorMaterials.RANDOMITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item RANDOM_WATER_BUCKET = registerItem("random_water_bucket",
            new BucketItem(ModFluids.RANDOM_WATER, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RandomMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RandomMod.LOGGER.info("Registering Mod Items for " + RandomMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RANDOMITE_INGOT);
        });
    }

}
