fun main() {
    val text: String? = null
    val textLength = text?.length

//    if (text != null){
//        val textLength = text.length
//    }

    val a = 5

    println("Toko ${if (a > 7) "already close" else "is open"}")
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}