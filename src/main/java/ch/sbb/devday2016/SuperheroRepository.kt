package ch.sbb.devday2016

import org.springframework.data.jpa.repository.JpaRepository

interface SuperheroRepository : JpaRepository<Superhero, Long>
