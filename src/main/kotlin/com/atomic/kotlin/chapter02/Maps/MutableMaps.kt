package com.atomic.kotlin.chapter02.Maps

import com.atomic.kotlin.atomicTest.*

fun main() {
    val m =
        mutableMapOf(5 to "five", 6 to "six")
    m[5] eq "five"
    m[5] = "5ive"
    m[5] eq "5ive"
    m += 4 to "four"
    m eq mapOf(5 to "5ive", 4 to "four", 6 to "six")
}