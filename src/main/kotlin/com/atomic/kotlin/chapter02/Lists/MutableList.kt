package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)

    list += 7
    list eq listOf(1, 2, 3, 4, 5, 6, 7)
}