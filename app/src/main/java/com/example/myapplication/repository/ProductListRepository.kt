package com.example.myapplication.repository

import com.example.myapplication.model.ProductModel
import com.example.myapplication.service.ProductListService
import javax.inject.Inject

class ProductListRepository @Inject constructor(
    private val productListService: ProductListService
) {


    suspend fun getProductList(): ProductModel? {
        var model: ProductModel? = null
        try {
            val response = productListService.getProduct()
            model = response.body()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return model;
    }
}