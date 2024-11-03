package com.mohaberabi.composeresponsive.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mohaberabi.composeresponsive.compose.TopicListingItem
import com.mohaberabi.composeresponsive.domain.DummyTopics
import com.mohaberabi.composeresponsive.domain.TopicModel


@Composable
fun TopicListingScreen(
    modifier: Modifier = Modifier,
    onClick: (TopicModel) -> Unit,
) {
    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = modifier.padding(8.dp)
        ) {
            items(
                DummyTopics.topic,
            ) { topic ->
                TopicListingItem(

                    topic = topic,
                    modifier = Modifier.clickable { onClick(topic) }
                )
            }
        }

    }
}