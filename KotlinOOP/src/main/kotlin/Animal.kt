//class Animal(
//        val nama: String,
//        val berat: Double,
//        val umur: Int,
//        val isMamal: Boolean
//) {
//    fun makan() {
//        println("$nama makan!")
//    }
//
//    fun tidur() {
//        println("$nama tidur!")
//    }
//}
//
//fun main() {
//    val dicodingcat = Animal("Dicoding Miaw", 4.2, 5, true)
//    println("Nama: ${dicodingcat.nama}, Berat: ${dicodingcat.berat}, Umur: ${dicodingcat.umur}, Mamalia: ${dicodingcat.isMamal}")
//    dicodingcat.makan()
//    dicodingcat.tidur()
//}

//class Animal{
//    var name: String = "Dicoding Miaw"
//        get() {
//            println("Fungsi Getter terpanggil")
//            return field
//        }
//        set(value) {
//            println("Fungsi Setter terpanggil")
//            field = value
//        }
//}
//
//fun main() {
//    val dicodingCat = Animal()
//    println("Nama: ${dicodingCat.name}")
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")
//}

fun main() {
    val dicodingCat = Hewan("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}

class Hewan(
        var name: String,
        var weight: Double,
        var age: Int,
        var isMamal: Boolean
)

val Hewan.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMamal}"