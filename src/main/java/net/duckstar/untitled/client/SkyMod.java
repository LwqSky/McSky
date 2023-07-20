package net.duckstar.untitled.client;

import net.fabricmc.api.ModInitializer;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkyMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("sky-mod");
    @Override
    public void onInitialize() {
        LOGGER.info("HELLO WORLD");
    }
}
