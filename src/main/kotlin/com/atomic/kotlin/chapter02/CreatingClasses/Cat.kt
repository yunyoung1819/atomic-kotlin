package com.atomic.kotlin.chapter02.CreatingClasses

class Cat {
    fun meow() = "야옹!"
}

fun main() {
    val cat = Cat()
    val m1 = cat.meow()
    println(m1)
}