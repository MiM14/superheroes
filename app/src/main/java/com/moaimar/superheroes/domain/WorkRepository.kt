package com.moaimar.superheroes.domain

interface WorkRepository{
    fun getWork(superHero: SuperHero): Work {
        return superHero.work
    }
}