package com.devnemo.nemos.mossy.blocks.world.item;

import com.devnemo.nemos.mossy.blocks.world.entity.projectile.MossBall;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MossBallItem extends Item implements ProjectileItem {

    public MossBallItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult use(Level level, Player user, @NotNull InteractionHand hand) {
        ItemStack itemStack = user.getItemInHand(hand);
        level.playSound(null, user.getX(), user.getY(), user.getZ(),
                SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL,
                0.5f, 0.4f / (level.getRandom().nextFloat() * 0.4f + 0.8f));

        if (level instanceof ServerLevel serverLevel) {
            Projectile.spawnProjectileFromRotation(MossBall::new, serverLevel, itemStack, user, 0.0F, 1.5F, 1.0F);
        }

        itemStack.consume(1, user);

        return InteractionResult.SUCCESS;
    }

    @Override
    public @NotNull Projectile asProjectile(@NotNull Level level, Position pos, @NotNull ItemStack stack, @NotNull Direction direction) {
        return new MossBall(level, pos.x(), pos.y(), pos.z(), stack);
    }
}
