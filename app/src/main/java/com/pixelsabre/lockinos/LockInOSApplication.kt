package com.pixelsabre.lockinos

import android.app.Application
import com.google.firebase.FirebaseApp
import com.pixelsabre.lockinos.activities.baseURL
import dev.hotwire.core.config.Hotwire
import dev.hotwire.core.turbo.config.PathConfiguration
import com.pixelsabre.lockinos.components.NotificationTokenComponent
import com.pixelsabre.lockinos.fragments.WebFragment
import dev.hotwire.navigation.config.registerBridgeComponents
import dev.hotwire.core.bridge.BridgeComponentFactory
import dev.hotwire.navigation.config.registerFragmentDestinations
import dev.hotwire.core.bridge.KotlinXJsonConverter


class LockInOSApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        FirebaseApp.initializeApp(this)

        Hotwire.loadPathConfiguration(
            context = this,
            location = PathConfiguration.Location(
                remoteFileUrl = "$baseURL/configurations/android_v1.json"
            )
        )

        Hotwire.registerFragmentDestinations(
            WebFragment::class,
        )

        Hotwire.registerBridgeComponents(
            BridgeComponentFactory(
                "notification-token",
                ::NotificationTokenComponent
            )
        )

        Hotwire.config.jsonConverter = KotlinXJsonConverter()
    }
}