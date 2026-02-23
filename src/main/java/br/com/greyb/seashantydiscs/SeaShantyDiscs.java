package br.com.greyb.seashantydiscs;

import br.com.greyb.seashantydiscs.disc.BarretsPrivateersItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeaShantyDiscs implements ModInitializer {
    public static final String MOD_ID = "sea-shanty-discs";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
    }
}