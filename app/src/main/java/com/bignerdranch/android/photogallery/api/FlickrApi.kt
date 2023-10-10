package com.bignerdranch.android.photogallery.api

import retrofit2.http.GET

interface FlickrApi {
    interface FlickrApi {
        @GET("/")
        suspend fun fetchContents(): String
    }
}