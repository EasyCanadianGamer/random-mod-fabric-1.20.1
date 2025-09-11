package net.canadiangamer.randommod.item;

import net.canadiangamer.randommod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.canadiangamer.randommod.RandomMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroup {

    public static final ItemGroup RANDOM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RandomMod.MOD_ID, "random_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.random_ingot"))
                    .icon(() -> new ItemStack(ModItems.RANDOMITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RANDOMITE_INGOT);
                        entries.add(ModItems.AIRPOD_CASE);
                        entries.add(ModItems.AIRPOD_CASE_EMPTY);

                        entries.add(ModItems.RANDOM_MEAT_COOKED);
                        entries.add(ModItems.RANDOM_MEAT_RAW);
                        entries.add(ModItems.COCAINE);

                        entries.add(ModItems.RANDOMITE_SWORD);
                        entries.add(ModItems.RANDOMITE_AXE);
                        entries.add(ModItems.RANDOMITE_PICKAXE);
                        entries.add(ModItems.RANDOMITE_HOE);
                        entries.add(ModItems.RANDOMITE_SHOVEL);

                        entries.add(ModItems.AIRPODS);
                        entries.add(ModItems.RANDOMITE_HELMET);
                        entries.add(ModItems.RANDOMITE_CHESTPLATE);
                        entries.add(ModItems.RANDOMITE_LEGGINGS);
                        entries.add(ModItems.RANDOMITE_BOOTS);

                        entries.add(ModBlocks.RANDOMITE_BLOCK);
                        entries.add(ModBlocks.RANDOMITE_ORE);
                        entries.add(ModBlocks.RANDOMWOOD_PLANKS);
                        entries.add(ModBlocks.RANDOMWOOD_LOG);
                        entries.add(ModBlocks.RANDOMWOOD_LEAVES);
                        entries.add(ModBlocks.RANDOMWOOD_SAPLING);
                        entries.add(ModBlocks.DEEPSLATE_RANDOMITE_ORE);
                        entries.add(ModBlocks.COCAINE_ROCK);
                        entries.add(ModBlocks.TOWEL_HANGER);

                        entries.add(ModItems.RAW_RANDOMITE);


                    }).build());


    public static void registerItemGroups() {
        RandomMod.LOGGER.info("Registering Item Groups for " + RandomMod.MOD_ID);
    }
}
