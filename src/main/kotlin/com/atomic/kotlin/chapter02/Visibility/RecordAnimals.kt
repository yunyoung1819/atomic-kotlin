private var index = 0

private class Animal(val name: String)

private fun recordAnimal(animal: Animal) {
    println("Animal #$index: ${animal.name}")
    index++
}

fun recordAnimals() {
    recordAnimal(Animal("Lion"))
    recordAnimal(Animal("Tiger"))
    recordAnimal(Animal("Panda"))
}

fun recordAnimalsCount() {
    println("$index animals are here!")
}