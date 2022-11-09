package com.moaimar.superheroes.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moaimar.superheroes.R

class SuperHeroDetailAdapter : RecyclerView.Adapter<SuperHeroDetailViewHolder>() {
    private val dataSet: MutableList<String> = mutableListOf()

    fun loadList(images: List<String>) {
        dataSet.clear()
        dataSet.addAll(images)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroDetailViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item_superherodetail,parent, false)
        return SuperHeroDetailViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuperHeroDetailViewHolder, position: Int) {
        holder.render(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

}