package net.strangeguyperson.apples_and_carrots.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IItemExtension;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.strangeguyperson.apples_and_carrots.ApplesAndCarrots;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ApplesAndCarrots.MOD_ID);

    // Custom food classes
    private static class UnenchantedAppleItem extends Item implements IItemExtension {
        private final int useDuration;

        public UnenchantedAppleItem(Properties properties, int useDuration) {
            super(properties);
            this.useDuration = useDuration;
        }

        @Override
        public int getUseDuration(@NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
            return useDuration;
        }

        // This code is broken and I have no idea how to fix it
        /*public int getEnchantmentValue() {
            return 35;
        }*/

        /*@Override
        public boolean isEnchantable(@NotNull ItemStack stack) {
            return true;
        }*/

        /*@Override
        public @NotNull ItemStack applyEnchantments(ItemStack stack, List<EnchantmentInstance> enchantments) {
            if (stack.is(ModItems.WOODEN_APPLE)) {
                stack = stack.transmuteCopy(ModItems.ENCHANTED_WOODEN_APPLE);
                //stack = ModItems.ENCHANTED_WOODEN_APPLE.toStack();
            }
            if (stack.is(ModItems.STONE_APPLE)) {
                stack = stack.transmuteCopy(ModItems.ENCHANTED_STONE_APPLE);
                //stack = ModItems.ENCHANTED_STONE_APPLE.toStack();
            }
            if (stack.is(ModItems.IRON_APPLE)) {
                stack = stack.transmuteCopy(ModItems.ENCHANTED_IRON_APPLE);
                //stack = ModItems.ENCHANTED_IRON_APPLE.toStack();
            }
            if (stack.is(ModItems.DIAMOND_APPLE)) {
                stack = stack.transmuteCopy(ModItems.ENCHANTED_DIAMOND_APPLE);
                //stack = ModItems.ENCHANTED_DIAMOND_APPLE.toStack();
            }
            if (stack.is(ModItems.NETHERITE_APPLE)) {
                stack = stack.transmuteCopy(ModItems.ENCHANTED_NETHERITE_APPLE);
                //stack = ModItems.ENCHANTED_NETHERITE_APPLE.toStack();
            }
            return stack;
        }*/
    }
    private static class EnchantedAppleItem extends Item {
        private final int useDuration;

        public EnchantedAppleItem(Properties properties, int useDuration) {
            super(properties);
            this.useDuration = useDuration;
        }

        @Override
        public int getUseDuration(@NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
            return useDuration;
        }
    }
    private static class GodAppleItem extends Item {
        public GodAppleItem(Properties properties) {
            super(properties);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.apples_and_carrots.god_apple_item.lore"));
        }
    }
    private static class CarrotItem extends Item {
        private final int useDuration;

        public CarrotItem(Properties properties, int useDuration) {
            super(properties);
            this.useDuration = useDuration;
        }

        @Override
        public int getUseDuration(@NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
            return useDuration;
        }
    }

    // Wooden apple
    public static final DeferredItem<Item> WOODEN_APPLE =
            ITEMS.registerItem("wooden_apple",
                    properties -> new UnenchantedAppleItem(properties.rarity(Rarity.COMMON).food(ModFoodProperties.WOODEN_APPLE), 24));

    // Stone apple
    public static final DeferredItem<Item> STONE_APPLE =
            ITEMS.registerItem("stone_apple",
                    properties -> new UnenchantedAppleItem(properties.rarity(Rarity.COMMON).food(ModFoodProperties.STONE_APPLE), 48));

    // Iron apple
    public static final DeferredItem<Item> IRON_APPLE =
            ITEMS.registerItem("iron_apple",
                    properties -> new UnenchantedAppleItem(properties.rarity(Rarity.COMMON).food(ModFoodProperties.IRON_APPLE), 36));

    // Diamond apple
    public static final DeferredItem<Item> DIAMOND_APPLE =
            ITEMS.registerItem("diamond_apple",
                    properties -> new UnenchantedAppleItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.DIAMOND_APPLE), 36));

    // Netherite apple
    public static final DeferredItem<Item> NETHERITE_APPLE =
            ITEMS.registerItem("netherite_apple",
                    properties -> new UnenchantedAppleItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.NETHERITE_APPLE), 36));

    // Enchanted wooden apple
    public static final DeferredItem<Item> ENCHANTED_WOODEN_APPLE =
            ITEMS.registerItem("enchanted_wooden_apple",
                    properties -> new EnchantedAppleItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.ENCHANTED_WOODEN_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), 12));

    // Enchanted stone apple
    public static final DeferredItem<Item> ENCHANTED_STONE_APPLE =
            ITEMS.registerItem("enchanted_stone_apple",
                    properties -> new EnchantedAppleItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.ENCHANTED_STONE_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), 48));


    // Enchanted iron apple
    public static final DeferredItem<Item> ENCHANTED_IRON_APPLE =
            ITEMS.registerItem("enchanted_iron_apple",
                    properties -> new EnchantedAppleItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.ENCHANTED_IRON_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), 36));

    // Enchanted diamond apple
    public static final DeferredItem<Item> ENCHANTED_DIAMOND_APPLE =
            ITEMS.registerItem("enchanted_diamond_apple",
                    properties -> new EnchantedAppleItem(properties.rarity(Rarity.EPIC).food(ModFoodProperties.ENCHANTED_DIAMOND_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), 36));

    // Enchanted netherite apple
    public static final DeferredItem<Item> ENCHANTED_NETHERITE_APPLE =
            ITEMS.registerItem("enchanted_netherite_apple",
                    properties -> new EnchantedAppleItem(properties.rarity(Rarity.EPIC).fireResistant().food(ModFoodProperties.ENCHANTED_NETHERITE_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true), 36));

    // Wooden carrot
    public static final DeferredItem<Item> WOODEN_CARROT =
            ITEMS.registerItem("wooden_carrot",
                    properties -> new CarrotItem(properties.rarity(Rarity.COMMON).food(ModFoodProperties.WOODEN_CARROT), 24));

    // Stone carrot
    public static final DeferredItem<Item> STONE_CARROT =
            ITEMS.registerItem("stone_carrot",
                    properties -> new CarrotItem(properties.rarity(Rarity.COMMON).food(ModFoodProperties.STONE_CARROT), 48));

    // Iron carrot
    public static final DeferredItem<Item> IRON_CARROT =
            ITEMS.registerItem("iron_carrot",
                    properties -> new CarrotItem(properties.rarity(Rarity.COMMON).food(ModFoodProperties.IRON_CARROT), 36));

    // Diamond carrot
    public static final DeferredItem<Item> DIAMOND_CARROT =
            ITEMS.registerItem("diamond_carrot",
                    properties -> new CarrotItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.DIAMOND_CARROT), 36));

    // Netherite carrot
    public static final DeferredItem<Item> NETHERITE_CARROT =
            ITEMS.registerItem("netherite_carrot",
                    properties -> new CarrotItem(properties.rarity(Rarity.RARE).food(ModFoodProperties.NETHERITE_CARROT), 36));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // God apple
    public static final DeferredItem<Item> GOD_APPLE =
            ITEMS.registerItem("god_apple",
                    properties -> new GodAppleItem(properties.rarity(Rarity.EPIC).fireResistant().food(ModFoodProperties.GOD_APPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
}