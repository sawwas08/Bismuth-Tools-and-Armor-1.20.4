package net.sawwas08.bismuthmod;

import net.fabricmc.api.ModInitializer;

import net.sawwas08.bismuthmod.block.ModBlocks;
import net.sawwas08.bismuthmod.item.ModItemGroups;
import net.sawwas08.bismuthmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BismuthMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "bismuth_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("bismuthmod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}