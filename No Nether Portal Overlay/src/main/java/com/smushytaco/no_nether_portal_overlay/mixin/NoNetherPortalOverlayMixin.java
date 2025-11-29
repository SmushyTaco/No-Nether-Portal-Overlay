package com.smushytaco.no_nether_portal_overlay.mixin;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.smushytaco.no_nether_portal_overlay.NoNetherPortalOverlay;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.PortalProcessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
@Mixin(LocalPlayer.class)
public abstract class NoNetherPortalOverlayMixin {
    @WrapOperation(method = "handlePortalTransitionEffect", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/PortalProcessor;isInsidePortalThisTick()Z"))
    private boolean hookTickNausea(PortalProcessor instance, Operation<Boolean> original) { return !NoNetherPortalOverlay.INSTANCE.getConfig().isEnabled() && original.call(instance); }
}