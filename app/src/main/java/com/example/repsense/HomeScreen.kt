package com.example.repsense

import android.content.Intent
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable //The home where the user selects exercise
fun HomeScreen(navController: NavController){

    val context = LocalContext.current

    // Full screen allows everything to be in the middle of the screen
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Home")
        Spacer(modifier = Modifier.height(10.dp))
        //When u press start workout button it brings you to the workout activity screen
        Button(onClick = {  val intent = Intent(context, WorkoutActivity::class.java)
            intent.putExtra("exercise", "Push-ups")
            intent.putExtra("target", 20)
            context.startActivity(intent)
        }) {
            Text(text = "Start Workout") //button starts work
        }

    }


    }


