package net.canadiangamer.randommod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.canadiangamer.randommod.block.ModBlocks;
//import net.canadiangamer.randommod.block.custom.PinkGarnetLampBlock;
import net.canadiangamer.randommod.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RANDOMITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RANDOMITE_ORE);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.TOWEL_HANGER);
//
//        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
//        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);
//
//        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
//        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
//
//        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
//        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
//        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

//        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
//        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

//        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
//        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
//        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
//                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RANDOMITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RANDOM_MEAT_COOKED, Models.GENERATED);
        itemModelGenerator.register(ModItems.RANDOM_MEAT_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCAINE, Models.GENERATED);

        itemModelGenerator.register(ModItems.RANDOMITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RANDOMITE_HOE, Models.HANDHELD);
    }
}