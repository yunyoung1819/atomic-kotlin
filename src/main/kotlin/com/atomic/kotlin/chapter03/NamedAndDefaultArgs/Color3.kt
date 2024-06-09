package com.atomic.kotlin.chapter03.NamedAndDefaultArgs

import com.atomic.kotlin.atomicTest.*

class Color(
    val red: Int = 0,
    val green: Int = 0,
    val blue: Int = 0,
) {
    override fun toString() =
        "($red, $green, $blue)"
}

fun main() {
    Color(red = 77).toString() eq "(77, 0, 0)"
}