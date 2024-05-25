package com.atomic.kotlin.chapter02.Varargs

import com.atomic.kotlin.atomicTest.*

fun main() {
    val array = intArrayOf(4, 5)
    sum(1, 2, 3, *array, 6) eq 21

    val list = listOf(9, 10, 11)
    sum(*list.toIntArray()) eq 30
}