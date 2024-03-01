fun open2(hour: Int) {
    val open = 9
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour >= open && hour <= closed
    println("Open: $status")
}

fun main() = open2(6)