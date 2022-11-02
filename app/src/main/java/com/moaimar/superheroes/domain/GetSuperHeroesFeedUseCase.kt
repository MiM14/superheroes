package com.moaimar.superheroes.domain

import com.moaimar.superheroes.data.SuperHeroDataRepository

class GetSuperHeroesFeedUseCase(private val repository: SuperHeroDataRepository){
    fun execute() = repository.getSuperHeroes()
}