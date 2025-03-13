package com.nemonotfound.nemosmossyblocks.entity.projectile.thrown;

import com.nemonotfound.nemosmossyblocks.entity.ModEntityTypes;
import com.nemonotfound.nemosmossyblocks.item.Items;
import com.nemonotfound.nemosmossyblocks.particle.ModParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class MossBallEntity extends ThrownItemEntity {

    public MossBallEntity(EntityType<MossBallEntity> entityType, World world) {
        super(entityType, world);
    }

    public MossBallEntity(World world, LivingEntity owner, ItemStack stack) {
        super(ModEntityTypes.MOSS_BALL, owner, world, stack);
    }

    public MossBallEntity(World world, double x, double y, double z, ItemStack stack) {
        super(ModEntityTypes.MOSS_BALL, x, y, z, world, stack);
    }

    @Override
    protected Item getDefaultItem() {
        return Items.MOSS_BALL;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getStack();
        return !itemStack.isEmpty() && !itemStack.isOf(this.getDefaultItem())
                ? new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack)
                : ModParticleTypes.ITEM_MOSS_BALL;
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(),
                        0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        entity.serverDamage(this.getDamageSources().thrown(this, this.getOwner()), 0);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }
}
