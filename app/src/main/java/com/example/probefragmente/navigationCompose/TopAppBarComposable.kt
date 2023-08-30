package com.example.probefragmente.navigationCompose

import androidx.compose.foundation.Image
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ColorFilter
import androidx.navigation.NavController

@Composable
fun TopAppBarComposable(
    title: String,
    isArrowBackVisible: Boolean,
    navController: NavController
){
    TopAppBar {
        if (isArrowBackVisible) {
            IconButton(onClick = { navController.popBackStack() }) {
                Image(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary)
                    )
            }
        }
        Text(
            text = title,
            style = MaterialTheme.typography.h6
        )
    }
}