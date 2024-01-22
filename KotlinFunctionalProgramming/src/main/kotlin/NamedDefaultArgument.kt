fun main() {
    val fullName = getFullName(awal = "Rosyid")
    println(fullName)
}

fun getFullName (
    awal: String = "Rosyid",
    tengah: String = "Mukti",
    akhir: String = "Wibowo"): String {
    return "$awal $tengah $akhir"
}
