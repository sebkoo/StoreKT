package com.apolis.storeKT

import com.apolis.storeKT.domain.model.Product
import com.apolis.storeKT.domain.repository.ProductRepository
import com.apolis.storeKT.domain.usecase.GetProductsUseCase
import org.junit.Test
import org.junit.Assert.*
import kotlinx.coroutines.test.runTest
import org.mockito.Mockito.mock
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun `getProducts returns list from repository`() = runTest {
        val repo = mock<ProductRepository>()
        val productList = listOf(Product(1,"Test",1.0,"img"))
        whenever(repo.getProducts()).thenReturn(productList)

        val useCase = GetProductsUseCase(repo)
        val result = useCase()

        assertEquals(productList, result)
    }
}