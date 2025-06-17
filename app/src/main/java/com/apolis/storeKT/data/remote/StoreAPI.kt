package com.apolis.storeKT.data.remote

import com.apolis.storeKT.data.remote.dto.ProductDTO
import retrofit2.http.GET

interface StoreAPI {
    @GET("products")
    suspend fun getProducts(): List<ProductDTO>
}