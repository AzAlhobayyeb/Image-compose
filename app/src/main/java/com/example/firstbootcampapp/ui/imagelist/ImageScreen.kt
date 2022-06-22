package com.example.firstbootcampapp.ui.imagelist

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.firstbootcampapp.ui.ImageCard


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageScreen(viewModel: ImagesViewModel = hiltViewModel()) {
    val  state = viewModel.state.value
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.primary)
            .padding(8.dp),

        color = MaterialTheme.colors.primary,
    ) {
    when{
        state.isLoading ->{
          Box(contentAlignment = Alignment.Center,
          modifier = Modifier.fillMaxSize()) {
              CircularProgressIndicator()
          }
        }
        
        state.error.isNotEmpty() ->{
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()) {
                Text(text = state.error)
            }
            
            
        }
        state.images.isNotEmpty()->{
            LazyVerticalGrid(
                cells = GridCells.Adaptive(180.dp),

                ) {
                item(span = { GridItemSpan(2) }) {
                    Text(
                        text = "hello this is my image store welcome all of you",
                        color = MaterialTheme.colors.onPrimary,
                        textAlign = TextAlign.Center, modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                Log.e("ImageScreen", "Hereee ${state.images}")
                items(state.images) {
                    Log.e("ImagesScreen", "${state.images}")
                    ImageCard(it)
                }
            }
            
        }
        
        
    }
    }
}
