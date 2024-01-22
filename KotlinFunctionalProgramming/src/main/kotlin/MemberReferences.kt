fun main() {
    val angka = 1.rangeTo(10)
    val evenAngka = angka.filter (Int::isEvenAngka)
    println(evenAngka)
}

fun Int.isEvenAngka() = this % 2 == 0