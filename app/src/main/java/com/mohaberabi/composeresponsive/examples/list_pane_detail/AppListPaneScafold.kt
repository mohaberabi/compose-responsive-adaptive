package com.mohaberabi.composeresponsive.examples.list_pane_detail

import androidx.activity.compose.BackHandler
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.mohaberabi.composeresponsive.domain.DummyTopics
import com.mohaberabi.composeresponsive.domain.TopicModel
import com.mohaberabi.composeresponsive.screens.TopicDetailScreen
import com.mohaberabi.composeresponsive.screens.TopicListingScreen


@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun AppListPaneScaffold(
    modifier: Modifier = Modifier,
) {

    var topic = rememberSaveable {
        DummyTopics.topic[0]
    }
    val navigator = rememberListDetailPaneScaffoldNavigator<TopicModel>()
    BackHandler(navigator.canNavigateBack()) {
        navigator.navigateBack()
    }
    ListDetailPaneScaffold(
        directive = navigator.scaffoldDirective,
        value = navigator.scaffoldValue,
        listPane = {
            TopicListingScreen(
                onClick = {
                    topic = it
                    navigator.navigateTo(ListDetailPaneScaffoldRole.Detail, topic)
                }
            )
        },
        detailPane = {
            val passedTopic = navigator.currentDestination?.content ?: topic
            TopicDetailScreen(
                topic = passedTopic,
            )
        },
    )
}