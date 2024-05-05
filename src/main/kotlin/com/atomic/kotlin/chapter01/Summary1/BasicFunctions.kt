package com.atomic.kotlin.chapter01.Summary1

fun cube(x: Int): Int {
    return x * x * x
}

fun bang(s: String) = s + "!"


fun main() {
    println(cube(3))
    println(bang("pop"))
}