package ch.sbb.devday2016

import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class KotlinMicroserviceApplication {

    @Bean
    open fun kotlinModule() = KotlinModule()

    @Bean
    open fun init(repository: SuperheroRepository) = CommandLineRunner {
        repository.save(Superhero("elektra","combat"))
        repository.save(Superhero("loki","shape-shifting"))
        repository.save(Superhero("superman","flight"))
        repository.save(Superhero("batmann"))
        repository.save(Superhero())
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinMicroserviceApplication::class.java, *args)
}