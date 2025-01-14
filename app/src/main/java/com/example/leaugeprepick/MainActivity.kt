package com.example.leaugeprepick


import android.R.attr.onClick
import com.example.leaugeprepick.ui.theme.*

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            appBackground() //set ".background" -> main2
        }
    }
}

@Composable
fun buttonCONNECT(){
    Box(
        modifier = Modifier
            .fillMaxWidth().fillMaxHeight() // fill the entire screen
            .padding(bottom = 50.dp), // additional size for bottom
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(modifier = Modifier.wrapContentSize(align = Alignment.TopCenter),
            onClick = { /* CODE */ },
            elevation = ButtonDefaults.buttonElevation(pressedElevation = 16.dp),  // elevation = shadow drop
            colors = defaultButtonLayoutCONNECT()) {
            Text("CONNECT")
        }
    }
}
// MAIN
@Composable
fun appBackground() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = backgroundBlue)) {main2()}
}
@Composable
fun main2() {
    /*  CODE  */
    buttonCONNECT()
}