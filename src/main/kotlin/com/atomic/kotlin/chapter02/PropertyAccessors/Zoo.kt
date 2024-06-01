package com.atomic.kotlin.chapter02.PropertyAccessors

import com.atomic.kotlin.atomicTest.*

class Animal(val name: String)

class Zoo(private val maxCapacity: Int) {
    private val animals = mutableListOf<Animal>()

    val capacity: Int
        get() = maxCapacity - animals.size
    val full: Boolean
        get() = animals.size == maxCapacity

    fun put(animal: Animal): Boolean =
        if (full)
            false
        else {
            animals += animal
            true
        }

    fun take(): Animal = animals.removeAt(0)
}

fun main() {
    val zoo = Zoo(3)
    zoo.full eq false

    zoo.put(Animal("Cat")) eq true
    zoo.put(Animal("Lion")) eq true
    zoo.put(Animal("Monkey")) eq true

    zoo.full eq true
    zoo.capacity eq 0

    zoo.put(Animal("Tiger")) eq false
    zoo.take()
    zoo.capacity eq 1
}