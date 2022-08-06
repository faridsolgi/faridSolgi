package com.matin.faridsolgi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.matin.faridsolgi.Posts
import com.matin.faridsolgi.repository.PostRepository
import javax.inject.Inject

class PostViewModel
    @Inject constructor( postRepository: PostRepository) : ViewModel() {

        val postsLiveData :LiveData<Posts> = postRepository.getPosts(1,6).asLiveData()


}