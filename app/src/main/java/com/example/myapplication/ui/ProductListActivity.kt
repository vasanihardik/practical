package com.example.myapplication.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.adapter.ProductListAdapter
import com.example.myapplication.databinding.ActivityProductListBinding
import com.example.myapplication.gone
import com.example.myapplication.viewmodel.ProductListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProductListActivity : AppCompatActivity() {
    lateinit var binding : ActivityProductListBinding

    private val  viewModel : ProductListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.getProductList()
        viewModel.productData.observe(this) {
            it?.let {
                binding.rvProductList.setHasFixedSize(true)
                binding.rvProductList.adapter = ProductListAdapter(it.products)
                binding.progress.gone()
            }
        }
    }

}
