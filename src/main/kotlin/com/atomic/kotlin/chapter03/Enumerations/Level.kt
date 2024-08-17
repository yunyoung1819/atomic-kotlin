package com.atomic.kotlin.chapter03.Enumerations

import com.atomic.kotlin.atomicTest.*

enum class Level {
    Overflow, High, Medium, Low, Empty
}

fun main() {
    Level.Medium eq "Medium"
}