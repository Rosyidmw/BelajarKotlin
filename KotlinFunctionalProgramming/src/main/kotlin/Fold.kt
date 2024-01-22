fun main() {
    val angka = listOf(1,2,3)
    val fold = angka.fold(10){ sekarang, item ->
        println("Sekarang $sekarang")
        println("Item $item")
        println()
        sekarang + item
    }

    println("Fold hasil: $fold")
}