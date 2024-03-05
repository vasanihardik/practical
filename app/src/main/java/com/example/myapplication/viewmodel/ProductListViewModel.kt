package com.example.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.model.ProductModel
import com.example.myapplication.repository.ProductListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val productListRepository: ProductListRepository
) : ViewModel() {

    val productData = MutableLiveData<ProductModel>()


    fun getProductList() {
        viewModelScope.launch {
            productData.value = productListRepository.getProductList()
        }
    }

}