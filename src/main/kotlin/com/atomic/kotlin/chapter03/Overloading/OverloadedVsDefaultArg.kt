package com.atomic.kotlin.chapter03.Overloading

import com.atomic.kotlin.atomicTest.*

fun foo(n: Int = 99) = trace("foo-1-$n")

fun foo() {
    trace("foo-2")
    foo(14)
}

fun main() {
    foo()
    trace eq """
        foo-2
        foo-1-14
    """
}

