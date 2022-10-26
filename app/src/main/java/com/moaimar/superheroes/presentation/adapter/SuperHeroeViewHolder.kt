package com.moaimar.superheroes.presentation.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.app.extensions.loadUrl
import com.moaimar.superheroes.R
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun render(model: SuperHero) {
        view.findViewById<ImageView>(R.id.image).loadUrl(
            model.images.xs
        )
        view.findViewById<TextView>(R.id.name).text = model.name
        view.findViewById<TextView>(R.id.real_name).text = model.id.toString()
    }
}