package net.canadiangamer.randommod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {

    public static final FoodComponent RANDOM_MEAT_COOKED = new FoodComponent.Builder().alwaysEdible().nutrition(5).saturationModifier(0.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 3), 0.40f).build();
    public static final FoodComponent RANDOM_MEAT_RAW = new FoodComponent.Builder().alwaysEdible().nutrition(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 3), 0.35f).build();
    public static final FoodComponent COCAINE = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(2) // doesn’t actually feed you much
            .saturationModifier(0.1f)
            .build();
}

