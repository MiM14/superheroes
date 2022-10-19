package com.moaimar.superheroes.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel

class SuperHeroLocalDataSource(private val sharedPref: SharedPreferences) {
    private val gson = Gson()
    private val editor = sharedPref.edit()
    fun saveUsers(superHeroes: List<SuperHeroApiModel>){

        superHeroes.forEach{
            saveUser(it)
        }

    }

    private fun saveUser(superHero: SuperHeroApiModel){
        val jsonUser = gson.toJson(superHero, SuperHeroApiModel::class.java)
        val editor = sharedPref.edit()
        editor.putString(superHero.id.toString(),jsonUser)
        editor.apply()
    }
}