package com.pixelsabre.lockinos.components

import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import com.pixelsabre.lockinos.fragments.WebFragment
import dev.hotwire.core.bridge.BridgeComponent
import dev.hotwire.core.bridge.BridgeDelegate
import dev.hotwire.core.bridge.Message
import dev.hotwire.navigation.destinations.HotwireDestination
class NotificationTokenComponent(
    name: String,
    private val bridgeDelegate: BridgeDelegate<HotwireDestination>
) : BridgeComponent<HotwireDestination>(name, bridgeDelegate) {
    private val fragment: WebFragment
        get() = bridgeDelegate.destination.fragment as WebFragment

    override fun onReceive(message: Message) {
        fragment.requestNotificationPermission()
    }
}