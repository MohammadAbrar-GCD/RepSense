package com.example.repsense

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable //Shows progress such as reps
fun ProgressScreen(navController: NavController){

    // Full screen allows everything to be in the middle of the screen
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        //Placeholder data
        Text("Total reps this week: 159")
        Text("Best set: 25 reps")
        Text("Workouts this week: 3")
        Text("Current streak: 3 days")

        Spacer(modifier = Modifier.height(10.dp))

        //placeholder chart
        Text("Weekly chart coming soon")

    }


}


