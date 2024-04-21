package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.atomicTest.eq

class Badger(id: String, years: Int) {
    val name = id
    val age = years
    override fun toString(): String {
        return "Badger: $name, age: $age"
    }
}

class Snake(
    var type: String,
    var length: Double
) {
    override fun toString(): String {
        return "Snake: $type, length: $length"
    }
}

class Moose(
    val age: Int,
    val height: Double
) {
    override fun toString(): String {
        return "Moose, age: $age, height: $height"
    }
}

fun main() {
    Badger("Happy", 11) eq  "Badger: Happy, age: 11"
    Snake("Nagini", 2.4) eq "Snake: Nagini, length: 2.4"
    Moose(16, 7.2) eq "Moose, age: 16, height: 7.2"
}