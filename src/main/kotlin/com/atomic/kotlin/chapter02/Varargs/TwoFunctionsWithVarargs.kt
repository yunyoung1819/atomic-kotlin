package com.atomic.kotlin.chapter02.Varargs

import com.atomic.kotlin.atomicTest.*

fun first(vararg numbers: Int): String {
    var result = ""
    for (i in numbers) {
        result += "[$i]"
    }
    return result
}

fun second(vararg numbers: Int) =
    first(*numbers)

fun main() {
    second(7, 9, 32) eq "[7][9][32]"
}