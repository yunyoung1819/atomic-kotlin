package com.atomic.kotlin.atomicTest.solution

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818?language=kotlin
 */
fun main() {
    val price = 580_000
    var discount = 0.0
    var answer = 0.0

    if (price >= 500_000) {
        discount = 1 - 0.2 // 20% 할인
        answer = price * discount
    } else if (price >= 300_000) {
        discount = 1 - 0.1 // 10% 할인
        answer = price * discount
    } else if (price >= 100_000) {
        discount = 1 - 0.05
        answer = price * discount
    }
    println(answer.toInt())
}