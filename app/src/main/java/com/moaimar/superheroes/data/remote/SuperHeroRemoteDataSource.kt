package com.moaimar.superheroes.data.remote


import com.moaimar.superheroes.domain.SuperHero

class SuperHeroRemoteDataSource {
    private val apiClient = SuperHeroesApiService()

    fun getSuperHeroes(): List<SuperHero> = apiClient.getSuperHeroesApi().map{
        it.toDomain()
    }


}