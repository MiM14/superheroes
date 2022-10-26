package com.moaimar.superheroes.presentation

import android.content.Context
import android.content.SharedPreferences
import com.moaimar.superheroes.data.SuperHeroesDataRepository
import com.moaimar.superheroes.domain.GetSuperHeroesFeedUseCase

class SuperHeroesFactory {

    companion object {
        fun getViewModel(
            context: Context,
            sharedPreferences: SharedPreferences
        ): SuperHeroesViewModel {
            return SuperHeroesViewModel(
                GetSuperHeroesFeedUseCase(
                    SuperHeroesDataRepository()
                )
            )
        }
    }
}