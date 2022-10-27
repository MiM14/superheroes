package com.moaimar.superheroes.data

import com.moaimar.superheroes.domain.*

class SuperHeroesDataRepository {
    fun getSuperHeroes(): List<SuperHero> {

        return mutableListOf(
            SuperHero(
                1,
                "pepe",
                powerStats = PowerStats(1,1,1),
                biography = Biography("pepito"),
                work = Work("nada"),
                connections = Connections("family 1"),
                "good",
                images = Images("https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/633-stargirl.jpg", "2", "3", "4")
            ),
            SuperHero(
                12,
                "Pepito",
                powerStats = PowerStats(1,1,1),
                biography = Biography("pepito grillo"),
                work = Work("nada"),
                connections = Connections("family 1"),
                "good",
                images = Images("https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/sm/620-spider-man.jpg", "2", "3", "4")
            )
        )
    }
}