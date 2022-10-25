package com.moaimar.superheroes.data.local.db

import com.moaimar.superheroes.domain.Biography
import com.moaimar.superheroes.domain.Images
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.domain.Work

fun SuperHeroEntity.toDomain() = SuperHero(this.id, this.name, this.biography.toDomain() , this.work.toDomain(), this.images.toDomain())

fun Biography.toDomain(): Biography {
    return Biography(this.fullName)
}

fun Work.toDomain():Work{
    return Work(this.occupation)
}

fun Images.toDomain(): Images {
    return Images(this.xs,this.sm,this.md,this.lg)
}