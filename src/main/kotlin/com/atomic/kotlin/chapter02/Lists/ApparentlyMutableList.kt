package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    var list = listOf('X')
    list += 'Y'
    list += 'Z'

    for (i in list) {
        println(i)
    }

    list eq "[X, Y, Z]"
}