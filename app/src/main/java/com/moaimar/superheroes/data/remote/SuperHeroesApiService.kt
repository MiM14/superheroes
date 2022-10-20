package com.moaimar.superheroes.data.remote

import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SuperHeroesApiService {
    private val urlEndPoint = "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/"
    private var apiEndPoints: SuperHeroesEndPoints

    init {
        apiEndPoints =buildApiEndPoint()
    }

    private fun buildClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlEndPoint)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buildApiEndPoint() : SuperHeroesEndPoints{
        return buildClient().create(SuperHeroesEndPoints::class.java)
    }

    fun getSuperHeroesApi(): List<SuperHeroApiModel>{
        val callSuperHeroes = apiEndPoints.getSuperHeroes()
        val response = callSuperHeroes.execute()
        return if(response.isSuccessful){
            //Not-Null Assertion
            response.body()!!
        }else{
            emptyList()
        }
    }
}