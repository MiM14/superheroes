package com.moaimar.superheroes.data.remote

import com.moaimar.superheroes.data.remote.models.*
import com.moaimar.superheroes.domain.*

fun SuperHeroApiModel.toDomain():SuperHero{
    return SuperHero(
        this.id,
        this.name,
        this.powerstats.toDomain(),
        this.biography.toDomain(),
        this.work.toDomain(),
        this.connections.toDomain() ,
        this.images.toDomain())
}

fun PowerStatsApiModel.toDomain(): PowerStats {
    return PowerStats(this.intelligence,this.speed,this.combat)
}

fun BiographyApiModel.toDomain(): Biography {
    return Biography(this.fullName,this.alignment)
}

fun WorkApiModel.toDomain():Work{
    return Work(this.occupation)
}

fun ConnectionsApiModel.toDomain():Connections{
    return Connections(this.groupAffiliation)
}

fun ImagesApiModel.toDomain(): Images {
    return Images(this.xs,this.sm,this.md,this.lg)
}
