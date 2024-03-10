fun isDigit(ch: Char) = ch in '0'..'9'

fun notDigit(ch: Char) =
    ch !in '0'..'9'

fun main() {
    println(isDigit('y'))
    println(isDigit('7'))
    println(notDigit('z'))
}