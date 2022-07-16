package com.matin.faridsolgi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.ViewUtils
import androidx.recyclerview.widget.RecyclerView
import com.matin.faridsolgi.DocsItem
import com.matin.faridsolgi.Posts
import com.matin.faridsolgi.R
import com.squareup.picasso.Picasso
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject

class PostAdapter
    @Inject constructor(@ActivityContext val context: Context): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    private var itemList : List<DocsItem> = arrayListOf()

    fun addItemList(itemList: List<DocsItem> ){
        this.itemList=itemList
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val layoutInflater :LayoutInflater =LayoutInflater.from(context)
      val layoutView=  layoutInflater.inflate(R.layout.list_item_posts,
       parent,false )

        return PostViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
      holder.bindItem(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size



    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        lateinit var authorName :TextView
        lateinit var postImage :ImageView
        lateinit var isPartner :ImageView
        lateinit var manufacturerName :TextView
        lateinit var menuType :TextView
        lateinit var textBody :TextView

        init {
            authorName= itemView.findViewById(R.id.tvAuthorNamePostItem)
            postImage= itemView.findViewById(R.id.imageViewPostItem)
            isPartner= itemView.findViewById(R.id.imageViewIsPartnerPostItem)
            manufacturerName= itemView.findViewById(R.id.tvManufacturerNamePostItem)
            menuType= itemView.findViewById(R.id.tvMenuTypePostItem)
            textBody= itemView.findViewById(R.id.tvDocsTextPostItem)
        }

        fun  bindItem(docsItem :DocsItem){
            if (docsItem.media.size>0){
                if (docsItem.media[0].mediaType.equals("image")){
                    authorName.text= docsItem.author.name
                    Picasso.get()
                        .load(docsItem.media[0].url)
                        .into(postImage)
                    if (docsItem.manufacturer.isPartner)
                        isPartner.visibility= View.VISIBLE
                    else
                        isPartner.visibility = View.INVISIBLE
                    manufacturerName.text= docsItem.manufacturer.name
                    menuType.text=docsItem.manuType
                    textBody.text=docsItem.text
                }
            }

            }

        }

    }

