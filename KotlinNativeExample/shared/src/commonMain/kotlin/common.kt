package com.kotlinnative.shared

expect fun getPlatformName(): String

class HelloWorld {
    fun sayWelcome(): String = "Welcome, ${getPlatformName()}"
}