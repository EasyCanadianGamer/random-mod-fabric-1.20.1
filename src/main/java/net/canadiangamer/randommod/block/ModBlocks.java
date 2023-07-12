package net.canadiangamer.randommod.block;

import net.canadiangamer.randommod.RandomMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.apache.commons.io.filefilter.RegexFileFilter;

import java.util.Random;

public class ModBlocks {
    public static final Block RANDOM_BLOCK = registerBlock("random_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).luminance(state -> 15)));
    public static final Block RANDOM_ORE = registerBlock("random_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock( String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RandomMod.MOD_ID, name),block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(RandomMod.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        RandomMod.LOGGER.info("Registering Modblocks for " + RandomMod.MOD_ID);
    }
}
