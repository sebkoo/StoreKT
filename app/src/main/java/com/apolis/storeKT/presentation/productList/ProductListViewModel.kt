package com.apolis.storeKT.presentation.productList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apolis.storeKT.domain.model.Product
import com.apolis.storeKT.domain.usecase.GetProductsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductListViewModel(
    private val getProductsUseCase: GetProductsUseCase
) : ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products = _products.asStateFlow()

    init {
        viewModelScope.launch {
            _products.value = getProductsUseCase()
        }
    }
}