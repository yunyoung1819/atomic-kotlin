package com.atomic.kotlin.chapter03.extenstionFunctions

import com.atomic.kotlin.atomicTest.eq

fun String.strangeQuote() =
    this.singleQuote().singleQuote()

fun String.tooManyQuotes() =
    doubleQuote().doubleQuote()

fun main() {
    "Hi".strangeQuote() eq "''Hi''"
    "Hi".tooManyQuotes() eq "\"\"Hi\"\""
}