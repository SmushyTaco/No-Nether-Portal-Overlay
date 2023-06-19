package com.smushytaco.no_nether_portal_overlay.mixin;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.smushytaco.no_nether_portal_overlay.NoNetherPortalOverlay;
import net.minecraft.client.network.ClientPlayerEntity;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
@Mixin(ClientPlayerEntity.class)
public abstract class NoNetherPortalOverlayMixin {
    @WrapOperation(method = "updateNausea", at = @At(value = "FIELD", target = "Lnet/minecraft/client/network/ClientPlayerEntity;inNetherPortal:Z", opcode = Opcodes.GETFIELD))
    @SuppressWarnings("unused")
    private boolean hookUpdateNausea(ClientPlayerEntity instance, Operation<Boolean> original) { return !NoNetherPortalOverlay.INSTANCE.getConfig().isEnabled() && original.call(instance); }
}