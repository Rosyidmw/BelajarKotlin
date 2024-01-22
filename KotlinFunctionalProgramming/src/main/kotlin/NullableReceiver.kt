fun main() {
    val value: Int? = null
    val value2: Int? = null

    println(value.slice)
    println(value2.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0