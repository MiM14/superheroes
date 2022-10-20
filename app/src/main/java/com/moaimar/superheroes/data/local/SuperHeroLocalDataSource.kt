package com.moaimar.superheroes.data.local

import android.content.SharedPreferences
import com.google.gson.Gson
import com.moaimar.app.commons.KSerializer
import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroLocalDataSource(private val sharedPref: SharedPreferences,
                               private val jSerializer: KSerializer) {

    private val editor = sharedPref.edit()

    fun saveSuperHeroes(superHeroes: List<SuperHero>) {
        superHeroes.forEach {

            saveSuperHero(it)
        }
    }

    private fun saveSuperHero(superHero: SuperHero) {
        val jsonSuperHero = jSerializer.toJson(superHero, SuperHero::class.java)
        editor.putString(superHero.id.toString(), jsonSuperHero)
        editor.apply()
    }

    fun getSuperHeroes(): List<SuperHero> {

        var superHeroList = mutableListOf<SuperHero>()

        sharedPref.all.forEach {
            val superHero = jSerializer.fromJson(it.value as String, SuperHero::class.java)
            superHeroList.add(superHero)
        }
        return superHeroList

    }

    fun findById(superHeroId: Int): SuperHeroApiModel? {
        return  sharedPref.getString(superHeroId.toString(), null)?.let{
        jSerializer.fromJson(it, SuperHeroApiModel::class.java)
        }
    }

}