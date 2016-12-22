package org.metapolis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class GolapiApplication

fun main(args: Array<String>) {
    SpringApplication.run(GolapiApplication::class.java, *args)
}
