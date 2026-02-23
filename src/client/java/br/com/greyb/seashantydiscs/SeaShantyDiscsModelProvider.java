package br.com.greyb.seashantydiscs;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class SeaShantyDiscsModelProvider extends FabricModelProvider {
    public SeaShantyDiscsModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_BARRETTS_PRIVATEERS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_BONES_IN_THE_OCEAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CAPTAIN_KIDD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DRUNKEN_SAILOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FISH_IN_THE_SEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HERES_A_HEALTH_TO_THE_COMPANY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_LEAVE_HER_JOHNNY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_OLD_MAUI, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RANDY_DANDY_O, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RETIREMENT_SONG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ROLL_THE_OLD_CHARIOT_ALONG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RYE_WHISKEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SANTIANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SPANISH_LADIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_WELLERMAN, Models.GENERATED);
    }

    @Override
    public String getName() {
        return "SeaShantyDiscsModelProvider";
    }
}
