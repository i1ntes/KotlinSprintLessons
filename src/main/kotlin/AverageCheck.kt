fun main() {
    val revenue = 14250
    val orders = 8
    val average = revenue / orders
    val averageDouble = revenue.toDouble() / orders

    println("Выручка: $revenue руб.")
    println("Заказов: $orders")
    println("Средний чек: $averageDouble руб.")
    println("Средний чек (грубо): $average руб.")
}