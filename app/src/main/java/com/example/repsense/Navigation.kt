package com.example.repsense

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable fun NavigationScreen(){ // functions lets you navigate to other screens
    val navController = rememberNavController()//remembers what screen you are in

    NavHost( // swaps screens one at a time using this container
        navController = navController, startDestination = "home"

    ) {
        composable("home")  {
            HomeScreen(navController)
        }

        composable("progress") {
            ProgressScreen(navController)
        }

        composable("settings") {
            SettingsScreen(navController)
        }

        composable("history") {
            HistoryScreen(navController)
        }
    }










}