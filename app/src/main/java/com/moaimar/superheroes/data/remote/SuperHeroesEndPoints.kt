package com.moaimar.superheroes.data.remote

import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import retrofit2.Call
import retrofit2.http.GET

interface SuperHeroesEndPoints {
    @GET("all.json")
    fun getSuperHeroes(): Call<List<SuperHeroApiModel>>
}