package com.moaimar.superheroes.presentation
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.moaimar.superheroes.R
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.databinding.ActivitySuperheroeslistBinding
import com.moaimar.superheroes.presentation.adapter.SuperHeroAdapter

class SuperHeroesListActivity : AppCompatActivity() {

    private var binding: ActivitySuperheroeslistBinding? = null
    private var superHeroAdapter: SuperHeroAdapter = SuperHeroAdapter()

    private val viewModel by lazy {
        SuperHeroesFactory.getViewModel(
            applicationContext,
            getSharedPreferences("", MODE_PRIVATE)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
        loadSuperHeroes()
    }

    private fun setupView() {
        binding = ActivitySuperheroeslistBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {
            listSuperheroes.adapter = superHeroAdapter
            val verticalLayout = LinearLayoutManager(this@SuperHeroesListActivity)
            verticalLayout.orientation = LinearLayoutManager.VERTICAL
            listSuperheroes.layoutManager = verticalLayout
        }
    }

    private fun loadSuperHeroes() {
        viewModel.obtainSuperHeroes(object : SuperHeroesCallback {
            override fun onCall(superHeroes: List<SuperHero>) {
                updateList(superHeroes)
            }
        })
    }

    private fun updateList(superHeroes: List<SuperHero>) {
        superHeroAdapter.loadList(superHeroes)
    }
}