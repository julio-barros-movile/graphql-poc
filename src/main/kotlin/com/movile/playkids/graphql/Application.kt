package com.movile.playkids.graphql

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author Júlio Moreira Blás de Barros (julio.barros@movile.com)
 * @since 2/7/19
 */

@SpringBootApplication(scanBasePackages = ["com.movile.playkids.graphql"])
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}