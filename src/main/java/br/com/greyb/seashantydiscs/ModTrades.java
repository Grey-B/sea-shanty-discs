package br.com.greyb.seashantydiscs;

import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTrades {
    public static void initialize() {
        SeaShantyDiscs.LOGGER.info("Registering " + SeaShantyDiscs.MOD_ID + " fisherman offers");

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 4, factories ->
                factories.addAll(ImmutableList.of(
                        new TradeOffers.ProcessItemFactory(Blocks.OAK_SAPLING, 1, 8,
                                ModItems.MUSIC_DISC_RETIREMENT_SONG, 1, 10, 10, 0.2F),
                        new TradeOffers.ProcessItemFactory(Items.COD_BUCKET, 1, 8,
                                ModItems.MUSIC_DISC_WELLERMAN, 1, 10, 10, 0.2F)
                ))
        );
    }
}
