package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    val doubles =
        listOf(1.1, 2.2, 3.3, 4.4)
    doubles.sum() eq 11.0

    val strings = listOf("Twas", "Brillig",
        "And", "Slithy", "Toves")

    strings eq listOf("Twas", "Brillig",
        "And", "Slithy", "Toves")

    strings.sorted() eq listOf("And",
        "Brillig", "Slithy", "Toves", "Twas")

    strings.reversed() eq listOf("Toves",
        "Slithy", "And", "Brillig", "Twas")

    strings.first() eq "Twas"

    strings.takeLast(2) eq
            listOf("Slithy", "Toves")

}