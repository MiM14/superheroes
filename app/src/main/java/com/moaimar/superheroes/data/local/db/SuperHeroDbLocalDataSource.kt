package com.moaimar.superheroes.data.local.db

import com.moaimar.superheroes.data.local.SuperHeroesLocalSource
import com.moaimar.superheroes.domain.SuperHero

class SuperHeroDbLocalDataSource(): SuperHeroesLocalSource {

    override fun saveSuperHeroes(superHeroes: List<SuperHero>) {
        TODO("Not yet implemented")
    }

    override fun saveSuperHero(superHero: SuperHero) {
        TODO("Not yet implemented")
    }

    override fun getSuperHeroes(): List<SuperHero> {
        TODO("Not yet implemented")
    }

    override fun findById(superHeroId: Int): SuperHero? {
        TODO("Not yet implemented")
    }
}