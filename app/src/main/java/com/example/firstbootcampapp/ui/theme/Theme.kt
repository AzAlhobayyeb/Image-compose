package com.example.firstbootcampapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Color(0xff003e74),
    primaryVariant = Color(0xFF091b27),
    secondary = Color(0xFFc8ece9)
)

private val LightColorPalette = lightColors(
    primary = Color(0xFF2868a3),
    primaryVariant = Color(0xFF091b27),
    secondary = Color(0xFF688a87)

    /* Other default colors to override
    background = Color.White,5d768c
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)
@Composable
fun FirstBootcampAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}