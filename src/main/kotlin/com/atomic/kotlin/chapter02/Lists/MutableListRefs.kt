package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    val first = mutableListOf(1)
    val second: List<Int> = first
    second eq listOf(1)

    first += 2

    // second도 first에 의해 변경된 내용을 보게 된다
    second eq listOf(1, 2)

}