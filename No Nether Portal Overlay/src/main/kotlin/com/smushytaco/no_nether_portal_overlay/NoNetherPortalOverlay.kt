package com.smushytaco.no_nether_portal_overlay
import net.fabricmc.api.ClientModInitializer
object NoNetherPortalOverlay : ClientModInitializer {
    const val MOD_ID = "no_nether_portal_overlay"
    val config = ModConfig.createAndLoad()
    override fun onInitializeClient() {}
}