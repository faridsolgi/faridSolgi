package com.matin.faridsolgi.view.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.matin.faridsolgi.R
import com.matin.faridsolgi.adapter.PostAdapter
import com.matin.faridsolgi.model.MediaType
import com.matin.faridsolgi.viewmodel.PostViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PostFragment : Fragment() {
    @Inject
    lateinit var viewModel: PostViewModel

    @Inject
    lateinit var postAdapter: PostAdapter
    private lateinit var recylerviewPosts: RecyclerView

    private val TAG = "PostFragment"
    private lateinit var prvView: View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // init views
        prvView = inflater.inflate(R.layout.fragment_post, container, false)
        recylerviewPosts = prvView.findViewById(R.id.rvPostFragment)
        recylerviewPosts.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        //observe live data
        viewModel.postsLiveData.observe(
            viewLifecycleOwner
        ) {
            posts->
            // init recyclerview
            if (posts != null) {
                var docsImageList= posts
                    .docs
                    .filter {
                 docsItem ->
                    docsItem
                        .media.any {
                            it
                                .mediaType
                                .equals(MediaType.Image.value, true)
                        }
                }
                postAdapter.addItemList(docsImageList)
                recylerviewPosts.adapter = postAdapter
            } else {
                Log.i(TAG, "onCreateView: error happend null posts")
            }
        }





        return prvView
    }


}