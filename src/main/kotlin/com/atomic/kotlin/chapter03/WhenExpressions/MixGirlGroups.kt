package com.atomic.kotlin.chapter03.WhenExpressions

import com.atomic.kotlin.atomicTest.*


fun mixGirlGroups(firstMember: String, secondMember: String) =
    when (setOf(firstMember, secondMember)) {
        setOf("Minji", "Hani") -> "NewJeans"
        setOf("Moka", "WoonHee") -> "ILLIT"
        setOf("HaeRin", "HyeIn") -> "NewJeans"
        else -> "Unknown"
    }

fun main() {
    mixGirlGroups("Minji", "Hani") eq "NewJeans"
    mixGirlGroups("Hani", "Minji") eq "NewJeans"
    mixGirlGroups("Moka", "WoonHee") eq "ILLIT"
    mixGirlGroups("WonYoung", "Yujin") eq "Unknown"
}