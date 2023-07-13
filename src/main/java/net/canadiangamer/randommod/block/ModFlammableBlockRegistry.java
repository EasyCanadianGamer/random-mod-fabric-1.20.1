package net.canadiangamer.randommod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.RANDOM_LOG, 5, 5);

        registry.add(ModBlocks.RANDOM_LEAVES, 30, 60);
        registry.add(ModBlocks.RANDOM_PLANKS, 5, 20);
    }
}
