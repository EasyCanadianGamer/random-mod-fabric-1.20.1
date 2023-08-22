package net.canadiangamer.randommod.datagen;

import net.canadiangamer.randommod.block.ModBlocks;
import net.canadiangamer.randommod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider  extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RANDOMITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RANDOMITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RANDOMITE_ORE);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.RANDOMITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RANDOM_MEAT_COOKED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RANDOM_MEAT_RAW, Models.GENERATED);




        itemModelGenerator.register(ModItems.RANDOMITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RANDOMITE_BOOTS));


    }
}
