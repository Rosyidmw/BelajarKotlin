fun main() {

    val contoh: (String, String) -> String = { namaAwal: String, namaAKhir: String ->
        val result = "$namaAwal $namaAKhir"
        result
    }

    val result = contoh("Rosyid", "Wibowo")
    println(result)

    printPesan("halo")

//    it
    val kedua: (String) -> String = {
        "Hai $it"
    }

    println(kedua("Rotibowif"))
}

val printPesan = { pesan: String -> println(pesan) }

