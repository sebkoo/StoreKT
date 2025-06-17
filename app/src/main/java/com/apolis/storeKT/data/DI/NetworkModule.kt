package com.apolis.storeKT.data.DI

import com.apolis.storeKT.data.remote.StoreAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    val api: StoreAPI by lazy {
        Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(StoreAPI::class.java)
    }
}