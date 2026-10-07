package edu.iesam.superheroe.feature.users.data.local

import edu.iesam.superheroe.feature.users.domain.User

class UserMemLocalDataSource {

    private val localUsers = mutableListOf<User>(
        User("John", "Doe", "12345678A"),
        User("Jane", "Smith", "24684673B"),
        User("Bob", "Johnson", "18390478C")
    )

    fun getAll()= localUsers

    /*fun getAll2(): List<User>{
        return  localUsers.toList()
    }*/
}