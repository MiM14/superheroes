package com.moaimar.superheroes.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroLocalDataSource(private val sharedPref: SharedPreferences) {
    private val gson = Gson()
    private val editor = sharedPref.edit()
    fun saveSuperHeroes(superHeroes: List<SuperHeroApiModel>){

        superHeroes.forEach{
            saveSuperHero(it)
        }

    }

    private fun saveSuperHero(superHero: SuperHeroApiModel){
        val jsonUser = gson.toJson(superHero, SuperHeroApiModel::class.java)
        val editor = sharedPref.edit()
        editor.putString(superHero.id.toString(),jsonUser)
        editor.apply()
    }
    fun getSuperHeroes(): List<SuperHeroApiModel>{

        var superHeroList = mutableListOf<SuperHeroApiModel>()

        sharedPref.all.forEach{
            val user = gson.fromJson(it.value as String, SuperHeroApiModel::class.java)
            superHeroList.add(user)
        }
        return superHeroList

    }
}