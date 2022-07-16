package com.matin.faridsolgi.repository

import com.matin.faridsolgi.Posts
import com.matin.faridsolgi.model.network.RetrofitService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostRepository
    @Inject constructor(val retrofitService: RetrofitService)
{

        fun getPosts(page :Int , limit : Int) :Flow<Posts>{
            return flow {
                emit(retrofitService.postApi.getPosts(page,limit))
            }
        }

}