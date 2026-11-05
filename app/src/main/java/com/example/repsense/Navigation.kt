package com.example.repsense

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Button

@Composable
fun NavigationScreen() { // functions lets you navigate to other screens
    val navController = rememberNavController()//remembers what screen you are in

    Scaffold(bottomBar = {
        BottomAppBar {
            Button(onClick = { navController.navigate("home") }) {
                Text("Home")
            }
            Button(onClick = { navController.navigate("progress") }) {
                Text("Progress")
            }
            Button(onClick = { navController.navigate("settings") }) {
                Text("Settings")
            }
            Button(onClick = { navController.navigate("history") }) {
                Text("History")
            }
        }
    }) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") {
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
}