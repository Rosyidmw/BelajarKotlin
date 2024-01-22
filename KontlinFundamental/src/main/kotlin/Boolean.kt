fun main() {
    val a = 15
    val b = 5
    val buka = 20
    val c = a > b && b > a
    val d = a > b || b < a

    println(c)
    println(d)

    if (!d) {
        println(buka)
    } else {
        println("ngga tau")
    }
}