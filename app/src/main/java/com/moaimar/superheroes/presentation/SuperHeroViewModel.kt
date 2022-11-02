package com.moaimar.superheroes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moaimar.superheroes.domain.GetSuperHeroesFeedUseCase
import kotlinx.coroutines.*

class SuperHeroesViewModel(private val superHeroesFeedUseCase: GetSuperHeroesFeedUseCase) : ViewModel() {
    fun obtainSuperHeroes(callback: SuperHeroCallback) {
        viewModelScope.launch(Dispatchers.IO) {
            val superHeroes = superHeroesFeedUseCase.execute()
            withContext(Dispatchers.Main) {
                callback.onCall(superHeroes)
            }
        }
    }
}