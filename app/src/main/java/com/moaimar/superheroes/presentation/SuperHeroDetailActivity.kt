package com.moaimar.superheroes.presentation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moaimar.superheroes.R

class SuperHeroDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_superheroedetail)
    }
    fun createIntent(context: Context, superHeroId: Int): Intent {
        return Intent(context, SuperHeroDetailActivity::class.java)
    }
}