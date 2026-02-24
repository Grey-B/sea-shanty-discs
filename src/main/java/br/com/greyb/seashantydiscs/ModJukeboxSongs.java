package br.com.greyb.seashantydiscs;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs{
    RegistryKey<JukeboxSong> BARRETTS_PRIVATEERS = of("barretts_privateers");
    RegistryKey<JukeboxSong> BONES_IN_THE_OCEAN = of("bones_in_the_ocean");
    RegistryKey<JukeboxSong> CAPTAIN_KIDD = of("captain_kidd");
    RegistryKey<JukeboxSong> DRUNKEN_SAILOR = of("drunken_sailor");
    RegistryKey<JukeboxSong> FISH_IN_THE_SEA = of("fish_in_the_sea");
    RegistryKey<JukeboxSong> HERES_A_HEALTH = of("heres_a_health_to_the_company");
    RegistryKey<JukeboxSong> LEAVE_HER_JOHNNY = of("leave_her_johnny");
    RegistryKey<JukeboxSong> OLD_MAUI = of("old_maui");
    RegistryKey<JukeboxSong> RANDY_DANDY_O = of("randy_dandy_o");
    RegistryKey<JukeboxSong> RETIREMENT_SONG = of("retirement_song");
    RegistryKey<JukeboxSong> ROLL_THE_OLD_CHARIOT_ALONG = of("roll_the_old_chariot_along");
    RegistryKey<JukeboxSong> RYE_WHISKEY = of("rye_whiskey");
    RegistryKey<JukeboxSong> SANTIANA = of("santiana");
    RegistryKey<JukeboxSong> SPANISH_LADIES = of("spanish_ladies");
    RegistryKey<JukeboxSong> WELLERMAN = of("welleman");

    private static RegistryKey<JukeboxSong> of(String id){
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SeaShantyDiscs.MOD_ID, id));
    }

    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int length, int comparatorOutput){
        registry.register(key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), length, comparatorOutput));
    }

    static void bootstrap(Registerable<JukeboxSong> registry){
        register(registry, WELLERMAN, ModMusic.MUSIC_DISC_WELLERMAN, 156, 12);
    }
}
