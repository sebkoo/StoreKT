package com.apolis.storeKT.domain.repository

import com.apolis.storeKT.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
}