package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    // List의 각 원소에 대해 이터레이션하기
    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "99 3 5 7 11 13"

    // List 원소를 인덱싱하기
    ints[4] eq 11

}