package com.example.myapplication.service

import com.example.myapplication.model.ProductModel
import retrofit2.Response
import retrofit2.http.GET

interface ProductListService {

    @GET("/products")
    suspend fun getProduct(): Response<ProductModel>
}