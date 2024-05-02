package com.atomic.kotlin.chapter02.Summary2

import com.atomic.kotlin.atomicTest.*

val colors = "Yellow Green Green Blue"
    .split(Regex("""\W+""")).sorted()

fun main() {
    colors eq listOf("Blue", "Green", "Green", "Yellow")

    val colorSet = colors.toSet()
    colorSet eq setOf("Yellow", "Green", "Blue")
    (colorSet + colorSet) eq colorSet

    val mSet = colorSet.toMutableSet()
    mSet -= "Blue"
    mSet += "Red"
    mSet eq setOf("Yellow", "Green", "Red")

    // 집합 원소인지 확인
    ("Green" in colorSet) eq true
    colorSet.contains("Red") eq false
}