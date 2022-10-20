package com.moaimar.superheroes.data.remote

import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel

class SuperHeroRemoteDataSource {
    private val apiClient = SuperHeroesApiService()

    fun getSuperHeroes(): List<SuperHeroApiModel> {
        return apiClient.getSuperHeroesApi()
    }


}