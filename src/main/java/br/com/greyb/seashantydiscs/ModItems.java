package br.com.greyb.seashantydiscs;

import br.com.greyb.seashantydiscs.disc.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

//TODO: Add tooltips
//TODO: Add jukebox

public class ModItems {
    public static final Item MUSIC_DISC_BARRETTS_PRIVATEERS = register(
            "music_disc_barretts_privateers", BarretsPrivateersItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_BONES_IN_THE_OCEAN = register(
            "music_disc_bones_in_the_ocean", BonesInTheOceanItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_CAPTAIN_KIDD = register(
            "music_disc_captain_kidd", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.RARE)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_DRUNKEN_SAILOR = register(
            "music_disc_drunken_sailor", DrunkenSailorItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_FISH_IN_THE_SEA = register(
            "music_disc_fish_in_the_sea", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY = register(
            "music_disc_heres_a_health_to_the_company", HeresAHealthItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
                    .jukeboxPlayable(JukeboxSongs.CAT)
    );
    public static final Item MUSIC_DISC_LEAVE_HER_JOHNNY = register(
            "music_disc_leave_her_johnny", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_OLD_MAUI = register(
            "music_disc_old_maui", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_RANDY_DANDY_O = register(
            "music_disc_randy_dandy_o", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_RETIREMENT_SONG = register(
            "music_disc_retirement_song", RetirementItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG = register(
            "music_disc_roll_the_old_chariot_along", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_RYE_WHISKEY = register(
            "music_disc_rye_whiskey", RyeWhiskeyItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_SANTIANA = register(
            "music_disc_santiana", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.RARE)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_SPANISH_LADIES = register(
            "music_disc_spanish_ladies", Item::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );
    public static final Item MUSIC_DISC_WELLERMAN = register(
            "music_disc_wellerman", WellermanItem::new, new Item.Settings()
                    .maxCount(1).rarity(Rarity.UNCOMMON)
//                    .jukeboxPlayable()
    );

    public static <GenericItem extends Item> GenericItem register(
            String name, Function<Item.Settings, GenericItem> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SeaShantyDiscs.MOD_ID, name));

        GenericItem item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
        SeaShantyDiscs.LOGGER.info("Registering " + SeaShantyDiscs.MOD_ID + " items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register(fabricItemGroupEntries -> {
                    fabricItemGroupEntries.add(MUSIC_DISC_BARRETTS_PRIVATEERS);
                    fabricItemGroupEntries.add(MUSIC_DISC_BONES_IN_THE_OCEAN);
                    fabricItemGroupEntries.add(MUSIC_DISC_CAPTAIN_KIDD);
                    fabricItemGroupEntries.add(MUSIC_DISC_DRUNKEN_SAILOR);
                    fabricItemGroupEntries.add(MUSIC_DISC_FISH_IN_THE_SEA);
                    fabricItemGroupEntries.add(MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY);
                    fabricItemGroupEntries.add(MUSIC_DISC_LEAVE_HER_JOHNNY);
                    fabricItemGroupEntries.add(MUSIC_DISC_OLD_MAUI);
                    fabricItemGroupEntries.add(MUSIC_DISC_RANDY_DANDY_O);
                    fabricItemGroupEntries.add(MUSIC_DISC_RETIREMENT_SONG);
                    fabricItemGroupEntries.add(MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG);
                    fabricItemGroupEntries.add(MUSIC_DISC_RYE_WHISKEY);
                    fabricItemGroupEntries.add(MUSIC_DISC_SANTIANA);
                    fabricItemGroupEntries.add(MUSIC_DISC_SPANISH_LADIES);
                    fabricItemGroupEntries.add(MUSIC_DISC_WELLERMAN);
                });
    }
}
