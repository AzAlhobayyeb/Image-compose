package com.example.firstbootcampapp.ui.imagestyle

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.firstbootcampapp.ui.imagestyle.ImagesViewModel
import com.example.firstbootcampapp.ui.ImageCard
import dagger.hilt.android.lifecycle.HiltViewModel


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageScreen(viewModel: ImagesViewModel = hiltViewModel()) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.primary)
            .padding(8.dp),

        color = MaterialTheme.colors.primary,
    ) {

        LazyVerticalGrid(
            cells = GridCells.Fixed(2),

            ) {
            item(span = { GridItemSpan(4) }) {
                Text(
                    text = "hello",
                    color = MaterialTheme.colors.onPrimary,
                    textAlign = TextAlign.Center, modifier = Modifier
                        .background(color = MaterialTheme.colors.primary)
                        .fillMaxWidth()
                )
            }
            items(viewModel.getImages()) {
                ImageCard(it)
            }
        }
    }
}
