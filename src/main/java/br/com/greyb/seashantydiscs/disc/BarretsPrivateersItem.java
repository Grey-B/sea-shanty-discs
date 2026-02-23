package br.com.greyb.seashantydiscs.disc;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class BarretsPrivateersItem extends Item {
    public BarretsPrivateersItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(
            ItemStack stack, Item.TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type
    ) {
        textConsumer.accept(Text.translatable(
                this.getTranslationKey() + ".desc").formatted(Formatting.GRAY));
    }
}
