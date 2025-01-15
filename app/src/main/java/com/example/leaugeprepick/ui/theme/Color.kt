package com.example.leaugeprepick.ui.theme

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// BLUE
val backgroundBlue = Color(14,14,38) //background
val darkBlue = Color(25,24,54) // boxes etc..
val blue = Color(51,115,251) // buttons
// WHITE
val darkWhite = Color(204,221,254)
val white = Color(254,254,255)
// RATING
val ratingSp = Color(247,142,49) // Sp
val ratingS = Color(67,110,229) // S
val ratingA = Color(114,147,220) // A
val ratingB = Color(221,244,255) // B
val ratingC = Color(240,178,184) // C
val ratingD = Color(177,54,74) // D

// button color layouts
//CONNECT
@Composable
fun defaultButtonLayoutCREATE_NEW() = ButtonDefaults.buttonColors(
    containerColor = blue,
    contentColor = white,
//    disabledContentColor = ,
//    disabledContainerColor =
)
