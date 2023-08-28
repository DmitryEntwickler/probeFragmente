package com.example.probefragmente.composeNavHostFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.probefragmente.Screen1.Screen1Composable
import com.example.probefragmente.screen2.Screen2Composable

class ComposeNavHostFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val navController = rememberNavController()

                NavHost(navController, startDestination = "screen1") {
                    composable("screen1") {
                        Screen1Composable(navController)
                    }
                    composable("screen2") {
                        Screen2Composable(navController)
                    }
                }
            }
        }
    }
}