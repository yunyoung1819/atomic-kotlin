package com.atomic.kotlin.chapter01.Summary1

fun main() {
    var i = 0
    do {
        print(".")
        i += 10
    } while (testCondition(i))
}