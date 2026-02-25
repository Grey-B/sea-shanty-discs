package br.com.greyb.seashantydiscs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeaShantyDiscs implements ModInitializer {
    public static final String MOD_ID = "sea-shanty-discs";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModMusic.initialize();

        LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && LootTables.FISHING_TREASURE_GAMEPLAY.equals(key)) {
                tableBuilder.modifyPools((LootPool.Builder poolBuilder) -> poolBuilder
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_DRUNKEN_SAILOR))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_FISH_IN_THE_SEA)));
            }
        }));
    }
}