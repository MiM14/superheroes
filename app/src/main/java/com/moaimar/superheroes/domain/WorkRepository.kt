package com.moaimar.superheroes.domain

class WorkRepository{
    fun getWork(superHero: SuperHero): Work {
        return superHero.work
    }
}