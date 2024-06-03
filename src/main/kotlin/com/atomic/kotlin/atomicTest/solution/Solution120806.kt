package com.atomic.kotlin.atomicTest.solution

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
const val num3 = 1000

fun main() {
    val num1 = 7
    val num2 = 3
    var result: Double = 0.0
    result = (num1.toDouble() / num2.toDouble()) * num3
    println(result)
    println(result.toInt())

}
