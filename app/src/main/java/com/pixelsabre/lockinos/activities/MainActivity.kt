package com.pixelsabre.lockinos.activities

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pixelsabre.lockinos.R
import com.pixelsabre.lockinos.models.mainTabs
import com.pixelsabre.lockinos.BuildConfig
import dev.hotwire.core.config.Hotwire
import dev.hotwire.core.turbo.config.PathConfiguration
import dev.hotwire.navigation.activities.HotwireActivity
import dev.hotwire.navigation.tabs.HotwireBottomNavigationController
import dev.hotwire.navigation.tabs.navigatorConfigurations
import dev.hotwire.navigation.util.applyDefaultImeWindowInsets

const val baseURL = BuildConfig.BASE_URL

class MainActivity : HotwireActivity() {
    private lateinit var bottomNavigationController: HotwireBottomNavigationController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.main).applyDefaultImeWindowInsets()

        initialiseBottomTabs()
    }

    fun resetNavigators() {
        delegate.resetNavigators()
    }

    override fun navigatorConfigurations() = mainTabs.navigatorConfigurations

    private fun initialiseBottomTabs() {
        val bottomNavigationView =
            findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomNavigationController =
            HotwireBottomNavigationController(this, bottomNavigationView)
        bottomNavigationController.load(mainTabs, 0)
    }
}