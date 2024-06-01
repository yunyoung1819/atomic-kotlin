package com.atomic.kotlin.chapter02.PropertyAccessors

import com.atomic.kotlin.atomicTest.*

class Data(var i: Int)

fun main() {
    val data = Data(1000)
    data.i eq 1000 // 'i' 프로퍼티를 읽음
    data.i = 2000  // 'i' 프로퍼티에 값을 씀
}