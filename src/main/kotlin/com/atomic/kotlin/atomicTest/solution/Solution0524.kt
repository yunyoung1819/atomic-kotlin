package com.atomic.kotlin.atomicTest.solution

fun main() {
    val intArray = arrayOf(149, 180, 192, 170)
    val height = 167
    val count = intArray.filter { it -> it > height }.count()
    println(count)
}