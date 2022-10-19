package com.moaimar.superheroes.data.remote.models

data class SuperHeroApiModel(val id: Int, val name :String, val slug:String, val powerstats:PowerStatsApiModel,val appearance:AppearanceApiModel,val biography:BiographyApiModel, val work:WorkApiModel,val connections:ConnectionsApiModel,val images:ImagesApiModel)
data class PowerStatsApiModel(val intelligence: Int, val strength:Int,val speed:Int,val durability:Int, val power:Int, val combat:Int)
data class AppearanceApiModel(val gender:String, val race:String, val height:List<String>,val weight:List<String>,val eyeColor:String,val hairColor:String)
data class BiographyApiModel(val fullName:String, val alterEgo:String, val aliases:List<String>, val placeOfBirth:String, val firstAppearance:String, val publisher:String, val alignment:String)
data class WorkApiModel(val occupation:String,val base:String)
data class ConnectionsApiModel(val groupAffiliation:String, val relative:String)
data class ImagesApiModel(val xs:String,val sm:String,val md:String,val lg:String)
