package com.asalcedo.examplelazycolumandlazyrow.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.asalcedo.examplelazycolumandlazyrow.ui.screen.HomeScreen
import com.asalcedo.examplelazycolumandlazyrow.ui.theme.ExampleLazyColumAndLazyRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleLazyColumAndLazyRowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}








