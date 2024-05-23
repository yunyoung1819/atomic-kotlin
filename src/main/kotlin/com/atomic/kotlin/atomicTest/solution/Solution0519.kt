package com.atomic.kotlin.atomicTest.solution

fun main() {
    var n = 10
    var k = 3

    var foodPrice = 12000 * n
    var drinkPrice = 2000 * k
    var discount = 0
    var totalPrice = 0

    if (n >= 10) {
        discount = (n / 10) * 2000
    }
    totalPrice = foodPrice + drinkPrice - discount
    println(totalPrice)
}