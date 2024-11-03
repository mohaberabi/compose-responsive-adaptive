package com.mohaberabi.composeresponsive.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

enum class TopLevelRoutes(
    val label: String,
    val icon: ImageVector
) {
    Home("Home", Icons.Default.Home),
    Favorite("Favorite", Icons.Default.Favorite),

}