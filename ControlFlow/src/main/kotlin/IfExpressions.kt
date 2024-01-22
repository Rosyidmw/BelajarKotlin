fun main() {
    val tokoBuka = 7
    val sekarang = 5

//    if (sekarang > tokoBuka)
//        print("Toko sudah buka")
//    else
//        print("Toko belum buka")
    val toko: String = if (sekarang > tokoBuka) "Toko buka" else "Toko tutup"
    print(toko)
}