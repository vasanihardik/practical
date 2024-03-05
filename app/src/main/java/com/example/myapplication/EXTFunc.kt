package com.example.myapplication

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

fun ImageView.loadImage(url: String) {
   Glide.with(this).load(url).into(this)
}

fun View.gone(){
    this.visibility = View.GONE
}