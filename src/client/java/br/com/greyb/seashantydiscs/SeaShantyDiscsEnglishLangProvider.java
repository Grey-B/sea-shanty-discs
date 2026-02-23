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
        translationBuilder.add(ModItems.MUSIC_DISC_BARRETTS_PRIVATEERS.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_BONES_IN_THE_OCEAN.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_CAPTAIN_KIDD.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_DRUNKEN_SAILOR.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_FISH_IN_THE_SEA.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_LEAVE_HER_JOHNNY.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_OLD_MAUI.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_RANDY_DANDY_O.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_RETIREMENT_SONG.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_RYE_WHISKEY.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_SANTIANA.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_SPANISH_LADIES.getTranslationKey(), "Music Disc");
        translationBuilder.add(ModItems.MUSIC_DISC_WELLERMAN.getTranslationKey(), "Music Disc");

        translationBuilder.add(ModItems.MUSIC_DISC_BARRETTS_PRIVATEERS.getTranslationKey() + ".desc",
                "Stan Rogers - Barrett's Privateers");
        translationBuilder.add(ModItems.MUSIC_DISC_BONES_IN_THE_OCEAN.getTranslationKey() + ".desc",
                "The Longest Johns - Bones In The Ocean");
        translationBuilder.add(ModItems.MUSIC_DISC_DRUNKEN_SAILOR.getTranslationKey() + ".desc",
                "The Irish Roves - Drunken Sailor");
        translationBuilder.add(ModItems.MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY.getTranslationKey() + ".desc",
                "Colm R. McGuinness - Here's a Health to the Company");
        translationBuilder.add(ModItems.MUSIC_DISC_RETIREMENT_SONG.getTranslationKey() + ".desc",
                "The Longest Johns - Retirement Song");
        translationBuilder.add(ModItems.MUSIC_DISC_RYE_WHISKEY.getTranslationKey() + ".desc",
                "The Pirates Charles - Rye Whiskey");
        translationBuilder.add(ModItems.MUSIC_DISC_WELLERMAN.getTranslationKey() + ".desc",
                "Nathan Evans - Wellerman");
    }
}
