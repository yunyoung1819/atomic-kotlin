package com.atomic.kotlin.chapter03.NamedAndDefaultArgs

class DefaultArg
val da = DefaultArg()

fun g(d: DefaultArg = da) = println(d)

fun h(d: DefaultArg = DefaultArg()) = println(d)

fun main() {
    g()
    g()
    h()
    h()
}