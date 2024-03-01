package com.atomic.kotlin.chapter01.RepetitionWithWhile

fun condition(i: Int) = i < 100

fun main() {
    var i = 0
    do {
        print(".")
        i += 10
    } while (com.atomic.kotlin.chapter01.RepetitionWithWhile.condition(i))
}