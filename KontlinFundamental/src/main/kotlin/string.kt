fun main() {
    val teks = "Rosyid"
    val hurufke1 = teks[0]
    println(teks)
    println("Huruf pertama dari $teks, adalah $hurufke1")

    for (ejaan in teks) {
        print("$ejaan ")
    }

    println("Wah keren \"sekali!\" ")

    print("""
         baris 1
         baris 2
         baris 3
    """.trimIndent())
}

//\t: menambah tab ke dalam teks.
//
//\n: membuat baris baru di dalam teks.
//
//\’: menambah karakter single quote kedalam teks.
//
//\”: menambah karakter double quote kedalam teks.
//
//\\: menambah karakter backslash kedalam teks.

