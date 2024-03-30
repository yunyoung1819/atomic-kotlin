package com.atomic.kotlin.chapter02.CreatingClasses

class Warrior {
    fun fire() = "fire! "
    fun defence() = "shield! "
    fun attack() = this.fire()+
            fire() +
            defence() +
            fire()
}

fun main() {
    val warrior = Warrior()
    println(warrior.attack())
}