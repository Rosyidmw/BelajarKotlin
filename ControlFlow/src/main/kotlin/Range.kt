fun main() {
    val range = 1..5 step 2
    range.forEach {
        println("$it")
    }
    println(range.step)

    val jarak = 1.rangeTo(10)
    if (15 in jarak) {
        println("Angka 5 ada diantara 1 hingga 10")
    } else {
        println()
    }
}