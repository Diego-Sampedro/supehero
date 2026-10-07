package edu.iesam.superheroe.feature.list.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superheroe.feature.list.domain.GetSuperheroesUseCase

class ListViewModel(private val getSuperheroesUseCase: GetSuperheroesUseCase): ViewModel() {
    fun getSuperheroes() = getSuperheroesUseCase.invoke()
}