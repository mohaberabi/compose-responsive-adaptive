package com.mohaberabi.composeresponsive.examples.nav_suite_scaffold

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.window.core.layout.WindowWidthSizeClass
import com.mohaberabi.composeresponsive.domain.TopLevelRoutes
import com.mohaberabi.composeresponsive.examples.list_pane_detail.AppListPaneScaffold
import com.mohaberabi.composeresponsive.screens.FavoriteScreen
import com.mohaberabi.composeresponsive.screens.HomeScreen


@Composable
fun AppNavSuiteScaffold(modifier: Modifier = Modifier) {

    val windowAdaptiveInfo = currentWindowAdaptiveInfo()

    val layoutType = remember(windowAdaptiveInfo.windowSizeClass.windowWidthSizeClass) {
        when (windowAdaptiveInfo.windowSizeClass.windowWidthSizeClass) {
            WindowWidthSizeClass.EXPANDED -> NavigationSuiteType.NavigationRail
            WindowWidthSizeClass.MEDIUM -> NavigationSuiteType.NavigationRail
            WindowWidthSizeClass.COMPACT -> NavigationSuiteType.NavigationBar
            else -> NavigationSuiteType.NavigationDrawer
        }
    }
    var selected by rememberSaveable {
        mutableStateOf(TopLevelRoutes.Home)
    }
    NavigationSuiteScaffold(
        layoutType = layoutType,
        navigationSuiteItems = {
            TopLevelRoutes.entries.forEach {
                item(
                    it.name == selected.name,
                    label = { Text(text = it.name) },
                    icon = { Icon(imageVector = it.icon, contentDescription = it.name) },
                    onClick = { selected = it },
                )
            }
        },
    ) {
        when (selected) {
            TopLevelRoutes.Home -> AppListPaneScaffold()
            TopLevelRoutes.Favorite -> FavoriteScreen()
        }
    }
}