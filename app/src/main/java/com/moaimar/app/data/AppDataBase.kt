package com.moaimar.app.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.moaimar.superheroes.data.local.db.SuperHeroDao
import com.moaimar.superheroes.data.local.db.SuperHeroEntity


@Database(entities = [SuperHeroEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun superHeroeDao(): SuperHeroDao
}