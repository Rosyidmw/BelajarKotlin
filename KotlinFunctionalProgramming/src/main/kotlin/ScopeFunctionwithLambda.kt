//run

//fun main() {
//    val teks = "hai"
//    val hasil = teks.run {
//        val from = this
//        val to = this.replace("hai", "Kotlin")
//        "Replace teks from $from to $to"
//    }
//    println("hasil: $hasil")
//}

// with
fun main() {
    val pesan = "Hai Kotlin!"
    val hasil = with(pesan) {
        println("nilai adalah $this")
        println("dengan panjang ${this.length}")
    }
}