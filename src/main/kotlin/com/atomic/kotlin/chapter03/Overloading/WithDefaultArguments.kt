package com.atomic.kotlin.chapter03.Overloading

import com.atomic.kotlin.atomicTest.*

fun f(n: Int = 0) = n + 373

fun main() {
    f() eq 373
}