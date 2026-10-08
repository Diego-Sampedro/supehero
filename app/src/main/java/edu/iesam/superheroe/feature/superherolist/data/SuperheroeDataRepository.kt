package edu.iesam.superheroe.feature.superherolist.data

import edu.iesam.superheroe.feature.superherolist.data.local.SuperheroeMemLocalDataSource
import edu.iesam.superheroe.feature.superherolist.domain.Superheroe
import edu.iesam.superheroe.feature.superherolist.domain.SuperheroeRepository

class SuperheroeDataRepository(private val localDataSource: SuperheroeMemLocalDataSource): SuperheroeRepository {
    override fun obtainSuperheroes(): List<Superheroe> {
        return localDataSource.getAll()
    }
}