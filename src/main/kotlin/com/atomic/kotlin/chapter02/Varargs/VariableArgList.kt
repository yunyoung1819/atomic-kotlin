package com.atomic.kotlin.chapter02.Varargs

import com.atomic.kotlin.atomicTest.*

fun v(s: String, vararg d: Double) {}

fun main() {
    v("abc", 1.0, 2.0)
    v("def", 1.0, 2.0, 3.0, 4.0)
    v("ghi", 1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
}