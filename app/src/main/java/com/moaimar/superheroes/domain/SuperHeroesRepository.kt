package com.moaimar.superheroes.domain

interface SuperHeroesRepository {
    fun saveSuperHeroes(superHeroes: List<SuperHero>)
    fun getSuperHeroes(): List<SuperHero>
    fun getSuperHero(superHeroId: Int): SuperHero
}