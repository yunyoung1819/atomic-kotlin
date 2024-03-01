package com.atomic.kotlin.chapter01.Functions

/**
 * 함수
 * 함수(function)는 이름이 있는 작은 프로그램과 같으며,
 * 다른 함수에서 그 이름으로 실행하거나 호출(invoke)할 수 있다
 */
fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2
}

fun main() {
    val r = com.atomic.kotlin.chapter01.Functions.multiplyByTwo(5)
    println(r)
}