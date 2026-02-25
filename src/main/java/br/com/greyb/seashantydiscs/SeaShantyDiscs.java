package br.com.greyb.seashantydiscs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeaShantyDiscs implements ModInitializer {
    public static final String MOD_ID = "sea-shanty-discs";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final RegistryKey<LootTable> FISHING_TABLE_ID = LootTables.FISHING_TREASURE_GAMEPLAY;

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModMusic.initialize();

        LootTableEvents.MODIFY.register(((registryKey, builder, lootTableSource, wrapperLookup) -> {
            if (lootTableSource.isBuiltin() && FISHING_TABLE_ID.equals(registryKey)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_DRUNKEN_SAILOR))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_FISH_IN_THE_SEA));
                builder.pool(poolBuilder);
            }
        }));
    }
}