package com.moaimar.superheroes.data

import com.moaimar.superheroes.domain.Biography
import com.moaimar.superheroes.domain.Images
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.domain.Work

class SuperHeroesDataRepository {
    fun getSuperHeroes():List<SuperHero>{

        val sh = mutableListOf<SuperHero>(
            SuperHero(
                "1",
                "pepe",
                biography = Biography("pepito"),
                work = Work("nada"),
                images = Images("1", "2", "3", "4")
            ),
            SuperHero(
                "2",
                "pepe",
                biography = Biography("pepito"),
                work = Work("nada"),
                images = Images("1", "2", "3", "4")
            )
        )
        return sh
    }
}