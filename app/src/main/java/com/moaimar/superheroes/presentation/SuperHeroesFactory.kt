package com.moaimar.superheroes.presentation

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import com.moaimar.app.commons.GsonJSerializer
import com.moaimar.superheroes.data.SuperHeroDataRepository
import com.moaimar.superheroes.data.local.xml.SuperHeroXmlLocalDataSource
import com.moaimar.superheroes.data.remote.SuperHeroRemoteDataSource
import com.moaimar.superheroes.domain.GetSuperHeroUseCase
import com.moaimar.superheroes.domain.GetSuperHeroesFeedUseCase

class SuperHeroesFactory {

    companion object {
        fun getViewModel(sharedPreferences: SharedPreferences): SuperHeroesViewModel {
            return SuperHeroesViewModel(
                GetSuperHeroesFeedUseCase(
                    SuperHeroDataRepository(
                            SuperHeroXmlLocalDataSource(sharedPreferences,GsonJSerializer()),
                            SuperHeroRemoteDataSource()
                        )
                    )
                )
        }
        fun getDetailViewModel(activity: Activity): SuperHeroDetailViewModel{
            return SuperHeroDetailViewModel(
                GetSuperHeroUseCase(
                    SuperHeroDataRepository(
                        SuperHeroXmlLocalDataSource(activity.getSharedPreferences("", Context.MODE_PRIVATE),GsonJSerializer()),
                        SuperHeroRemoteDataSource()
                    )
                )
            )
        }
    }
}