package net.canadiangamer.randommod.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.canadiangamer.randommod.item.ModItems;
import net.canadiangamer.randommod.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;
public class ModItemTagProvider  extends FabricTagProvider.ItemTagProvider  {


    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RANDOMITE_INGOT)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RANDOMITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RANDOMITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RANDOMITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RANDOMITE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RANDOMITE_HOE);
    }
}
