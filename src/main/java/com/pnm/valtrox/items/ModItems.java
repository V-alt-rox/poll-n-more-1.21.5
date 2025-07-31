package com.pnm.valtrox.items;

import com.pnm.valtrox.PollnMore;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItems
{

    public static final Item RAW_TORTILLA = registerItem(new Item.Settings().food(ModFoodComponents.RAW_TORTILLA), "raw_tortilla");
    public static final Item COOKED_TORTILLA = registerItem(new Item.Settings().food(ModFoodComponents.COOKED_TORTILLA), "cooked_tortilla");
    public static final Item NEW_MILK = registerItem(new Item.Settings().food(ModFoodComponents.NEW_MILK), "new_milk");
    public static final Item NSO_SUB = registerItem(new Item.Settings(), "nso_sub");



    private static Item registerItem(Item.Settings itemSettings, String name) {
        Identifier id = Identifier.of(PollnMore.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }


    public static void registerModItems() {

        final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(PollnMore.MOD_ID, "item_group"));
        final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.NEW_MILK))
                .displayName(Text.translatable("itemGroup.poll_n_more.mod_items"))
                .build();


        PollnMore.LOGGER.info("Registering Mod Items for " + PollnMore.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(ModItems.NEW_MILK);
            itemGroup.add(ModItems.RAW_TORTILLA);
            itemGroup.add(ModItems.COOKED_TORTILLA);
            itemGroup.add(ModItems.NSO_SUB);
            itemGroup.add(ModBlocks.RAW_TORTILLA_BLOCK.asItem());


        });

    }


}

