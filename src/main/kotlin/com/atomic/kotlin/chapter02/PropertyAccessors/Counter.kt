package com.atomic.kotlin.chapter02.PropertyAccessors

import com.atomic.kotlin.atomicTest.*

class Counter {
    var value: Int = 0
        private set
    fun inc() = value++
}

fun main() {
    val counter = Counter()
    repeat(1000) {
        counter.inc()
    }
    counter.value eq 1000
}