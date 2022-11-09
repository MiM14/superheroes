package com.moaimar.superheroes.domain

data class SuperHero(val id: Int, val name :String, val powerstats: PowerStats ,val biography:Biography,val work:Work,val connections: Connections ,val images:Images)
data class PowerStats(val intelligence: String, val speed: String, val combat: String)
data class Biography(val fullName:String,val alignment: String)
data class Work(val occupation:String)
data class Connections(val groupAffiliation:String)
data class Images(val xs:String, val sm:String, val md:String, val lg:String)
