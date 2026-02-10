package net.BIGMONKI33.wildernessreborn.item;

import net.BIGMONKI33.wildernessreborn.WildernessReborn;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WildernessReborn.MOD_ID);

    public static final DeferredItem<Item> JUNGLEFOWLFEATHER = ITEMS.register("junglefowlfeather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BOARTUSK = ITEMS.register("boartusk",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOUFLONHORN = ITEMS.register("mouflonhorn",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AUROCHSHORN = ITEMS.register("aurochshorn",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
