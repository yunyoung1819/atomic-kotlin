package com.atomic.kotlin.chapter03.NamedAndDefaultArgs

import com.atomic.kotlin.atomicTest.*
import com.atomic.kotlin.chapter03.NamedAndDefaultArgs.color1.color

fun main() {
    color(blue = 0, red = 99, green = 52) eq "(99, 52, 0)"

    color(red = 255, 255, 0) eq "(255, 255, 0)"
}