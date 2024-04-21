class NoBody

class SomeBody {
    val name = "Le sserafim"
}

class EveryBody {
    val all = listOf(SomeBody(), SomeBody(), SomeBody())
}

fun main() {
    val nb = NoBody()
    val sb = SomeBody()
    val eb = EveryBody()
}