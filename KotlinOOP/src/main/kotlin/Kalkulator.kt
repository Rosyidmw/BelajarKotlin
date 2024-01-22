class Kalkulator {
    fun add(value1: Int, value2: Int) = value1+value2
    fun add(value1: Int, value2: Int, value3: Int) = value1+value2+value3
    fun add(value1: Double, value2: Double) = value1+value2
    fun add(value1: Float, value2: Float) = value1+ value2

    fun min(value1: Int, value2: Int) = if (value1< value1) value1 else value2
    fun min(value1: Double, value2: Double) = if(value1< value2) value1 else value2
}

fun main() {
    val kal = Kalkulator()

    println(kal.add(2,4))
    println(kal.add(2.5,2.2))
    println(kal.add(6f, 7f))
    println(kal.add(1,2,3))

    println(kal.min(9,2))
    println(kal.min(17.2,18.3))
}


// Abstract Class
//abstract class sasatoan(var nama: String, var berat: Double, var umur: Int, var isKarnivora: Boolean) {
//    fun makan() {
//        println("$nama sedang makan")
//    }
//
//    fun tidur() {
//        println("$nama sedang tidur")
//    }
//}
//
//fun main() {
//    val sato = sasatoan("Dicoding Miaw", 2.6, 1, true)
//}