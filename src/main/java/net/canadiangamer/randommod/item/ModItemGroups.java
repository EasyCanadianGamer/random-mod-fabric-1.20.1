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
                    .icon(() -> new ItemStack(ModItems.RANDOM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RANDOM_INGOT);


                        entries.add(ModBlocks.RANDOM_BLOCK);
                        entries.add(ModBlocks.RANDOM_ORE);
                        entries.add(ModBlocks.RANDOM_PLANKS);
                        entries.add(ModBlocks.RANDOM_LOG);
                        entries.add(ModBlocks.RANDOM_LEAVES);


                    }).build());


    public static void registerItemGroups() {
        RandomMod.LOGGER.info("Registering Item Groups for " + RandomMod.MOD_ID);
    }
}
