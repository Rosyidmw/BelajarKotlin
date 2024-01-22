fun main() {
    val nilai = 5

//    when(nilai) {
//        4 -> println("Nilai adalah $nilai")
//        5 -> println("Nilai adalah $nilai")
//        6 -> println("Nilai adalah $nilai")
//        else -> println("Tidak ada nilai")
//    }
    val cek = when(nilai) {
        4 -> "Nilai adalah $nilai"
        5 -> "Nilai adalah $nilai"
        6 -> "Nilai adalah $nilai"
        else -> "Tidak ada nilai yang sesuai"
    }
    println(cek)

    val tipe : Any = 100L
    when (tipe) {
        is Long -> println("Nilai tersebut adalah long karena $tipe")
        is String -> println("Nilai tersebut string karena $tipe")
        else -> println("Tidak diketahui")
    }
}