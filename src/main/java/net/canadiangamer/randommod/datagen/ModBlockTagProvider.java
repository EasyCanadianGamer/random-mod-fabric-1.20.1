package net.canadiangamer.randommod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.canadiangamer.randommod.block.ModBlocks;
import net.canadiangamer.randommod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;
public class ModBlockTagProvider   extends FabricTagProvider.BlockTagProvider{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RANDOMITE_BLOCK)
                .add(ModBlocks.RANDOMITE_ORE)
                .add(ModBlocks.DEEPSLATE_RANDOMITE_ORE);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RANDOMITE_ORE);

//        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
//        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
//        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_RANDOMITE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RANDOMITE_TOOL   )
                .addTag(BlockTags.PICKAXE_MINEABLE);
    }
}
