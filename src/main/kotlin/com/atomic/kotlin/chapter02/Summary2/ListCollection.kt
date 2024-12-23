import com.atomic.kotlin.atomicTest.eq

fun main() {
    val lst = listOf(19.2, 88.3, 22.1)
    lst[1] eq 88.3
    lst.reversed() eq listOf(22.1, 88.3, 19.2)
    lst.sorted() eq listOf(19.2, 22.1, 88.3)
    lst.sum() eq 129.6
}