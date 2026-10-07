package edu.iesam.superheroe.feature.list.data

import edu.iesam.superheroe.feature.list.data.local.SuperheroeMemLocalDataSource
import edu.iesam.superheroe.feature.list.domain.Superheroe
import edu.iesam.superheroe.feature.list.domain.SuperheroeRepository

class SuperheroeDataRepository(private val localDataSource: SuperheroeMemLocalDataSource): SuperheroeRepository {
    override fun obtainSuperheroes(): List<Superheroe> {
        return localDataSource.getAll()
    }
}