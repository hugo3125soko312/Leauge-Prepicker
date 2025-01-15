package com.example.leaugeprepick

import android.os.Bundle
import android.util.Log.i
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.leaugeprepick.ui.theme.backgroundBlue
import com.example.leaugeprepick.ui.theme.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
fun buttonSAVE(){ // SAVE
    Box(
        modifier = Modifier
            .fillMaxWidth().fillMaxHeight() // fill the entire screen
            .padding(bottom = 50.dp), // additional size for bottom
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(modifier = Modifier.wrapContentSize(align = Alignment.TopCenter),
            onClick = { /* CODE */ },
            elevation = ButtonDefaults.buttonElevation(pressedElevation = 16.dp),  // elevation = shadow drop
            colors = defaultButtonLayoutCREATE_NEW()) {
            Text("SAVE")
        }
    }
}
@Composable
fun btnCREATE_NEW() {
    Button(modifier = Modifier.wrapContentSize(align = Alignment.TopCenter),
        onClick = { /* CODE */ },
        elevation = ButtonDefaults.buttonElevation(pressedElevation = 16.dp),  // elevation = shadow drop
        colors = defaultButtonLayoutCREATE_NEW()) {
        Text("CREATE NEW")
    }
}

@Preview
@Composable // BAR
fun scrollBar(){
    Box(
        modifier = Modifier
            .fillMaxWidth().fillMaxHeight(), // fill the entire screen
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(100.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top) {
            loopedButtons(3)

        }
    }
}
@Composable
fun loopedButtons(howmuch: Int){
    var i =0
    while(i > howmuch) {
        btnCREATE_NEW()
        i++

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
    buttonSAVE()
    scrollBar()
}