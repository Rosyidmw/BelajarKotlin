fun main() {
    tailrec fun display(value: Int) {
        println("Nilai $value")
        if (value > 0) {
            display(value-1)
        }
    }
    tailrec fun recursivFaktorial(value: Int, total:Int = 1): Int {
        return when (value) {
            1 -> total
            else -> recursivFaktorial(value - 1, total * value)
        }
    }
    println(recursivFaktorial(5))
}