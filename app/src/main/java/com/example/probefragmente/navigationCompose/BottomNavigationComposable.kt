package com.example.probefragmente.navigationCompose

import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationComposable(mNavController: NavController){

    val mActualRoute = mNavController.currentBackStackEntryAsState().value?.destination?.route

    // Material 2
    BottomAppBar() {
        BottomNavigationItem(
            selected = (mActualRoute == "screen1"),
            onClick = { /*TODO*/ },
            icon = { Icon(imageVector = Icons.Default.Home,"")}
        )
        BottomNavigationItem(
            selected = (mActualRoute == "screen2"),
            onClick = { /*TODO*/ },
            icon = { Icon(imageVector = Icons.Default.Person,"")}
        )
    }
}