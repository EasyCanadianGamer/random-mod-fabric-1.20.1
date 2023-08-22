package net.canadiangamer.randommod.item;




import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RANDOM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RandomMod.MOD_ID, "random_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.random_ingot"))
                    .icon(() -> new ItemStack(ModItems.RANDOMITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RANDOMITE_INGOT);

                        entries.add(ModItems.RANDOM_MEAT_COOKED);
                        entries.add(ModItems.RANDOM_MEAT_RAW);

                        entries.add(ModItems.RANDOMITE_SWORD);
                        entries.add(ModItems.RANDOMITE_AXE);
                        entries.add(ModItems.RANDOMITE_PICKAXE);
                        entries.add(ModItems.RANDOMITE_HOE);
                        entries.add(ModItems.RANDOMITE_SHOVEL);

                        entries.add(ModBlocks.RANDOMITE_BLOCK);
                        entries.add(ModBlocks.RANDOMITE_ORE);
                        entries.add(ModBlocks.RANDOM_PLANKS);
                        entries.add(ModBlocks.RANDOM_LOG);
                        entries.add(ModBlocks.RANDOM_LEAVES);
                        entries.add(ModBlocks.RANDOM_SAPLING);
                        entries.add(ModBlocks.DEEPSLATE_RANDOMITE_ORE);


                    }).build());


    public static void registerItemGroups() {
        RandomMod.LOGGER.info("Registering Item Groups for " + RandomMod.MOD_ID);
    }
}
