package net.canadiangamer.randommod.block;

import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RANDOMITE_BLOCK = registerBlock("randomite_block",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.METAL).luminance(state -> 15).requiresTool()));

    public static final Block RANDOMITE_ORE = registerBlock("randomite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block COCAINE_ROCK = registerBlock("cocaine_rock",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).noCollision().breakInstantly().nonOpaque()));

    public static final Block DEEPSLATE_RANDOMITE_ORE = registerBlock("deepslate_randomite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6 ),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));
    public static final Block RANDOMWOOD_PLANKS = registerBlock("randomwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.WOOD).burnable().hardness(1f)));
    public static final Block RANDOMWOOD_LEAVES = registerBlock("randomwood_leaves",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).requiresTool()));

    public static final Block RANDOMWOOD_LOG = registerBlock("randomwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()));
    public static final Block RANDOMWOOD_SAPLING = registerBlock("randomwood_sapling",
            new SaplingBlock(ModSaplingGenerators.RANDOMWOOD,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(RandomMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(RandomMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        RandomMod.LOGGER.info("Registering Mod Blocks for " + RandomMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        entries.add(RANDOMITE_BLOCK);
        });
    }
}
