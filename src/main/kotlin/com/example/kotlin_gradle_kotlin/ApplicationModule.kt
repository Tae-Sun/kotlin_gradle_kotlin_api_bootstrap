package com.example.kotlin_gradle_kotlin

import com.example.domain.services.SomeService
import com.example.domain.services.AnotherService

object ApplicationModule {
    val someService = SomeService()
    val anotherService = AnotherService()
}
