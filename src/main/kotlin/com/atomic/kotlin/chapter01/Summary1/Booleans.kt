package com.atomic.kotlin.chapter01.Summary1

fun main() {
    val opens = 9
    val closes = 20
    println("Operating hours: $opens - $closes")

    val hour = 6
    println("Current time: " + hour)

    val isOpen = hour >= opens && hour <= closes
    println("Open: " + isOpen)
    println("Not open: " + !isOpen)

    val isClosed = hour < opens || hour > closes
    println("Closed: " + isClosed)
}