//visibility modifiers
class Kewan(
       private var nama: String,
       private val berat: Double,
       private val umur: Int,
       private val isMammal: Boolean = true
) {
//    cara mengatasi penggunaan private
    fun getNama() : String {
        return nama
    }
    fun setNama(newNama: String) {
        nama = newNama
    }
}

fun main() {
//    val dicodingCat = Kewan("Dicoding Miaw", 2.5, 2, true)
//    println("${dicodingCat.nama}, ${dicodingCat.berat}, ${dicodingCat.umur}, ${dicodingCat.isMammal}")
    val dicodingCat = Kewan("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getNama())
    dicodingCat.setNama("Gooose")
    println(dicodingCat.getNama())
}