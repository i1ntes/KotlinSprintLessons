fun main() {
    val mugs = 127
    val boxSize = 12
    val boxesFull = mugs / boxSize
    val mugsWithoutBoxes = mugs % boxSize
    val boxesNeeded = (mugs + boxSize - 1) / boxSize

    println("Полных коробок: $boxesFull")
    println("Кружек без коробки: $mugsWithoutBoxes")
    println("Коробок нужно всего: $boxesNeeded")
}