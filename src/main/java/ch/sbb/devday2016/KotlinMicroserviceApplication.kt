package ch.sbb.devday2016

import ch.sbb.devday2016.Superhero
import ch.sbb.devday2016.SuperheroRepository
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
        repository.save(Superhero("elektra"))
        repository.save(Superhero("hulk"))
        repository.save(Superhero("superman"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinMicroserviceApplication::class.java, *args)
}