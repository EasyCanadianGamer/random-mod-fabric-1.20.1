package net.canadiangamer.randommod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RANDOM_MEAT_COOKED = new FoodComponent.Builder().alwaysEdible().hunger(5).saturationModifier(0.50f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 3), 0.40f).build();
    public static final FoodComponent RANDOM_MEAT_RAW = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(0.25f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 3), 0.35f).build();
}
