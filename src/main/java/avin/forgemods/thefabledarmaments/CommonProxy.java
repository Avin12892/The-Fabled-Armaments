package avin.forgemods.thefabledarmaments;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;


public abstract class CommonProxy {
	
	// Event handler
	public static MyEventHandler eventHandler;
	
	// Items
	// Weapons
	public static TheObsidianReaver theObsidianReaver;
	public static final String reaverName = "theobsidianreavermodel";
	
	public static TruthSword swordOfTruths;
	public static final String truthSwordName = "truthswordmodel";
	
	public static Thunderfury thunderfury;
	public static final String thunderfuryName = "thunderfurymodel";
	
	public static Warglaive warglaive;
	public static final String warglaiveName = "warglaivemodel";
	
	public static Bane bane;
	public static final String baneName = "banemodel";
	
	public static Witherer witherer;
	public static String withererName = "witherermodel";
	
	// Blocks
	public static BlockTest blockTest;
	
	
	public void preInit() {
		
		
		// Event handler
		
		eventHandler = new MyEventHandler();
		MinecraftForge.EVENT_BUS.register(eventHandler);
		
		// Item registry and instantiation
		
		theObsidianReaver = (TheObsidianReaver) new TheObsidianReaver().setUnlocalizedName(reaverName);
		GameRegistry.registerItem(theObsidianReaver, reaverName);
		LanguageRegistry.addName(theObsidianReaver, "The Obsidian Reaver");
		
		swordOfTruths = (TruthSword) new TruthSword().setUnlocalizedName(truthSwordName);
		GameRegistry.registerItem(swordOfTruths, truthSwordName);
		LanguageRegistry.addName(swordOfTruths, "Sword of A Thousand Truths");
		
		thunderfury = (Thunderfury) new Thunderfury().setUnlocalizedName(thunderfuryName);
		GameRegistry.registerItem(thunderfury, thunderfuryName);
		LanguageRegistry.addName(thunderfury, "Thunderfury, Blessed Blade of the Windseeker");
		
		warglaive = (Warglaive) new Warglaive().setUnlocalizedName(warglaiveName);
		GameRegistry.registerItem(warglaive, warglaiveName);
		LanguageRegistry.addName(warglaive, "Warglaive of Azzinoth");
		
		bane = (Bane) new Bane().setUnlocalizedName(baneName);
		GameRegistry.registerItem(bane, baneName);
		LanguageRegistry.addName(bane, "Dragon's Bane");
		
		witherer = (Witherer) new Witherer().setUnlocalizedName(withererName);
		GameRegistry.registerItem(witherer, withererName);
		LanguageRegistry.addName(witherer, "The Witherer");
		
		// Block registry and instantiation
		
		blockTest = (BlockTest) new BlockTest().setUnlocalizedName(BlockTest.getName());
		GameRegistry.registerBlock(blockTest, BlockTest.getName());
		LanguageRegistry.addName(blockTest, "Nonsense Cube");
		
		
	}
	
	public void init() {
		
		
		
	}
	
	public void postInit() {
		
		
		
	}
	
}
