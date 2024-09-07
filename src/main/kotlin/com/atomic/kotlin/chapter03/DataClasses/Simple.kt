package com.atomic.kotlin.chapter03.DataClasses

import com.atomic.kotlin.atomicTest.*

data class Simple(
    val arg1: String,
    val arg2: Int
)

fun main() {
    val s1 = Simple("Hi", 36)
    val s2 = Simple("Hi", 36)
    s1 eq "Simple(arg1=Hi, arg2=36)"
    s1 eq s2
}