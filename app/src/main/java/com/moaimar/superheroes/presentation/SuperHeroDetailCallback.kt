package com.moaimar.superheroes.presentation

import com.moaimar.superheroes.domain.SuperHero

interface SuperHeroDetailCallback {
    fun onCall(superHero:SuperHero)
}