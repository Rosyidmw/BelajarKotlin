//fun main() {
//    val nama = setNama("Rosyid", 19)
//    println(nama)
//
//    printNama("Rosyid")
//}
//
//fun setNama(nama: String, umur: Int) = "Halo, nama saya $nama dan umur saya adalah $umur tahun"
//
//fun printNama(nama: String) {
//    println("Nama saya $nama")
//}

fun main() {
    val a = b("Rosyid", 19)
    println(a)

    c("Rosyid")
}

fun b(nama: String, umur: Int) = "Haiii nama aku $nama, umur aku $umur tahun."


fun c(d: String) {
    println("Salam kenal dari $d yaa")
}