package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

data class ProductModel(

    @SerializedName("products") var products: ArrayList<Products> = arrayListOf(),
    @SerializedName("total") var total: Int? = null,
    @SerializedName("skip") var skip: Int? = null,
    @SerializedName("limit") var limit: Int? = null

)