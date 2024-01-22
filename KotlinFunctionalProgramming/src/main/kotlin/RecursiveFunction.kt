//  faktorial menggunakan For Loop
//fun main() {
//    fun faktorial(value: Int): Int {
//        var hasil = 1
//        for (i in value downTo 1) {
//            hasil *= i
//        }
//        return hasil
//    }
//    println(faktorial(10))
//}

//  Faktorial menggunakan recursive
fun main() {
    fun recursivFaktorial(value: Int): Int {
        return when (value) {
            1 -> 1
            else -> value * recursivFaktorial(value - 1)
        }
    }
    println(recursivFaktorial(10))
}