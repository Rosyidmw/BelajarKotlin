//fun main() {
//    val someNullValue: String? = null
//    lateinit var someMustNotNullValue: String
//
//    try {
//        someMustNotNullValue = someNullValue!!
//    } catch (e: Exception) {
//        someMustNotNullValue = "Nilai String Null"
//    } finally {
//        println(someMustNotNullValue)
//    }
//}

fun main() {
//    val someStringValue: String? = null
    val someStringValue: String = "12"
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}