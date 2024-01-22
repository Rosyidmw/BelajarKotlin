fun main() {
    val angka = listOf(1,2,3,4,5,6,7,8,9,10)
    val mod2 = angka.find { it % 2 == 1 }
    val mod3 = angka.firstOrNull { it % 2 == 3 }

    println(mod2)
    println(mod3)

    val moreThan10 = angka.last { it > 7 }
    println(moreThan10)

//    penjumlahan
    val total = angka.sum()
    println(total)

//    SORT

//    Sort Ascending
    val urutKecil = angka.sorted()
    println(urutKecil)

//    Sort Descending
    val urutBesar = angka.sortedDescending()
    println(urutBesar)
}