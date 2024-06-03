package com.atomic.kotlin.atomicTest.solution

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */
fun main() {
    val intArray = arrayOf(149, 180, 192, 170)
    val height = 167
    val count = intArray.filter { it -> it > height }.count()
    println(count)
}