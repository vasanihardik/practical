package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ItemProductListBinding
import com.example.myapplication.loadImage
import com.example.myapplication.model.Products

class ProductListAdapter(val list: List<Products>): RecyclerView.Adapter<ProductListAdapter.ProductItemViewHolder>() {

    inner class ProductItemViewHolder(private val binding: ItemProductListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Products) {
            binding.imgProduct.loadImage(data.thumbnail!!)
            binding.tvTitle.text = data.title
            binding.tvBrand.text = data.brand
            binding.tvPrice.text = data.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductItemViewHolder {
        return ProductItemViewHolder(ItemProductListBinding.inflate(LayoutInflater.from(parent.context),parent,false))


    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ProductItemViewHolder, position: Int) {
        holder.bind(list[position])
    }

}