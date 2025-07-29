package com.pnm.valtrox.items;

import com.pnm.valtrox.PollnMore;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ModItems
{

    public static final Item RAW_TORTILLA = registerItem(new Item.Settings().food(ModFoodComponents.RAW_TORTILLA), "raw_tortilla");
    public static final Item COOKED_TORTILLA = registerItem(new Item.Settings().food(ModFoodComponents.COOKED_TORTILLA), "cooked_tortilla");
    public static final Item NEW_MILK = registerItem(new Item.Settings().food(ModFoodComponents.NEW_MILK), "new_milk");
    private static Item registerItem(Item.Settings itemSettings, String name) {
        Identifier id = Identifier.of(PollnMore.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void registerModItems() {
        PollnMore.LOGGER.info("Registering Mod Items for " + PollnMore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(NEW_MILK);
            entries.add(RAW_TORTILLA);
            entries.add(COOKED_TORTILLA);


        });
    }


}
