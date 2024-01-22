data class CekIsi(val nama: String, val umur : Int) {
    fun awal() {
        println("Halo perkenalkan nama saya $nama, dan umur saya $umur")
    }
}

fun main() {
    val cek = CekIsi("Rosyid", 19)
    cek.awal()
}