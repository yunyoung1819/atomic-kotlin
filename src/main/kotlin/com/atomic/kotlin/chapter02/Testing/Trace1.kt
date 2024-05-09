package com.atomic.kotlin.chapter02.Testing

import com.atomic.kotlin.atomicTest.*

fun main() {
    trace("line 1")
    trace(47)
    trace("line 2")
    trace eq """
       line 1
       47
       line 2
    """
}