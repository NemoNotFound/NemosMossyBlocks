package com.devnemo.nemos.mossy.blocks.world.entity.projectile;

import com.devnemo.nemos.mossy.blocks.client.particle.NemosMossyParticleTypes;
import com.devnemo.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import com.devnemo.nemos.mossy.blocks.world.item.NemosMossyItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class MossBall extends ThrowableItemProjectile {

    public MossBall(EntityType<MossBall> entityType, Level level) {
        super(entityType, level);
    }

    public MossBall(Level level, LivingEntity owner, ItemStack stack) {
        super(NemosMossyEntityTypes.MOSS_BALL.get(), owner, level, stack);
    }

    public MossBall(Level level, double x, double y, double z, ItemStack stack) {
        super(NemosMossyEntityTypes.MOSS_BALL.get(), x, y, z, level, stack);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return NemosMossyItems.MOSS_BALL.get();
    }

    private ParticleOptions getParticleParameters() {
        ItemStack itemStack = this.getItem();
        return !itemStack.isEmpty() && !itemStack.is(this.getDefaultItem())
                ? new ItemParticleOption(ParticleTypes.ITEM, itemStack)
                : NemosMossyParticleTypes.ITEM_MOSS_BALL.get();
    }

    @Override
    public void handleEntityEvent(byte status) {
        if (status == EntityEvent.DEATH) {
            ParticleOptions particleOptions = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(particleOptions, this.getX(), this.getY(), this.getZ(),
                        0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.hurt(this.damageSources().thrown(this, this.getOwner()), 0);
    }

    @Override
    protected void onHit(@NotNull HitResult hitResult) {
        super.onHit(hitResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, EntityEvent.DEATH);
            this.discard();
        }
    }
}
