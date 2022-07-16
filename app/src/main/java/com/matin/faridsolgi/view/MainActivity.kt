package com.matin.faridsolgi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.matin.faridsolgi.R
import com.matin.faridsolgi.view.fragments.PostFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.clMainActivityBaseFragments,
        PostFragment(),PostFragment::class.simpleName).commit()


    }
}