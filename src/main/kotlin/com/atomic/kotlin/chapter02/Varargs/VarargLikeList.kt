package com.atomic.kotlin.chapter02.Varargs

import com.atomic.kotlin.atomicTest.*

fun evaluate(vararg ints: Int) = "Size: ${ints.size}\n" + "Sum: ${ints.sum()}\n" + "Average: ${ints.average()}"

fun main() {
    evaluate(10, -3, 8, 1, 9) eq """
       Size: 5
       Sum: 25
       Average: 5.0
    """
}