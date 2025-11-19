package de.tabbeddev.create_rusty_framed;

import de.tabbeddev.create_rusty_framed.registry.CreateFramedBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateFramedMod.ID)
public class CreateFramedEvents {
    @SubscribeEvent
    public static void modifyFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();

        for (CreateFramedBlocks blocks : CreateFramedBlocks.values()) {
            // Not sure if this is a good solution, but it works
            if (blocks.cardboard_block != null && item == blocks.cardboard_block.asItem()) {
                event.setBurnTime(4000);
                return;
            }
        }
    }
}
