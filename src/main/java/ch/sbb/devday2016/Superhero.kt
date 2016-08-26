package ch.sbb.devday2016

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Superhero(
        val name: String = "",

        @Id @GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
        var id: Long = 0
)

