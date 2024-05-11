package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    // 타입을 추론한다
    val numbers = listOf(1, 2, 3)
    val strings =
        listOf("Apple", "Microsoft", "Nvidia")

    // 똑같은 코드지만 타입을 명시했다
    val numbers2: List<Int> = listOf(1, 2, 3)
    val strings2: List<String> =
        listOf("Apple", "Microsoft", "Nvidia")
    numbers eq numbers2
    strings eq strings2
}