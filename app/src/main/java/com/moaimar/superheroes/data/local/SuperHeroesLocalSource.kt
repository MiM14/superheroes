package com.moaimar.superheroes.data.local

import com.moaimar.superheroes.domain.SuperHero

interface SuperHeroesLocalSource {
    fun saveSuperHeroes(superHeroes: List<SuperHero>)
    fun saveSuperHero(superHero: SuperHero)
    fun getSuperHeroes(): List<SuperHero>
    fun findById(superHeroId: Int): SuperHero?
}