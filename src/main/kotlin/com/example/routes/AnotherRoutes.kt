package com.example.routes


import com.example.kotlin_gradle_kotlin.ApplicationModule
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.anotherRoutes() {
    route("/another") {
        get {
            call.respond(ApplicationModule.anotherService.getAnotherData())
        }
    }
}