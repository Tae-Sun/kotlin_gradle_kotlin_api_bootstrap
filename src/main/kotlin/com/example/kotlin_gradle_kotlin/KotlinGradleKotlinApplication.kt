package com.example.kotlin_gradle_kotlin

import io.ktor.application.*
import io.ktor.features.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json

import com.example.routes.registerRoutes
import io.ktor.routing.*

@SpringBootApplication
class KotlinGradleKotlinApplication

fun main(args: Array<String>) {
    runApplication<KotlinGradleKotlinApplication>(*args)
    embeddedServer(Netty, 8888, module = Application::module).start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    install(StatusPages) {
        // Handle any exceptions here
    }
    install(Routing){
        registerRoutes()
    }

}
