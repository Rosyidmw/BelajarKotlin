fun main() {
    val pesan = buildString {
        append("hai")
        append(" saya")
        append(" Rosyid")
    }
    println(pesan)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}