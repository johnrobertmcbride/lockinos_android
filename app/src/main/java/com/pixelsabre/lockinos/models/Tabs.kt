package com.pixelsabre.lockinos.models

import com.pixelsabre.lockinos.R
import com.pixelsabre.lockinos.activities.baseURL
import dev.hotwire.navigation.navigator.NavigatorConfiguration
import dev.hotwire.navigation.tabs.HotwireBottomTab

private val habits = HotwireBottomTab(
    title = "Habits",
    iconResId = android.R.drawable.ic_menu_agenda,
    configuration = NavigatorConfiguration(
        name = "habits",
        navigatorHostId = R.id.habits_nav_host,
        startLocation = "$baseURL/habits"
    )
)
private val coach = HotwireBottomTab(
    title = "Coach",
    iconResId = android.R.drawable.ic_menu_compass,
    configuration = NavigatorConfiguration(
        name = "coach",
        navigatorHostId = R.id.coach_nav_host,
        startLocation = "$baseURL/coach"
    )
)
private val settings = HotwireBottomTab(
    title = "Settings",
    iconResId = android.R.drawable.ic_menu_preferences,
    configuration = NavigatorConfiguration(
        name = "settings",
        navigatorHostId = R.id.settings_nav_host,
        startLocation = "$baseURL/settings"
    )
)
val mainTabs = listOf(
    habits,
    coach,
    settings
)