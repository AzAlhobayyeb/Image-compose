package com.example.firstbootcampapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ImageCard(imageData: ImageData){
    Card(
        elevation = 5.dp,
        shape =MaterialTheme.shapes.medium,
        modifier = Modifier.padding(16.dp)
    ) {
        Box(
            modifier = Modifier.size(300.dp)
        ) {
            Image(
                bitmap = ImageBitmap.imageResource(imageData.photoPath),
                contentDescription = imageData.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.TopCenter),


            )

            Text(
                text = imageData.title.uppercase(),
                color = MaterialTheme.colors.onPrimary,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(color = MaterialTheme.colors.primary)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.subtitle2,
            )
        }
    }

}