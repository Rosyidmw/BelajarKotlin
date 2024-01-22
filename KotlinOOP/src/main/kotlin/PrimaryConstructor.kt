//class PrimaryConstructor (var nama: String, var berat: Double, var umur: Int = 0, var isMamal: Boolean = true) {
//
//}
//class PrimaryConstructor (nama: String, berat: Double, umur: Int) {

class PrimaryConstructor {
//    default constructor
    val nama: String = "Dicoding Miaw"
    val berat: Double = 4.2
    val umur: Int = 2
    val isMamal: Boolean = true

//    Tanpa This, harus mengganti nama variabel pada class
//    init {
//        berat = if (pBerat < 0) 0.1 else pBerat
//        umur = if (pUmur < 0) 0 else pUmur
//        nama = pNama
//        isMamal = pIsMamal
//    }

//    Menggunakan This, untuk menghindari ambiguitas
//    init {
//        this.berat = if (berat < 0) 0.1 else berat
//        this.umur = if (umur < 0) 0 else umur
//        this.nama = nama
//        this.isMamal = false
//    }

//    constructor secondary
//    constructor(nama: String, berat: Double, umur: Int, isMamal: Boolean) : this(nama, berat, umur) {
//        this.isMamal = isMamal
//    }

}

fun main() {
    val dicodingCat = PrimaryConstructor()
    println("${dicodingCat.nama}, ${dicodingCat.berat}, ${dicodingCat.umur}, ${dicodingCat.isMamal}")

//    val dicodingBird = PrimaryConstructor("Dicoding tweet", 0.5, 1)
//    println("${dicodingBird.nama}, ${dicodingBird.berat}, ${dicodingBird.umur}, ${dicodingBird.isMamal}")
}