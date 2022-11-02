package com.moaimar.superheroes.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.app.extensions.loadUrl
import com.moaimar.superheroes.databinding.ViewItemSuperherodetailBinding
import com.moaimar.superheroes.domain.Images

class SuperHeroDetailViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private var binding: ViewItemSuperherodetailBinding? = null
    fun render(image: Images) {
        binding = ViewItemSuperherodetailBinding.bind(view)
        binding?.apply {
            //DetailImage.loadUrl(image)
        }
    }
}