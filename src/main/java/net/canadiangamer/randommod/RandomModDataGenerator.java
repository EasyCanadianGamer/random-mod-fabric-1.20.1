package net.canadiangamer.randommod;

import net.canadiangamer.randommod.datagen.ModBlockTagProvider;
import net.canadiangamer.randommod.datagen.ModItemTagProvider;
import net.canadiangamer.randommod.datagen.ModLootTableProvider;
import net.canadiangamer.randommod.datagen.ModModelProvider;
import net.canadiangamer.randommod.datagen.ModRecipeProvider;
import net.canadiangamer.randommod.datagen.ModWorldGenProvider;
import net.canadiangamer.randommod.world.ModConfiguredFeatures;
import net.canadiangamer.randommod.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class RandomModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModWorldGenProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
