package com.atomic.kotlin.chapter03.Overloading

import com.atomic.kotlin.atomicTest.*

class Overloading {
    fun f() = 0
    fun f(n: Int) = n + 2
}

fun main() {
    val o = Overloading()
    o.f() eq 0
    o.f(11) eq 13
}