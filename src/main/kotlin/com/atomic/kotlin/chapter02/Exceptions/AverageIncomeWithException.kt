package com.atomic.kotlin.chapter02.Exceptions

import com.atomic.kotlin.atomicTest.*

fun averageIncome3(income: Int, months: Int) =
    if (months == 0)
        throw IllegalArgumentException(
            "Months can't be zero")
    else
        income / months

fun main() {
    averageIncome3(3300, 3) eq 1100
    capture {
        averageIncome3(5000, 0)
    } eq "IllegalArgumentException: " +
            "Months can't be zero"
}