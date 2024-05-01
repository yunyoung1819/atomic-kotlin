package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.chapter02.Summary2.varargs
import com.atomic.kotlin.atomicTest.*

fun main() {
    val array = intArrayOf(4, 5)
    varargs("x", 1, 2, 3, *array, 6)
    val list = listOf(9, 10, 11)
    varargs(
        "y", 7, 8, *list.toIntArray())
    trace eq "1 2 3 4 5 6 x 7 8 9 10 11 y"
}