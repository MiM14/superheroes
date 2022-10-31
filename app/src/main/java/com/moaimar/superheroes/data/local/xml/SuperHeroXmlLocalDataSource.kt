package com.moaimar.superheroes.data.local.xml

import android.content.SharedPreferences
import com.moaimar.app.commons.KSerializer
import com.moaimar.superheroes.data.local.SuperHeroesLocalSource
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroXmlLocalDataSource(val sharedPref: SharedPreferences,
                                  val jSerializer: KSerializer): SuperHeroesLocalSource {

    private val editor = sharedPref.edit()

    override fun saveSuperHeroes(superHeroes: List<SuperHero>) {
        superHeroes.forEach {

            saveSuperHero(it)
        }
    }

    override fun saveSuperHero(superHero: SuperHero) {
        val jsonSuperHero = jSerializer.toJson(superHero, SuperHero::class.java)
        editor.putString(superHero.id.toString(), jsonSuperHero)
        editor.apply()
    }


    override fun getSuperHeroes(): List<SuperHero> = sharedPref.all.map {
        jSerializer.fromJson(it.value as String, SuperHero::class.java)
    }

    override fun findById(superHeroId: Int): SuperHero?{
        return  sharedPref.getString(superHeroId.toString(), null)?.let{
            jSerializer.fromJson(it, SuperHero::class.java)
        }
    }
}


