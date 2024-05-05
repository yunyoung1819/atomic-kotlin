package com.atomic.kotlin.chapter03.extenstionFunctions

import com.atomic.kotlin.atomicTest.eq
import com.atomic.kotlin.chapter03.extenstionFunctions.doubleQuote
import com.atomic.kotlin.chapter03.extenstionFunctions.singleQuote

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double\""
}