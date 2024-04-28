import com.atomic.kotlin.atomicTest.*

class JetPack(
    private var fuel: Double
) {
    private var warning = false
    private fun burn() =
        if (fuel - 1 <= 0) {
            fuel = 0.0
            warning = true
        } else
            fuel -= 1
    public fun fly() = burn()
    fun check() =
        if (warning)
            "Warning"
        else
            "OK"
}

fun main() {
    val jetPck = JetPack(3.0)
    while (jetPck.check() != "Warning") {
        jetPck.check() eq "OK"
        jetPck.fly()
    }
    jetPck.check() eq "Warning"
}
