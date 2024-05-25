package com.atomic.kotlin.chapter02.Exceptions

import com.atomic.kotlin.atomicTest.*

fun averageIncome(income: Int, months: Int) =
    income / months

fun main() {
    averageIncome(3300, 3) eq 1100
    capture {
        averageIncome(5000, 0)
    } eq "ArithmeticException: / by zero"
}