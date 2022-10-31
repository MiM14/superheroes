package com.moaimar.superheroes.data

import com.moaimar.superheroes.data.local.xml.SuperHeroXmlLocalDataSource
import com.moaimar.superheroes.data.remote.SuperHeroRemoteDataSource
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroRepository(private val localSource : SuperHeroXmlLocalDataSource,
                          private val remoteSource: SuperHeroRemoteDataSource) {
    fun createSuperHeroes(): List<SuperHero>{
        var superHeroes = localSource.getSuperHeroes()
        if (superHeroes.isEmpty()){
            superHeroes = remoteSource.getSuperHeroes()
            localSource.saveSuperHeroes(superHeroes)
        }
        return superHeroes
    }

    fun findSuperHeroById(superHeroId:Int): SuperHero{
        var superHero = localSource.findById(superHeroId)
        if (superHero==null){
            superHero = remoteSource.getSuperHero(superHeroId)
            localSource.saveSuperHero(superHero)
        }
        return superHero
    }
}