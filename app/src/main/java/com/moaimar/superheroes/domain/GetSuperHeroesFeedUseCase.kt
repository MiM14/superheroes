package com.moaimar.superheroes.domain

class GetSuperHeroesFeedUseCase(private val repository: SuperHeroesRepository){
    fun execute(): List<SuperHero> {
        return repository.getSuperHeroes()
    }
}