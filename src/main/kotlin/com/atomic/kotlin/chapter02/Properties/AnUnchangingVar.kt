class Sofa {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    // 다음은 허용되지 않음
    // sofa.cover = "New cover"
    sofa = Sofa()
}