package com.smushytaco.no_nether_portal_overlay
import io.wispforest.owo.config.annotation.Config
import io.wispforest.owo.config.annotation.Modmenu
@Modmenu(modId = NoNetherPortalOverlay.MOD_ID)
@Config(name = NoNetherPortalOverlay.MOD_ID, wrapperName = "ModConfig")
@Suppress("UNUSED")
class ModConfiguration {
    @JvmField
    var isEnabled = true
}