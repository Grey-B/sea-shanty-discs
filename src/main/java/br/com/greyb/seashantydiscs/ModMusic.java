package br.com.greyb.seashantydiscs;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.*;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModMusic {
    private ModMusic() {
    }

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
