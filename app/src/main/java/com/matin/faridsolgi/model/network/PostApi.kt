package com.matin.faridsolgi.model.network

import com.matin.faridsolgi.Posts
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PostApi {

    @GET("api/feed")
   suspend fun getPosts(@Query("page") page : Int,
                        @Query("limit") limit :Int
    ): Posts
}