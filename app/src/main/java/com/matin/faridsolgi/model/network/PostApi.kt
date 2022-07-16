package com.matin.faridsolgi.model.network

import com.matin.faridsolgi.Posts
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path

interface PostApi {

    @GET("api/feed/?page={page}&limit={limit}")
   suspend fun getPosts(@Path("page") page : Int ,
    @Path("limit") limit :Int
    ): Posts
}