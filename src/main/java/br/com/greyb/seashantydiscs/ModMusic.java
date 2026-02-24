package br.com.greyb.seashantydiscs;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModMusic {
    private ModMusic() {
    }

    public static final SoundEvent MUSIC_DISC_BARRETTS_PRIVATEERS = registerSoundEvent("music_disc.barretts_privateers");
    public static final RegistryKey<JukeboxSong> BARRETTS_KEY = registerJukeboxSong("music_disc.barretts_privateers");
    public static final SoundEvent MUSIC_DISC_BONES_IN_THE_OCEAN = registerSoundEvent("music_disc.bones_in_the_ocean");
    public static final RegistryKey<JukeboxSong> BONES_KEY = registerJukeboxSong("music_disc.bones_in_the_ocean");
    public static final SoundEvent MUSIC_DISC_CAPTAIN_KIDD = registerSoundEvent("music_disc.captain_kidd");
    public static final RegistryKey<JukeboxSong> KIDD_KEY = registerJukeboxSong("music_disc.captain_kidd");
    public static final SoundEvent MUSIC_DISC_DRUNKEN_SAILOR = registerSoundEvent("music_disc.drunken_sailor");
    public static final RegistryKey<JukeboxSong> DRUNKEN_SAILOR_KEY = registerJukeboxSong("music_disc.drunken_sailor");
    public static final SoundEvent MUSIC_DISC_FISH_IN_THE_SEA = registerSoundEvent("music_disc.fish_in_the_sea");
    public static final RegistryKey<JukeboxSong> FISH_KEY = registerJukeboxSong("music_disc.fish_in_the_sea");
    public static final SoundEvent MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY = registerSoundEvent("music_disc.heres_a_health_to_the_company");
    public static final RegistryKey<JukeboxSong> HERES_A_HEALTH_KEY = registerJukeboxSong("music_disc.heres_a_health_to_the_company");
    public static final SoundEvent MUSIC_DISC_LEAVE_HER_JOHNNY = registerSoundEvent("music_disc.leave_her_johnny");
    public static final RegistryKey<JukeboxSong> JOHNNY_KEY = registerJukeboxSong("music_disc.leave_her_johnny");
    public static final SoundEvent MUSIC_DISC_OLD_MAUI = registerSoundEvent("music_disc.old_maui");
    public static final RegistryKey<JukeboxSong> OLD_MAUI_KEY = registerJukeboxSong("music_disc.old_maui");
    public static final SoundEvent MUSIC_DISC_RANDY_DANDY_O = registerSoundEvent("music_disc.randy_dandy_o");
    public static final RegistryKey<JukeboxSong> RANDY_DANDY_O_KEY = registerJukeboxSong("music_disc.randy_dandy_o");
    public static final SoundEvent MUSIC_DISC_RETIREMENT_SONG = registerSoundEvent("music_disc.retirement_song");
    public static final RegistryKey<JukeboxSong> RETIREMENT_KEY = registerJukeboxSong("music_disc.retirement_song");
    public static final SoundEvent MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG = registerSoundEvent("music_disc.roll_the_old_chariot_along");
    public static final RegistryKey<JukeboxSong> CHARIOT_KEY = registerJukeboxSong("music_disc.roll_the_old_chariot_along");
    public static final SoundEvent MUSIC_DISC_RYE_WHISKEY = registerSoundEvent("music_disc.rye_whiskey");
    public static final RegistryKey<JukeboxSong> RYE_WHISKEY_KEY = registerJukeboxSong("music_disc.rye_whiskey");
    public static final SoundEvent MUSIC_DISC_SANTIANA = registerSoundEvent("music_disc.santiana");
    public static final RegistryKey<JukeboxSong> SANTIANA_KEY = registerJukeboxSong("music_disc.santiana");
    public static final SoundEvent MUSIC_DISC_SPANISH_LADIES = registerSoundEvent("music_disc.spanish_ladies");
    public static final RegistryKey<JukeboxSong> SPANISH_KEY = registerJukeboxSong("music_disc.spanish_ladies");
    public static final SoundEvent MUSIC_DISC_WELLERMAN = registerSoundEvent("music_disc.wellerman");
    public static final RegistryKey<JukeboxSong> WELLERMAN_KEY = registerJukeboxSong("music_disc.wellerman");

    public static SoundEvent registerSoundEvent(String id) {
        Identifier identifier = Identifier.of(SeaShantyDiscs.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static RegistryKey<JukeboxSong> registerJukeboxSong(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SeaShantyDiscs.MOD_ID, id));
    }

    public static void initialize() {
        SeaShantyDiscs.LOGGER.info("Registering " + SeaShantyDiscs.MOD_ID + " sounds");
    }
}
