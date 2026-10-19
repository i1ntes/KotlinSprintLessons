fun main() {
    val mugPrice = 350
    val shirtPrice = 1200
    val stickerpackPrice = 150
    val mugCount = 2
    val shirtCount = 1
    val stickerpackCount = 3

    val mugTotalPrice = mugPrice * mugCount
    val shirtTotalPrice = shirtPrice * shirtCount
    val stickerpackTotalPrice = stickerpackPrice * stickerpackCount
    val totalPrice = mugTotalPrice + shirtTotalPrice + stickerpackTotalPrice

    println("Кружка x$mugCount- $mugTotalPrice руб.")
    println("Футболка x$shirtCount- $shirtTotalPrice руб.")
    println("Стикерпак x$stickerpackCount - $stickerpackTotalPrice руб.")
    println("Итого: $totalPrice руб.")
}