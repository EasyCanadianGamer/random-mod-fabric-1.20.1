package net.canadiangamer.randommod;

import net.canadiangamer.randommod.block.ModBlocks;
import net.canadiangamer.randommod.item.ModItemGroup;
import net.canadiangamer.randommod.item.ModItems;
import net.canadiangamer.randommod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomMod implements ModInitializer {
    public static final String MOD_ID = "randommod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
        ModBlocks.registerModBlocks();

        ModWorldGeneration.generateModWorldGen();

//        StrippableBlockRegistry.register(ModBlocks.DRIFTWOOD_LOG, ModBlocks.STRIPPED_DRIFTWOOD_LOG);
//        StrippableBlockRegistry.register(ModBlocks.DRIFTWOOD_WOOD, ModBlocks.STRIPPED_DRIFTWOOD_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RANDOMWOOD_LOG, 5, 5);
//        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIFTWOOD_WOOD, 5, 5);
//        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DRIFTWOOD_LOG, 5, 5);
//        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DRIFTWOOD_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RANDOMWOOD_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RANDOMWOOD_LEAVES, 30, 60);


    }
}