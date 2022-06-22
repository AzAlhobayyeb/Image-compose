package com.example.firstbootcampapp.data.repository

import com.example.firstbootcampapp.common.Response
import com.example.firstbootcampapp.data.domain.ImageData
import com.example.firstbootcampapp.data.domain.PicsumAPI
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val picsumApi: PicsumAPI
) {

    suspend fun getImages(): List<ImageData> {
        return picsumApi.getImages()
    }

    fun getAllImages(): Flow<Response<List<ImageData>>> = flow {
        try {
            emit(Response.Loading<List<ImageData>>())
            val images = getImages()
            emit(Response.Success<List<ImageData>>(images))
        } catch (e: HttpException){
            emit(Response.Error<List<ImageData>>(e.localizedMessage?: "something went wrong"))
        }
        catch (e: IOException){
            emit(Response.Error<List<ImageData>>("Failed to connect to server"))
        }
    }
}