package com.matin.faridsolgi

import com.google.gson.annotations.SerializedName

data class Posts(

	@field:SerializedName("total")
	val total: Int,

	@field:SerializedName("docs")
	val docs: List<DocsItem>,

	@field:SerializedName("limit")
	val limit: Int,

	@field:SerializedName("hasMore")
	val hasMore: Boolean
)

data class Author(

	@field:SerializedName("invitedCount")
	val invitedCount: Int,

	@field:SerializedName("isVerified")
	val isVerified: Boolean,

	@field:SerializedName("savedPostsCount")
	val savedPostsCount: Int,

	@field:SerializedName("language")
	val language: String,

	@field:SerializedName("avatar")
	val avatar: String,

	@field:SerializedName("emailNotificationIsOn")
	val emailNotificationIsOn: Boolean,

	@field:SerializedName("userBolckedCount")
	val userBolckedCount: Int,

	@field:SerializedName("commentCount")
	val commentCount: Int,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("getLikedCount")
	val getLikedCount: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("postCount")
	val postCount: Int,

	@field:SerializedName("likedPostsCount")
	val likedPostsCount: Int,

	@field:SerializedName("_id")
	val id: String,

	@field:SerializedName("updatedAt")
	val updatedAt: String
)

data class MediaItem(

	@field:SerializedName("mediaType")
	val mediaType: String,

	@field:SerializedName("_id")
	val id: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("thumbnailUrl")
	val thumbnailUrl: String
)

data class Manufacturer(

	@field:SerializedName("isPartner")
	val isPartner: Boolean,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("isSubscribed")
	val isSubscribed: Boolean,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("language")
	val language: String,

	@field:SerializedName("_id")
	val id: String,

	@field:SerializedName("categories")
	val categories: List<String>,

	@field:SerializedName("followersCount")
	val followersCount: Int,

	@field:SerializedName("publicMail")
	val publicMail: String,

	@field:SerializedName("website")
	val website: String,

	@field:SerializedName("telefon")
	val telefon: String,

	@field:SerializedName("imageUrl")
	val imageUrl: String,

	@field:SerializedName("description")
	val description: String
)

data class DocsItem(

	@field:SerializedName("hasOwnerAnswer")
	val hasOwnerAnswer: Boolean,

	@field:SerializedName("publishedAt")
	val publishedAt: String,

	@field:SerializedName("isPublished")
	val isPublished: Boolean,

	@field:SerializedName("author")
	val author: Author,

	@field:SerializedName("isMyPost")
	val isMyPost: Boolean,

	@field:SerializedName("media")
	val media: List<MediaItem>,

	@field:SerializedName("liked")
	val liked: Boolean,

	@field:SerializedName("manufacturer")
	val manufacturer: Manufacturer,

	@field:SerializedName("commentCount")
	val commentCount: Int,

	@field:SerializedName("ownerAnswer")
	val ownerAnswer: String,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("likesCount")
	val likesCount: Int,

	@field:SerializedName("isSaved")
	val isSaved: Boolean,

	@field:SerializedName("_id")
	val id: String,

	@field:SerializedName("text")
	val text: String,

	@field:SerializedName("isReported")
	val isReported: Boolean,

	@field:SerializedName("manuType")
	val manuType: String,

	@field:SerializedName("updatedAt")
	val updatedAt: String,

	@field:SerializedName("status")
	val status: String
)
