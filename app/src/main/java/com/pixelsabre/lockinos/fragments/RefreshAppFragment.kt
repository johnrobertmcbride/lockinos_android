package com.pixelsabre.lockinos.fragments

import android.os.Bundle
import com.pixelsabre.lockinos.activities.MainActivity
import dev.hotwire.navigation.destinations.HotwireDestinationDeepLink
import dev.hotwire.navigation.fragments.HotwireFragment

@HotwireDestinationDeepLink(uri = "hotwire://fragment/refresh_app")
class RefreshAppFragment : HotwireFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navigator.reset()
        (activity as? MainActivity)?.resetNavigators()
    }
}