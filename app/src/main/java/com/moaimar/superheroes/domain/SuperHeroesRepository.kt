package com.moaimar.superheroes.domain

interface SuperHeroesRepository {
    fun getSuperHeroes(): List<SuperHero>
    fun getSuperHero(superHeroId: Int): SuperHero
}