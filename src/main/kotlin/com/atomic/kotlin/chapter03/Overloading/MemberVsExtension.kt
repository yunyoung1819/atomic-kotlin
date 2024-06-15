package com.atomic.kotlin.chapter03.Overloading

import com.atomic.kotlin.atomicTest.*

class My {
    fun foo() = 0
}

fun My.foo() = 1

fun My.foo(i: Int) = i + 2

fun main() {
    My().foo() eq 0
    My().foo(1) eq 3
}