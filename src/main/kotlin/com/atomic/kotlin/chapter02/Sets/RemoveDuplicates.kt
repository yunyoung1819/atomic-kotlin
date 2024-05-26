package com.atomic.kotlin.chapter02.Sets

import com.atomic.kotlin.atomicTest.*

fun main() {
    val list = listOf(3, 3, 2, 1, 2)
    list.toSet() eq setOf(1,2,3)
    list.distinct() eq listOf(3,2,1)
    "abbbcccc".toSet() eq setOf('a','b','c')
}