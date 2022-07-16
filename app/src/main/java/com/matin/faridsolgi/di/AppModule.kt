package com.matin.faridsolgi.di

import com.matin.faridsolgi.model.network.PostApi
import com.matin.faridsolgi.model.network.RetrofitService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    @Singleton
    fun provideRetrofit() : RetrofitService{
        return RetrofitService()
    }
}