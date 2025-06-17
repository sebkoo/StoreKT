package com.apolis.storeKT.data.repository

import com.apolis.storeKT.data.remote.StoreAPI
import com.apolis.storeKT.domain.model.Product
import com.apolis.storeKT.domain.repository.ProductRepository

class ProductRepositoryImpl(
    private val api: StoreAPI
) : ProductRepository {
    override suspend fun getProducts(): List<Product> =
        api.getProducts().map { it.toProduct() }
}