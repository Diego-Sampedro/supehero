package edu.iesam.superheroe.feature.users.domain

interface UserRepository {
    fun obtainUsers(): List<User>
}