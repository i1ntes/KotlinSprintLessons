fun main() {
    val revenue = 14250
    val orders = 8
    val averageCheck = revenue / orders
    val averageCheckDouble = revenue.toDouble() / orders

    println("Выручка: $revenue руб.")
    println("Заказов: $orders")
    println("Средний чек: $averageCheckDouble руб.")
    println("Средний чек (грубо): $averageCheck руб.")
}