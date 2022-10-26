package com.moaimar.superheroes.domain

import com.moaimar.superheroes.data.SuperHeroesDataRepository

class GetSuperHeroesFeedUseCase(private val repository: SuperHeroesDataRepository){
    fun execute(): List<SuperHero> {
        return repository.getSuperHeroes()
    }
}