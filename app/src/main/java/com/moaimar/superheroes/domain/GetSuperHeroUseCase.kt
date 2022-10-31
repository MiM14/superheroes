package com.moaimar.superheroes.domain

class GetSuperHeroUseCase(private val repository: SuperHeroesRepository){
    fun execute(superHeroId: Int): SuperHero {
        return repository.getSuperHero(superHeroId)
    }

}