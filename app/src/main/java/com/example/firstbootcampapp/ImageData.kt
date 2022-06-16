package com.example.firstbootcampapp

data class ImageData(val title: String, val photoPath: Int, val id: Int)

val images = mutableListOf<ImageData>(
    ImageData("lion", R.drawable.pic_1, 1),
    ImageData("hores", R.drawable.pic_2, 2),
    ImageData("bird", R.drawable.pic_3, 3),
    ImageData("frog", R.drawable.pic_4, 4),
    ImageData("elephant", R.drawable.pic_5, 5),
    ImageData("duck", R.drawable.pic_6, 6),
    ImageData("beach", R.drawable.pic_7, 7),
    ImageData("cat", R.drawable.pic_8, 8),
)