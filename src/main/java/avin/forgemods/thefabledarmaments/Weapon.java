package avin.forgemods.thefabledarmaments;


import java.awt.List;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public abstract class Weapon extends Item {
	
	/*
	// Name for this item
	protected String name;
	*/
	
	// The weapon damage
	protected float damage;
	// Weapons won't stack
	final int stackSize = 1;
	// Just in case
	private final Item.ToolMaterial material = Item.ToolMaterial.EMERALD;


	public Weapon() {
		
		this.maxStackSize = stackSize;
		this.damage = 24F;
		this.setCreativeTab(CreativeTabs.tabCombat);
		
	}


	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumRarity.EPIC;
	}
	
	/**
	 * Enchanted effect
	 * @param par1ItemStack Not needed
	 */
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return false;
	}
	
	
	/**
	 * Keep the weapon from being breakable
	*/
	public boolean isDamageable() {
		return false;
	}
	
	
	/**
	 * How long it takes to use or consume an item
	 */
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 72000;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {

		playerIn.setItemInUse(itemStackIn, this.getMaxItemUseDuration(itemStackIn));

		return itemStackIn;
	}
	
	/**
	 * Called to pick the animation on right click
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BLOCK;
	}
	
	
	/**
	 * Determines strength against the block being hit
	 * @param blockIn Block being hit
	 * @param stack Not needed to determine return value
	 * @return The amount of strength boost in Float value (1.0F)
	 */
	public float getStrVsBlock(ItemStack stack, Block blockIn) {

		if (blockIn == Blocks.web) {
			return 15.0F;
		}
		/*else {
				 Material blockInMaterial = blockIn.getMaterial();
				 return blockInMaterial != Material.plants && blockInMaterial != Material.vine && blockInMaterial != Material.coral && blockInMaterial != Material.leaves && blockInMaterial != Material.gourd ? 1.0F : 1.5F;
			 }*/

		return 10.0F;
	}
	
	
	/**
	 * Check whether this Item can harvest the given Block, aka get drops
	 * Use if statements to compare block types against blockIn
	 * @param blockIn Block being hit
	 */
	public boolean canHarvestBlock(Block blockIn) {
		return blockIn == Blocks.web;
	}
	
	
	/**
	 * allows items to add custom lines of information to the mouseover description
	 *  
	 * @param tooltip All lines to display in the Item's tooltip. This is a List of Strings.
	 * @param advanced Whether the setting "Advanced tooltips" is enabled
	 */
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {

		// TODO Add tooltips

	}
	
	
	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 * @return True if to be rendered in full 3D
	 */
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
	
	/**
	 * Return the name for this tool's material.
	 */
	public String getToolMaterialName() {
		return this.material.toString();
	}
	
	
	/**
	 * Gets a map of item attribute modifiers, used to increase hit damage from the weapon
	 * @return Returns a map of attribute modifiers obtained from super.getItemAttributeModifiers
	 */
	public Multimap getItemAttributeModifiers() {

		Multimap map = super.getItemAttributeModifiers();
		map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Weapon modifier", (double)this.damage, 0));

		return map;
	}
	
	
	/**
	 * Returns true if the item can be used on the given entity, e.g. shears on sheep.
	 * @return True if the item can be used on the given entity
	 */
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer playerIn, EntityLivingBase target) {
		return true;
	}

	
	// Getters and setters

	/**
	 * @return The damage this weapon is set to do
	 */
	public float getDamage() {
		return this.damage;
	}
	/**
	 * @param newDamage Sets the new damage this weapon will do
	 */
	public void setDamage(Float newDamage) {
		this.damage = newDamage;
	}

	
}
