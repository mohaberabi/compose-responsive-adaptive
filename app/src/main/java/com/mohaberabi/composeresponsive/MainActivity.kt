package com.mohaberabi.composeresponsive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mohaberabi.composeresponsive.examples.list_pane_detail.AppListPaneScaffold
import com.mohaberabi.composeresponsive.examples.nav_suite_scaffold.AppNavSuiteScaffold
import com.mohaberabi.composeresponsive.ui.theme.ComposeResponsiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeResponsiveTheme {
                Surface(modifier = Modifier.safeContentPadding()) {
                    AppNavSuiteScaffold()
                }
            }
        }
    }
}

