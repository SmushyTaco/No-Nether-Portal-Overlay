package com.smushytaco.no_nether_portal_overlay.mixin;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.smushytaco.no_nether_portal_overlay.NoNetherPortalOverlay;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.world.dimension.PortalManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
@Mixin(ClientPlayerEntity.class)
public abstract class NoNetherPortalOverlayMixin {
    @WrapOperation(method = "tickNausea", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/dimension/PortalManager;isInPortal()Z"))
    private boolean hookTickNausea(PortalManager instance, Operation<Boolean> original) { return !NoNetherPortalOverlay.INSTANCE.getConfig().isEnabled() && original.call(instance); }
}