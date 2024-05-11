package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

// 반환 타입을 추론한다
fun inferred(p: Char, q: Char) =
    listOf(p, q)

// 반환 타입을 명시한다
fun explicit(p: Char, q: Char): List<Char> =
    listOf(p, q)

fun main() {
    inferred('a', 'b') eq "[a, b]"
    explicit('y', 'z') eq "[y, z]"
}

