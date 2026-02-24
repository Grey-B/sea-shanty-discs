package br.com.greyb.seashantydiscs;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModMusic {
    private ModMusic() {
    }

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_WELLERMAN = registerReference("music_disc.wellerman");

    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Identifier.of(SeaShantyDiscs.MOD_ID, id));
    }
    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void initialize() {
        SeaShantyDiscs.LOGGER.info("Registering " + SeaShantyDiscs.MOD_ID + " sounds");
    }
}
