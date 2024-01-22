fun main() {
//    val ranges = 1..5
//    val ranges = 1.rangeTo(5)
    val ranges = 1.rangeTo(10) step 3
    for (cek in ranges) {
        println("Nilai dari $cek")
    }

    val jarak = 1.rangeTo(10) step 2
    for ((index, value ) in jarak.withIndex()) {
        println("nilai $value dengan index $index")
    }
}