package com.moaimar.superheroes.data

import com.moaimar.superheroes.data.local.xml.SuperHeroXmlLocalDataSource
import com.moaimar.superheroes.data.remote.SuperHeroRemoteDataSource
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.domain.SuperHeroesRepository

class SuperHeroDataRepository(private val localSource : SuperHeroXmlLocalDataSource,
                              private val remoteSource: SuperHeroRemoteDataSource): SuperHeroesRepository {

    override fun getSuperHeroes(): List<SuperHero>{
        var superHeroes = localSource.getSuperHeroes()
        if (superHeroes.isEmpty()){
            superHeroes = remoteSource.getSuperHeroes()
            localSource.saveSuperHeroes(superHeroes)
        }
        return superHeroes
    }

    override fun getSuperHero(superHeroId:Int): SuperHero{
        var superHero = localSource.findById(superHeroId)
        if (superHero==null){
            superHero = remoteSource.getSuperHero(superHeroId)
            localSource.saveSuperHero(superHero)
        }
        return superHero
    }
}