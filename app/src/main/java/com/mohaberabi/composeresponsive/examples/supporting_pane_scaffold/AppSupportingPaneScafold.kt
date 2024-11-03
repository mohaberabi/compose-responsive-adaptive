package com.mohaberabi.composeresponsive.examples.supporting_pane_scaffold

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.SupportingPaneScaffold
import androidx.compose.material3.adaptive.navigation.rememberSupportingPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun AppSupportingPaneScaffold(modifier: Modifier = Modifier) {


    val navigator = rememberSupportingPaneScaffoldNavigator()
    SupportingPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        mainPane = {},
        supportingPane = {},
        extraPane = {},
    )
}