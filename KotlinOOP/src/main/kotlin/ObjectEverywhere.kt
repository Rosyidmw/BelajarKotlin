fun main() {
//    val someString = "Rosyid"
//    println(someString.reversed())
//    println(someString.uppercase())
//    println(someString.lowercase())
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt)
    println(someDouble)
    println(someInt is Int)
    println(someDouble is Double)
}