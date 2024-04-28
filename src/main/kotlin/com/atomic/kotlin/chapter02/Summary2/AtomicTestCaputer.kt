package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.atomicTest.*

fun main() {
    capture {
        "#$1.9".toDouble()
    } eq "NumberFormatException: " +
            """For input string: "$1.9""""
}