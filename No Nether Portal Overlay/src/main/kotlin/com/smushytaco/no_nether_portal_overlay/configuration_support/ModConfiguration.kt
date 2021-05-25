package com.smushytaco.no_nether_portal_overlay.configuration_support
import com.smushytaco.no_nether_portal_overlay.NoNetherPortalOverlay
import me.shedaniel.autoconfig.ConfigData
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment
@Config(name = NoNetherPortalOverlay.MOD_ID)
class ModConfiguration: ConfigData {
    @Comment("Default value is yes. If set to yes the mod will be enabled. If set to no it won't be.")
    val isEnabled = true
}