package br.com.greyb.seashantydiscs;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModMusic {
    private ModMusic(){}

    public static final SoundEvent MUSIC_DISC_WELLERMAN = register("music_disc_wellerman");

    public static SoundEvent register(String id){
        Identifier identifier = Identifier.of(SeaShantyDiscs.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void initialize(){
        SeaShantyDiscs.LOGGER.info("Registering " + SeaShantyDiscs.MOD_ID + " sounds");}
}
