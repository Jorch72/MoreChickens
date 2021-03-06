package com.gendeathrow.morechickens.modHelper;

import java.util.List;

import com.setycz.chickens.ChickensRegistryItem;
import com.setycz.chickens.SpawnType;

public class BotaniaAddon extends BaseModAddon
{

	public static ChickensRegistryItem elementiumChicken = null;
	public static ChickensRegistryItem manasteelChicken = null; 
	public static ChickensRegistryItem terrasteelChicken = null;
	
	public BotaniaAddon() 
	{
		super("Botania", "Botania","textures/entity/botania/");
		this.setStartID(120);
	}

	@Override
	public List<ChickensRegistryItem> registerChickens(List<ChickensRegistryItem> allChickens) 
	{
		terrasteelChicken = addChicken(allChickens, 
				"terrasteelchicken", 
				this.nextID(), 
				"TerrasteelChicken.png", 
				this.getFirstOreDictionary("ingotTerrasteel"), 
				0x3ff123, 0xf5fcf1, 
				SpawnType.NONE);
		
		manasteelChicken = addChicken(allChickens, 
				"manasteelchicken", 
				this.nextID(), 
				"ManasteelChicken.png", 
				this.getFirstOreDictionary("ingotManasteel"), 
				0x69d7ff, 0x002c4b, 
				SpawnType.NONE);
		
		elementiumChicken = addChicken(allChickens, 
				"elementiumchicken", 
				this.nextID(), 
				"ElementiumChicken.png", 
				this.getFirstOreDictionary("nuggetElvenElementium"), 
				0xf655f3, 0xb407b7, 
				SpawnType.NONE);
		
		return allChickens;
	}

	@Override
	public void RegisterAllParents(List<ChickensRegistryItem> allChickens) 
	{
		setParents(manasteelChicken, IronChicken, GhastChicken);
		setParents(terrasteelChicken, EnderChicken, MoreChickens.pCrystalChicken);
		setParents(elementiumChicken, manasteelChicken, terrasteelChicken);
	}

}
