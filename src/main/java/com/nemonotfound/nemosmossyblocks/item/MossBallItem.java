package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.entity.projectile.thrown.MossBallEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class MossBallItem extends Item implements ProjectileItem {

    public MossBallItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL,
                0.5f, 0.4f / (world.getRandom().nextFloat() * 0.4f + 0.8f));

        if (!world.isClient) {
            MossBallEntity mossBallEntity = new MossBallEntity(world, user);
            mossBallEntity.setItem(itemStack);
            mossBallEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0f, 1.3f, 1.0f);
            world.spawnEntity(mossBallEntity);
        }

        itemStack.decrementUnlessCreative(1, user);

        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        MossBallEntity mossBallEntity = new MossBallEntity(world, pos.getX(), pos.getY(), pos.getZ());
        mossBallEntity.setItem(stack);
        return mossBallEntity;
    }
}
