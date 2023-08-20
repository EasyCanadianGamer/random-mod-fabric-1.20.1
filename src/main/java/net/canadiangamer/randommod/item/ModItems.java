package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.RandomMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RANDOM_INGOT = registerItem("random_ingot", new Item(new FabricItemSettings()));

    public static final Item RANDOM_MEAT_COOKED = registerItem("random_meat_cooked", new Item(new FabricItemSettings().food(ModFoodComponents.RANDOM_MEAT_COOKED)));

    public static final Item RANDOM_MEAT_RAW = registerItem("random_meat_raw", new Item(new FabricItemSettings().food(ModFoodComponents.RANDOM_MEAT_RAW)));



    private static void addItemsToIngrediantItemGroup(FabricItemGroupEntries entries) {
        entries.add(RANDOM_INGOT);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RandomMod.MOD_ID,name), item);
    }

    public static void registerModItems() {
        RandomMod.LOGGER.info("Registering Mod Items for " + RandomMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrediantItemGroup);
    }




}



