package com.example.firstbootcampapp.di

import com.example.firstbootcampapp.common.Constants
import com.example.firstbootcampapp.data.domain.PicsumAPI
import com.example.firstbootcampapp.data.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModul {

    @Provides
    @Singleton
    fun providePicsunAPI() : PicsumAPI {
      return Retrofit.Builder()
          .baseUrl(Constants.BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build()
          .create(PicsumAPI::class.java)
    }

    @Provides
    @Singleton
    fun providerepo(api: PicsumAPI): ImageRepository{
        return ImageRepository(picsumapi = api)
    }



}