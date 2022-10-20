package com.moaimar.superheroes.domain

data class SuperHero(val id: Int, val name :String, val biography:Biography, val work:Work, val images:Images)
data class Biography(val fullName:String)
data class Work(val occupation:String)
data class Images(val xs:String, val sm:String, val md:String, val lg:String)