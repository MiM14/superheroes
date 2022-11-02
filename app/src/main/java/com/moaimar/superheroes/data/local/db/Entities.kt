package com.moaimar.superheroes.data.local.db

import androidx.room.*
import com.moaimar.superheroes.domain.*

const val SUPERHEROES_TABLA_NAME = "superheroes"
const val POWERSTATS_TABLE_NAME = "powerstats"
const val BIOGRAPHY_TABLE_NAME = "biography"
const val WORK_TABLE_NAME = "work"
const val CONNECTIONS_TABLE_NAME = "connections"
const val IMAGES_TABLE_NAME = "images"
@Entity(tableName = SUPERHEROES_TABLA_NAME)
data class SuperHeroEntity(
    @PrimaryKey @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @Embedded val powerStats: PowerStats,
    @Embedded val biography: Biography,
    @Embedded val work: Work,

    @Embedded val connections: Connections,
    @Embedded val images: Images
    )

@Entity(tableName = POWERSTATS_TABLE_NAME)
data class PowerStatsEntity(
    @ColumnInfo(name="intelligence")val xs:Int,
    @ColumnInfo(name="speed")val sm:Int,
    @ColumnInfo(name="combat")val md:Int,
)

@Entity(tableName = BIOGRAPHY_TABLE_NAME)
data class BiographyEntity(
    @ColumnInfo(name="full_name")val full_name:String,
    @ColumnInfo(name = "alignment") val alignment: String
)

@Entity(tableName = WORK_TABLE_NAME)
data class WorkEntity(
    @ColumnInfo(name="occupation")val occupation:String
    )

@Entity(tableName = CONNECTIONS_TABLE_NAME)
data class ConnectionsEntity(
    @ColumnInfo(name="groupAffiliation")val groupAffiliation:String
)

@Entity(tableName = IMAGES_TABLE_NAME)
data class ImagesEntity(
    @ColumnInfo(name="xs")val xs:String,
    @ColumnInfo(name="sm")val sm:String,
    @ColumnInfo(name="md")val md:String,
    @ColumnInfo(name="lg")val lg:String
)
