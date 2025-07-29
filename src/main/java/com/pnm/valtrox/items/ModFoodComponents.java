package com.pnm.valtrox.items;


import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent NEW_MILK = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f).alwaysEdible().build();
    public static final FoodComponent RAW_TORTILLA = new FoodComponent.Builder().nutrition(1).saturationModifier(0f).build();
    public static final FoodComponent COOKED_TORTILLA = new FoodComponent.Builder().nutrition(4).saturationModifier(1.25f).build();


}
