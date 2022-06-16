package com.example.firstbootcampapp.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(
        topEnd = 8.dp,
        topStart = 8.dp,
        bottomEnd = 16.dp,
        bottomStart = 60.dp
    ),
    medium = CutCornerShape(
        topStart = 25.dp,
        topEnd = 25.dp,
        bottomStart = 16.dp,
        bottomEnd = 16.dp
    ),
    large = RoundedCornerShape(0.dp)
)