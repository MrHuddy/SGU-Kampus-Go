package com.sgu.kampusgo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sgu.kampusgo.ui.theme.KampusGoTheme
import android.content.Intent
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Capture the Activity BEFORE setContent. The button needs it to build an Intent.
        setContent {
            KampusGoTheme {
// Holds the typed text while this screen is open. A redraw keeps it. Rotation still runs onCreate again.
                var name by remember { mutableStateOf("") }
                var npm by remember {mutableStateOf("")}
                var showEmpty by remember { mutableStateOf(false) }
                val events = if (showEmpty) emptyList() else sampleEvents
                KampusApp()
                    }
                }
            }
        }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KampusGoTheme {
        Greeting("Android")
    }
}