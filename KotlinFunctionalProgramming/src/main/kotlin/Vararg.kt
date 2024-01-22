//fun main() {
//    val angka = jumlahAngka(5,6,10,15)
//    println(angka)
//    val number = getNumber(10,20,30,40,50)
//    println(number)
//}
//
//fun jumlahAngka(vararg angka: Int): Int {
//    return angka.sum()
//}
//
//fun getNumber(vararg number: Int): Int {
//    return number.size
//}

//aturan
//fun sumNumbers(vararg number: Int, vararg number2: Int) gagal karena terdapat 2 parameter
//jika ada 2parameter, yg 1 tanpa vararg, maka tempatkan parameter vararg diposisi kedua


fun hitungTotal(vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun main() {
//    val values = arrayOf(10,10,10,10)
    val result = hitungTotal(10,10,10,10)
    println(result)
}