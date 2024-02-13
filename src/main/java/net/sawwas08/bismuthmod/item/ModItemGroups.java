package net.sawwas08.bismuthmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sawwas08.bismuthmod.BismuthMod;
import net.sawwas08.bismuthmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BISMUTH_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BismuthMod.MOD_ID, "bismuth"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bismuth"))
                    .icon(() -> new ItemStack(ModItems.BISMUTH)).entries((displayContext, entries) -> {
                        //add items to group here

                        entries.add(ModItems.BISMUTH);
                        entries.add(ModItems.RAW_BISMUTH);

                        entries.add(ModBlocks.BISMUTH_BLOCK);
                        entries.add(ModBlocks.RAW_BISMUTH_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        BismuthMod.LOGGER.info("Registering item groups for " + BismuthMod.MOD_ID);
    }
}
