package com.example.repsense

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable //The settings page
fun SettingsScreen(navController: NavController){

    // daily goal at 60, vibrate on or off
    var goal by rememberSaveable { mutableStateOf(60) }
    var vibrate by rememberSaveable { mutableStateOf(true) }

    // Full screen allows everything to be in the middle of the screen
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {//increase Setting text size
        Text(text = "Settings", fontSize = 28.sp)
        Spacer(modifier = Modifier.height(10.dp))


        Row(verticalAlignment = Alignment.CenterVertically) {
            //Reduce number of reps by 5 when u press the button
            Button(onClick = { goal = goal - 5}) {
                Text("-") // minus icon on the button
            }
            Text("Daily goal: $goal reps")
            //Increase number of reps by 5 when u press the button
            Button(onClick = { goal = goal + 5}) {
                Text("+") // plus icon on the button
            }
        }

        //Allows u to vhange settings : vibrate on each rep
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Vibrate on each rep")
            Switch(
                checked = vibrate,
                onCheckedChange = {vibrate = it}
            )
        }

    }


}


