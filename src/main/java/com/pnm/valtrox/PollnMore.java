package com.pnm.valtrox;

import com.pnm.valtrox.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PollnMore implements ModInitializer
{
	public static final String MOD_ID = "poll_n_more";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
	}
}