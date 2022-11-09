package com.moaimar.superheroes.data.local.db

import androidx.room.Dao
import androidx.room.Query

@Dao
interface SuperHeroDao {

    @Query("SELECT * FROM $SUPERHEROES_TABLA_NAME")
    fun getAll(): List<SuperHeroEntity>

}