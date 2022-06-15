package com.example.firstbootcampapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.firstbootcampapp.ui.theme.FirstBootcampAppTheme
import com.example.firstbootcampapp.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstBootcampAppTheme {
                FirstBootcampAppTheme {

                    window.statusBarColor = MaterialTheme.colors.primaryVariant.toArgb()

                    Surface(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = MaterialTheme.colors.onPrimary)
                            .padding(8.dp),

                        color = MaterialTheme.colors.onPrimary,
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
                            items(images) {
                                ImageCard(it)
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    FirstBootcampAppTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)

        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()

            )
            {
                Card(
                    elevation = 5.dp,
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .size(170.dp)
                ) {
                    Box(
                        modifier = Modifier
                    ) {


                        Image(
                            bitmap = ImageBitmap.imageResource(id = R.drawable.pic_1),
                            contentDescription = "Lion",
                            contentScale = ContentScale.FillWidth,
                            modifier = Modifier
                                .size(170.dp)
                                .align(Alignment.TopCenter)

                        )

                        Text(
                            text = "lion".uppercase(),
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(Color.Yellow.copy(alpha = 0.9f))
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center

                        )
                    }
                }

                Card(
                    elevation = 5.dp,
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .size(170.dp)
                ) {
                    Box(
                        modifier = Modifier
                    ) {
                        Image(
                            bitmap = ImageBitmap.imageResource(id = R.drawable.pic_1),
                            contentDescription = "horse",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .size(170.dp)
                                .align(Alignment.TopCenter)
                        )
                        Text(
                            text = "lion".uppercase(),
                            color = Color.Black,
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .background(Color.Yellow.copy(alpha = 0.9f))
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center

                        )
                    }
                }
            }
        }
    }
}
