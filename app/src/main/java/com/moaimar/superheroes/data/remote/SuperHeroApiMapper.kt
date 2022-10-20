package com.moaimar.superheroes.data.remote

import com.moaimar.superheroes.data.remote.models.BiographyApiModel
import com.moaimar.superheroes.data.remote.models.ImagesApiModel
import com.moaimar.superheroes.data.remote.models.SuperHeroApiModel
import com.moaimar.superheroes.data.remote.models.WorkApiModel
import com.moaimar.superheroes.domain.Biography
import com.moaimar.superheroes.domain.Images
import com.moaimar.superheroes.domain.SuperHero
import com.moaimar.superheroes.domain.Work

fun SuperHeroApiModel.toDomain():SuperHero{
    return SuperHero(this.id, this.name, this.biography.toDomain() , this.work.toDomain(), this.images.toDomain())
}

fun BiographyApiModel.toDomain(): Biography {
    return Biography(this.fullName)
}

fun WorkApiModel.toDomain():Work{
    return Work(this.occupation)
}

fun ImagesApiModel.toDomain(): Images {
    return Images(this.xs,this.sm,this.md,this.lg)
}
