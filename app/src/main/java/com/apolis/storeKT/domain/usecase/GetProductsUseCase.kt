package com.apolis.storeKT.domain.usecase

import com.apolis.storeKT.domain.model.Product
import com.apolis.storeKT.domain.repository.ProductRepository

class GetProductsUseCase(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(): List<Product> = repository.getProducts()
}