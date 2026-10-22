fun main() {
    val cashbox1 = 1254350
    val rublesCountCashbox1 = cashbox1 / 100
    val restCashbox1 = cashbox1 % 100

    val cashbox2 = 987425
    val rublesCountCashbox2 = cashbox2 / 100
    val restCashbox2 = cashbox2 % 100

    val cashbox3 = 758225
    val rublesCountCashbox3 = cashbox3 / 100
    val restCashbox3 = cashbox3 % 100

    val cashboxesSum = cashbox1 + cashbox2 + cashbox3
    val rublesCashboxesSum = cashboxesSum / 100
    val restCashboxesSum = cashboxesSum % 100

    val percentCountCashbox1 = cashbox1 * 100 / cashboxesSum
    val percentCountCashbox2 = cashbox2 * 100 / cashboxesSum
    val percentCountCashbox3 = cashbox3 * 100 / cashboxesSum

    val orders = 40
    val rublesOrdersAverage = cashboxesSum / orders / 100
    val restOrdersAverage = cashboxesSum / orders % 100

    println("=== Отчёт за смену ===")
    println("Касса 1: $rublesCountCashbox1 руб. $restCashbox1 коп. ($percentCountCashbox1 %)")
    println("Касса 2: $rublesCountCashbox2 руб. $restCashbox2 коп. ($percentCountCashbox2 %)")
    println("Касса 3: $rublesCountCashbox3 руб. $restCashbox3 коп. ($percentCountCashbox3 %)")
    println("Итого: $rublesCashboxesSum руб. $restCashboxesSum коп.")
    println("Заказов: $orders")
    println("Средний чек: $rublesOrdersAverage руб. $restOrdersAverage коп.")
}