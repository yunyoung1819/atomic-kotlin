package com.atomic.kotlin.chapter03.ExtenstionFunctions

import com.atomic.kotlin.atomicTest.eq

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double\""
}