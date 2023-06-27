package com.example.postal_maint.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.postal_maint.ui.screen.HomeDestination
import com.example.postal_maint.ui.screen.HomeScreen

@Composable
fun CallNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = HomeDestination.route,
        modifier = modifier
    ) {
        composable(route = HomeDestination.route) {
            HomeScreen(
                navToCallEntry = { /*TODO*/ },
                navToCallUpdate = { /*TODO*/ }
            )
        }
    }

}