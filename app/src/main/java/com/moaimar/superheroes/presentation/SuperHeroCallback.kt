package com.moaimar.superheroes.presentation

import com.moaimar.superheroes.domain.SuperHero

interface SuperHeroesCallback {
    fun onCall(superHeroes: List<SuperHero>)
}