package net.strangeguyperson.apples_and_carrots.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    // Wooden apple
    public static final FoodProperties WOODEN_APPLE =
            new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
                    .alwaysEdible()
                    .build();

    // Stone apple
    public static final FoodProperties STONE_APPLE =
            new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
                    .alwaysEdible()
                    .build();

    // Iron apple
    public static final FoodProperties IRON_APPLE =
            new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0), 1.0F)
                    .alwaysEdible()
                    .build();

    // Diamond apple
    public static final FoodProperties DIAMOND_APPLE =
            new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
                    .alwaysEdible()
                    .build();

    // Netherite apple
    public static final FoodProperties NETHERITE_APPLE =
            new FoodProperties.Builder().nutrition(8).saturationModifier(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 6000, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 3), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 6000, 0), 1.0F)
                    .alwaysEdible()
                    .build();

    // Enchanted wooden apple
    public static final FoodProperties ENCHANTED_WOODEN_APPLE =
            new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
                    .alwaysEdible()
                    .build();

    // Enchanted stone apple
    public static final FoodProperties ENCHANTED_STONE_APPLE =
            new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 20, 0), 1.0F)
                    .alwaysEdible()
                    .build();

    // Enchanted iron apple
    public static final FoodProperties ENCHANTED_IRON_APPLE =
            new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1), 1.0F)
                    .alwaysEdible()
                    .build();

    // Enchanted diamond apple
    public static final FoodProperties ENCHANTED_DIAMOND_APPLE =
            new FoodProperties.Builder().nutrition(8).saturationModifier(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F)
                    .alwaysEdible()
                    .build();

    // Enchanted netherite apple
    public static final FoodProperties ENCHANTED_NETHERITE_APPLE =
            new FoodProperties.Builder().nutrition(10).saturationModifier(1.4F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 12000, 4), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 24000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 24000, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 12000, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 3), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12000, 4), 1.0F)
                    .alwaysEdible()
                    .build();

    // Wooden carrot
    public static final FoodProperties WOODEN_CARROT =
            new FoodProperties.Builder().nutrition(2).saturationModifier(0.6F)
                    .build();

    // Stone carrot
    public static final FoodProperties STONE_CARROT =
            new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
                    .build();

    // Iron carrot
    public static final FoodProperties IRON_CARROT =
            new FoodProperties.Builder().nutrition(4).saturationModifier(1.0F)
                    .build();

    // Diamond carrot
    public static final FoodProperties DIAMOND_CARROT =
            new FoodProperties.Builder().nutrition(10).saturationModifier(1.2F)
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 600, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 1200, 0), 1.0F)
                    .build();

    // Netherite carrot
    public static final FoodProperties NETHERITE_CARROT =
            new FoodProperties.Builder().nutrition(14).saturationModifier(1.4F)
                    .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 36000, 2), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 36000, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 36000, 0), 1.0F)
                    .build();

    // God apple
    public static final FoodProperties GOD_APPLE =
            new FoodProperties.Builder().nutrition(20).saturationModifier(2.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360000, 9), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 360000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 360000, 3), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.LUCK, 360000, 4), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 360000, 0), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 360000, 1), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 360000, 4), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 360000, 4), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 360000, 9), 1.0F)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 360000, 14), 1.0F)
                    .alwaysEdible()
                    .build();
}