fun main() {
    val price = 1200
    val discountPercent = 15
    val discountPrice = price - (price * discountPercent / 100)
    val saving = price * discountPercent / 100

    println("Цена: $price руб.")
    println("Со скидкой: $discountPrice руб.")
    println("Экономия: $saving руб.")
}
