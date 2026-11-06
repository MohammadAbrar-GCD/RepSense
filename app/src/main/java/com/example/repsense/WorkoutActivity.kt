package com.example.repsense

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.repsense.ui.theme.RepSenseTheme

class WorkoutActivity : ComponentActivity() { //separate screen when you press start workout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RepSenseTheme { //applies colours and fonts

                //reads data that comes from HomeScreen
                //val so data doesnt change
                val exercise = intent.getStringExtra("exercise")
                val target = intent.getIntExtra("target", 0)

                //counts reps starting from zero
                var reps by rememberSaveable { mutableStateOf(0) }

                Column( //stacks all text centrically and vertically
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    //shows exercise and targer reps text
                    Text("Exercise: $exercise")
                    Text("Target: $target reps")

                    Text("$reps", fontSize = 48.sp) //numbers on screen

                    //each cick of the button increase by 1
                    Button(onClick = { reps = reps + 1 }) {
                        Text("+1")
                    }

                    //pressing finish button brings u back to home screen
                    Button(onClick = { finish() }){
                        Text("Finish")
                    }

                    //Implicent intent clicking button brings u to a youtube video on how to do the exercise
                    Button(onClick = { val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IODxDxX7oi4"))
                        startActivity(intent) }) {
                        Text("Watch form guide")
                    }
                }
            }
        }
    }
}