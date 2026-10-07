package edu.iesam.superheroe.feature.users.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superheroe.feature.users.domain.GetUsersUseCase

class UserViewModel(private val getUsersUseCase: GetUsersUseCase): ViewModel() {
    fun getUsers() = getUsersUseCase.invoke()
}