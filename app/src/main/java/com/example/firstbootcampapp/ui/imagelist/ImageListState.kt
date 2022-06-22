package com.example.firstbootcampapp.ui.imagelist

import com.example.firstbootcampapp.common.Response
import com.example.firstbootcampapp.data.domain.ImageData

data class ImageListState(
    val isLoading: Boolean = false,
    val error: String = "",
    val images: List<ImageData> = emptyList()
)
