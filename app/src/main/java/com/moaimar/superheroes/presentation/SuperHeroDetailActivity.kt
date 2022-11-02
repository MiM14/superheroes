package com.moaimar.superheroes.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.moaimar.app.extensions.loadUrl
import com.moaimar.superheroes.databinding.ActivitySuperheroedetailBinding
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.presentation.adapter.SuperHeroDetailAdapter

class SuperHeroDetailActivity : AppCompatActivity() {
    private var binding: ActivitySuperheroedetailBinding? = null
    private var superHeroAdapter: SuperHeroDetailAdapter = SuperHeroDetailAdapter()
    private var detailViewModel: SuperHeroDetailViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        loadSuperHeroes()
    }

    private fun setupView() {
        binding = ActivitySuperheroedetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        detailViewModel = SuperHeroesFactory.getDetailViewModel(this)
        binding?.apply {
            superheroesListImages.adapter = superHeroAdapter
            val horizontalLayout = LinearLayoutManager(this@SuperHeroDetailActivity)
            horizontalLayout.orientation = LinearLayoutManager.HORIZONTAL
            superheroesListImages.layoutManager = horizontalLayout
        }

    }

    private fun loadSuperHeroes() {
        val superHeroId = intent.extras?.getInt(SUPERHERO_ID)!!
        detailViewModel?.obtainSuperHero(object : SuperHeroDetailCallback {
            override fun onCall(superHero:SuperHero) {
                //updateList(superHero)
                bind(superHero)
            }
        }, superHeroId)
    }
    private fun updateList(superHero:SuperHero) {
        val images = mutableListOf(superHero.images)
        superHeroAdapter.loadList(images)
    }

    private fun bind(model:SuperHero) {
        binding?.apply {
            mainImage.loadUrl(model.images.lg)
            name.text = model.name
            alignment.text = model.biography.alignment
            fullName.text = model.biography.fullName
            groupAffiliation.text = model.connections.groupAffiliation
            intelligence.text = model.powerstats.intelligence
            speed.text = model.powerstats.speed.toString()
            combat.text = model.powerstats.combat.toString()
        }
    }

    companion object {
        private const val SUPERHERO_ID = "SUPERHERO_ID"
        fun getIntent(context: Context, superHeroId: Int)= Intent(context, SuperHeroDetailActivity::class.java)
            .putExtra(SUPERHERO_ID, superHeroId)
    }
}