package com.example.leaugeprepick

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            main2() // init
        }
    }
}

@Composable
fun ConnectButton(alingment: String = , ){
    Box(
        modifier = Modifier
            .fillMaxSize() // fill the entire screen
            .padding(top = 16.dp), // optional padding
        contentAlignment = Alignment.TopCenter // aligns content to the center of the top
    ) {
        Button(onClick = { /* handle button click */ }) {
            Text("Click Me")
        }
    }
}

@Composable
fun main2() {
    /*  CODE  */
    ConnectButton()
}