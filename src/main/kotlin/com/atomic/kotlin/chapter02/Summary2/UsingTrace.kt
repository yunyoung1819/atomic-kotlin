import com.atomic.kotlin.atomicTest.*

fun main() {
    trace("Hello,")
    trace(47)
    trace("World!")
    trace eq """
        Hello,
        47
        World!
    """
}
