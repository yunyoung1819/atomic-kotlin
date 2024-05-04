package com.atomic.kotlin.chapter03.extenstionFunctions

import com.atomic.kotlin.atomicTest.*

fun String.singleQuote() = "'$this'"
fun String.doubleQuote() = "\"$this\""

fun main() {
    "Hi".singleQuote() eq "'Hi'"
    "Hi".doubleQuote() eq "\"Hi\""
}