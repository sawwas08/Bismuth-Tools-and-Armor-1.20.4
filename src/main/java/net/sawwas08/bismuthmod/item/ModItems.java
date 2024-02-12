package net.sawwas08.bismuthmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sawwas08.bismuthmod.BismuthMod;

public class ModItems {
    public static final Item BISMUTH = registerItem("bismuth", new Item(new FabricItemSettings()));
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BISMUTH);
        entries.add(RAW_BISMUTH);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BismuthMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BismuthMod.LOGGER.info("Registering Mod Items for " + BismuthMod.MOD_ID);

    ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }

}
