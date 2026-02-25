package br.com.greyb.seashantydiscs;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTables {
    public static void initialize() {
        SeaShantyDiscs.LOGGER.info("Registering " + SeaShantyDiscs.MOD_ID + " loot tables");

        LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && LootTables.FISHING_TREASURE_GAMEPLAY.equals(key)) {
                tableBuilder.modifyPools((LootPool.Builder poolBuilder) -> poolBuilder
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_DRUNKEN_SAILOR))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_FISH_IN_THE_SEA)));
            }

            if (source.isBuiltin() && (
                    LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key) || LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key))) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_OLD_MAUI))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_SPANISH_LADIES));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.BURIED_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_CAPTAIN_KIDD))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_RANDY_DANDY_O))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_SANTIANA));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.SHIPWRECK_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_BARRETTS_PRIVATEERS))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_BONES_IN_THE_OCEAN))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_LEAVE_HER_JOHNNY))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_RYE_WHISKEY));
                tableBuilder.pool(poolBuilder);
            }
        }));
    }
}
