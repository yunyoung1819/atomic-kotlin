package com.atomic.kotlin.chapter03.Enumerations

import com.atomic.kotlin.atomicTest.*
import com.atomic.kotlin.chapter03.Enumerations.Direction.*

enum class Direction(val notation: String) {
    North("N"), South("S"),
    East("E"), West("W");

    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> North
            West -> East
            East -> West
        }
}

fun main() {
    North.notation eq "N"
    North.opposite eq South
    West.opposite.opposite eq West
    North.opposite.notation eq "S"
}