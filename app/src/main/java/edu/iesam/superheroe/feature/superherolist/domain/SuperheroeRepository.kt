package edu.iesam.superheroe.feature.superherolist.domain

interface SuperheroeRepository {
    fun obtainSuperheroes(): List<Superheroe>
}