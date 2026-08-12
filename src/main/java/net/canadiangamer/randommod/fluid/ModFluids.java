package net.canadiangamer.randommod.fluid;

import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.block.custom.RandomWaterFluidBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid RANDOM_WATER = registerFluid("random_water", new RandomWaterFluid.Still());
    public static final FlowableFluid FLOWING_RANDOM_WATER = registerFluid("flowing_random_water", new RandomWaterFluid.Flowing());

    public static final Block RANDOM_WATER_BLOCK = Registry.register(Registries.BLOCK,
            Identifier.of(RandomMod.MOD_ID, "random_water"),
            new RandomWaterFluidBlock(RANDOM_WATER, AbstractBlock.Settings.copy(Blocks.WATER)));

    private static <T extends Fluid> T registerFluid(String name, T fluid) {
        return Registry.register(Registries.FLUID, Identifier.of(RandomMod.MOD_ID, name), fluid);
    }

    public static void registerModFluids() {
        RandomMod.LOGGER.info("Registering Mod Fluids for " + RandomMod.MOD_ID);
    }
}
