package com.example.probefragmente.navigationCompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.probefragmente.Screen1.Screen1Composable
import com.example.probefragmente.screen2.Screen2Composable

@Composable
fun NavHostComposable() {
    val mNavController = rememberNavController()
    val mTopAppBarTitle = rememberSaveable { mutableStateOf("Screen 1") }
    val mIsArrowBackVisible = rememberSaveable { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBarComposable(
                title = mTopAppBarTitle.value,
                isArrowBackVisible = mIsArrowBackVisible.value,
                navController = mNavController
            )
                 },
        bottomBar = { BottomNavigationComposable(mNavController = mNavController)}
    ) { innerPaddingValues ->
        NavHost(
            navController = mNavController,
            startDestination = "screen1",
            modifier = Modifier.padding(innerPaddingValues)
        ) {
            composable("screen1") {
                mTopAppBarTitle.value = "Compose Dash Board"
                mIsArrowBackVisible.value = false
                Screen1Composable(mNavController)
            }
            composable("screen2") {
                mTopAppBarTitle.value = "Screen 2"
                mIsArrowBackVisible.value = true
                Screen2Composable(mNavController)
            }
        }
    }
}