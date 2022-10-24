package com.moaimar.superheroes.data.remote


import com.moaimar.superheroes.domain.SuperHero

class SuperHeroRemoteDataSource {
    private val apiClient = SuperHeroesApiService()

    fun getSuperHeroes(): List<SuperHero> = apiClient.getSuperHeroesApi().map{
        it.toDomain()
    }

    fun getSuperHero(superHeroId: Int): SuperHero = apiClient.getSuperHero(superHeroId)!!.toDomain()
}