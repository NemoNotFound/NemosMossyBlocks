package com.nemonotfound.nemos.mossy.blocks.item;

import com.nemonotfound.nemos.mossy.blocks.entity.projectile.thrown.MossBallEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class MossBallItem extends Item implements ProjectileItem {

    public MossBallItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL,
                0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        if (world instanceof ServerWorld serverWorld) {
            ProjectileEntity.spawnWithVelocity(MossBallEntity::new, serverWorld, itemStack, user, 0.0F, 1.5F, 1.0F);
        }

        itemStack.decrementUnlessCreative(1, user);

        return ActionResult.SUCCESS;
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        return new MossBallEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack);
    }
}
