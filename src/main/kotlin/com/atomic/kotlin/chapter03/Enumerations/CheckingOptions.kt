package com.atomic.kotlin.chapter03.Enumerations

import com.atomic.kotlin.atomicTest.*
import com.atomic.kotlin.chapter03.Enumerations.Level
import com.atomic.kotlin.chapter03.Enumerations.Level.*

fun checkLevel(level: Level) {
    when(level) {
        Overflow -> trace(">>> Overflow!")
        Empty -> trace("Alert: Empty")
        else -> trace("Level $level OK")
    }
}

fun main() {
    checkLevel(Empty)
    checkLevel(Low)
    checkLevel(Overflow)
    trace eq """
        Alert: Empty
        Level Low OK
        >>> Overflow!
    """
}