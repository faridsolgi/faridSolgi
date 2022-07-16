package com.matin.faridsolgi.view.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.matin.faridsolgi.R
import com.matin.faridsolgi.adapter.PostAdapter
import com.matin.faridsolgi.viewmodel.PostViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PostFragment : Fragment() {
    @Inject
     lateinit var viewModel:PostViewModel
     @Inject
     lateinit var postAdapter: PostAdapter
    private  lateinit var recylerviewPosts : RecyclerView

    private val TAG = "PostFragment"
    private lateinit var prvView :View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // init views
        prvView = inflater.inflate(R.layout.fragment_post,container,false)
        recylerviewPosts = prvView.findViewById(R.id.rvPostFragment)
        recylerviewPosts.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)


        //observe live data
        viewModel.PostsLiveData.observe(viewLifecycleOwner
        ){
            // init recyclerview
            if (it!=null){
                postAdapter.addItemList(it.docs)
                recylerviewPosts.adapter=postAdapter
            }else
            {
                Log.i(TAG, "onCreateView: error happend null posts")
            }
            Log.i(TAG, "onCreateView: ${it.docs[0].author}")
        }





        return prvView
    }



}