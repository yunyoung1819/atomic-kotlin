package com.atomic.kotlin.chapter02.Maps

import com.atomic.kotlin.atomicTest.eq

fun main() {
    val artist = mapOf(
        "IVE" to "Accendio",
        "Newjeans" to "HowToSweet",
        "aespa" to "Supernova"
    )
    artist eq
            "{IVE=Accendio, Newjeans=HowToSweet, aespa=Supernova}"

    artist["IVE"] eq "Accendio"
    artist.keys eq setOf("IVE","Newjeans","aespa")
    artist.values eq "[Accendio, HowToSweet, Supernova]"

    var s = ""
    for (entry in artist) {
        s += "${entry.key}=${entry.value}, "
    }
    s eq "IVE=Accendio, Newjeans=HowToSweet, aespa=Supernova,"

    s = ""
    for ((key, value) in artist)
        s += "$key=$value, "
    s eq "IVE=Accendio, Newjeans=HowToSweet, aespa=Supernova,"
}