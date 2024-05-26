package com.atomic.kotlin.chapter02.Maps

import com.atomic.kotlin.atomicTest.*

fun main() {
    val m = mapOf(5 to "five", 6 to "six")
    m[5] eq "five"
    // m[5] = "5ive"
    // m += (4 to "four")
    m + (4 to "four") // m을 바꾸지 않음
    m eq mapOf(5 to "five", 6 to "six")
    val m2 = m + (4 to "four")
    m2 eq mapOf(
        5 to "five", 6 to "six", 4 to "four"
    )
}