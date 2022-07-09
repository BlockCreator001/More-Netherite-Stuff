package com.blocklegend001.morenetheritestuff1182;

import com.blocklegend001.morenetheritestuff1182.block.ModBlocks;
import com.blocklegend001.morenetheritestuff1182.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreNetheriteStuff1182.MOD_ID)
public class MoreNetheriteStuff1182
{
    public static final String MOD_ID = "morenetheritestuff1182";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogManager.getLogger();


    public MoreNetheriteStuff1182() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}