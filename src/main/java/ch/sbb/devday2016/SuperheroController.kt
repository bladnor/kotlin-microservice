package ch.sbb.devday2016

import ch.sbb.devday2016.Superhero
import ch.sbb.devday2016.SuperheroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/superheroes")
class SuperheroController @Autowired constructor(val superheroRepository: SuperheroRepository) {

//    @Autowired
//    lateinit var superheroRepo : SuperheroRepository

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun findAll(): List<Superhero> = superheroRepository.findAll()

    @RequestMapping(method = arrayOf(RequestMethod.POST))
    fun addSuperhero(@RequestBody superhero: Superhero): Superhero = superheroRepository.save(superhero)
}