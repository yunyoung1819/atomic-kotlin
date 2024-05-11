package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun getList(): List<Int> {
    return mutableListOf(1, 2, 3)
}

fun main() {
    // getList()는 읽기 전용 List를 만든다
    val list = getList()

    // list += 3 // 오류
    list eq listOf(1, 2, 3)

}