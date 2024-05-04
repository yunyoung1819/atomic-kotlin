package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.atomicTest.*

class Holder(var i: Int)

fun main() {
    val holder = Holder(10)
    holder.i eq 10  // 'i' 프로퍼티를 읽는다
    holder.i = 20   // 'i' 프로퍼티에 값을 쓴다
}