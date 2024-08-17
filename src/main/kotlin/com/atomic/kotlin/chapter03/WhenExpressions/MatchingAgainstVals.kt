package com.atomic.kotlin.chapter03.WhenExpressions

import com.atomic.kotlin.atomicTest.*

fun main() {
    val yes = "A"
    val no = "B"
    for (choice in listOf(yes, no, yes)) {
        when (choice) {
            yes -> trace("Hooray!")
            no -> trace("Too bad!")
        }
        // if
        if (choice == yes) trace("Hooray!")
        else if (choice == no) trace("Too bad!")
    }
    trace eq """
        Hooray!
        Hooray!
        Too bad!
        Too bad!
        Hooray!
        Hooray!
    """
}
