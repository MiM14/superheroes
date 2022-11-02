package com.moaimar.superheroes.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.superheroes.R
import com.moaimar.superheroes.domain.Images

class SuperHeroDetailAdapter : RecyclerView.Adapter<SuperHeroDetailViewHolder>() {
    private val dataSet: MutableList<Images> = mutableListOf()

    fun loadList(images: List<Images>) {
        dataSet.clear()
        dataSet.addAll(images)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroDetailViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_superhero, parent, false)
        return SuperHeroDetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroDetailViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

}