//open class Inheritances(
//        val nama: String, val berat: Double, val umur: Int, isKarnivora: Boolean
//) {
//    open fun makan() {
//        println("$nama sedang makan")
//    }
//
//    open fun tidur() {
//        println("$nama sedang tidur")
//    }
//}
//
//class Kucing(pName: String, pBerat: Double, pUmur: Int, pIsKarnivora: Boolean, val furWarna: String, val jumlahKaki: Int) : Inheritances(pName, pBerat, pUmur, pIsKarnivora){
//    fun bermain() {
//        println("$nama bermain bersama Manusia!")
//    }
//
//    override fun makan() {
//        println("$nama sedang makan ikan")
//    }
//
//    override fun tidur() {
//        println("$nama sedang tidur di bantal")
//    }
//}
//
//fun main() {
//    val dicodingCat = Kucing("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
//
//    dicodingCat.bermain()
//    dicodingCat.makan()
//    dicodingCat.tidur()
//}


class ahewan(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}


fun main() {
    val dicodingCat = ahewan("Dicoding Miaw")

    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)
}

/*
    Output:
    Dicoding Miaw makan!
    Dicoding Miaw memakan Ikan Tuna!
    Dicoding Miaw memakan Ikan Tuna sebanyak 450.0 grams!
*/