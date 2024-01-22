fun main() {

    fun hai(nama: String, rubah: (String)-> String): String {
        val namarubah = rubah(nama)
        return "hai, $namarubah"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hai("Rosyid", lambdaUpper))

    println(hai("Isma", { value: String -> value.toLowerCase()}))

    println(hai("rotibowif") { value: String ->
        value.toUpperCase()
    })

}