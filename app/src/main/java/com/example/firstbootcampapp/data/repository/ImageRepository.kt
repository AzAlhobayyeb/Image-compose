package com.example.firstbootcampapp.data.repository

import com.example.firstbootcampapp.common.Response
import com.example.firstbootcampapp.data.domain.ImageData
import com.example.firstbootcampapp.data.domain.PicsumAPI
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val picsumapi: PicsumAPI
) {

    suspend fun getImages(): List<ImageData> {
        return picsumapi.getImages()
    }

    fun getAllImages(): Flow<Response<List<ImageData>>> = flow {
        try {
            emit(Response.Loading<List<ImageData>>())
            val images = getImages()
            emit(Response.Success<List<ImageData>>(images))
        } catch (e: HttpException){
            emit(Response.Error<List<ImageData>>("error try later *_*"))
        }
    }
}