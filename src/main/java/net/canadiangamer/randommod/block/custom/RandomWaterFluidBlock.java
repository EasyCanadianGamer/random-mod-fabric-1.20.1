package net.canadiangamer.randommod.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class RandomWaterFluidBlock extends FluidBlock {
    // Funny + scary status effect pool - this is the mod's whole "random" identity, tune freely.
    private static final List<RegistryEntry<StatusEffect>> EFFECT_POOL = List.of(
            StatusEffects.NAUSEA,
            StatusEffects.BLINDNESS,
            StatusEffects.LEVITATION,
            StatusEffects.WEAKNESS,
            StatusEffects.POISON,
            StatusEffects.HUNGER,
            StatusEffects.SLOWNESS,
            StatusEffects.GLOWING,
            StatusEffects.WITHER
    );

    // Vanilla "spooky" sound effects to play alongside the potion effect.
    private static final List<SoundEvent> SOUND_POOL = List.of(
            SoundEvents.ENTITY_ENDERMAN_SCREAM,
            SoundEvents.ENTITY_GHAST_SCREAM,
            SoundEvents.ENTITY_ELDER_GUARDIAN_CURSE,
            SoundEvents.ENTITY_HUSK_AMBIENT,
            SoundEvents.ENTITY_PHANTOM_AMBIENT,
            SoundEvents.ENTITY_WARDEN_AMBIENT,
            SoundEvents.ENTITY_WITHER_SPAWN
    );

    public RandomWaterFluidBlock(FlowableFluid fluid, AbstractBlock.Settings settings) {
        super(fluid, settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);
        if (!world.isClient) {
            applyRandomGimmick(world, entity);
        }
    }

    private void applyRandomGimmick(World world, Entity entity) {
        if (!(entity instanceof LivingEntity living) || world.getRandom().nextInt(20) != 0) {
            return;
        }

        RegistryEntry<StatusEffect> effect = EFFECT_POOL.get(world.getRandom().nextInt(EFFECT_POOL.size()));
        living.addStatusEffect(new StatusEffectInstance(effect, 200, 0));

        SoundEvent sound = SOUND_POOL.get(world.getRandom().nextInt(SOUND_POOL.size()));
        world.playSoundFromEntity(entity, sound, SoundCategory.HOSTILE, 1.0f, 1.0f);
    }
}
