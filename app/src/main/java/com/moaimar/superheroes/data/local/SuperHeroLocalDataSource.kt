package com.moaimar.superheroes.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroLocalDataSource(private val sharedPref: SharedPreferences) {
    private val gson = Gson()
    private val editor = sharedPref.edit()

    fun saveSuperHeroes(superHeroes: List<SuperHero>) {
        superHeroes.forEach {

            saveSuperHero(it)
        }
    }

    private fun saveSuperHero(superHero: SuperHero) {
        val jsonSuperHero = gson.toJson(superHero, SuperHero::class.java)
        editor.putString(superHero.id.toString(), jsonSuperHero)
        editor.apply()
    }

    fun getSuperHeroes(): List<SuperHero> {

        var superHeroList = mutableListOf<SuperHero>()

        sharedPref.all.forEach {
            val superHero = gson.fromJson(it.value as String, SuperHero::class.java)
            superHeroList.add(superHero)
        }
        return superHeroList

    }

    fun findById(superHeroId: Int): SuperHeroApiModel? {
        val jsonSuperHero = sharedPref.getString(superHeroId.toString(), null)
        return gson.fromJson(jsonSuperHero, SuperHeroApiModel::class.java)
    }

}