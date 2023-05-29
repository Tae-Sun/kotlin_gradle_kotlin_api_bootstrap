package com.example.routes


import com.example.kotlin_gradle_kotlin.ApplicationModule
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.someRoutes() {
    route("/some") {
        get {
            call.respond(ApplicationModule.someService.getSomeData())
        }
    }
}
