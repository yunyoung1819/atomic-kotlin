package com.atomic.kotlin.chapter02.CreatingClasses

class Hamster {
    fun speak() = "Squeak! "
    fun exercise() =
        this.speak() + speak() + "Running on wheel"
}

fun main() {
    val hamster = Hamster()
    println(hamster.exercise())
}