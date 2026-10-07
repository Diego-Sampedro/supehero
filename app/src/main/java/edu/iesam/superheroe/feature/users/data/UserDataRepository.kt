package edu.iesam.superheroe.feature.users.data

import edu.iesam.superheroe.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superheroe.feature.users.domain.User
import edu.iesam.superheroe.feature.users.domain.UserRepository

class UserDataRepository(private  val localDataSource: UserMemLocalDataSource) : UserRepository {
    override fun obtainUsers(): List<User> {
        return localDataSource.getAll()
    }
}