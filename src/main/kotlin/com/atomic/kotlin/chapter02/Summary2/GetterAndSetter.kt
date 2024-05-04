package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.atomicTest.*

class GetterAndSetter {
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
    val gs = GetterAndSetter()
    gs.i = 2
    trace(gs.i)
    trace eq """
        set(2)
        get()
        2
    """
}