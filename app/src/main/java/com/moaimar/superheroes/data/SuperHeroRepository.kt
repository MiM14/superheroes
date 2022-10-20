package com.moaimar.superheroes.data

import com.moaimar.superheroes.data.local.SuperHeroLocalDataSource
import com.moaimar.superheroes.data.remote.SuperHeroRemoteDataSource
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroRepository(private val localSource : SuperHeroLocalDataSource,
                          private val remoteSource: SuperHeroRemoteDataSource) {
    fun createSuperHeroes(): List<SuperHero>{
        var superHeroes = localSource.getSuperHeroes()
        if (superHeroes.isEmpty()){
            superHeroes = remoteSource.getSuperHeroes()
            localSource.saveSuperHeroes(superHeroes)
        }
        return superHeroes

    }

    fun findSuperHeroById(SuperHeroId:Int){
        localSource.findById(SuperHeroId)
    }
}