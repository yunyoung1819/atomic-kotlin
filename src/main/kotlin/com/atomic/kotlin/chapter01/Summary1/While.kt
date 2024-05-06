package com.atomic.kotlin.chapter01.Summary1

fun testCondition(i: Int) = i < 100

fun main() {
    var i = 0
    while (testCondition(i)) {
        print(".")
        i += 10
    }
}