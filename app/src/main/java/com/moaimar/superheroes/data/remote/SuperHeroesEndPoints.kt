package com.moaimar.superheroes.data.remote

import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SuperHeroesEndPoints {
    @GET("all.json")
    fun getSuperHeroes(): Call<List<SuperHeroApiModel>>

    @GET("id/{superHeroId}.json")
    fun getSuperHero(@Path("superHeroId")id : Int):Call<SuperHeroApiModel>
}