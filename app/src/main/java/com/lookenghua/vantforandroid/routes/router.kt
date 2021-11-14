package com.lookenghua.vantforandroid.routes

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lookenghua.vantforandroid.page.ButtonPage
import com.lookenghua.vantforandroid.page.HomePage

@Composable
fun VantNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "/") {
        composable("/") {
            HomePage(navController)
        }
        composable("/button",
        ) {
            ButtonPage(navController)
        }
    }
}