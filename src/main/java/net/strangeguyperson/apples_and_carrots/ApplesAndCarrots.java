package net.strangeguyperson.apples_and_carrots;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.strangeguyperson.apples_and_carrots.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(ApplesAndCarrots.MOD_ID)
public class ApplesAndCarrots {
    // Define the mod id in a common place for everything to reference
    public static final String MOD_ID = "apples_and_carrots";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Mod class constructor
    public ApplesAndCarrots(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for mod loading
        modEventBus.addListener(this::commonSetup);

        // Register items
        ModItems.register(modEventBus);

        // Register game events
        NeoForge.EVENT_BUS.register(this);

        // Register creative mode tabs
        modEventBus.addListener(this::addCreative);

        // Register the mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }

    // Creative mode tabs
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.insertAfter(
                    Items.APPLE.getDefaultInstance(),
                    ModItems.WOODEN_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.WOODEN_APPLE.get().getDefaultInstance(),
                    ModItems.STONE_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.STONE_APPLE.get().getDefaultInstance(),
                    ModItems.IRON_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.GOLDEN_APPLE.getDefaultInstance(),
                    ModItems.DIAMOND_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.DIAMOND_APPLE.get().getDefaultInstance(),
                    ModItems.NETHERITE_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.NETHERITE_APPLE.get().getDefaultInstance(),
                    ModItems.ENCHANTED_WOODEN_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.ENCHANTED_WOODEN_APPLE.get().getDefaultInstance(),
                    ModItems.ENCHANTED_STONE_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.ENCHANTED_STONE_APPLE.get().getDefaultInstance(),
                    ModItems.ENCHANTED_IRON_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.ENCHANTED_GOLDEN_APPLE.getDefaultInstance(),
                    ModItems.ENCHANTED_DIAMOND_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.ENCHANTED_DIAMOND_APPLE.get().getDefaultInstance(),
                    ModItems.ENCHANTED_NETHERITE_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.ENCHANTED_NETHERITE_APPLE.get().getDefaultInstance(),
                    ModItems.GOD_APPLE.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.CARROT.getDefaultInstance(),
                    ModItems.WOODEN_CARROT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.WOODEN_CARROT.get().getDefaultInstance(),
                    ModItems.STONE_CARROT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.STONE_CARROT.get().getDefaultInstance(),
                    ModItems.IRON_CARROT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    Items.GOLDEN_CARROT.getDefaultInstance(),
                    ModItems.DIAMOND_CARROT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.insertAfter(
                    ModItems.DIAMOND_CARROT.get().getDefaultInstance(),
                    ModItems.NETHERITE_CARROT.get().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}