package com.atomic.kotlin.chapter02.PropertyAccessors

import com.atomic.kotlin.atomicTest.*

class Default {
    var i: Int = 0
        get() {
            trace("get()")
            return field
        }
        set(value) {
            trace("set($value)")
            field = value
        }
}

fun main() {
    val d = Default()
    d.i = 1001
    trace(d.i)
    trace eq """
        set(1001)
        get()
        1001
    """
}