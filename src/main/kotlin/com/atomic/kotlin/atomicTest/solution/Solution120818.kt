package com.atomic.kotlin.atomicTest.solution

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120818
 */
fun main() {
    val price = 150_000
    val result = calculateDiscount(price)
    println(result)
}

private fun calculateDiscount(price: Int): Int {
    return when {
        price in 100_000..299_999 -> (price * 0.95).toInt()
        price in 300_000..499_999 -> (price * 0.9).toInt()
        price >= 500_000 -> (price * 0.8).toInt()
        else -> price
    }
}