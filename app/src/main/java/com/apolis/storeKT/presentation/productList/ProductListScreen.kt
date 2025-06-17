package com.apolis.storeKT.presentation.productList

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.material3.Text

@Composable
fun ProductListScreen(viewModel: ProductListViewModel) {
    val products by viewModel.products.collectAsState()

    LazyColumn {
        items(products) { product ->
            Text(text = product.title)
        }
    }
}