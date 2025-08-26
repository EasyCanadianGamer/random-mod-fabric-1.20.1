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
            // Remove one full case
            stack.decrement(1);

            // Give empty case
            user.giveItemStack(new ItemStack(ModItems.AIRPOD_CASE_EMPTY));

            // Give airpods
            user.giveItemStack(new ItemStack(ModItems.AIRPODS));
        }

        return TypedActionResult.success(stack, world.isClient());
    }

}