package com.atomic.kotlin.chapter03.extenstionFunctions

fun String.isEmptys(): Boolean {
    return this.length == 0
}

fun main() {
    val str = "Hello"
    println(str.isEmptys())
}