package com.example.probefragmente.Screen1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Screen1Composable(mNavController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text("Hier ist ein Screen 1 Composable!")
        Button(
            modifier = Modifier.fillMaxWidth().padding(8.dp),
            onClick = { mNavController.navigate("screen2") }
        ) {
            Text("go to Screen 2")
        }
    }
}