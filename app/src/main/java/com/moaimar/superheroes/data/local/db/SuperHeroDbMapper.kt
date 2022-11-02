package com.moaimar.superheroes.data.local.db

import com.moaimar.superheroes.domain.*

fun SuperHeroEntity.toDomain() = SuperHero(this.id, this.name, this.powerStats.toDomain() ,this.biography.toDomain(),this.work.toDomain(),this.connections.toDomain(),this.images.toDomain())

fun PowerStats.toDomain(): PowerStats{
    return PowerStats(this.intelligence,this.speed,this.combat)
}

fun Biography.toDomain(): Biography {
    return Biography(this.fullName,this.alignment)
}

fun Work.toDomain():Work{
    return Work(this.occupation)
}
fun Connections.toDomain():Connections{
    return Connections(this.groupAffiliation)
}
fun Images.toDomain(): Images {
    return Images(this.xs,this.sm,this.md,this.lg)
}