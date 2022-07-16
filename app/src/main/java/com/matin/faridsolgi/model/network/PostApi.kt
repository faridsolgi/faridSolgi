package com.matin.faridsolgi.model.network

import retrofit2.http.GET
import retrofit2.http.Path

interface PostApi {

    @GET("api/feed/?page={page}&limit={limit}")
    fun getPosts(@Path("page") page : Int ,
    @Path("limit") limit :Int
    )
}