package com.atomic.kotlin.chapter02.PropertyAccessors

import com.atomic.kotlin.atomicTest.*

class LogChanges {
    var n: Int = 0
        set(value) {
            trace("$field becomes $value")
            field = value
        }
}

fun main() {
    val lc = LogChanges()
    lc.n eq 0
    lc.n = 1004
    lc.n eq 1004
    trace eq "0 become 1004"
}