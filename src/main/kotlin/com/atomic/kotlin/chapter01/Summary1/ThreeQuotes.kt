package com.atomic.kotlin.chapter01.Summary1

fun json(q: String, a: Int) = """{
    "question": "$q",
    "answer": $a
}"""

fun main() {
    println(json("The Ultimate", 42))
}