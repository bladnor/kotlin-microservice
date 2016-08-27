package ch.sbb.devday2016

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Superhero(
        val name: String = "",
        val superpower: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0
)














//{
//     private constructor() : this("","")
//}

