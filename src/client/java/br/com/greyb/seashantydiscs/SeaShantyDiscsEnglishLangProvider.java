package br.com.greyb.seashantydiscs;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SeaShantyDiscsEnglishLangProvider extends FabricLanguageProvider {
    public SeaShantyDiscsEnglishLangProvider(
            FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> wrapperLookup) {
        super(output, "en_us", wrapperLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
            String discName = "Music Disc";

        translationBuilder.add(ModItems.MUSIC_DISC_BARRETTS_PRIVATEERS.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_BONES_IN_THE_OCEAN.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_CAPTAIN_KIDD.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_DRUNKEN_SAILOR.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_FISH_IN_THE_SEA.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_LEAVE_HER_JOHNNY.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_OLD_MAUI.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_RANDY_DANDY_O.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_RETIREMENT_SONG.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_RYE_WHISKEY.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_SANTIANA.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_SPANISH_LADIES.getTranslationKey(), discName);
        translationBuilder.add(ModItems.MUSIC_DISC_WELLERMAN.getTranslationKey(), discName);

        translationBuilder.add("sound.sea-shanty-discs.music_disc.wellerman", "Nathan Evans - Wellerman");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.wellerman", "Nathan Evans - Wellerman");
    }
}
