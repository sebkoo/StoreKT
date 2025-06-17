package com.apolis.storeKT.presentation.productList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.apolis.storeKT.domain.usecase.GetProductsUseCase

class ProductListViewModelFactory(
    private val useCase: GetProductsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        ProductListViewModel(useCase) as T
}