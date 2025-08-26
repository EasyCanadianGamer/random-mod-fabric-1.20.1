package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RANDOMITE_INGOT = registerItem("randomite_ingot", new Item(new FabricItemSettings()));
    public static final Item AIRPOD_CASE = registerItem("airpod_case",
            new FullAirpodsCaseItem(new FabricItemSettings().maxCount(1)));
    public static final Item AIRPOD_CASE_EMPTY = registerItem("airpod_case_empty",new Item(new FabricItemSettings()));


    public static final Item RANDOM_MEAT_COOKED = registerItem("random_meat_cooked", new Item(new FabricItemSettings().food(ModFoodComponents.RANDOM_MEAT_COOKED)));
    public static final Item RANDOM_MEAT_RAW = registerItem("random_meat_raw", new Item(new FabricItemSettings().food(ModFoodComponents.RANDOM_MEAT_RAW)));
    public static final Item COCAINE = registerItem("cocaine", new CocaineItem(new FabricItemSettings().food(ModFoodComponents.COCAINE)));


    public static final Item RANDOMITE_PICKAXE = registerItem("randomite_pickaxe",
            new PickaxeItem(ModToolMaterial.RANDOMITE, 2, 2f, new FabricItemSettings()));
    public static final Item RANDOMITE_AXE = registerItem("randomite_axe",
            new AxeItem(ModToolMaterial.RANDOMITE, 25, 1f, new FabricItemSettings()));
    public static final Item RANDOMITE_SHOVEL = registerItem("randomite_shovel",
            new ShovelItem(ModToolMaterial.RANDOMITE, 0, 0f, new FabricItemSettings()));
    public static final Item RANDOMITE_SWORD = registerItem("randomite_sword",
            new SwordItem(ModToolMaterial.RANDOMITE, 20, 10f, new FabricItemSettings()));
    public static final Item RANDOMITE_HOE = registerItem("randomite_hoe",
            new HoeItem(ModToolMaterial.RANDOMITE, 0, 0f, new FabricItemSettings()));



    public static final Item RANDOMITE_HELMET = registerItem("randomite_helmet",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RANDOMITE_CHESTPLATE = registerItem("randomite_chestplate",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RANDOMITE_LEGGINGS = registerItem("randomite_leggings",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RANDOMITE_BOOTS = registerItem("randomite_boots",
            new ArmorItem(ModArmorMaterials.RANDOMITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AIRPODS = registerItem("airpods",
            new ArmorItem(ModArmorMaterials.AIRPODS, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static void addItemsToIngrediantItemGroup(FabricItemGroupEntries entries) {
        entries.add(RANDOMITE_INGOT);
    }




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RandomMod.MOD_ID,name), item);
    }

    public static void registerModItems() {
        RandomMod.LOGGER.info("Registering Mod Items for " + RandomMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrediantItemGroup);
    }




}



