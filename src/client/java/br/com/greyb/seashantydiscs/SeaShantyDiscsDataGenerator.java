package br.com.greyb.seashantydiscs;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SeaShantyDiscsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(SeaShantyDiscsModelProvider::new);
        pack.addProvider(SeaShantyDiscsEnglishLangProvider::new);
        pack.addProvider(SeaShantyDiscsPirateLangProvider::new);
        pack.addProvider(SeaShantyDiscsPortugueseBRLangProvider::new);
        pack.addProvider(SeaShantyDiscsPortuguesePTLangProvider::new);
    }
}
