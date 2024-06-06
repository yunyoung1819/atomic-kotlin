package com.atomic.kotlin.chapter03.NamedAndDefaultArgs.color2

import com.atomic.kotlin.atomicTest.*

fun color(
    red: Int = 0,
    green: Int = 0,
    blue: Int = 0,
) = "($red, $green, $blue)"

fun main() {
    color(139) eq "(139, 0, 0)"
    color(blue = 139) eq "(0, 0, 139)"
    color(255, 165) eq "(255, 165, 0)"
    color(red = 128, blue = 128) eq "(128, 0, 128)"
}