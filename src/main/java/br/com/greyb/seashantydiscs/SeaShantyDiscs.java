package br.com.greyb.seashantydiscs;

import net.fabricmc.api.ModInitializer;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiConsumer;

public class SeaShantyDiscs implements ModInitializer {
    public static final String MOD_ID = "sea-shanty-discs";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public void LootTableBiConsumer(BiConsumer<RegistryKey<LootTable>, LootTable.Builder> consumer) {
        consumer.accept(
                LootTables.FISHING_TREASURE_GAMEPLAY,
                LootTable.builder().pool(LootPool.builder()
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_DRUNKEN_SAILOR))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_FISH_IN_THE_SEA)))
        );
    }

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModMusic.initialize();
    }
}