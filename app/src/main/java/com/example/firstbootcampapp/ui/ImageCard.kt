package com.example.firstbootcampapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.unit.dp
import com.example.firstbootcampapp.data.domain.ImageData
import com.example.firstbootcampapp.ui.imagelist.NetworkImage


@Composable
fun ImageCard(image: ImageData){
    Card(
        elevation = 5.dp,
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp)
    ) {
        Box(){
            NetworkImage(
                url = image.downloadUrl,
                contentDesc = image.author,
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.TopCenter),
            )

            Text(
                text = image.author.uppercase(),
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