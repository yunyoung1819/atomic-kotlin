package com.atomic.kotlin.chapter03.WhenExpressions

import com.atomic.kotlin.atomicTest.*

fun mixColors(first: String, second: String) =
    when (setOf(first, second)) {
        setOf("red", "blue") -> "purple"
        setOf("red", "yellow") -> "orange"
        setOf("blue", "yellow") -> "green"
        else -> "unknown"
    }

fun main() {
    mixColors("red", "blue") eq "purple"
    mixColors("blue", "red") eq "purple"
    mixColors("blue", "purple") eq "unknown"
}