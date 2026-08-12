package net.canadiangamer.randommod.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.canadiangamer.randommod.RandomMod;
import net.canadiangamer.randommod.fluid.RandomWaterFluid;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(InGameOverlayRenderer.class)
public class RandomWaterOverlayMixin {
    private static final Identifier RANDOM_UNDERWATER_TEXTURE =
            Identifier.of(RandomMod.MOD_ID, "textures/misc/random_underwater.png");

    @Redirect(method = "renderUnderwaterOverlay", at = @At(value = "INVOKE",
            target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/util/Identifier;)V"))
    private static void randommod$useCustomUnderwaterOverlay(int slot, Identifier vanillaTexture,
                                                               MinecraftClient client, MatrixStack matrices) {
        ClientPlayerEntity player = client.player;
        if (player != null) {
            BlockPos eyePos = BlockPos.ofFloored(player.getX(), player.getEyeY(), player.getZ());
            FluidState fluidState = player.getWorld().getFluidState(eyePos);
            if (fluidState.getFluid() instanceof RandomWaterFluid) {
                RenderSystem.setShaderTexture(slot, RANDOM_UNDERWATER_TEXTURE);
                return;
            }
        }
        RenderSystem.setShaderTexture(slot, vanillaTexture);
    }
}
