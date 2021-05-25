package com.smushytaco.no_nether_portal_overlay.mixin;
import com.smushytaco.no_nether_portal_overlay.NoNetherPortalOverlay;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
@Mixin(ClientPlayerEntity.class)
public abstract class NoNetherPortalOverlayMixin extends Entity {
    public NoNetherPortalOverlayMixin(EntityType<?> type, World world) {
        super(type, world);
    }
    @Redirect(method = "updateNausea", at = @At(value = "FIELD", target = "Lnet/minecraft/client/network/ClientPlayerEntity;inNetherPortal:Z", opcode = Opcodes.GETFIELD))
    private boolean hookUpdateNausea(ClientPlayerEntity clientPlayerEntity) {
        if (NoNetherPortalOverlay.INSTANCE.getConfig().isEnabled()) return false;
        return inNetherPortal;
    }
}