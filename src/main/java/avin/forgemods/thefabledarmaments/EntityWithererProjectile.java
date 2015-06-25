package avin.forgemods.thefabledarmaments;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWithererProjectile extends EntityWitherSkull {

	public EntityWithererProjectile(World worldIn) {
		
		super(worldIn);
		
	}
	
	/**
	 *  Launch a wither skull toward _3, _5, _7. Accel x, y, z?
	 * @param worldIn
	 * @param p_i1794_2_ Shooter
	 * @param p_i1794_3_ 
	 * @param p_i1794_5_
	 * @param p_i1794_7_
	 */
	public EntityWithererProjectile(World worldIn, EntityLivingBase shooter, double p_i1794_3_, double p_i1794_5_, double p_i1794_7_) {
		
        super(worldIn, shooter, p_i1794_3_, p_i1794_5_, p_i1794_7_);
        
    }
	
	public EntityWithererProjectile(World worldIn, EntityLivingBase shooter, float speed) {
		
		super(worldIn);
		
		this.setLocationAndAngles(shooter.posX, shooter.posY + (double)shooter.getEyeHeight(), shooter.posZ, shooter.rotationYaw, shooter.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI));
        this.motionY = (double)(-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
		
	}
	
	@SideOnly(Side.CLIENT)
    public EntityWithererProjectile(World worldIn, double p_i1795_2_, double p_i1795_4_, double p_i1795_6_, double p_i1795_8_, double p_i1795_10_, double p_i1795_12_) {
        
		super(worldIn, p_i1795_2_, p_i1795_4_, p_i1795_6_, p_i1795_8_, p_i1795_10_, p_i1795_12_);
		
    }

	
}
