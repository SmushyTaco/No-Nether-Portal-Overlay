package com.smushytaco.no_nether_portal_overlay
import me.shedaniel.autoconfig.AutoConfig
import me.shedaniel.autoconfig.annotation.Config
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer
import com.smushytaco.no_nether_portal_overlay.configuration_support.ModConfiguration
import net.fabricmc.api.ClientModInitializer
object NoNetherPortalOverlay : ClientModInitializer {
    const val MOD_ID = "no_nether_portal_overlay"
    lateinit var config: ModConfiguration
        private set
    override fun onInitializeClient() {
        AutoConfig.register(ModConfiguration::class.java) { definition: Config, configClass: Class<ModConfiguration> ->
            GsonConfigSerializer(definition, configClass)
        }
        config = AutoConfig.getConfigHolder(ModConfiguration::class.java).config
    }
}