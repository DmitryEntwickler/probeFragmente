package com.example.probefragmente.secondFragment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun UserScreenComposable(){
    Column(modifier = Modifier.fillMaxSize()) {
        Text("Hier ist ein Composable!")
    }
}