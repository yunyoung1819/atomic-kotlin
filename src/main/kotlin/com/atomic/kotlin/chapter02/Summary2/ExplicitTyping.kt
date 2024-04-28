package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.atomicTest.*

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3)
    val strings: List<String> = listOf("Ive", "Le serafim", "NewJeans")
    numbers eq "[1, 2, 3]"
    strings eq "[Ive, Le serafim, NewJeans]"
    toCharList("seven") eq "[s, e, v, e, n]"
}

fun toCharList(s: String): List<Char> =
    s.toList()