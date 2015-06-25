package avin.forgemods.thefabledarmaments;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = TheFabledArmaments.MODID, name = TheFabledArmaments.NAME, version = TheFabledArmaments.VERSION)
public class TheFabledArmaments {
	
	// Paths to proxies
	public static final String PATH_TO_CLIENTPROXY = "avin.forgemods.thefabledarmaments.ClientProxy";
	public static final String PATH_TO_SERVERPROXY = "avin.forgemods.thefabledarmaments.DedicatedServerProxy";
	
	// Mod info
	public static final String MODID = "thefabledarmaments";
	public static final String NAME = "The Fabled Armaments";
	public static final String VERSION = "1.2.0";
	
	// Instance of this mod
	@Mod.Instance(TheFabledArmaments.MODID)
	public static TheFabledArmaments instanceOfTheFabledArmaments;
	
	// Proxy to the client/server of this mod
	@SidedProxy(clientSide = PATH_TO_CLIENTPROXY, serverSide = PATH_TO_SERVERPROXY)
	public static CommonProxy commonProxy;
	
	
	@EventHandler // Tells forge where the methods for the mod are; these are the mod; items will be instantiated here
	public void preInit(FMLPreInitializationEvent event) {
		
		commonProxy.preInit();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		commonProxy.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		commonProxy.postInit();
		
	}
	
	
	public static String prependModID(String name) {
		return MODID + ":" + name;
	}
	
}
