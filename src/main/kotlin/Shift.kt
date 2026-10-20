fun main() {
    val shiftMinutes = 437
    val orders = 23
    val payPerOrder = 85

    val hours = shiftMinutes / 60
    val minutes = shiftMinutes % 60
    val income = orders * payPerOrder
    val minutesPerOrder = shiftMinutes / orders

    println("Смена: $hours ч $minutes мин")
    println("Заказов: $orders")
    println("Заработок: $income")
    println("Средняя выручка за заказ: $payPerOrder")
    println("В среднем минут на заказ: $minutesPerOrder")
}