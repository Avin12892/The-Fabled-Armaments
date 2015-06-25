package avin.forgemods.thefabledarmaments;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeaponTab extends CreativeTabs {
	
	
	public WeaponTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return CommonProxy.thunderfury;
	}
	
	
}
