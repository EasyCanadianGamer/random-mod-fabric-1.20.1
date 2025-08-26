package net.canadiangamer.randommod.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CocaineItem extends Item {
    public CocaineItem(Settings settings) {
        super(settings.food(ModFoodComponents.COCAINE)); // use your FoodComponent here
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            if (!world.isClient) {
                // Always give speed & haste (the "high")
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 30, 1));  // 30s Speed II
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 30, 0));  // 30s Haste I

                // If already on Speed (means multiple uses), add side effects
                if (player.hasStatusEffect(StatusEffects.SPEED)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 15, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20 * 30, 1));
                }

                // If used even more, escalate to dangerous effects
                if (player.hasStatusEffect(StatusEffects.NAUSEA)) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 20 * 20, 1));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 20 * 10, 0)); // 10s Wither I
                }
            }
        }
        return super.finishUsing(stack, world, user);
    }
}