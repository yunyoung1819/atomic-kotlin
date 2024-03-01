package com.example.atomic.kotlin.RepetitionWithWhile

fun condition(i: Int) = i < 100

fun main() {
    var i = 0
    do {
        print(".")
        i += 10
    } while (condition(i))
}