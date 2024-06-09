package com.atomic.kotlin.chapter03.NamedAndDefaultArgs

import com.atomic.kotlin.atomicTest.*

fun main() {
    val list = listOf(1, 2, 3)
    list.joinToString(". ", "", "!") eq "1. 2. 3!"
    list.joinToString(separator = ". ", postfix = "!") eq "1. 2. 3!"
}