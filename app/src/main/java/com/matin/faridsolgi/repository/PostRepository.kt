package com.matin.faridsolgi.repository

import android.util.Log
import com.matin.faridsolgi.DocsItem
import com.matin.faridsolgi.Posts
import com.matin.faridsolgi.model.MediaType
import com.matin.faridsolgi.model.network.RetrofitService
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class PostRepository
    @Inject constructor(val retrofitService: RetrofitService)
{
    private  val TAG = "PostRepository"

        fun getPosts(page :Int, limit : Int) : Flow<Posts> = flow{
           emit( retrofitService.postApi.getPosts(page,limit))
        }

            .catch {
                Log.i(TAG, "getDocs: ")
            }


}