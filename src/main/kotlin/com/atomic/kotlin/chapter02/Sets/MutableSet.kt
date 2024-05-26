package com.atomic.kotlin.chapter02.Sets

import com.atomic.kotlin.atomicTest.*

fun main() {
    val mutableSet = mutableSetOf<Int>()
    mutableSet += 42
    mutableSet += 42
    mutableSet eq setOf(42)
    mutableSet -= 42
    mutableSet eq setOf<Int>()
}