package br.com.greyb.seashantydiscs;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SeaShantyDiscsPortuguesePTLangProvider extends FabricLanguageProvider {
    public SeaShantyDiscsPortuguesePTLangProvider(
            FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> wrapperLookup) {
        super(output, "pt_pt", wrapperLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        String discName = "Disco de Música";

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


        translationBuilder.add("sound.sea-shanty-discs.music_disc.roll_the_old_chariot_along", "The Longest Johns - A Drop of Nelson's Blood");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.roll_the_old_chariot_along", "The Longest Johns - A Drop of Nelson's Blood");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.barretts_privateers", "Stan Rogers - Barrett's Privateers");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.barretts_privateers", "Stan Rogers - Barrett's Privateers");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.bones_in_the_ocean", "The Longest Johns - Bones in the Ocean");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.bones_in_the_ocean", "The Longest Johns - Bones in the Ocean");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.captain_kidd", "Great Big Sea - Captain Kidd");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.captain_kidd", "Great Big Sea - Captain Kidd");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.drunken_sailor", "The Irish Rovers - Drunken Sailor");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.drunken_sailor", "The Irish Rovers - Drunken Sailor");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.fish_in_the_sea", "Michiel Schrey, Seán Dagher, Nils Brown - Fish In The Sea");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.fish_in_the_sea", "Michiel Schrey, Seán Dagher, Nils Brown - Fish In The Sea");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.heres_a_health_to_the_company", "Colm R. McGuinness - Here's a Health to the Company");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.heres_a_health_to_the_company", "Colm R. McGuinness - Here's a Health to the Company");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.leave_her_johnny", "Michiel Schrey, Seán Dagher, Nils Brown - Leave Her Johnny");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.leave_her_johnny", "Michiel Schrey, Seán Dagher, Nils Brown - Leave Her Johnny");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.randy_dandy_o", "The Longest Johns - Randy Dandy-O");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.randy_dandy_o", "The Longest Johns - Randy Dandy-O");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.retirement_song", "The Longest Johns - Retirement Song");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.retirement_song", "The Longest Johns - Retirement Song");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.old_maui", "Stan Rogers - Rolling Down to Old Maui");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.old_maui", "Stan Rogers - Rolling Down to Old Maui");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.rye_whiskey", "The Pirates Charles - Rye Whiskey");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.rye_whiskey", "The Pirates Charles - Rye Whiskey");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.santiana", "The Longest Johns - Santiana");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.santiana", "The Longest Johns - Santiana");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.spanish_ladies", "Jerry Bryant and Starboard Mess - Spanish Ladies");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.spanish_ladies", "Jerry Bryant and Starboard Mess - Spanish Ladies");

        translationBuilder.add("sound.sea-shanty-discs.music_disc.wellerman", "Nathan Evans - Wellerman");
        translationBuilder.add("jukebox_song.sea-shanty-discs.music_disc.wellerman", "Nathan Evans - Wellerman");
    }
}
