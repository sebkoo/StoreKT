package com.apolis.storeKT.data.remote.dto

import com.apolis.storeKT.domain.model.Product

data class ProductDTO(
    val id: Int,
    val title: String,
    val price: Double,
    val image: String
) {
    fun toProduct(): Product = Product(id, title, price, image)
}
