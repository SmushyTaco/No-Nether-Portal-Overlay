package com.smushytaco.no_nether_portal_overlay
import com.llamalad7.mixinextras.MixinExtrasBootstrap
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
@Suppress("UNUSED")
object NoNetherPortalOverlayPreLaunch: PreLaunchEntrypoint { override fun onPreLaunch() { MixinExtrasBootstrap.init() } }