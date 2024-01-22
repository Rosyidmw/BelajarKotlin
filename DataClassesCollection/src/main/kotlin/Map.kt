fun main() {
    val kota = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(kota["Jakarta"])
//    atau
    println(kota.getValue("Jakarta"))

    val mutableKota = kota.toMutableMap()

    mutableKota.put("Amsterdam", "Belanda")
}