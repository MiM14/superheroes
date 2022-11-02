package com.moaimar.superheroes.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.app.extensions.loadUrl
import com.moaimar.superheroes.databinding.ViewItemSuperheroBinding
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.presentation.SuperHeroDetailActivity

class  SuperHeroViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private var binding: ViewItemSuperheroBinding? = null
    fun render(model: SuperHero) {
        binding = ViewItemSuperheroBinding.bind(view)
        binding?.apply {
            image.loadUrl(model.images.md)
            name.text = model.name
            realName.text = model.biography.fullName.toString()
            occupation.text = model.work.occupation.toString()
        }
        view.setOnClickListener {
            view.context.startActivity(
                SuperHeroDetailActivity.getIntent(
                    view.context,
                    model.id
                )
            )
        }
    }
}