package com.atomic.kotlin.chapter03.ExtenstionFunctions

fun List<Int>.sums(): Int {
    var sum = 0
    for (item in this) {
        sum += item
    }
    return sum
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.sums())
}