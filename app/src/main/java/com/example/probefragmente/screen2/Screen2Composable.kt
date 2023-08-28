package com.example.probefragmente.screen2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Screen2Composable(mNavController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Hier ist ein Screen 2 Composable!")
    }
}