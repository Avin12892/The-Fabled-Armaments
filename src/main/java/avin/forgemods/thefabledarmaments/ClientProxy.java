package avin.forgemods.thefabledarmaments;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ClientProxy extends CommonProxy {
	
	
	public void preInit() {
		
		super.preInit();
		
	}
	
	public void init() {
		
		super.init();
		
		final int DEFAULT_ITEM_SUBTYPE = 0;
		
		
		// Model assignment for items
		
		ModelResourceLocation reaverLocation = new ModelResourceLocation("thefabledarmaments:" + CommonProxy.reaverName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.theObsidianReaver, DEFAULT_ITEM_SUBTYPE, reaverLocation);
		
		ModelResourceLocation truthSwordLocation = new ModelResourceLocation("thefabledarmaments:" + CommonProxy.truthSwordName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.swordOfTruths, DEFAULT_ITEM_SUBTYPE, truthSwordLocation);
		
		ModelResourceLocation thunderfuryLocation = new ModelResourceLocation("thefabledarmaments:" + CommonProxy.thunderfuryName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.thunderfury, DEFAULT_ITEM_SUBTYPE, thunderfuryLocation);
		
		ModelResourceLocation warglaiveLocation = new ModelResourceLocation("thefabledarmaments:" + CommonProxy.warglaiveName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.warglaive, DEFAULT_ITEM_SUBTYPE, warglaiveLocation);
		
		ModelResourceLocation baneLocation = new ModelResourceLocation("thefabledarmaments:" + CommonProxy.baneName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.bane, DEFAULT_ITEM_SUBTYPE, baneLocation);
		
		ModelResourceLocation withererLocation = new ModelResourceLocation("thefabledarmaments:" + CommonProxy.withererName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(CommonProxy.witherer, DEFAULT_ITEM_SUBTYPE, withererLocation);
		
		// Model assignment for blocks
		
		Item itemBlockTest = GameRegistry.findItem(TheFabledArmaments.MODID, BlockTest.getName());
		ModelResourceLocation block_test_resourceLocation = new ModelResourceLocation("thefabledarmaments:" + BlockTest.getName(), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBlockTest, DEFAULT_ITEM_SUBTYPE, block_test_resourceLocation);
		
		
	}
	
	public void postInit() {
		
		super.postInit();
		
	}
	
}
