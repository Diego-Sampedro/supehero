package edu.iesam.superheroe.feature.users.domain

class GetUsersUseCase(private val userRepository: UserRepository) {

    operator fun invoke(): List<User>{
        return userRepository.obtainUsers()
    }
}