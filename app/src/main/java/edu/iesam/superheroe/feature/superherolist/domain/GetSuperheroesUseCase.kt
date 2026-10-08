package edu.iesam.superheroe.feature.superherolist.domain

class GetSuperheroesUseCase(private val superheroeRepository: SuperheroeRepository) {

    operator fun invoke(): List<Superheroe>{
        return superheroeRepository.obtainSuperheroes()
    }
}