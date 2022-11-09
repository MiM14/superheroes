package com.moaimar.superheroes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moaimar.superheroes.domain.GetSuperHeroUseCase
import kotlinx.coroutines.*

class SuperHeroDetailViewModel(private val getSuperHeroUseCase: GetSuperHeroUseCase) : ViewModel() {

    fun obtainSuperHero(callback: SuperHeroDetailCallback , superHeroId: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            val superHero = getSuperHeroUseCase.execute(superHeroId)
           withContext(Dispatchers.Main) {
                callback.onCall(superHero)
            }
       }
    }
}