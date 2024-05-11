package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    val ints = listOf(3, 2, 1)
    capture {
        ints[3]
    } contains
            listOf("ArrayIndexOutOfBoundsException")
}