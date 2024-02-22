fun bmiMetric(
    weight: Double,
    height: Double
): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "Underweight"
        else if (bmi < 25) "Normal weight"
        else "Overweight"
}

fun main() {
    val weight = 86.30
    val height = 1.67
    val status = bmiMetric(weight, height)
    println(status)
}