fun main() {
    val angka = listOf(1,2,3,4,5,6,7,8,9,10)
    val genap = angka.filter { it % 2 == 0 }
    val ganjil = angka.filterNot { it % 2 == 0 }

    println(ganjil)
    println(genap)
//  untuk mengalikan array data dengan sebuah angka
    val kali = angka.map { it * 2 }
    println(kali)
//    untuk mencari tahu berapa jumlah data pada array
    println(angka.count())
    println(angka.count { it % 3 == 0})
}