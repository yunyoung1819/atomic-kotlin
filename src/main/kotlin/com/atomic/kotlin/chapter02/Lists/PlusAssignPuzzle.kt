package com.atomic.kotlin.chapter02.Lists

import com.atomic.kotlin.atomicTest.*

fun main() {
    val list1 = mutableListOf('A')
    list1 += 'A'
    list1.plusAssign('A')

    val list2 = listOf('B')
    // list2 += 'B'
    // list2 = list2 + 'B'

    var list3 = listOf('C')
    list3 += 'C'
    val newList = list3 + 'C'
    list3 = newList

    list1 eq "[A, A, A]"
    list2 eq "[B]"
    list3 eq "[C, C, C]"
}