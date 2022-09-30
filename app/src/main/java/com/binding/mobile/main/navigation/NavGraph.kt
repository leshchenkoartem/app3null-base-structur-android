package com.binding.mobile.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.app3null.commoncodelib.main.welcome.WelcomeScreen
import com.binding.mobile.consts.Screens
import com.binding.mobile.main.details.DetailsScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.WELCOME
    ) {

        composable(
            route = Screens.WELCOME,
        ) {
            WelcomeScreen(
                onClickToDetailScreen = { navController.navigate(Screens.DETAILS) }
            )
        }
        composable(
            route = Screens.DETAILS,
        ) {
            DetailsScreen()
        }
    }
}