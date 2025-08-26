package net.canadiangamer.randommod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class FullAirpodsCaseItem extends Item {
    public FullAirpodsCaseItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack stack = user.getStackInHand(hand);

        if (!world.isClient) {
            // Replace the current item in hand with an empty case
            stack.decrement(1); // remove the full case
            ItemStack newStack = new ItemStack(ModItems.AIRPOD_CASE_EMPTY);
            user.setStackInHand(hand, newStack);

            // Also give AirPods separately
            user.giveItemStack(new ItemStack(ModItems.AIRPODS));
        }

        return TypedActionResult.success(user.getStackInHand(hand), world.isClient());
    }

}
