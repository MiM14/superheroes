package com.moaimar.superheroes.domain

interface BiographyRepository{
    fun getBiography(superHero: SuperHero): Biography {
        return superHero.biography
    }
}