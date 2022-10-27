package com.moaimar.superheroes.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.app.extensions.loadUrl

import com.moaimar.superheroes.R
import com.moaimar.superheroes.databinding.ViewItemSuperheroBinding
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.presentation.SuperHeroDetailActivity

class SuperHeroViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private var binding: ViewItemSuperheroBinding? = null
    private val sh = SuperHeroDetailActivity()
    fun render(model: SuperHero) {
        binding = ViewItemSuperheroBinding.bind(view)
        binding?.apply {
            image.loadUrl(model.images.xs)
            name.text = model.name
            realName.text = model.id.toString()
            occupation.text = model.work.occupation.toString()
        }
        view.setOnClickListener {
            view.context.startActivity(
                sh.createIntent(
                    view.context,
                    model.id.toInt()
                )
            )
        }
    }
}