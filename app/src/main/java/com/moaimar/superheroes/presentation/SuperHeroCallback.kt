package com.moaimar.superheroes.presentation

import com.moaimar.superheroes.domain.SuperHero

interface SuperHeroCallback {
    fun onCall(superHeroes: List<SuperHero>)
}