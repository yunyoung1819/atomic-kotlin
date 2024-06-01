package com.atomic.kotlin.chapter02.PropertyAccessors

import com.atomic.kotlin.atomicTest.*

class Hamster(val name: String)

class Cage(private val maxCapacity: Int) {
    private val hamsters =
        mutableListOf<Hamster>()
    val capacity: Int
        get() = maxCapacity - hamsters.size

    val full: Boolean
        get() = hamsters.size == maxCapacity

    fun put(hamster: Hamster): Boolean =
        if (full)
            false
        else {
            hamsters += hamster
            true
        }

    fun take(): Hamster = hamsters.removeAt(0)
}

fun main() {
    val cage = Cage(2)
    cage.full eq false
    cage.capacity eq 2

    cage.put(Hamster("Minji")) eq true
    cage.put(Hamster("Hani")) eq true

    cage.full eq true
    cage.capacity eq 0

    cage.put(Hamster("Hearin")) eq false
    cage.take()
    cage.capacity eq 1
}