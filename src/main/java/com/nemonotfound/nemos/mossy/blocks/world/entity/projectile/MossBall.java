package com.nemonotfound.nemos.mossy.blocks.world.entity.projectile;

import com.nemonotfound.nemos.mossy.blocks.core.particles.NemosMossyParticleTypes;
import com.nemonotfound.nemos.mossy.blocks.world.entity.NemosMossyEntityTypes;
import com.nemonotfound.nemos.mossy.blocks.world.item.MossyItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.throwableitemprojectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class MossBall extends ThrowableItemProjectile {

    public MossBall(EntityType<@NotNull MossBall> entityType, Level level) {
        super(entityType, level);
    }

    public MossBall(Level level, LivingEntity owner, ItemStack stack) {
        super(NemosMossyEntityTypes.MOSS_BALL, owner, level, stack);
    }

    public MossBall(Level level, double x, double y, double z, ItemStack stack) {
        super(NemosMossyEntityTypes.MOSS_BALL, x, y, z, level, stack);
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return MossyItems.MOSS_BALL;
    }

    private ParticleOptions getParticle() {
        ItemStack itemStack = this.getItem();
        return !itemStack.isEmpty()
                ? new ItemParticleOption(ParticleTypes.ITEM, ItemStackTemplate.fromNonEmptyStack(itemStack))
                : NemosMossyParticleTypes.ITEM_MOSS_BALL;
    }

    @Override
    public void handleEntityEvent(byte status) {
        if (status == EntityEvent.DEATH) {
            ParticleOptions particleOptions = this.getParticle();
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
        if (!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, EntityEvent.DEATH);
            this.discard();
        }
    }
}
