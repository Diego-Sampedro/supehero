package edu.iesam.superheroe.feature.list.domain

interface SuperheroeRepository {
    fun obtainSuperheroes(): List<Superheroe>
}