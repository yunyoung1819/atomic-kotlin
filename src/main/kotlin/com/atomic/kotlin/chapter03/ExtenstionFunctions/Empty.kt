package com.atomic.kotlin.chapter03.ExtenstionFunctions

fun String.isEmptys(): Boolean {
    return this.length == 0
}

fun main() {
    val str = "Hello"
    println(str.isEmptys())
}