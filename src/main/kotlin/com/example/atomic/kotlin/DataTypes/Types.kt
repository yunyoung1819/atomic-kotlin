package com.example.atomic.kotlin.DataTypes

/**
 * 데이터 타입
 * 데이터는 서로 다른 타입에 속할 수 있다
 */
fun main() {
    val whole: Int = 11
    val fractional: Double = 1.4
    val trueOrFalse: Boolean = true
    val words: String = "A value"
    val character: Char = 'z'
    val lines: String = """Triple quotes let you have may lines
        in your string"""

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(words)
    println(character)
    println(lines)
}