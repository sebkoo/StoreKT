package com.apolis.storeKT

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.apolis.storeKT.data.DI.NetworkModule
import com.apolis.storeKT.data.repository.ProductRepositoryImpl
import com.apolis.storeKT.domain.usecase.GetProductsUseCase
import com.apolis.storeKT.presentation.productList.ProductListScreen
import com.apolis.storeKT.presentation.productList.ProductListViewModel
import com.apolis.storeKT.presentation.productList.ProductListViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val api = NetworkModule.api
            val repo = ProductRepositoryImpl(api)
            val useCase = GetProductsUseCase(repo)
            val factory = ProductListViewModelFactory(useCase)

            val viewModel: ProductListViewModel = viewModel(factory = factory)
            ProductListScreen(viewModel)
        }
    }
}
