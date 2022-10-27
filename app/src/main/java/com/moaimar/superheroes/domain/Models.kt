package com.moaimar.superheroes.domain

data class SuperHero(val id: Int, val name:String,val powerStats:PowerStats,val biography:Biography,val work:Work,val connections: Connections,val alignment: String,val images:Images)
data class PowerStats(val intelligence:Int, val speed:Int,val combat:Int)
data class Biography(val fullName:String)
data class Work(val occupation:String)
data class Connections(val groupAffiliation:String)
data class Images(val xs:String, val sm:String, val md:String, val lg:String)