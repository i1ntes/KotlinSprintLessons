fun main() {
    val orderTotal = 1350
    val received = 2000
    val change = received - orderTotal

    val count500 = change / 500
    val rest500 = change % 500
    val count100 = rest500 / 100
    val rest100 = rest500 % 100
    val count50 = rest100 / 50
    val rest50 = rest100 % 50
    val count10 = rest50 / 10
    val banknoteCount = count500 + count100 + count50 + count10
    val validation = (count500 * 500) + (count100 * 100) + (count50 * 50) + (count10 * 10) == change

    println("К оплате: $orderTotal руб.")
    println("Получено: $received руб.")
    println("Сдача: $change руб.")
    println("  по 500: $count500")
    println("  по 100: $count100")
    println("  по 50: $count50")
    println("  по 10: $count10")
    println("Купюр всего: $banknoteCount")
    println("Проверка: $validation")
}