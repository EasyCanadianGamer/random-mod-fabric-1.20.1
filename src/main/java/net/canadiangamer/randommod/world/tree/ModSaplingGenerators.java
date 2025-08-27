package net.canadiangamer.randommod.world.tree;


import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {

    public static final SaplingGenerator RANDOMWOOD = new SaplingGenerator(RandomMod.MOD_ID + ":randomwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.RANDOMWOOD_KEY), Optional.empty());
}
