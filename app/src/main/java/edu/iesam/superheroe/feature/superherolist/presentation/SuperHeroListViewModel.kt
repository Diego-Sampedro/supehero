package edu.iesam.superheroe.feature.superherolist.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superheroe.feature.superherolist.domain.GetSuperheroesUseCase

class SuperHeroListViewModel(private val getSuperheroesUseCase: GetSuperheroesUseCase): ViewModel() {
    fun getSuperheroes() = getSuperheroesUseCase.invoke()
}