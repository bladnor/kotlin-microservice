package ch.sbb.devday2016

import ch.sbb.devday2016.Superhero
import org.springframework.data.jpa.repository.JpaRepository

interface SuperheroRepository : JpaRepository<Superhero, Long>
