package com.atomic.kotlin.chapter02.Exceptions

import com.atomic.kotlin.atomicTest.capture

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""
}