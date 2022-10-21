package com.moaimar.superheroes.domain

class GetSuperHeroUseCase(private val repository: SuperHeroesRepository){
    fun execute(): SuperHero {
        return repository.getSuperHero()
    }

}