package net.estikuwus.neoforge.item;

import net.estikuwus.neoforge.TutorialMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MOD_ID);

    //Se le asigna un nombre al objeto
    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    //Crear un segundo itemm siempre el lower case y nunca separado.
    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));
    //Crea el Item
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}