package com.example.firstbootcampapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.ui.graphics.toArgb
import com.example.firstbootcampapp.ui.imagelist.ImageScreen
import com.example.firstbootcampapp.ui.theme.FirstBootcampAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstBootcampAppTheme {

                window.statusBarColor = MaterialTheme.colors.primaryVariant.toArgb()

                ImageScreen()
            }
        }
    }
}