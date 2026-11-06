package com.example.repsense

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//Shows previous workouts
@Composable
fun HistoryScreen(navController: NavController){


    // Full screen allows everything to be in the middle of the screen
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "History", fontSize = 28.sp)
        Spacer(modifier = Modifier.height(10.dp))

        //sample data for now, will use data base
        Text("Mon 2 Nov - Push-ups - 3 sets - 54 reps")
        Text("Tues 3 Nov - Push-ups - 3 sets - 55 reps")
        Text("Wed 4 Nov - Push-ups - 3 sets - 50 reps")

    }


}


