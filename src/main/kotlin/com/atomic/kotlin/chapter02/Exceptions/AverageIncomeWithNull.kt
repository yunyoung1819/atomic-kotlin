package com.atomic.kotlin.chapter02.Exceptions

import com.atomic.kotlin.atomicTest.*

fun averageIncome2(income: Int, months: Int) =
    if (months == 0)
        null
    else
        income / months

fun main() {
    averageIncome2(3300, 3) eq 1100
    averageIncome2(5000, 0) eq null
}