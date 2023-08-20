package net.canadiangamer.randommod;

import net.canadiangamer.randommod.block.ModBlocks;
import net.canadiangamer.randommod.block.ModFlammableBlockRegistry;
import net.canadiangamer.randommod.item.ModItemGroups;
import net.canadiangamer.randommod.item.ModItems;
import net.canadiangamer.randommod.worldgen.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomMod implements ModInitializer {
	public static final String MOD_ID = "randommod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFlammableBlockRegistry.registerFlammableBlocks();


	}
}