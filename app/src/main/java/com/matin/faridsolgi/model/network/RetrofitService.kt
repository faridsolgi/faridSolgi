package com.matin.faridsolgi.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

  private companion object{
      private const val BASE_URL="https://evolute-test-db.herokuapp.com"
  }
    private val retrofitService = Retrofit.Builder()
    private val retrofit = retrofitService
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val postApi : PostApi = retrofit.create(PostApi::class.java)
}