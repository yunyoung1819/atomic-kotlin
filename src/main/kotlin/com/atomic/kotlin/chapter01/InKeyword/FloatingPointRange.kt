fun inFloatRange(n: Double) {
    val r = 1.0..10.0
    println("$n in $r? ${n in r}")
}

fun main() {
    inFloatRange(0.999999) // false
    inFloatRange(5.0) // true
    inFloatRange(10.0) // true
    inFloatRange(10.0000001) // false
}