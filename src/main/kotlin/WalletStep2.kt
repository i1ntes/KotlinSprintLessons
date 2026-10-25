fun main() {
    var balance = 5200
    val salary = 34000
    val rent = 15000
    val food = 8500
    val transport = 2100
    val books = 1590
    //
    val spent = rent + food + transport + books
    val spentFromIncome = spent * 100 / salary
    val averageSpentPerDay = spent / 30
    val sharpAverageSpentPerDay = spent.toDouble() / 30
    val startBalance = balance

    println("Старт месяца: $balance руб.")
    balance += salary
    println("Стипендия: $balance руб.")
    balance -= rent
    println("Аренда: $balance руб.")
    balance -= food
    println("Еда: $balance руб.")
    balance -= transport
    println("Транспорт: $balance руб.")
    balance -= books
    println("Книги: $balance руб.")
    println("Конец месяца: $balance руб.")
    println("")
    //
    val moneySetAside = balance - startBalance

    println("--- Аналитика месяца ---")
    println("Потрачено всего: $spent руб.")
    println("Доля трат от дохода: $spentFromIncome%")
    println("Отложено за месяц: $moneySetAside руб.")
    println("Средние траты в день: $averageSpentPerDay руб.")
    println("Точнее: $sharpAverageSpentPerDay руб.")
}